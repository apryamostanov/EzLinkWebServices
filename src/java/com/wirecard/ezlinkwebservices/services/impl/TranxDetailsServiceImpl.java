/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wirecard.ezlinkwebservices.services.impl;

import com.ezlinkwebservices.service.tranxdetails.TranxDetailsFault;
import com.ezlinkwebservices.service.tranxdetails.TranxDetailsFault_Exception;
import com.ezlinkwebservices.service.tranxdetails.request.EZLINGWSTRANXDETAILSREQENV;
import com.ezlinkwebservices.service.tranxdetails.response.EZLINGWSTRANXDETAILSRESBODY;
import com.ezlinkwebservices.service.tranxdetails.response.TranxDetailsRes;
import com.ezlinkwebservices.service.tranxdetails.response.TranxDetailsResError;
import com.wirecard.ezlinkwebservices.constants.StringConstants;
import com.wirecard.ezlinkwebservices.dto.ETranxLogDto;
import com.wirecard.ezlinkwebservices.mapperdao.ETranxLogDtoMapper;
import com.wirecard.ezlinkwebservices.services.TranxDetailsServices;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

/**
 *
 * @author WCCTTI-JANAHAN
 */
public class TranxDetailsServiceImpl implements TranxDetailsServices {

    @Autowired
    ETranxLogDtoMapper objETranxLogDtoMapper;
    
    
    private static final org.apache.log4j.Logger ezlink = org.apache.log4j.Logger.getLogger(TranxDetailsServiceImpl.class);

