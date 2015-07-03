/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wirecard.ezlinkwebservices.services.impl;

import com.ezlinkwebservices.service.tranxhistory.TranxHistoryFault;
import com.ezlinkwebservices.service.tranxhistory.TranxHistoryFault_Exception;
import com.ezlinkwebservices.service.tranxhistory.request.EZLINGWSTRANXREQENV;
import com.ezlinkwebservices.service.tranxhistory.response.EZLINGWSTRANXRESBODY;
import com.ezlinkwebservices.service.tranxhistory.response.TranxHistoryDetail;
import com.ezlinkwebservices.service.tranxhistory.response.TranxHistoryResError;
import com.ezlinkwebservices.service.tranxhistory.response.TranxList;
import com.wirecard.ezlinkwebservices.constants.StringConstants;
import com.wirecard.ezlinkwebservices.dto.ETerminalDataDto;
import com.wirecard.ezlinkwebservices.dto.ETranxLogDto;
import com.wirecard.ezlinkwebservices.dto.MerchantDto;
import com.wirecard.ezlinkwebservices.mapperdao.ETerminalDataDtoMapper;
import com.wirecard.ezlinkwebservices.mapperdao.ETranxLogDtoMapper;
import com.wirecard.ezlinkwebservices.mapperdao.MerchantDtoMapper;
import com.wirecard.ezlinkwebservices.services.TranxHistoryService;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

/**
 *
 * @author WCCTTI-JANAHAN
 */
public class TranxHistoryServiceImpl implements TranxHistoryService {

    @Autowired
    ETerminalDataDtoMapper objETerminalDataDtoMapper;
    @Autowired
    ETranxLogDtoMapper objETranxLogDtoMapper;
    @Autowired
    MerchantDtoMapper objMerchantDtoMapper;

    private static final org.apache.log4j.Logger ezlink = org.apache.log4j.Logger.getLogger(DebitCommandServiceImpl.class);

