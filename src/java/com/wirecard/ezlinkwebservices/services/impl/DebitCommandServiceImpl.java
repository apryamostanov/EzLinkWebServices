/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wirecard.ezlinkwebservices.services.impl;

import com.ezlinkwebservices.service.debitcommand.DebitCommandFault;
import com.ezlinkwebservices.service.debitcommand.DebitCommandFault_Exception;
import com.ezlinkwebservices.service.debitcommand.request.EZLINGWSREQENV;
import com.ezlinkwebservices.service.debitcommand.response.DebitCommandRes;
import com.wirecard.ezlinkwebservices.dto.EMerchantDetailsDto;
import com.wirecard.ezlinkwebservices.mapperdao.EMerchantDetailsDtoMapper;
import com.wirecard.ezlinkwebservices.constants.StringConstants;
import com.wirecard.ezlinkwebservices.dto.ETerminalDataDto;
import com.wirecard.ezlinkwebservices.dto.ETranxLogDto;
import com.wirecard.ezlinkwebservices.dto.ViewEZBlacklistDto;
import com.wirecard.ezlinkwebservices.mapperdao.ETerminalDataDtoMapper;
import com.wirecard.ezlinkwebservices.mapperdao.ETranxLogDtoMapper;
import com.wirecard.ezlinkwebservices.mapperdao.ViewEZBlacklistDtoMapper;
import com.wirecard.ezlinkwebservices.services.DebitCommandService;
import com.wirecard.ezlinkwebservices.util.TerminalUtil;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;
import org.transinfo.messaging.communication.posdailer.SerialManager;

/**
 *
 * @author WCCTTI-JANAHAN
 */
@Service
public class DebitCommandServiceImpl implements DebitCommandService {

    @Autowired
    EMerchantDetailsDtoMapper objEMerchantDetailsDtoMapper;
    @Autowired
    ETranxLogDtoMapper objETranxLogDtoMapper;
    @Autowired
    ETerminalDataDtoMapper objETerminalDataDtoMapper;
    @Autowired
    ETerminalDataDto objETerminalDataDto;
    @Autowired
    ViewEZBlacklistDto objViewEZBlacklistDto;
    @Autowired
    ViewEZBlacklistDtoMapper objViewEZBlacklistDtoMapper;
    static String syncObj="synch";

    private static final org.apache.log4j.Logger ezlink = org.apache.log4j.Logger.getLogger(DebitCommandServiceImpl.class);