    @Override
    public EZLINGWSTRANXDETAILSRESBODY getTranxDetails(EZLINGWSTRANXDETAILSREQENV parameters) throws TranxDetailsFault_Exception {
        
        ezlink.info("Tranx Details Request received in " + TranxDetailsServiceImpl.class.getName());
        
        EZLINGWSTRANXDETAILSRESBODY objEZLINGWSTRANXDETAILSRESBODY=new EZLINGWSTRANXDETAILSRESBODY();
        TranxDetailsRes objTranxDetailsRes=new TranxDetailsRes();
        TranxDetailsResError objTranxDetailsResError=new TranxDetailsResError();
       ETranxLogDto objETranxLogDto;
        
        try {
            
            
           String merchantNo = parameters.getEZLINGWSTRANXDETAILSREQBODY().getTranxDetailsReq().getMERCHANTNO();
           String merchantTranxRefNo = parameters.getEZLINGWSTRANXDETAILSREQBODY().getTranxDetailsReq().getMERCHANTREFNO();
            String orderNo = parameters.getEZLINGWSTRANXDETAILSREQBODY().getTranxDetailsReq().getORDERNO();
            double amount = parameters.getEZLINGWSTRANXDETAILSREQBODY().getTranxDetailsReq().getAMOUNT().doubleValue();
            
            
            ezlink.info("\n-------TRANX DETAILS----REQUEST----------------------------------------------");
            ezlink.info("SOURCE ID : " + parameters.getEZLINGWSTRANXDETAILSREQHEADER().getSOURCEID());
            ezlink.info("IP : " + parameters.getEZLINGWSTRANXDETAILSREQHEADER().getIPADDRESS());
            ezlink.info("SEC LEVEL : " + parameters.getEZLINGWSTRANXDETAILSREQHEADER().getSECURITYLEVEL());
            ezlink.info("MERCHANT NO : " +merchantNo );
            ezlink.info("MERCHANT TRANX REF NO : " +merchantTranxRefNo);
            ezlink.info("ORDER NO : " +orderNo );
            ezlink.info("AMOUNT : " +amount);
            ezlink.info("\n-------TRANX DETAILS----REQUEST----------------------------------------------");
            
            
            SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
            objETranxLogDto=objETranxLogDtoMapper.getTranxDetails(merchantNo, merchantTranxRefNo, orderNo, amount);
        } catch (Exception ex) {
            ezlink.error(new Object(), ex);
            TranxDetailsFault objTranxDetailsFault = new TranxDetailsFault();
            objTranxDetailsFault.setMessage(StringConstants.Common.CONNECTION_ISSUE_MESSAGE);
            objTranxDetailsFault.setFaultInfo(StringConstants.Common.CONNECTION_ISSUE_MESSAGE_INFO);
            
            ezlink.info("\n------TRANX DETAILS-------EXCEPTION----------------------");
            ezlink.info("Response sent from getTranxDetail : " + new Date());
            ezlink.info("Status : " + objTranxDetailsFault.getMessage());
            ezlink.info("Remarks : " + objTranxDetailsFault.getFaultInfo());
            ezlink.info("\n-------TRANX DETAILS---------EXCEPTION-------------------");

            throw new TranxDetailsFault_Exception(objTranxDetailsFault.getMessage(), objTranxDetailsFault);

        }
        if (null==objETranxLogDto ){
            TranxDetailsFault objTranxDetailsFault = new TranxDetailsFault();
            objTranxDetailsFault.setMessage(StringConstants.Common.NO_TRANSCATION_DETAIL_AVAILABLE);
            objTranxDetailsFault.setFaultInfo(StringConstants.Common.NO_TRANSCATION_DETAIL_AVAILABLE_INFO);
            
            ezlink.info("\n------TRANX DETAILS-------EXCEPTION----------------------");
            ezlink.info("Response sent from getTranxDetail : " + new Date());
            ezlink.info("Status : " + objTranxDetailsFault.getMessage());
            ezlink.info("Remarks : " + objTranxDetailsFault.getFaultInfo());
            ezlink.info("\n-------TRANX DETAILS---------EXCEPTION-------------------");

            throw new TranxDetailsFault_Exception(objTranxDetailsFault.getMessage(), objTranxDetailsFault);
        
        }
        
        objTranxDetailsRes.setMERCHANTNO(objETranxLogDto.getMerchantNo());
        objTranxDetailsRes.setMERCHANTREFNO(objETranxLogDto.getMerchantRefno());
        objTranxDetailsRes.setORDERNO(objETranxLogDto.getOrderNo());
        objTranxDetailsRes.setAMOUNT(String.valueOf(objETranxLogDto.getAmount()));
        objTranxDetailsRes.setCURRENCYCODE(String.valueOf(objETranxLogDto.getCurrency()));
        
        
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        objTranxDetailsRes.setTRANXDATE(df.format(objETranxLogDto.getDatetime()));
        
        objTranxDetailsRes.setTRANXSTATUS(objETranxLogDto.getTranxStatus());
        objTranxDetailsRes.setRESPONSECODE(objETranxLogDto.getResponseCode());
        
        objTranxDetailsResError.setTDERRORCODE(StringConstants.ResponseCode.SUCCESS);
        objTranxDetailsResError.setTDERRORDESC(StringConstants.Common.STATUS_SUCCESS);
        
        ezlink.info("\n-------TRANX DETAILS----RESPONSE----------------------------------------------");
            ezlink.info("MERCHANT NO : " +objTranxDetailsRes.getMERCHANTNO() );
            ezlink.info("MERCHANT TRANX REF NO : " +objTranxDetailsRes.getMERCHANTREFNO());
            ezlink.info("ORDER NO : " +objTranxDetailsRes.getORDERNO() );
            ezlink.info("AMOUNT : " +objTranxDetailsRes.getAMOUNT());
            ezlink.info("CURRENCY CODE : " +objTranxDetailsRes.getCURRENCYCODE() );
            ezlink.info("TRANSACTION STATUS : " +objTranxDetailsRes.getTRANXSTATUS());
            ezlink.info("RESPONSE CODE : " +objTranxDetailsRes.getRESPONSECODE() );
            ezlink.info("TRANSACTION DATE : " +objTranxDetailsRes.getTRANXDATE());
            ezlink.info("ERROR CODE : " +objTranxDetailsResError.getTDERRORCODE() );
            ezlink.info("ERROR DESCRIPTION : " +objTranxDetailsResError.getTDERRORDESC());
            ezlink.info("\n-------TRANX DETAILS----RESPONSE----------------------------------------------");
        
        objEZLINGWSTRANXDETAILSRESBODY.setTranxDetailsRes(objTranxDetailsRes);
        objEZLINGWSTRANXDETAILSRESBODY.setTranxDetailsResError(objTranxDetailsResError);
        
        return objEZLINGWSTRANXDETAILSRESBODY;
    }
    
}
