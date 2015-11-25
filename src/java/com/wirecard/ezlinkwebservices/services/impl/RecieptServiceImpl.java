/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wirecard.ezlinkwebservices.services.impl;

import com.ezlinkwebservices.service.reciept.RecieptFault;
import com.ezlinkwebservices.service.reciept.request.EZLINGWSREQENV;
import com.ezlinkwebservices.service.reciept.RecieptFault_Exception;
import com.ezlinkwebservices.service.reciept.response.RecieptRes;
import com.wirecard.ezlinkwebservices.dto.EMerchantDetailsDto;
import com.wirecard.ezlinkwebservices.mapperdao.EMerchantDetailsDtoMapper;
import com.wirecard.ezlinkwebservices.constants.StringConstants;
import com.wirecard.ezlinkwebservices.dto.ETerminalDataDto;
import com.wirecard.ezlinkwebservices.dto.ETranxLogDto;
import com.wirecard.ezlinkwebservices.mapperdao.ETerminalDataDtoMapper;
import com.wirecard.ezlinkwebservices.mapperdao.ETranxLogDtoMapper;

import com.wirecard.ezlinkwebservices.services.RecieptService;
import com.wirecard.ezlinkwebservices.util.TerminalUtil;
import java.sql.SQLException;
import java.util.Date;
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
public class RecieptServiceImpl implements RecieptService {

    @Autowired
    EMerchantDetailsDtoMapper objEMerchantDetailsDtoMapper;
    @Autowired
    ETranxLogDtoMapper objETranxLogDtoMapper;
    @Autowired
    ETerminalDataDtoMapper objETerminalDataDtoMapper;
    @Autowired
    ETerminalDataDto objETerminalDataDto;

    private static final org.apache.log4j.Logger ezlink = org.apache.log4j.Logger.getLogger(RecieptServiceImpl.class);