    @Override
    public EZLINGWSTRANXRESBODY getTranxHistory(EZLINGWSTRANXREQENV parameters) throws TranxHistoryFault_Exception {

        ezlink.info("Tranx History Request received in " + TranxHistoryServiceImpl.class.getName());

        EZLINGWSTRANXRESBODY objEZLINGWSTRANXRESBODY = new EZLINGWSTRANXRESBODY();
        TranxHistoryResError objTranxHistoryResError = new TranxHistoryResError();
        String cardNo;
        int requiredNoOfTranx;
        int counter = 0;

        List<ETranxLogDto> objETranxLogDtoList;
        List<ETerminalDataDto> objETerminalDataDtoList;

        TranxList objTranxList = new TranxList();

        try {

            cardNo = parameters.getEZLINGWSTRANXREQBODY().getTranxHistoryReq().getCARDNO();
            requiredNoOfTranx = parameters.getEZLINGWSTRANXREQBODY().getTranxHistoryReq().getREQUIREDNOOFREC().intValue();

            // log the response send time and parameters
            ezlink.info("\n-------Tranx HIstory----REQUEST----------------------------------------------");
            ezlink.info("SOURCE ID : " + parameters.getEZLINGWSTRANXREQHEADER().getSOURCEID());
            ezlink.info("IP : " + parameters.getEZLINGWSTRANXREQHEADER().getIPADDRESS());
            ezlink.info("SEC LEVEL : " + parameters.getEZLINGWSTRANXREQHEADER().getSECURITYLEVEL());
            ezlink.info("CAN : " + cardNo);
            ezlink.info("REQ NO OF TRANX : " + requiredNoOfTranx);
            ezlink.info("\n-------Tranx HIstory----REQUEST----------------------------------------------");

        } catch (Exception e) {
            TranxHistoryFault objTranxHistoryFault = new TranxHistoryFault();
            objTranxHistoryFault.setMessage(StringConstants.Common.REQUIRED_FIELD_MISSING);
            objTranxHistoryFault.setFaultInfo(StringConstants.Common.REQUIRED_FIELD_MISSING_INFO);

            ezlink.info("\n-----TH------EXCEPTION------------------------");
            ezlink.info("Response sent from getTranxHistory : " + new Date());
            ezlink.info("Status : " + objTranxHistoryFault.getMessage());
            ezlink.info("Remarks : " + objTranxHistoryFault.getFaultInfo());
            ezlink.info("\n------TH---------EXCEPTION--------------------");

            throw new TranxHistoryFault_Exception(objTranxHistoryFault.getMessage(), objTranxHistoryFault);
        }

        //Get list of tranx ID s for CAn
        try {
            SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);

            objETerminalDataDtoList = objETerminalDataDtoMapper.getTranxLogIdByCan(cardNo);
            System.out.println("++++++++++++++++TRANX LOG ID SIZE+++++++++++++++++++++++++++++" + objETerminalDataDtoList.size());
            if (null == objETerminalDataDtoList || objETerminalDataDtoList.isEmpty()) {

                objEZLINGWSTRANXRESBODY.setTranxList(null);
                objTranxHistoryResError.setDCERRORCODE(StringConstants.Common.NO_TRANSCATION_AVAILABLE);
                objTranxHistoryResError.setDCERRORDESC(StringConstants.Common.NO_TRANSCATION_AVAILABLE_INFO);

                objEZLINGWSTRANXRESBODY.setTranxHistoryResError(objTranxHistoryResError);
                ezlink.info("\n-------Tranx HIstory----RESPONSE SENT----------------- : CAN : " + cardNo);
                return objEZLINGWSTRANXRESBODY;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            ezlink.error(new Object(), ex);
            TranxHistoryFault objTranxHistoryFault = new TranxHistoryFault();
            objTranxHistoryFault.setMessage(StringConstants.Common.CONNECTION_ISSUE_MESSAGE);
            objTranxHistoryFault.setFaultInfo(StringConstants.Common.CONNECTION_ISSUE_MESSAGE_INFO);

            ezlink.info("\n------TH-------EXCEPTION----------------------");
            ezlink.info("Response sent from getTranxHistory : " + new Date());
            ezlink.info("Status : " + objTranxHistoryFault.getMessage());
            ezlink.info("Remarks : " + objTranxHistoryFault.getFaultInfo());
            ezlink.info("\n-------TH---------EXCEPTION-------------------");

            throw new TranxHistoryFault_Exception(objTranxHistoryFault.getMessage(), objTranxHistoryFault);
        }

        //Get list of tranxlogs by tranxlogId
        try {
            SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
            //System.out.println("++++++++++++++++TRANX LOG ID SIZE+++++++++++++2nd++++++++++++++++"+objETerminalDataDtoList.size());

            objETranxLogDtoList = objETranxLogDtoMapper.getTranxByTranxLogId(objETerminalDataDtoList);
            System.out.println("++++++++++++++++TRANXLOG SIZE+++++++++++++++++++++++++++++" + objETranxLogDtoList.size());
            if (null == objETranxLogDtoList || objETranxLogDtoList.isEmpty()) {

                objEZLINGWSTRANXRESBODY.setTranxList(null);
                objTranxHistoryResError.setDCERRORCODE(StringConstants.Common.NO_TRANSCATION_AVAILABLE);
                objTranxHistoryResError.setDCERRORDESC(StringConstants.Common.NO_TRANSCATION_AVAILABLE_INFO);

                objEZLINGWSTRANXRESBODY.setTranxHistoryResError(objTranxHistoryResError);
                ezlink.info("\n-------Tranx HIstory----RESPONSE SENT----------------- : CAN : " + cardNo);
                return objEZLINGWSTRANXRESBODY;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            ezlink.error(new Object(), ex);
            TranxHistoryFault objTranxHistoryFault = new TranxHistoryFault();
            objTranxHistoryFault.setMessage(StringConstants.Common.CONNECTION_ISSUE_MESSAGE);
            objTranxHistoryFault.setFaultInfo(StringConstants.Common.CONNECTION_ISSUE_MESSAGE_INFO);

            ezlink.info("\n------TH-------EXCEPTION----------------------");
            ezlink.info("Response sent from getTranxHistory : " + new Date());
            ezlink.info("Status : " + objTranxHistoryFault.getMessage());
            ezlink.info("Remarks : " + objTranxHistoryFault.getFaultInfo());
            ezlink.info("\n-------TH---------EXCEPTION-------------------");

            throw new TranxHistoryFault_Exception(objTranxHistoryFault.getMessage(), objTranxHistoryFault);
        }
        for (int i = 0; i < objETranxLogDtoList.size(); i++) {

            TranxHistoryDetail objTranxHistoryDetail = new TranxHistoryDetail();
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            objTranxHistoryDetail.setTRANXDATE(df.format(objETranxLogDtoList.get(i).getDatetime()));
            try {
                // SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
                String merNo = objETranxLogDtoList.get(i).getMerchantNo();
                SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
                MerchantDto objMerchantDto = objMerchantDtoMapper.getMerchantNameByMerchantId(merNo);
                if (null == objMerchantDto) {
                    ezlink.info("\n-------TH--getMerchantName-------EXCEPTION-------------------");
                    ezlink.info("Merchant name not available so assigning merchant number : ");
                    ezlink.info("\n-------TH-----getMerchantName----EXCEPTION-------------------");
                    objTranxHistoryDetail.setMERCHANTNAME(objETranxLogDtoList.get(i).getMerchantNo());
                } else {
                    objTranxHistoryDetail.setMERCHANTNAME(objMerchantDto.getMerchantName());
                    //objTranxHistoryDetail.setMERCHANTNAME(objMerchantDtoMapper.getMerchantNameByMerchantId(objETranxLogDtoList.get(i).getMerchantNo()).getMerchantName());
                }
            } catch (Exception ex) {

                ex.printStackTrace();
                ezlink.error(new Object(), ex);
                TranxHistoryFault objTranxHistoryFault = new TranxHistoryFault();
                objTranxHistoryFault.setMessage(StringConstants.Common.CONNECTION_ISSUE_MESSAGE);
                objTranxHistoryFault.setFaultInfo(StringConstants.Common.CONNECTION_ISSUE_MESSAGE_INFO);

                ezlink.info("\n------TH-------EXCEPTION----------------------");
                ezlink.info("Response sent from getTranxHistory : " + new Date());
                ezlink.info("Status : " + objTranxHistoryFault.getMessage());
                ezlink.info("Remarks : " + objTranxHistoryFault.getFaultInfo());
                ezlink.info("\n-------TH---------EXCEPTION-------------------");

                throw new TranxHistoryFault_Exception(objTranxHistoryFault.getMessage(), objTranxHistoryFault);
            }

            objTranxHistoryDetail.setAMOUNT(BigDecimal.valueOf(objETranxLogDtoList.get(i).getAmount()));
            objTranxHistoryDetail.setSTATUS(objETranxLogDtoList.get(i).getTranxStatus());

            objTranxList.getTranxHistoryDetail().add(objTranxHistoryDetail);
            counter++;
            //System.out.println("counter at : "+counter);
            if (counter == requiredNoOfTranx) {
                System.out.println("REQUIRED SIZE : " + requiredNoOfTranx);
                System.out.println("BREAKING AT : " + counter);
                System.out.println("ACTUAL SIZE : " + objETranxLogDtoList.size());
                ezlink.info("\n-------TH--DETAIL--------------------------");
                ezlink.info("REQUIRED SIZE : " + requiredNoOfTranx);
                ezlink.info("BREAKING AT : " + counter);
                ezlink.info("ACTUAL SIZE : " + objETranxLogDtoList.size());
                ezlink.info("\n-------TH-----DETAIL-----------------------");
                break;
            }

        }
        objEZLINGWSTRANXRESBODY.setTranxList(objTranxList);
        objTranxHistoryResError.setDCERRORCODE(StringConstants.ResponseCode.SUCCESS);
        objTranxHistoryResError.setDCERRORDESC(StringConstants.ResponseCode.SUCCESS);

        objEZLINGWSTRANXRESBODY.setTranxHistoryResError(objTranxHistoryResError);
        ezlink.info("\n-------Tranx HIstory----RESPONSE SENT----------------- : CAN : " + cardNo);
        return objEZLINGWSTRANXRESBODY;
    }

}