    @Override
    public DebitCommandRes getDebitCommand(EZLINGWSREQENV parameters) throws DebitCommandFault_Exception {

        ezlink.info("DC Request received in " + DebitCommandServiceImpl.class.getName());

        String merchantNo, merchantTranxRefNo, orderNo, cardNo, termRndNo, CardRndNo, purseData;
        String xorAmount;
        double amount;
        int result;
        boolean debitTraxValidationFlag = false;
        ETranxLogDto objETranxLogDto;
        EMerchantDetailsDto objEMerchantDetailsDto;
        int hostRepeatedCounter = 0;
        List<ETerminalDataDto> ETerminalDataDtolist;
        Date updatedDate = new Date();
        ETerminalDataDto objAvailableETerminalDataDto;
        ETerminalDataDto objTerminalDataFromTerminal;
        TerminalUtil objTerminalUtil;
        DebitCommandRes objDebitCommandRes = new DebitCommandRes();

        //MerchantDtoMapper objMerchantDtoMapper=new MerchantDtoMapper(); 
        try {
            merchantNo = parameters.getEZLINGWSREQBODY().getDebitCommandReq().getMERCHANTNO();
            merchantTranxRefNo = parameters.getEZLINGWSREQBODY().getDebitCommandReq().getMERCHANTREFNO();
            orderNo = parameters.getEZLINGWSREQBODY().getDebitCommandReq().getORDERNO();
            amount = parameters.getEZLINGWSREQBODY().getDebitCommandReq().getAMOUNT().doubleValue();
            cardNo = parameters.getEZLINGWSREQBODY().getDebitCommandReq().getCAN();
            termRndNo = parameters.getEZLINGWSREQBODY().getDebitCommandReq().getTERMINALRANDOMNO();
            //termRndNo = "CF549C2B7520389C";
            CardRndNo = parameters.getEZLINGWSREQBODY().getDebitCommandReq().getCARDRANDOMNO();
            purseData = parameters.getEZLINGWSREQBODY().getDebitCommandReq().getPURSEDATA();

            // log the response send time and parameters
            ezlink.info("\n-------DC----REQUEST----------------------------------------------");
            ezlink.info("SOURCE ID : " + parameters.getEZLINGWSHEADER().getSOURCEID());
            ezlink.info("IP : " + parameters.getEZLINGWSHEADER().getIPADDRESS());
            ezlink.info("SEC LEVEL : " + parameters.getEZLINGWSHEADER().getSECURITYLEVEL());
            ezlink.info("BODY+++ getDebitCommand : " + new Date());
            ezlink.info("merchantNo : " + merchantNo);
            ezlink.info("merchantTranxRefNo : " + merchantTranxRefNo);
            ezlink.info("orderNo : " + orderNo);
            ezlink.info("amount : " + amount);
            ezlink.info("cardNo : " + cardNo);
            ezlink.info("Terminal Rnd No : " + termRndNo);
            ezlink.info("card Rnd No : " + CardRndNo);
            ezlink.info("Purse Data : " + purseData);
            ezlink.info("\n-------DC-----REQUEST----------------------------------------------");

        } catch (Exception ex) {
            ezlink.error(new Object(), ex);
            Logger.getLogger(DebitCommandServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
            ezlink.error(new Object(), ex);

            DebitCommandFault objDebitCommandFault = new DebitCommandFault();
            objDebitCommandFault.setMessage(StringConstants.Common.REQUIRED_FIELD_MISSING);
            objDebitCommandFault.setFaultInfo(StringConstants.Common.REQUIRED_FIELD_MISSING_INFO);

            ezlink.info("\n-----DC------EXCEPTION------------------------");
            ezlink.info("Response sent from getDebitCommand : " + new Date());
            ezlink.info("Status : " + objDebitCommandFault.getMessage());
            ezlink.info("Remarks : " + objDebitCommandFault.getFaultInfo());
            ezlink.info("\n------DC---------EXCEPTION--------------------");

            throw new DebitCommandFault_Exception(objDebitCommandFault.getMessage(), objDebitCommandFault);
        }
        try {
            SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
            objEMerchantDetailsDto = objEMerchantDetailsDtoMapper.getMerchantByMerchantId(merchantNo);
        } catch (SQLException ex) {
            Logger.getLogger(DebitCommandServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
            ezlink.error(new Object(), ex);
            DebitCommandFault objDebitCommandFault = new DebitCommandFault();
            objDebitCommandFault.setMessage(StringConstants.Common.CONNECTION_ISSUE_MESSAGE);
            objDebitCommandFault.setFaultInfo(StringConstants.Common.CONNECTION_ISSUE_MESSAGE_INFO);

            ezlink.info("\n------DC-------EXCEPTION----------------------");
            ezlink.info("Response sent from getDebitCommand : " + new Date());
            ezlink.info("Status : " + objDebitCommandFault.getMessage());
            ezlink.info("Remarks : " + objDebitCommandFault.getFaultInfo());
            ezlink.info("\n-------DC---------EXCEPTION-------------------");

            throw new DebitCommandFault_Exception(objDebitCommandFault.getMessage(), objDebitCommandFault);
        }

        if (objEMerchantDetailsDto == null) {
            DebitCommandFault objDebitCommandFault = new DebitCommandFault();
            objDebitCommandFault.setMessage(StringConstants.Common.NO_MERCHANT_AVAILABLE);
            objDebitCommandFault.setFaultInfo(StringConstants.Common.NO_MERCHANT_AVAILABLE_INFO);

            ezlink.info("\n-------DC-------EXCEPTION---------------------");
            ezlink.info("Response sent from getDebitCommand : " + new Date());
            ezlink.info("Status : " + objDebitCommandFault.getMessage());
            ezlink.info("Remarks : " + objDebitCommandFault.getFaultInfo());
            ezlink.info("\n--------DC-------EXCEPTION--------------------");

            throw new DebitCommandFault_Exception(objDebitCommandFault.getMessage(), objDebitCommandFault);
        }
        if ((!objEMerchantDetailsDto.getSecurityLevel().equalsIgnoreCase(parameters.getEZLINGWSHEADER().getSECURITYLEVEL()))) {
            DebitCommandFault objDebitCommandFault = new DebitCommandFault();
            objDebitCommandFault.setMessage(StringConstants.ExceptionInfo.INVALID_SECURITY_LEVEL_MESSAGE);
            objDebitCommandFault.setFaultInfo(StringConstants.ExceptionInfo.INVALID_SECURITY_LEVEL_MESSAGE_INFO);

            ezlink.info("\n-------DC------EXCEPTION----------------------");
            ezlink.info("Response sent from getDebitCommand : " + new Date());
            ezlink.info("Status : " + objDebitCommandFault.getMessage());
            ezlink.info("Remarks : " + objDebitCommandFault.getFaultInfo());
            ezlink.info("\n-------DC--------EXCEPTION--------------------");

            throw new DebitCommandFault_Exception(objDebitCommandFault.getMessage(), objDebitCommandFault);
        }
        if ((!objEMerchantDetailsDto.getAccessCode().equalsIgnoreCase(parameters.getEZLINGWSHEADER().getACCESSCODE()))) {
            DebitCommandFault objDebitCommandFault = new DebitCommandFault();
            objDebitCommandFault.setMessage(StringConstants.ExceptionInfo.INVALID_ACCESS_CODE_MESSAGE);
            objDebitCommandFault.setFaultInfo(StringConstants.ExceptionInfo.INVALID_ACCESS_CODE_MESSAGE_INFO);

            ezlink.info("\n-------DC--------EXCEPTION--------------------");
            ezlink.info("Response sent from getDebitCommand : " + new Date());
            ezlink.info("Status : " + objDebitCommandFault.getMessage());
            ezlink.info("Remarks : " + objDebitCommandFault.getFaultInfo());
            ezlink.info("\n--------DC---------EXCEPTION------------------");

            throw new DebitCommandFault_Exception(objDebitCommandFault.getMessage(), objDebitCommandFault);
        }
        try {
            //Check transaction available in ETranxLog 

            objETranxLogDto = objETranxLogDtoMapper.validateTransactionLog(merchantNo, merchantTranxRefNo, orderNo, amount);

        } catch (Exception ex) {

            Logger.getLogger(DebitCommandServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
            ezlink.error(new Object(), ex);
            DebitCommandFault objDebitCommandFault = new DebitCommandFault();
            objDebitCommandFault.setMessage(StringConstants.Common.CONNECTION_ISSUE_MESSAGE);
            objDebitCommandFault.setFaultInfo(StringConstants.Common.CONNECTION_ISSUE_MESSAGE_INFO);

            ezlink.info("\n--------DC-------EXCEPTION--------------------");
            ezlink.info("Response sent from getDebitCommand : " + new Date());
            ezlink.info("Status : " + objDebitCommandFault.getMessage());
            ezlink.info("Remarks : " + objDebitCommandFault.getFaultInfo());
            ezlink.info("\n---------DC-------EXCEPTION-------------------");

            throw new DebitCommandFault_Exception(objDebitCommandFault.getMessage(), objDebitCommandFault);
        }

        //if source id WD..
        if (parameters.getEZLINGWSHEADER().getSOURCEID().equals(StringConstants.Common.SOURCE_ID)) {
            ezlink.info("\n-------DC-------SOURCE ID WD---------------------");
            if (null == objETranxLogDto) {
                DebitCommandFault objDebitCommandFault = new DebitCommandFault();
                objDebitCommandFault.setMessage(StringConstants.ExceptionInfo.NO_TRANSACTION_AVAILABLE_MESSAGE);
                objDebitCommandFault.setFaultInfo(StringConstants.ExceptionInfo.NO_TRANSACTION_AVAILABLE_MESSAGE_INFO);

                ezlink.info("\n------DC------EXCEPTION-----------------------");
                ezlink.info("Response sent from getDebitCommand : " + new Date());
                ezlink.info("Status : " + objDebitCommandFault.getMessage());
                ezlink.info("Remarks : " + objDebitCommandFault.getFaultInfo());
                ezlink.info("\n--------DC-------EXCEPTION--------------------");

                throw new DebitCommandFault_Exception(objDebitCommandFault.getMessage(), objDebitCommandFault);
            }
            //check status not "Completed"
            System.out.println("+++++++++++++++Tranx Status from DB : " + objETranxLogDto.getTranxStatus());
            System.out.println("+++++++++++++++Response Code from DB : " + objETranxLogDto.getResponseCode());
            ezlink.info("++Transaction Status in DB ++: " + objETranxLogDto.getTranxStatus());
            ezlink.info("++Response Code in DB ++: " + objETranxLogDto.getResponseCode());

            debitTraxValidationFlag = TerminalUtil.ValidateDebitTransaction(objETranxLogDto);

            if (!debitTraxValidationFlag) {
                DebitCommandFault objDebitCommandFault = new DebitCommandFault();
                objDebitCommandFault.setMessage(StringConstants.ExceptionInfo.TRANX_COMPLETED_MESSAGE);
                objDebitCommandFault.setFaultInfo(StringConstants.ExceptionInfo.TRANX_COMPLETED_MESSAGE_INFO);

                ezlink.info("\n-----DC--------EXCEPTION----------------------");
                ezlink.info("Response sent from getDebitCommand : " + new Date());
                ezlink.info("Status : " + objDebitCommandFault.getMessage());
                ezlink.info("Remarks : " + objDebitCommandFault.getFaultInfo());
                ezlink.info("\n---------DC---------EXCEPTION-----------------");

                throw new DebitCommandFault_Exception(objDebitCommandFault.getMessage(), objDebitCommandFault);
            }

        }//Source ID WD
        else {
            //Source ID not 'WD'
            ezlink.info("\n-------DC-------SOURCE ID NOT WD---------------------");

            if (objETranxLogDto != null) {
                //Record available 
                System.out.println("++++++NOT WD BUT RECORD AVAILABLE++++Tranx Status from DB : " + objETranxLogDto.getTranxStatus());
                System.out.println("+++++++++++++++Response Code from DB : " + objETranxLogDto.getResponseCode());
                ezlink.info("++Transaction Status in DB ++: " + objETranxLogDto.getTranxStatus());
                ezlink.info("++Response Code in DB ++: " + objETranxLogDto.getResponseCode());

                debitTraxValidationFlag = TerminalUtil.ValidateDebitTransaction(objETranxLogDto);
                if (!debitTraxValidationFlag) {

                    insertFaiedTranxDetail(objETranxLogDto.getTranxlogid(), StringConstants.ResponseCode.TRANX_COMPLETED_ALREADY, StringConstants.ExceptionInfo.TRANX_COMPLETED_MESSAGE);

                    DebitCommandFault objDebitCommandFault = new DebitCommandFault();
                    objDebitCommandFault.setMessage(StringConstants.ExceptionInfo.TRANX_COMPLETED_MESSAGE);
                    objDebitCommandFault.setFaultInfo(StringConstants.ExceptionInfo.TRANX_COMPLETED_MESSAGE_INFO);

                    ezlink.info("\n-----DC--------EXCEPTION----------------------");
                    ezlink.info("Response sent from getDebitCommand : " + new Date());
                    ezlink.info("Status : " + objDebitCommandFault.getMessage());
                    ezlink.info("Remarks : " + objDebitCommandFault.getFaultInfo());
                    ezlink.info("\n---------DC---------EXCEPTION-----------------");

                    throw new DebitCommandFault_Exception(objDebitCommandFault.getMessage(), objDebitCommandFault);
                }
            } else {
                //NOT WD but record not available in tranxlog table in our DB
                objTerminalUtil = new TerminalUtil();
                objETranxLogDto = objTerminalUtil.insertNonWDTransaction(merchantNo, merchantTranxRefNo, orderNo, amount);
                if (null == objETranxLogDto) {
                    ezlink.info("\n-----NON WC--------TRANXLOG INSERTION FAILED------------");
                    DebitCommandFault objDebitCommandFault = new DebitCommandFault();
                    objDebitCommandFault.setMessage(StringConstants.ExceptionInfo.DB_INSERTION_FAILED_MESSAGE);
                    objDebitCommandFault.setFaultInfo(StringConstants.ExceptionInfo.DB_INSERTION_FAILED_MESSAGE_INFO);

                    ezlink.info("\n-------DC-----EXCEPTION-----------------------");
                    ezlink.info("Response sent from getDebitCommand : " + new Date());
                    ezlink.info("Status : " + objDebitCommandFault.getMessage());
                    ezlink.info("Remarks : " + objDebitCommandFault.getFaultInfo());
                    ezlink.info("\n--------DC------EXCEPTION---------------------");

                    throw new DebitCommandFault_Exception(objDebitCommandFault.getMessage(), objDebitCommandFault);
                }

            }
        }

        //--------------------------------------------------------------------------------------------------
        //Checking get debit command time from when generating qrcode
        try {
            Date generateQrcode = objETranxLogDto.getDatetime();
            Date timeout = new Date(generateQrcode.getTime() + 4 * 60 * 1000);
            if (updatedDate.after(timeout)) {
                objETranxLogDto.setDatetime(updatedDate);
                objETranxLogDto.setResponseCode(StringConstants.ResponseCode.TIME_OUT);
                result = objETranxLogDtoMapper.updateResponseCode(objETranxLogDto);
                System.out.println(" tranxlog Updation Result : " + result);
                if (result != 1) {
                    DebitCommandFault objDebitCommandFault = new DebitCommandFault();
                    objDebitCommandFault.setMessage(StringConstants.Common.INSERTION_FAILED_MESSAGE);
                    objDebitCommandFault.setFaultInfo(StringConstants.Common.INSERTION_FAILED_MESSAGE_INFO);

                    ezlink.info("\n------DC------EXCEPTION-----------------------");
                    ezlink.info("Response sent from getDebitCommand : " + new Date());
                    ezlink.info("Status : " + objDebitCommandFault.getMessage());
                    ezlink.info("Remarks : " + objDebitCommandFault.getFaultInfo());
                    ezlink.info("\n---------DC-------EXCEPTION-------------------");

                    throw new DebitCommandFault_Exception(objDebitCommandFault.getMessage(), objDebitCommandFault);
                }

                DebitCommandFault objDebitCommandFault = new DebitCommandFault();
                objDebitCommandFault.setMessage(StringConstants.Common.TIME_OUT);
                objDebitCommandFault.setFaultInfo(StringConstants.Common.TIME_OUT_INFO);

                ezlink.info("\n------DC------EXCEPTION-----------------------");
                ezlink.info("Response sent from getDebitCommand : " + new Date());
                ezlink.info("Status : " + objDebitCommandFault.getMessage());
                ezlink.info("Remarks : " + objDebitCommandFault.getFaultInfo());
                ezlink.info("\n---------DC-------EXCEPTION-------------------");

                throw new DebitCommandFault_Exception(objDebitCommandFault.getMessage(), objDebitCommandFault);
            }
        } catch (DebitCommandFault_Exception e) {
            throw e;
        } catch (Exception ex) {
            Logger.getLogger(DebitCommandServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
            ezlink.error(new Object(), ex);
            DebitCommandFault objDebitCommandFault = new DebitCommandFault();
            objDebitCommandFault.setMessage(StringConstants.Common.CONNECTION_ISSUE_MESSAGE);
            objDebitCommandFault.setFaultInfo(StringConstants.Common.CONNECTION_ISSUE_MESSAGE_INFO);

            ezlink.info("\n-------DC-----EXCEPTION-----------------------");
            ezlink.info("Response sent from getDebitCommand : " + new Date());
            ezlink.info("Status : " + objDebitCommandFault.getMessage());
            ezlink.info("Remarks : " + objDebitCommandFault.getFaultInfo());
            ezlink.info("\n--------DC------EXCEPTION---------------------");

            throw new DebitCommandFault_Exception(objDebitCommandFault.getMessage(), objDebitCommandFault);
        }

        // Check black list card
        try {
            String bdc = getBDC(purseData);
            objViewEZBlacklistDto = objViewEZBlacklistDtoMapper.isBlackList(cardNo, bdc);
            if (objViewEZBlacklistDto != null) {
                System.out.println("----CARD IS BLACKLIST----");
                DebitCommandFault objDebitCommandFault = new DebitCommandFault();
                objDebitCommandFault.setMessage(StringConstants.Common.CARD_BLACK_LIST);
                objDebitCommandFault.setFaultInfo(StringConstants.Common.CARD_BLACK_LIST);

                ezlink.info("\n-------DC-----EXCEPTION-----------------------");
                ezlink.info("Response sent from getDebitCommand : " + new Date());
                ezlink.info("Status : " + objDebitCommandFault.getMessage());
                ezlink.info("Remarks : " + objDebitCommandFault.getFaultInfo());
                ezlink.info("\n--------DC------EXCEPTION---------------------");

                throw new DebitCommandFault_Exception(objDebitCommandFault.getMessage(), objDebitCommandFault);
            }
        } catch (DebitCommandFault_Exception e) {
            throw e;
        } catch (Exception ex) {
            Logger.getLogger(DebitCommandServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
            ezlink.error(new Object(), ex);
            DebitCommandFault objDebitCommandFault = new DebitCommandFault();
            objDebitCommandFault.setMessage(StringConstants.Common.CONNECTION_ISSUE_MESSAGE);
            objDebitCommandFault.setFaultInfo(StringConstants.Common.CONNECTION_ISSUE_MESSAGE_INFO);

            ezlink.info("\n-------DC-----EXCEPTION-----------------------");
            ezlink.info("Response sent from getDebitCommand : " + new Date());
            ezlink.info("Status : " + objDebitCommandFault.getMessage());
            ezlink.info("Remarks : " + objDebitCommandFault.getFaultInfo());
            ezlink.info("\n--------DC------EXCEPTION---------------------");

            throw new DebitCommandFault_Exception(objDebitCommandFault.getMessage(), objDebitCommandFault);
        }

        try {
            //Repeated host Count
            objAvailableETerminalDataDto = objETerminalDataDtoMapper.isRepeatedMerchantTranxRefNo(merchantNo, merchantTranxRefNo, orderNo, cardNo);

        } catch (Exception ex) {
            Logger.getLogger(DebitCommandServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
            ezlink.error(new Object(), ex);
            DebitCommandFault objDebitCommandFault = new DebitCommandFault();
            objDebitCommandFault.setMessage(StringConstants.Common.CONNECTION_ISSUE_MESSAGE);
            objDebitCommandFault.setFaultInfo(StringConstants.Common.CONNECTION_ISSUE_MESSAGE_INFO);

            ezlink.info("\n-------DC-----EXCEPTION-----------------------");
            ezlink.info("Response sent from getDebitCommand : " + new Date());
            ezlink.info("Status : " + objDebitCommandFault.getMessage());
            ezlink.info("Remarks : " + objDebitCommandFault.getFaultInfo());
            ezlink.info("\n--------DC------EXCEPTION---------------------");

            throw new DebitCommandFault_Exception(objDebitCommandFault.getMessage(), objDebitCommandFault);
        }
        if (objAvailableETerminalDataDto != null) {
            hostRepeatedCounter = objAvailableETerminalDataDto.getHostCounter();
            hostRepeatedCounter++;
        }

        
        //----------------------------------------------------------------------------------------------------
        /*
         //Updating tranxlog status D
         try {
         objETranxLogDto.setDatetime(updatedDate);
         //objETranxLogDto.setResponseCode(StringConstants.ResponseCode.SUCCESS);
         result = objETranxLogDtoMapper.updateDebitCommandStatus(objETranxLogDto);
         System.out.println(" tranxlog Updation Result : " + result);
         if (result == 0) {
         DebitCommandFault objDebitCommandFault = new DebitCommandFault();
         objDebitCommandFault.setMessage(StringConstants.Common.INSERTION_FAILED_MESSAGE);
         objDebitCommandFault.setFaultInfo(StringConstants.Common.INSERTION_FAILED_MESSAGE_INFO);

         ezlink.info("\n------DC------EXCEPTION-----------------------");
         ezlink.info("Response sent from getDebitCommand : " + new Date());
         ezlink.info("Status : " + objDebitCommandFault.getMessage());
         ezlink.info("Remarks : " + objDebitCommandFault.getFaultInfo());
         ezlink.info("\n---------DC-------EXCEPTION-------------------");

         throw new DebitCommandFault_Exception(objDebitCommandFault.getMessage(), objDebitCommandFault);
         }
         } catch (Exception e) {
         DebitCommandFault objDebitCommandFault = new DebitCommandFault();
         objDebitCommandFault.setMessage(StringConstants.ExceptionInfo.DB_CONNECTION_ERROR_MESSAGE);
         objDebitCommandFault.setFaultInfo(StringConstants.ExceptionInfo.DB_CONNECTION_ERROR_MESSAGE_INFO);
         e.printStackTrace();
         ezlink.error(new Object(), e);

         ezlink.info("\n-------DC-----EXCEPTION-----------------------");
         ezlink.info("Response sent from getDebitCommand : " + new Date());
         ezlink.info("Status : " + objDebitCommandFault.getMessage());
         ezlink.info("Remarks : " + objDebitCommandFault.getFaultInfo());
         ezlink.info("\n-------DC-------EXCEPTION---------------------");

         throw new DebitCommandFault_Exception(objDebitCommandFault.getMessage(), objDebitCommandFault);
         }
         */

        //----------------------------------------------------------------------------------------------------
        try {
            //objETerminalDataDto = TerminalUtil.getDebitCommandFromTerminal(objETerminalDataDto);

            
            //String xorAmount="FFFFFE";
            BigDecimal beforeAmt = new BigDecimal(parameters.getEZLINGWSREQBODY().getDebitCommandReq().getAMOUNT().doubleValue()).setScale(2, RoundingMode.HALF_DOWN);
            System.out.println("AMOUNT BEFORE : " + beforeAmt);
            BigDecimal amt = new BigDecimal(parameters.getEZLINGWSREQBODY().getDebitCommandReq().getAMOUNT().doubleValue()).setScale(2, RoundingMode.HALF_DOWN).subtract(new BigDecimal("0.01"));
            System.out.println("AMOUNT After -0.01 : " + amt);
            String amountForXor = String.valueOf(amt).replace(".", "");
            String amountForHexXor = Long.toHexString(Long.valueOf(amountForXor));

            ezlink.info("Amount for HEX XOR : " + amountForHexXor);
            System.out.println("AMOUNT For Hex XOR : " + amountForHexXor);
            xorAmount = TerminalUtil.strXor(amountForHexXor, StringConstants.Common.XOR_FORMAT);
            ezlink.info("Amount in XOR : " + xorAmount);
            System.out.println("AMOUNT IN XOR : " + xorAmount);

            ezlink.info("\n-----DC----------START of Serial Manager--------------------");
            System.out.println("---------------START of Serial Manager -----------------------------------------------------------");
            System.out.println("++++++++++TERMINAL RANDOM NO++++++++++++++++++++++++++++ : " + termRndNo);
            ezlink.info("---------------TERMINAL RANDOM NO -----------: " + termRndNo);
            long serialReqTime = System.currentTimeMillis();
            System.out.println("++++++++SerialManager REQUEST time :+++++ " + serialReqTime);

            //Check autoload is enable or not and payment amount is greater than card balance
            boolean autoload = false;
            if ((null != getALStatus(purseData) && getALStatus(purseData).equals("Enabled")) && amount > Double.parseDouble(getPurseBal(purseData))) {
                autoload = true;
            }
            synchronized (syncObj) {
                SerialManager objSerialManager = new SerialManager();
                System.out.println("+++++++ Start In Synchornized");
                ezlink.info("+++++++ Start In Synchornized");
                objTerminalDataFromTerminal = objSerialManager.getDebitCmd(CardRndNo, termRndNo, xorAmount, purseData, autoload);
                Thread.sleep(3000);
                
                System.out.println("+++++++ Finish In Synchornized");
                ezlink.info("+++++++ Finish In Synchornized");
            }
            
            try {
                    objETranxLogDto = objETranxLogDtoMapper.validateTransactionLog(merchantNo, merchantTranxRefNo, orderNo, amount);
                    debitTraxValidationFlag = TerminalUtil.ValidateDebitTransaction(objETranxLogDto);
                    if (!debitTraxValidationFlag) {
                        DebitCommandFault objDebitCommandFault = new DebitCommandFault();
                        objDebitCommandFault.setMessage(StringConstants.ExceptionInfo.TRANX_COMPLETED_MESSAGE);
                        objDebitCommandFault.setFaultInfo(StringConstants.ExceptionInfo.TRANX_COMPLETED_MESSAGE_INFO);

                        ezlink.info("\n-----DC--------EXCEPTION----------------------");
                        ezlink.info("Response sent from getDebitCommand : " + new Date());
                        ezlink.info("Status : " + objDebitCommandFault.getMessage());
                        ezlink.info("Remarks : " + objDebitCommandFault.getFaultInfo());
                        ezlink.info("\n---------DC---------EXCEPTION-----------------");

                        throw new DebitCommandFault_Exception(objDebitCommandFault.getMessage(), objDebitCommandFault);
                    }
                } catch (DebitCommandFault_Exception e) {
                    ezlink.info("----------DebitCommandFault_Exception xxxxx -----------");
                    throw e;
                     
                } catch (Exception ex) {
                    ezlink.info("----------Exception xxxxx111111111111 -----------");
                    Logger.getLogger(DebitCommandServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
                    ex.printStackTrace();
                    ezlink.error(new Object(), ex);
                    DebitCommandFault objDebitCommandFault = new DebitCommandFault();
                    objDebitCommandFault.setMessage(StringConstants.Common.CONNECTION_ISSUE_MESSAGE);
                    objDebitCommandFault.setFaultInfo(StringConstants.Common.CONNECTION_ISSUE_MESSAGE_INFO);

                    ezlink.info("\n-------DC-----EXCEPTION-----------------------");
                    ezlink.info("Response sent from getDebitCommand : " + new Date());
                    ezlink.info("Status : " + objDebitCommandFault.getMessage());
                    ezlink.info("Remarks : " + objDebitCommandFault.getFaultInfo());
                    ezlink.info("\n--------DC------EXCEPTION---------------------");

                    throw new DebitCommandFault_Exception(objDebitCommandFault.getMessage(), objDebitCommandFault);
                }
            
            long serialResTime = System.currentTimeMillis();
            System.out.println("+++++++SerialManager Response time :++++++++ " + serialResTime);
            long timeTaken = serialResTime - serialReqTime;
            System.out.println("+++++++++Time taken to Serve within SERIALMANAGER +++++++ : " + timeTaken);
            if (null == objTerminalDataFromTerminal) {

                insertFaiedTranxDetail(objETranxLogDto.getTranxlogid(), StringConstants.ResponseCode.TERMINAL_CONNECTION_FAILED, StringConstants.ExceptionInfo.TERMINAL_CONNECTION_ERROR_MESSAGE);

                System.out.println("---------------Not recieving Debit Command from terminal -----------");
                ezlink.info("---------------Not recieving Debit Command from terminal -----------");
                DebitCommandFault objDebitCommandFault = new DebitCommandFault();
                objDebitCommandFault.setMessage(StringConstants.ExceptionInfo.TERMINAL_CONNECTION_ERROR_MESSAGE);
                objDebitCommandFault.setFaultInfo(StringConstants.ExceptionInfo.TERMINAL_CONNECTION_ERROR_MESSAGE_INFO);

                ezlink.info("\n------DC----EXCEPTION-------------------------");
                ezlink.info("Response sent from getDebitCommand : " + new Date());
                ezlink.info("Status : " + objDebitCommandFault.getMessage());
                ezlink.info("Remarks : " + objDebitCommandFault.getFaultInfo());
                ezlink.info("\n-------DC-----EXCEPTION-----------------------");

                throw new DebitCommandFault_Exception(objDebitCommandFault.getMessage(), objDebitCommandFault);
            }
            System.out.println("---------------END of Serial Manager -----------------------------------------------------------");
            ezlink.info("\n-----DC----------END of Serial Manager--------------------");

            System.out.println("+++Debit Command ++++" + objTerminalDataFromTerminal.getDebitCmd());
            objETerminalDataDto.setMerchantNo(merchantNo);
            objETerminalDataDto.setCan(cardNo);
            objETerminalDataDto.setOrderNo(orderNo);
            objETerminalDataDto.setMerchantTranxRefNo(merchantTranxRefNo);
            objETerminalDataDto.setHostCounter(hostRepeatedCounter);
            objETerminalDataDto.setAmount(amount);
            objETerminalDataDto.setUpdatedBy(StringConstants.Common.DBT_CMD_USER);
            objETerminalDataDto.setUpdatedDate(updatedDate);
            objETerminalDataDto.setTerminalRndNo(termRndNo);
            objETerminalDataDto.setCardRndNo(CardRndNo);
            objETerminalDataDto.setPurseData(purseData);
            objETerminalDataDto.setTranxlogId(objETranxLogDto.getTranxlogid());
            objETerminalDataDto.setDecryptReceiptStatus("N");
            objETerminalDataDto.setDebitCmd(objTerminalDataFromTerminal.getDebitCmd());
            objETerminalDataDto.setTerminalSessionKey(objTerminalDataFromTerminal.getTerminalSessionKey());
            objETerminalDataDto.setDebitSessionKey(objTerminalDataFromTerminal.getDebitSessionKey());
            objETerminalDataDto.setEzLinkString(objTerminalDataFromTerminal.getEzLinkString());

            System.out.println("++++" + objETerminalDataDto.toString());
            ezlink.info("++++" + objETerminalDataDto.toString());
            ETerminalDataDtolist = objETerminalDataDtoMapper.isRecordAvailable(merchantNo, merchantTranxRefNo, orderNo, cardNo);
            ezlink.info("\n+++++++++++++ ETerminalDataDtolist( " + ETerminalDataDtolist.isEmpty() +" / " + merchantTranxRefNo + ", " + orderNo + " )+++++++++++");
            System.out.println("SIZE : " + ETerminalDataDtolist.size());
            ezlink.info("SIZE ETerminalDataDtolist: " + ETerminalDataDtolist.size());
            ezlink.info("\n---------------------------- Receipt_Data of Terminal---------------: " + objETerminalDataDto.getRecieptData());
            if (ETerminalDataDtolist!=null && !ETerminalDataDtolist.isEmpty()) {
                objETerminalDataDto.setSno(ETerminalDataDtolist.get(0).getSno());
                ezlink.info("updateETerminalDataBySNo with merchantTranxRefNo: " +merchantTranxRefNo);
                result = objETerminalDataDtoMapper.updateETerminalDataBySNo(objETerminalDataDto);
                System.out.println(" Updation Result : " + result);
                ezlink.info(" Updation Result : " + result);
            } else {
                objETerminalDataDto.setRecieptData(null);
                ezlink.info("insertETerminalData with merchantTranxRefNo: " +merchantTranxRefNo);
                result = objETerminalDataDtoMapper.insert(objETerminalDataDto);
                System.out.println(" Insertion Result : " + result);
                ezlink.info(" Insertion Result : " + result);
            }

        } 
          catch (DebitCommandFault_Exception ex) {
               ezlink.info("before in Tranx detail table details");
            insertFaiedTranxDetail(objETranxLogDto.getTranxlogid(), StringConstants.ResponseCode.TERMINAL_CONNECTION_FAILED, StringConstants.ExceptionInfo.TERMINAL_CONNECTION_ERROR_MESSAGE);

                throw ex;
            }
        
        catch (Exception e) {

            ezlink.info("Insert  tranx details");
            insertFaiedTranxDetail(objETranxLogDto.getTranxlogid(), StringConstants.ResponseCode.TERMINAL_CONNECTION_FAILED, StringConstants.ExceptionInfo.TERMINAL_CONNECTION_ERROR_MESSAGE);
            
            DebitCommandFault objDebitCommandFault = new DebitCommandFault();
            objDebitCommandFault.setMessage(StringConstants.ExceptionInfo.TERMINAL_CONNECTION_ERROR_MESSAGE);
            objDebitCommandFault.setFaultInfo(StringConstants.ExceptionInfo.TERMINAL_CONNECTION_ERROR_MESSAGE_INFO);
            
            //e.printStackTrace();
            ezlink.error(new Object(), e);

            ezlink.info("\n------DC----EXCEPTION-------------------------");
            ezlink.info("Response sent from getDebitCommand : " + new Date());
            ezlink.info("Status : " + objDebitCommandFault.getMessage());
            ezlink.info("Remarks : " + objDebitCommandFault.getFaultInfo());
            ezlink.info("\n-------DC-----EXCEPTION-----------------------");

            //---------------------------------------------------------------------------------------------------
            //Updating Terminal COnnection failed response code
            try {
                objETranxLogDto.setDatetime(updatedDate);
                objETranxLogDto.setResponseCode(StringConstants.ResponseCode.TERMINAL_CONNECTION_FAILED);
                result = objETranxLogDtoMapper.updateResponseCode(objETranxLogDto);
                System.out.println(" tranxlog Updation Result : " + result);
                if (result != 1) {
                    DebitCommandFault objTerminalFailedDebitCommandFault = new DebitCommandFault();
                    objTerminalFailedDebitCommandFault.setMessage(StringConstants.Common.INSERTION_FAILED_MESSAGE);
                    objTerminalFailedDebitCommandFault.setFaultInfo(StringConstants.Common.INSERTION_FAILED_MESSAGE_INFO);

                    ezlink.info("\n------DC------EXCEPTION-----------------------");
                    ezlink.info("Response sent from getDebitCommand : " + new Date());
                    ezlink.info("Status : " + objTerminalFailedDebitCommandFault.getMessage());
                    ezlink.info("Remarks : " + objTerminalFailedDebitCommandFault.getFaultInfo());
                    ezlink.info("\n---------DC-------EXCEPTION-------------------");

                    throw new DebitCommandFault_Exception(objTerminalFailedDebitCommandFault.getMessage(), objTerminalFailedDebitCommandFault);
                } else {
                    objTerminalUtil = new TerminalUtil();
                    if (result != 1) {
                        DebitCommandFault objTranxDetailDebitCommandFault = new DebitCommandFault();
                        objTranxDetailDebitCommandFault.setMessage(StringConstants.Common.INSERTION_FAILED_MESSAGE);
                        objTranxDetailDebitCommandFault.setFaultInfo(StringConstants.Common.INSERTION_FAILED_MESSAGE_INFO);

                        ezlink.info("\n------DC--TRANX DETAIL----EXCEPTION-----------------------");
                        ezlink.info("Response sent from getDebitCommand : " + new Date());
                        ezlink.info("Status : " + objDebitCommandFault.getMessage());
                        ezlink.info("Remarks : " + objDebitCommandFault.getFaultInfo());
                        ezlink.info("\n---------DC-------EXCEPTION-------------------");

                        throw new DebitCommandFault_Exception(objTranxDetailDebitCommandFault.getMessage(), objTranxDetailDebitCommandFault);
                    }
                }

            } catch (DebitCommandFault_Exception ex) {
                throw ex;
            } catch (Exception ex) {
                DebitCommandFault objSQLDebitCommandFault = new DebitCommandFault();
                objSQLDebitCommandFault.setMessage(StringConstants.ExceptionInfo.DB_CONNECTION_ERROR_MESSAGE);
                objSQLDebitCommandFault.setFaultInfo(StringConstants.ExceptionInfo.DB_CONNECTION_ERROR_MESSAGE_INFO);
                ex.printStackTrace();
                ezlink.error(new Object(), ex);

                ezlink.info("\n-------DC-----EXCEPTION-----------------------");
                ezlink.info("Response sent from getDebitCommand : " + new Date());
                ezlink.info("Status : " + objSQLDebitCommandFault.getMessage());
                ezlink.info("Remarks : " + objSQLDebitCommandFault.getFaultInfo());
                ezlink.info("\n-------DC-------EXCEPTION---------------------");

                throw new DebitCommandFault_Exception(objSQLDebitCommandFault.getMessage(), objSQLDebitCommandFault);
            }

            throw new DebitCommandFault_Exception(objDebitCommandFault.getMessage(), objDebitCommandFault);
             }
        //Transaction detail insertion failed
        if (result == 0) {

            DebitCommandFault objDebitCommandFault = new DebitCommandFault();
            objDebitCommandFault.setMessage(StringConstants.Common.INSERTION_FAILED_MESSAGE);
            objDebitCommandFault.setFaultInfo(StringConstants.Common.INSERTION_FAILED_MESSAGE_INFO);

            ezlink.info("\n-----DC-------EXCEPTION-----------------------");
            ezlink.info("Response sent from getDebitCommand : " + new Date());
            ezlink.info("Status : " + objDebitCommandFault.getMessage());
            ezlink.info("Remarks : " + objDebitCommandFault.getFaultInfo());
            ezlink.info("\n-----DC--------EXCEPTION----------------------");

            throw new DebitCommandFault_Exception(objDebitCommandFault.getMessage(), objDebitCommandFault);
        }

        //---------------------------------------------------------------------------------------------------
        //Updating success response code
        try {
            objETranxLogDto.setDatetime(updatedDate);
            objETranxLogDto.setResponseCode(StringConstants.ResponseCode.SUCCESS);
            result = objETranxLogDtoMapper.updateDebitCommandStatus(objETranxLogDto);
            System.out.println(" tranxlog Updation Result : " + result);
            if (result != 1) {
                DebitCommandFault objDebitCommandFault = new DebitCommandFault();
                objDebitCommandFault.setMessage(StringConstants.Common.INSERTION_FAILED_MESSAGE);
                objDebitCommandFault.setFaultInfo(StringConstants.Common.INSERTION_FAILED_MESSAGE_INFO);

                ezlink.info("\n------DC------EXCEPTION-----------------------");
                ezlink.info("Response sent from getDebitCommand : " + new Date());
                ezlink.info("Status : " + objDebitCommandFault.getMessage());
                ezlink.info("Remarks : " + objDebitCommandFault.getFaultInfo());
                ezlink.info("\n---------DC-------EXCEPTION-------------------");

                throw new DebitCommandFault_Exception(objDebitCommandFault.getMessage(), objDebitCommandFault);
            } else {
                objTerminalUtil = new TerminalUtil();
                result = objTerminalUtil.insertTransactionDetail(objETranxLogDto.getTranxlogid(), StringConstants.Common.TRANX_TYPE_DEBIT, StringConstants.ResponseCode.SUCCESS, StringConstants.Common.STATUS_SUCCESS);
                if (result != 1) {
                    DebitCommandFault objDebitCommandFault = new DebitCommandFault();
                    objDebitCommandFault.setMessage(StringConstants.Common.INSERTION_FAILED_MESSAGE);
                    objDebitCommandFault.setFaultInfo(StringConstants.Common.INSERTION_FAILED_MESSAGE_INFO);

                    ezlink.info("\n------DC--TRANX DETAIL----EXCEPTION-----------------------");
                    ezlink.info("Response sent from getDebitCommand : " + new Date());
                    ezlink.info("Status : " + objDebitCommandFault.getMessage());
                    ezlink.info("Remarks : " + objDebitCommandFault.getFaultInfo());
                    ezlink.info("\n---------DC-------EXCEPTION-------------------");

                    throw new DebitCommandFault_Exception(objDebitCommandFault.getMessage(), objDebitCommandFault);
                }
            }

        } catch (DebitCommandFault_Exception e) {
            throw e;
        } catch (Exception e) {

            DebitCommandFault objDebitCommandFault = new DebitCommandFault();
            objDebitCommandFault.setMessage(StringConstants.ExceptionInfo.DB_CONNECTION_ERROR_MESSAGE);
            objDebitCommandFault.setFaultInfo(StringConstants.ExceptionInfo.DB_CONNECTION_ERROR_MESSAGE_INFO);
            e.printStackTrace();
            ezlink.error(new Object(), e);

            ezlink.info("\n-------DC-----EXCEPTION-----------------------");
            ezlink.info("Response sent from getDebitCommand : " + new Date());
            ezlink.info("Status : " + objDebitCommandFault.getMessage());
            ezlink.info("Remarks : " + objDebitCommandFault.getFaultInfo());
            ezlink.info("\n-------DC-------EXCEPTION---------------------");

            throw new DebitCommandFault_Exception(objDebitCommandFault.getMessage(), objDebitCommandFault);
        }

        objDebitCommandRes.setORDERNO(objETerminalDataDto.getOrderNo());
        objDebitCommandRes.setMERCHANTREFNO(objETerminalDataDto.getMerchantTranxRefNo());
        objDebitCommandRes.setCAN(objETerminalDataDto.getCan());
        objDebitCommandRes.setDEBITCOMMAND(objETerminalDataDto.getDebitCmd());

        ezlink.info("\n-------DC-------RESPONSE---------------------");
        ezlink.info("Response sent from getDebitCommand : " + new Date());
        ezlink.info("Order No : " + objDebitCommandRes.getORDERNO());
        ezlink.info("Merchant Ref no : " + objDebitCommandRes.getMERCHANTREFNO());
        ezlink.info("CAN: " + objDebitCommandRes.getCAN());
        ezlink.info("Debit Command : " + objDebitCommandRes.getDEBITCOMMAND());
        ezlink.info("\n-------DC-------RESPONSE---------------------");
        ezlink.info("\n-------DC-------PURSE DATA---------------" + purseData);

//        result = objTerminalUtil.insertTransactionDetail(objETranxLogDto.getTranxlogid(), StringConstants.Common.TRANX_TYPE_DEBIT, StringConstants.ResponseCode.SUCCESS, StringConstants.Common.STATUS_SUCCESS);
        return objDebitCommandRes;
    }

    public void insertFaiedTranxDetail(String tranxLogId, String responceCode, String detail) {
        TerminalUtil objTerminalUtil = new TerminalUtil();
        int result = objTerminalUtil.insertTransactionDetail(tranxLogId, StringConstants.Common.TRANX_TYPE_DEBIT, responceCode, detail);
        ezlink.info("\n-------DC-------Insert for failed Tranx Details---------------------");
        ezlink.info("Failed Tranx Updated result : " + result);
        ezlink.info("\n-------DC-------Insert for failed Tranx Details---------------------");

    }

    public String getALStatus(String result) {
        byte byte0 = Byte.parseByte(result.substring(2, 4), 16);
        if ((byte) (byte0 & 1) == 0) {
            return "N.A.";
        }
        if ((byte) (byte0 & 2) == 0) {
            return "Not Enabled";
        } else {
            return "Enabled";
        }
    }

    public String getPurseBal(String result) {
        String purseBal = result.substring(4, 10);
        int balanceStr = Integer.parseInt(purseBal, 16);
        BigDecimal balance = BigDecimal.valueOf((long) balanceStr, 2);
        return String.valueOf(balance);
    }

    private String getBDC(String purseData) {
        String reasonCode = purseData.substring(126, 128);
        int bdc = Integer.parseInt(reasonCode, 16) & 0x03;
        return String.valueOf(bdc);
    }
}