    @Override
    public RecieptRes getReciept(EZLINGWSREQENV parameters) throws RecieptFault_Exception {

        ezlink.info("Reciept Request received in " + RecieptServiceImpl.class.getName());

        String merchantNo, orderNo, cardNo, recieptData;
        String recieptReqErrorCode, recieptReqErrorErrorDesc;
        String decryptedRecieptData;

        ETranxLogDto objETranxLogDto;
        EMerchantDetailsDto objEMerchantDetailsDto;
        int hostRepeatedCounter = 0;
        double amount;
        int result;
        boolean RecieptTraxValidationFlag = false;

        RecieptRes objRecieptRes = new RecieptRes();
        Date updatedDate = new Date();
        ETerminalDataDto objAvailableETerminalDataDto;

        try {

            merchantNo = parameters.getEZLINGWSREQBODY().getRecieptReq().getMERCHANTNO();
            orderNo = parameters.getEZLINGWSREQBODY().getRecieptReq().getORDERNO();
            cardNo = parameters.getEZLINGWSREQBODY().getRecieptReq().getCAN();
            amount = parameters.getEZLINGWSREQBODY().getRecieptReq().getAMOUNT().doubleValue();
            recieptData = parameters.getEZLINGWSREQBODY().getRecieptReq().getRECIEPTDATA();
            recieptReqErrorCode = parameters.getEZLINGWSREQBODY().getRecieptReqError().getREERRORCODE();
            recieptReqErrorErrorDesc = parameters.getEZLINGWSREQBODY().getRecieptReqError().getREERRORDESC();

            // log the response send time and parameters
            ezlink.info("\n-------Reciept----REQUEST----------------------------------------------");
            ezlink.info("SOURCE ID : " + parameters.getEZLINGWSHEADER().getSOURCEID());
            ezlink.info("IP : " + parameters.getEZLINGWSHEADER().getIPADDRESS());
            ezlink.info("SEC LEVEL : " + parameters.getEZLINGWSHEADER().getSECURITYLEVEL());
            ezlink.info("BODY+++ getDebitCommand : " + new Date());
            ezlink.info("merchantNo : " + merchantNo);
            ezlink.info("orderNo : " + orderNo);
            ezlink.info("amount : " + amount);
            ezlink.info("cardNo : " + cardNo);
            ezlink.info("Reciept Data : " + recieptData);
            ezlink.info("Request Error Code : " + recieptReqErrorCode);
            ezlink.info("Request Error Description : " + recieptReqErrorErrorDesc);
            ezlink.info("\n-------RD-----REQUEST----------------------------------------------");

        } catch (Exception ex) {
            ezlink.error(new Object(), ex);
            Logger.getLogger(DebitCommandServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
            ezlink.error(new Object(), ex);
            RecieptFault objRecieptFault = new RecieptFault();
            objRecieptFault.setMessage(StringConstants.Common.REQUIRED_FIELD_MISSING);
            objRecieptFault.setFaultInfo(StringConstants.Common.REQUIRED_FIELD_MISSING_INFO);

            ezlink.info("\n-----Reciept------EXCEPTION------------------------");
            ezlink.info("Response sent from getReciept : " + new Date());
            ezlink.info("Status : " + objRecieptFault.getMessage());
            ezlink.info("Remarks : " + objRecieptFault.getFaultInfo());
            ezlink.info("\n------Reciept---------EXCEPTION--------------------");

            throw new RecieptFault_Exception(objRecieptFault.getMessage(), objRecieptFault);

        }
        try {
            SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
            objEMerchantDetailsDto = objEMerchantDetailsDtoMapper.getMerchantByMerchantId(merchantNo);
        } catch (SQLException ex) {
            ezlink.error(new Object(), ex);
            Logger.getLogger(DebitCommandServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
            ezlink.error(new Object(), ex);

            RecieptFault objRecieptFault = new RecieptFault();
            objRecieptFault.setMessage(StringConstants.Common.CONNECTION_ISSUE_MESSAGE);
            objRecieptFault.setFaultInfo(StringConstants.Common.CONNECTION_ISSUE_MESSAGE_INFO);

            ezlink.info("\n-----Reciept------EXCEPTION------------------------");
            ezlink.info("Response sent from getReciept : " + new Date());
            ezlink.info("Status : " + objRecieptFault.getMessage());
            ezlink.info("Remarks : " + objRecieptFault.getFaultInfo());
            ezlink.info("\n------Reciept---------EXCEPTION--------------------");

            throw new RecieptFault_Exception(objRecieptFault.getMessage(), objRecieptFault);

        }
        if (objEMerchantDetailsDto == null) {
            RecieptFault objRecieptFault = new RecieptFault();
            objRecieptFault.setMessage(StringConstants.Common.NO_MERCHANT_AVAILABLE);
            objRecieptFault.setFaultInfo(StringConstants.Common.NO_MERCHANT_AVAILABLE_INFO);

            ezlink.info("\n-----Reciept------EXCEPTION------------------------");
            ezlink.info("Response sent from getReciept : " + new Date());
            ezlink.info("Status : " + objRecieptFault.getMessage());
            ezlink.info("Remarks : " + objRecieptFault.getFaultInfo());
            ezlink.info("\n------Reciept---------EXCEPTION--------------------");

            throw new RecieptFault_Exception(objRecieptFault.getMessage(), objRecieptFault);

        }

        if ((!objEMerchantDetailsDto.getSecurityLevel().equalsIgnoreCase(parameters.getEZLINGWSHEADER().getSECURITYLEVEL()))) {
            RecieptFault objRecieptFault = new RecieptFault();
            objRecieptFault.setMessage(StringConstants.ExceptionInfo.INVALID_SECURITY_LEVEL_MESSAGE);
            objRecieptFault.setFaultInfo(StringConstants.ExceptionInfo.INVALID_SECURITY_LEVEL_MESSAGE_INFO);

            ezlink.info("\n-----Reciept------EXCEPTION------------------------");
            ezlink.info("Response sent from getReciept : " + new Date());
            ezlink.info("Status : " + objRecieptFault.getMessage());
            ezlink.info("Remarks : " + objRecieptFault.getFaultInfo());
            ezlink.info("\n------Reciept---------EXCEPTION--------------------");

            throw new RecieptFault_Exception(objRecieptFault.getMessage(), objRecieptFault);
        }

        if ((!objEMerchantDetailsDto.getAccessCode().equalsIgnoreCase(parameters.getEZLINGWSHEADER().getACCESSCODE()))) {
            RecieptFault objRecieptFault = new RecieptFault();
            objRecieptFault.setMessage(StringConstants.ExceptionInfo.INVALID_ACCESS_CODE_MESSAGE);
            objRecieptFault.setFaultInfo(StringConstants.ExceptionInfo.INVALID_ACCESS_CODE_MESSAGE_INFO);

            ezlink.info("\n-----Reciept------EXCEPTION------------------------");
            ezlink.info("Response sent from getReciept : " + new Date());
            ezlink.info("Status : " + objRecieptFault.getMessage());
            ezlink.info("Remarks : " + objRecieptFault.getFaultInfo());
            ezlink.info("\n------Reciept---------EXCEPTION--------------------");

            throw new RecieptFault_Exception(objRecieptFault.getMessage(), objRecieptFault);

        }
        try {
            //Check transaction available in ETranxLog 
            objETranxLogDto = objETranxLogDtoMapper.validateTransactionLog(merchantNo, orderNo, amount);
        } catch (Exception ex) {
            Logger.getLogger(DebitCommandServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
            ezlink.error(new Object(), ex);

            RecieptFault objRecieptFault = new RecieptFault();
            objRecieptFault.setMessage(StringConstants.Common.CONNECTION_ISSUE_MESSAGE);
            objRecieptFault.setFaultInfo(StringConstants.Common.CONNECTION_ISSUE_MESSAGE_INFO);

            ezlink.info("\n-----Reciept------EXCEPTION------------------------");
            ezlink.info("Response sent from getReciept : " + new Date());
            ezlink.info("Status : " + objRecieptFault.getMessage());
            ezlink.info("Remarks : " + objRecieptFault.getFaultInfo());
            ezlink.info("\n------Reciept---------EXCEPTION--------------------");

            throw new RecieptFault_Exception(objRecieptFault.getMessage(), objRecieptFault);

        }

        ezlink.info("\n-------RECIEPT----------------------------");

        if (null == objETranxLogDto) {
            RecieptFault objRecieptFault = new RecieptFault();
            objRecieptFault.setMessage(StringConstants.ExceptionInfo.NO_TRANSACTION_AVAILABLE_MESSAGE);
            objRecieptFault.setFaultInfo(StringConstants.ExceptionInfo.NO_TRANSACTION_AVAILABLE_MESSAGE_INFO);

            ezlink.info("\n-----Reciept------EXCEPTION------------------------");
            ezlink.info("Response sent from getReciept : " + new Date());
            ezlink.info("Status : " + objRecieptFault.getMessage());
            ezlink.info("Remarks : " + objRecieptFault.getFaultInfo());
            ezlink.info("\n------Reciept---------EXCEPTION--------------------");

            throw new RecieptFault_Exception(objRecieptFault.getMessage(), objRecieptFault);
        }
        //check status not "Completed"
        System.out.println("+++++++++++++++Tranx Status from DB : " + objETranxLogDto.getTranxStatus());
        System.out.println("+++++++++++++++Response Code from DB : " + objETranxLogDto.getResponseCode());
        ezlink.info("++Transaction Status in DB ++: " + objETranxLogDto.getTranxStatus());
        ezlink.info("++Response Code in DB ++: " + objETranxLogDto.getResponseCode());
        
        // if receipt data is empty, just insert into tranx_detail
        if(recieptData.equals("") || null == recieptData) {
            insertFaiedTranxDetail(objETranxLogDto.getTranxlogid(), recieptReqErrorCode, recieptReqErrorErrorDesc);
            
            objRecieptRes.setORDERNO(orderNo);
            objRecieptRes.setMERCHANTREFNO(orderNo);
            objRecieptRes.setCAN(cardNo);
            objRecieptRes.setSTATUSCODE(StringConstants.Common.STATUS_SUCCESS);
            objRecieptRes.setSTATUSDESC(StringConstants.Common.STATUS_SUCCESS_INFO);
            
            return objRecieptRes;
        }
        try {
            RecieptTraxValidationFlag = TerminalUtil.ValidateRecieptTransaction(objETranxLogDto);
            
             if (RecieptTraxValidationFlag) {
             RecieptFault objRecieptFault = new RecieptFault();
             objRecieptFault.setMessage(StringConstants.ExceptionInfo.TRANX_COMPLETED_MESSAGE);
             objRecieptFault.setFaultInfo(StringConstants.ExceptionInfo.TRANX_COMPLETED_MESSAGE_INFO);

             ezlink.info("\n-----Reciept--------EXCEPTION----------------------");
             ezlink.info("Response sent from getDebitCommand : " + new Date());
             ezlink.info("Status : " + objRecieptFault.getMessage());
             ezlink.info("Remarks : " + objRecieptFault.getFaultInfo());
             ezlink.info("\n---------Reciept---------EXCEPTION-----------------");

             throw new RecieptFault_Exception(objRecieptFault.getMessage(), objRecieptFault);
             }
             

            //Repeated host Count
            objAvailableETerminalDataDto = objETerminalDataDtoMapper.isRepeatedMerchantTranxRefNo(merchantNo, orderNo, cardNo);
        } catch (RecieptFault_Exception e) {
            throw e;
        } catch (Exception ex) {

            insertFaiedTranxDetail(objETranxLogDto.getTranxlogid(), StringConstants.ResponseCode.TRANX_COMPLETED_ALREADY, StringConstants.ExceptionInfo.TRANX_COMPLETED_MESSAGE);

            Logger.getLogger(DebitCommandServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
            ezlink.error(new Object(), ex);

            RecieptFault objRecieptFault = new RecieptFault();
            objRecieptFault.setMessage(StringConstants.Common.TRANX_COMPLETED_MESSAGE);
            objRecieptFault.setFaultInfo(StringConstants.Common.TRANX_COMPLETED_MESSAGE_INFO);

            ezlink.info("\n-----Reciept------EXCEPTION------------------------");
            ezlink.info("Response sent from getReciept : " + new Date());
            ezlink.info("Status : " + objRecieptFault.getMessage());
            ezlink.info("Remarks : " + objRecieptFault.getFaultInfo());
            ezlink.info("\n------Reciept---------EXCEPTION--------------------");

            throw new RecieptFault_Exception(objRecieptFault.getMessage(), objRecieptFault);

        }
        if (objAvailableETerminalDataDto == null) {

            insertFaiedTranxDetail(objETranxLogDto.getTranxlogid(), StringConstants.ResponseCode.NO_DEBIT_COMMAND_DETAILS_AVAILABLE, StringConstants.ExceptionInfo.NO_DEBITCOMMAND_DETAILS_AVAILABLE_MESSAGE);

            RecieptFault objRecieptFault = new RecieptFault();
            objRecieptFault.setMessage(StringConstants.ExceptionInfo.NO_DEBITCOMMAND_DETAILS_AVAILABLE_MESSAGE);
            objRecieptFault.setFaultInfo(StringConstants.ExceptionInfo.NO_DEBITCOMMAND_DETAILS_AVAILABLE_MESSAGE_INFO);

            ezlink.info("\n-----Reciept------EXCEPTION------------------------");
            ezlink.info("Response sent from getReciept : " + new Date());
            ezlink.info("Status : " + objRecieptFault.getMessage());
            ezlink.info("Remarks : " + objRecieptFault.getFaultInfo());
            ezlink.info("\n------Reciept---------EXCEPTION--------------------");

            throw new RecieptFault_Exception(objRecieptFault.getMessage(), objRecieptFault);

        }
        /*
         //--------------------------------------------------------------------------------------------------------------------
         //Updating tranxlog status R
         try {
         objETranxLogDto.setDatetime(updatedDate);
         //objETranxLogDto.setResponseCode(StringConstants.ResponseCode.SUCCESS);
         result = objETranxLogDtoMapper.updateRecieptDataStatus(objETranxLogDto);
         System.out.println(" tranxlog Updation Result : " + result);
         if (result == 0) {
         RecieptFault objRecieptFault = new RecieptFault();
         objRecieptFault.setMessage(StringConstants.Common.INSERTION_FAILED_MESSAGE);
         objRecieptFault.setFaultInfo(StringConstants.Common.INSERTION_FAILED_MESSAGE_INFO);

         ezlink.info("\n-----Reciept------EXCEPTION------------------------");
         ezlink.info("Response sent from getReciept : " + new Date());
         ezlink.info("Status : " + objRecieptFault.getMessage());
         ezlink.info("Remarks : " + objRecieptFault.getFaultInfo());
         ezlink.info("\n------Reciept---------EXCEPTION--------------------");

         throw new RecieptFault_Exception(objRecieptFault.getMessage(), objRecieptFault);
         }
         } catch (Exception e) {
         ezlink.error(new Object(), e);
            
         RecieptFault objRecieptFault = new RecieptFault();
         objRecieptFault.setMessage(StringConstants.ExceptionInfo.TERMINAL_CONNECTION_ERROR_MESSAGE);
         objRecieptFault.setFaultInfo(StringConstants.ExceptionInfo.TERMINAL_CONNECTION_ERROR_MESSAGE_INFO);
         e.printStackTrace();

         ezlink.info("\n-----Reciept------EXCEPTION------------------------");
         ezlink.info("Response sent from getReciept : " + new Date());
         ezlink.info("Status : " + objRecieptFault.getMessage());
         ezlink.info("Remarks : " + objRecieptFault.getFaultInfo());
         ezlink.info("\n------Reciept---------EXCEPTION--------------------");

         throw new RecieptFault_Exception(objRecieptFault.getMessage(), objRecieptFault);
         }
         */

        //----------------------SERIAL CONNECTION------------------------------------------------------------------------
        try {
//            Thread.sleep(5000);
//            SerialManager objSerialManager = new SerialManager();
//            objAvailableETerminalDataDto.setRecieptData(recieptData);
//            synchronized (this) {
//                decryptedRecieptData = objSerialManager.getDecryptedRecieptData(objAvailableETerminalDataDto);
//            }
            
            // Close port if needed
        } catch (Exception e) {

            insertFaiedTranxDetail(objETranxLogDto.getTranxlogid(), StringConstants.ResponseCode.TERMINAL_CONNECTION_FAILED, StringConstants.ExceptionInfo.TERMINAL_CONNECTION_ERROR_MESSAGE);

            System.out.println("++++++++++++EXCEPTION IN SERIAL++++++++++++++++++++++++++");
            e.printStackTrace();

            RecieptFault objRecieptFault = new RecieptFault();
            objRecieptFault.setMessage(StringConstants.ExceptionInfo.TERMINAL_CONNECTION_ERROR_MESSAGE);
            objRecieptFault.setFaultInfo(StringConstants.ExceptionInfo.TERMINAL_CONNECTION_ERROR_MESSAGE_INFO);
            e.printStackTrace();
            ezlink.error(new Object(), e);

            ezlink.info("\n------RE----EXCEPTION-------------------------");
            ezlink.info("Response sent from getDebitCommand : " + new Date());
            ezlink.info("Status : " + objRecieptFault.getMessage());
            ezlink.info("Remarks : " + objRecieptFault.getFaultInfo());
            ezlink.info("\n-------RE-----EXCEPTION-----------------------");

            throw new RecieptFault_Exception(objRecieptFault.getMessage(), objRecieptFault);
        }
        //----------------------SERIAL CONNECTION------------------------------------------------------------------------

        if (objAvailableETerminalDataDto.getRecieptData() != null) {
            hostRepeatedCounter = objAvailableETerminalDataDto.getHostCounter();
            hostRepeatedCounter++;
        }

        objETerminalDataDto.setMerchantNo(merchantNo);
        objETerminalDataDto.setCan(cardNo);
        objETerminalDataDto.setOrderNo(orderNo);
//        objETerminalDataDto.setMerchantTranxRefNo(merchantTranxRefNo);
        objETerminalDataDto.setHostCounter(hostRepeatedCounter);
        objETerminalDataDto.setAmount(amount);
        objETerminalDataDto.setRecieptSessionKey(objAvailableETerminalDataDto.getDebitSessionKey());
        objETerminalDataDto.setRecieptData(recieptData);
        objETerminalDataDto.setUpdatedBy(StringConstants.Common.REC_DTA_USER);
        objETerminalDataDto.setUpdatedDate(updatedDate);
        objETerminalDataDto.setSno(objAvailableETerminalDataDto.getSno());
        objETerminalDataDto.setTranxlogId(objETranxLogDto.getTranxlogid());
        try {
            result = objETerminalDataDtoMapper.updateETerminalDataBySNo(objETerminalDataDto);
            System.out.println(" Updation Result : " + result);

            objRecieptRes.setORDERNO(orderNo);
            objRecieptRes.setMERCHANTREFNO(orderNo);
            objRecieptRes.setCAN(cardNo);
            objRecieptRes.setSTATUSCODE(StringConstants.Common.STATUS_SUCCESS);
            objRecieptRes.setSTATUSDESC(StringConstants.Common.STATUS_SUCCESS_INFO);
            if (result == 0) {
                objRecieptRes.setSTATUSCODE(StringConstants.Common.STATUS_FAILED);
                objRecieptRes.setSTATUSDESC(StringConstants.Common.STATUS_FAILED_INFO);

                insertFaiedTranxDetail(objETranxLogDto.getTranxlogid(), StringConstants.ResponseCode.RECIEPT_DATA_UPDATION_FAILED, StringConstants.ExceptionInfo.RECIEPT_DATA_UPDATION_MESSAGE);

            }
        } catch (SQLException e) {

            insertFaiedTranxDetail(objETranxLogDto.getTranxlogid(), StringConstants.ResponseCode.RECIEPT_DATA_UPDATION_FAILED, StringConstants.ExceptionInfo.RECIEPT_DATA_UPDATION_MESSAGE);

            ezlink.error(new Object(), e);
            RecieptFault objRecieptFault = new RecieptFault();
            objRecieptFault.setMessage(StringConstants.Common.RECIEPTDATA_UPDATION_FAILED);
            objRecieptFault.setFaultInfo(StringConstants.Common.RECIEPTDATA_UPDATION_FAILED_INFO);
            e.printStackTrace();

            ezlink.info("\n-----Reciept------EXCEPTION------------------------");
            ezlink.info("Response sent from getReciept : " + new Date());
            ezlink.info("Status : " + objRecieptFault.getMessage());
            ezlink.info("Remarks : " + objRecieptFault.getFaultInfo());
            ezlink.info("\n------Reciept---------EXCEPTION--------------------");

            throw new RecieptFault_Exception(objRecieptFault.getMessage(), objRecieptFault);
        }

        //Updating success response code
        try {
            objETranxLogDto.setDatetime(updatedDate);
            objETranxLogDto.setResponseCode(StringConstants.ResponseCode.SUCCESS);
            result = objETranxLogDtoMapper.updateRecieptDataStatus(objETranxLogDto);
            System.out.println(" tranxlog Updation Result : " + result);
            if (result != 1) {

                insertFaiedTranxDetail(objETranxLogDto.getTranxlogid(), StringConstants.ResponseCode.RECIEPT_DATA_UPDATION_FAILED, StringConstants.ExceptionInfo.RECIEPT_DATA_UPDATION_MESSAGE);

                RecieptFault objRecieptFault = new RecieptFault();
                objRecieptFault.setMessage(StringConstants.Common.INSERTION_FAILED_MESSAGE);
                objRecieptFault.setFaultInfo(StringConstants.Common.INSERTION_FAILED_MESSAGE_INFO);

                ezlink.info("\n------DC------EXCEPTION-----------------------");
                ezlink.info("Response sent from getDebitCommand : " + new Date());
                ezlink.info("Status : " + objRecieptFault.getMessage());
                ezlink.info("Remarks : " + objRecieptFault.getFaultInfo());
                ezlink.info("\n---------DC-------EXCEPTION-------------------");

                throw new RecieptFault_Exception(objRecieptFault.getMessage(), objRecieptFault);
            } else {
                TerminalUtil objTerminalUtil = new TerminalUtil();
                result = objTerminalUtil.insertTransactionDetail(objETranxLogDto.getTranxlogid(), StringConstants.Common.TRANX_TYPE_RECIEPT, StringConstants.ResponseCode.SUCCESS, StringConstants.Common.STATUS_SUCCESS);
                if (result != 1) {
                    RecieptFault objRecieptFault = new RecieptFault();
                    objRecieptFault.setMessage(StringConstants.Common.INSERTION_FAILED_MESSAGE);
                    objRecieptFault.setFaultInfo(StringConstants.Common.INSERTION_FAILED_MESSAGE_INFO);

                    ezlink.info("\n------RECIPT--TRANX DETAIL----EXCEPTION-----------------------");
                    ezlink.info("Response sent from getDebitCommand : " + new Date());
                    ezlink.info("Status : " + objRecieptFault.getMessage());
                    ezlink.info("Remarks : " + objRecieptFault.getFaultInfo());
                    ezlink.info("\n---------RECIPT-------EXCEPTION-------------------");

                    throw new RecieptFault_Exception(objRecieptFault.getMessage(), objRecieptFault);
                }
            }

        } catch (RecieptFault_Exception e) {
            throw e;
        } catch (Exception e) {
            RecieptFault objRecieptFault = new RecieptFault();
            objRecieptFault.setMessage(StringConstants.ExceptionInfo.DB_CONNECTION_ERROR_MESSAGE);
            objRecieptFault.setFaultInfo(StringConstants.ExceptionInfo.DB_CONNECTION_ERROR_MESSAGE_INFO);
            e.printStackTrace();
            ezlink.error(new Object(), e);

            ezlink.info("\n-------DC-----EXCEPTION-----------------------");
            ezlink.info("Response sent from getDebitCommand : " + new Date());
            ezlink.info("Status : " + objRecieptFault.getMessage());
            ezlink.info("Remarks : " + objRecieptFault.getFaultInfo());
            ezlink.info("\n-------DC-------EXCEPTION---------------------");

            throw new RecieptFault_Exception(objRecieptFault.getMessage(), objRecieptFault);
        }

        ezlink.info("\n-------RECIEPT-------RESPONSE---------------------");
        ezlink.info("Response sent from getDebitCommand : " + new Date());
        ezlink.info("Order No : " + objRecieptRes.getORDERNO());
        ezlink.info("Merchant Ref no : " + objRecieptRes.getMERCHANTREFNO());
        ezlink.info("CAN: " + objRecieptRes.getCAN());
        ezlink.info("STATUS CODE : " + objRecieptRes.getSTATUSCODE());
        ezlink.info("DESCRIPTION : " + objRecieptRes.getSTATUSDESC());
        ezlink.info("\n-------RECIEPT-------RESPONSE---------------------");

        return objRecieptRes;
    }

    public void insertFaiedTranxDetail(String tranxLogId, String responceCode, String detail) {
        TerminalUtil objTerminalUtil = new TerminalUtil();
        int result = objTerminalUtil.insertTransactionDetail(tranxLogId, StringConstants.Common.TRANX_TYPE_RECIEPT, responceCode, detail);
        ezlink.info("\n-------RE-------Insert failed Tranx Details---------------------");
        ezlink.info("Failed Tranx Updated result : " + result);
        ezlink.info("\n-------RE-------Insert failed Tranx Details---------------------");

    }

}
