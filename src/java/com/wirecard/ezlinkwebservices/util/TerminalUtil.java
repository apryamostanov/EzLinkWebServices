/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wirecard.ezlinkwebservices.util;

import com.wirecard.ezlinkwebservices.constants.StringConstants;
import com.wirecard.ezlinkwebservices.dto.ETerminalDataDto;
import com.wirecard.ezlinkwebservices.dto.ETranxDetailsDto;
import com.wirecard.ezlinkwebservices.dto.ETranxLogDto;
import com.wirecard.ezlinkwebservices.mapperdao.ETranxDetailsDtoMapper;
import com.wirecard.ezlinkwebservices.mapperdao.ETranxLogDtoMapper;
import java.math.BigInteger;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

/**
 *
 * @author WCCTTI-JANAHAN
 */
@Service
public class TerminalUtil {
    
    @Autowired
        ETranxLogDtoMapper objETranxLogDtoMapper;
    @Autowired
       ETranxDetailsDtoMapper objETranxDetailsDtoMapper;
    
        private static final org.apache.log4j.Logger ezlink = org.apache.log4j.Logger.getLogger(TerminalUtil.class);


    public static ETerminalDataDto getDebitCommandFromTerminal(ETerminalDataDto objETerinalDataDto) throws Exception {
        System.out.println("Sending Debit command request to terminal..");
        //Date updatedDate=new Date();

                //Dummy Values
        //objETerinalDataDto.setOrderNo("1");
        //objETerinalDataDto.setMerchantTranxRefNo("2");
        // objETerinalDataDto.setAmount(30.0);
        //objETerinalDataDto.setCan("12345");
        //objETerinalDataDto.setTerminalRndNo("3");
        //objETerinalDataDto.setCardRndNo("4");
        objETerinalDataDto.setDebitCmd("00250315021403CF549C2B7520389CFDDABE925DD9E886337A1A5A819242DD5449543030303120");
        objETerinalDataDto.setTerminalSessionKey("6");
        objETerinalDataDto.setRecieptSessionKey("7");
        objETerinalDataDto.setTerminalCounter(8);
        objETerinalDataDto.setHostRefNo("9");
                //objETerinalDataDto.setHostCounter(9);
        //objETerinalDataDto.setRecieptData("109876");
        //objETerinalDataDto.setUpdatedBy("DEB");
        //objETerinalDataDto.setUpdatedDate(updatedDate);

        return objETerinalDataDto;
    }
    
    public static synchronized String strXor(String s1,String s2)
  	{
  		System.out.println("strXor="+s1+"  "+s2);
  		BigInteger one = new BigInteger(s1, 16);
  		BigInteger two = new BigInteger(s2, 16);
  		BigInteger three = one.xor(two);
  		String s3 = three.toString(16);
  		System.out.println(s3);
  		return s3;
	}
    
    public static synchronized boolean ValidateDebitTransaction(ETranxLogDto objETranxLogDto){
        if(   
                    (
                    (StringConstants.Common.TRANX_STATUS_DEBIT).equalsIgnoreCase(objETranxLogDto.getTranxStatus())||
                    (StringConstants.Common.TRANX_STATUS_QR.equalsIgnoreCase(objETranxLogDto.getTranxStatus()))
                    )
                    &&
                    (
                    (StringConstants.ResponseCode.SUCCESS.equalsIgnoreCase(objETranxLogDto.getResponseCode()))||
                    (StringConstants.ResponseCode.TERMINAL_CONNECTION_FAILED.equalsIgnoreCase(objETranxLogDto.getResponseCode()))
                    )                  
                ){
        return true;
        }
    return false;
            
    }
    
    public static synchronized boolean ValidateRecieptTransaction(ETranxLogDto objETranxLogDto){
        if(   
                    (
                    (StringConstants.Common.TRANX_STATUS_RECIEPT.equalsIgnoreCase(objETranxLogDto.getTranxStatus())||
                    (StringConstants.Common.TRANX_STATUS_SUCCESS.equalsIgnoreCase(objETranxLogDto.getTranxStatus()))
                    )
                    &&
                    
                    (StringConstants.ResponseCode.SUCCESS.equalsIgnoreCase(objETranxLogDto.getResponseCode()))
                                     
                )){
        return true;
        }
    return false;
            
    }
    
    public synchronized ETranxLogDto insertNonWDTransaction(String merchantNo,String orderNo,double amount){
        
        Date objDate =new Date();
        int returnValue=0;
       SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
        
        ETranxLogDto objETranxLogDto=new ETranxLogDto();
        objETranxLogDto.setDatetime(objDate);
        objETranxLogDto.setMerchantTranxDate(objDate);
        objETranxLogDto.setVersion(StringConstants.Common.VERSION);
        objETranxLogDto.setTranxcode(StringConstants.Common.TRANX_CODE_DEBIT);
        objETranxLogDto.setMerchantNo(merchantNo);
        //objETranxLogDto.setMerchantRefno(merchantTranxRefNo);
        objETranxLogDto.setOrderNo(orderNo);
        objETranxLogDto.setOrderInfo("NON WD");
        objETranxLogDto.setAmount(amount);
        objETranxLogDto.setCurrency(Short.valueOf("702"));
        objETranxLogDto.setSecurehashType("SHA256");
        objETranxLogDto.setResponseCode(StringConstants.ResponseCode.SUCCESS);
        objETranxLogDto.setApprovalCode("A012");
        objETranxLogDto.setRrn("111");
        objETranxLogDto.setChannel("NW");
        objETranxLogDto.setMcc("NOWC");
        objETranxLogDto.setTranxStatus(StringConstants.Common.TRANX_STATUS_DEBIT);
        
        try {
            returnValue=objETranxLogDtoMapper.insert(objETranxLogDto);
            if(returnValue==1){
            
            }
        } catch (Exception ex) {
            Logger.getLogger(TerminalUtil.class.getName()).log(Level.SEVERE, null, ex);
            ezlink.error(new Object(), ex);
            return null;
        }
        
        return objETranxLogDto;
    }
    
    
 public  synchronized int insertTransactionDetail(String tranxlogId,String tranxType,String resCode,String details){
     
     SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
        int returnValue=0;
        Date updatedTime=new Date();
        ETranxDetailsDto objETranxDetailsDto=new ETranxDetailsDto();
        objETranxDetailsDto.setTranxlogId(tranxlogId);
        objETranxDetailsDto.setTranxtype(tranxType);
        objETranxDetailsDto.setResponseCode(resCode);
        objETranxDetailsDto.setDatetime(updatedTime);
        try {
            if(null==objETranxDetailsDtoMapper){
            System.out.println("+++++++++++++++++++++NULL++++++++++++++++++++++++++++++++++++++++");
            }
           returnValue= objETranxDetailsDtoMapper.insert(objETranxDetailsDto);
        } catch (Exception ex) {
            Logger.getLogger(TerminalUtil.class.getName()).log(Level.SEVERE, null, ex);
            ezlink.error(new Object(), ex);
             return 0;
        }
        
    return returnValue;
    }
    
    

}
