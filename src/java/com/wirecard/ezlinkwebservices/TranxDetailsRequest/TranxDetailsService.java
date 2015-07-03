/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wirecard.ezlinkwebservices.TranxDetailsRequest;

import com.ezlinkwebservices.service.reciept.response.EZLINGWSRESBODY;
import com.ezlinkwebservices.service.tranxdetails.TranxDetailsFault_Exception;
import com.ezlinkwebservices.service.tranxdetails.response.EZLINGWSTRANXDETAILSRESBODY;
import com.ezlinkwebservices.service.tranxdetails.response.EZLINGWSTRANXDETAILSRESENV;
import com.ezlinkwebservices.service.tranxdetails.response.TranxDetailsRes;
import com.ezlinkwebservices.service.tranxdetails.response.TranxDetailsResError;
import com.wirecard.ezlinkwebservices.constants.StringConstants;
import com.wirecard.ezlinkwebservices.services.TranxDetailsServices;
import com.wirecard.ezlinkwebservices.services.impl.TranxDetailsServiceImpl;
import com.wirecard.ezlinkwebservices.util.HeaderUtil;
import javax.jws.WebService;

/**
 *
 * @author WCCTTI-JANAHAN
 */
@WebService(serviceName = "TranxDetailsService", portName = "TranxDetailsSoap", endpointInterface = "com.ezlinkwebservices.service.tranxdetails.TranxDetailsPortType", targetNamespace = "http://ezlinkwebservices.com/service/TranxDetails", wsdlLocation = "WEB-INF/wsdl/TranxDetailsService/TranxDetails.wsdl")
public class TranxDetailsService {
    
    private static final org.apache.log4j.Logger ezlink = org.apache.log4j.Logger.getLogger(TranxDetailsService.class);
    
    public com.ezlinkwebservices.service.tranxdetails.response.EZLINGWSTRANXDETAILSRESENV getTranxDetails(com.ezlinkwebservices.service.tranxdetails.request.EZLINGWSTRANXDETAILSREQENV parameters) throws TranxDetailsFault_Exception {
        
        
        long tranxDetailReqTime = System.currentTimeMillis();
        System.out.println("++++++++Recieving from mobile Tranx Details REQUEST time :++++++++++++++++ " + tranxDetailReqTime);
        ezlink.info("\n-------RECIEVED TRANX DETAIL REQUEST------TIME----------------   : " + tranxDetailReqTime);
        EZLINGWSTRANXDETAILSRESENV objEZLINGWSTRANXDETAILSRESENV = new EZLINGWSTRANXDETAILSRESENV();
        EZLINGWSTRANXDETAILSRESBODY objEZLINGWSTRANXDETAILSRESBODY = new EZLINGWSTRANXDETAILSRESBODY();
        //TranxDetailsRes objTranxDetailsRes;
        TranxDetailsServices objTranxDetailsServices = new TranxDetailsServiceImpl();
        //TranxDetailsResError objTranxDetailsResError=new TranxDetailsResError();
       

        objEZLINGWSTRANXDETAILSRESBODY = objTranxDetailsServices.getTranxDetails(parameters);

       
        
        
        objEZLINGWSTRANXDETAILSRESENV.setEZLINGWSTRANXDETAILSRESHEADER(HeaderUtil.TranxDetailsResponseHeader(parameters));
        objEZLINGWSTRANXDETAILSRESENV.setEZLINGWSTRANXDETAILSRESBODY(objEZLINGWSTRANXDETAILSRESBODY);

        long tranxDetailsResTime = System.currentTimeMillis();
        System.out.println("++++++++Sending to mobile Tranx Detail Response time :+++++++++ " + tranxDetailsResTime);
        long timeTaken = tranxDetailsResTime - tranxDetailReqTime;
        System.out.println("++++++++++++Time taken to Serve Tranx Details REQUEST ++++++++: " + timeTaken);
        ezlink.info("\n-------SENDING TRANXDETAILS RESPONSE TO MOBILE---TIME------------ : " + tranxDetailsResTime);
        ezlink.info("\n-------TOTAL TIME TAKEN TO SERVE THIS TRANXDETAILS REQUEST------- : " + timeTaken);

        return objEZLINGWSTRANXDETAILSRESENV;
        
        
        
        //TODO implement this method
        //throw new UnsupportedOperationException("Not implemented yet.");
    }
    
}
