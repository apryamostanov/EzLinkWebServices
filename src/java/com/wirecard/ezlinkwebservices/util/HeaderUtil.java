/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wirecard.ezlinkwebservices.util;

import com.ezlinkwebservices.service.debitcommand.request.EZLINGWSREQENV;
import com.ezlinkwebservices.service.debitcommand.response.EZLINGWSHEADER;
import com.wirecard.ezlinkwebservices.constants.StringConstants;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author WCCTTI-JANAHAN
 */
public class HeaderUtil {

    public static EZLINGWSHEADER debitCommandResponseHeader(EZLINGWSREQENV objDebitCommandEZLINGWSREQENV) {
        Date dateTime = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        String stringDate = dateFormat.format(dateTime);
        String securityLevel;
        securityLevel = objDebitCommandEZLINGWSREQENV.getEZLINGWSHEADER().getSECURITYLEVEL();

        EZLINGWSHEADER objDebitCommandEZLINGWSHEADER = new EZLINGWSHEADER();

        objDebitCommandEZLINGWSHEADER.setVERSION(StringConstants.Header.VERSION);
        objDebitCommandEZLINGWSHEADER.setSOURCETYPE(objDebitCommandEZLINGWSREQENV.getEZLINGWSHEADER().getSOURCETYPE());
        objDebitCommandEZLINGWSHEADER.setSOURCEID(objDebitCommandEZLINGWSREQENV.getEZLINGWSHEADER().getSOURCEID());
        objDebitCommandEZLINGWSHEADER.setDATETIME(stringDate);
        objDebitCommandEZLINGWSHEADER.setIPADDRESS(objDebitCommandEZLINGWSREQENV.getEZLINGWSHEADER().getIPADDRESS());
        objDebitCommandEZLINGWSHEADER.setSECURITYLEVEL(securityLevel);
        if (securityLevel.equalsIgnoreCase("3")) {
            objDebitCommandEZLINGWSHEADER.setSIGNATURE(StringConstants.Header.SIGNATURE);
        } else if (securityLevel.equalsIgnoreCase("2")) {
            objDebitCommandEZLINGWSHEADER.setSIGNATURE(StringConstants.Header.ENCRYPTION_CRYPTOGRAM);
        } else if (securityLevel.equalsIgnoreCase("1")) {
            objDebitCommandEZLINGWSHEADER.setSIGNATURE(StringConstants.Header.ACCESSCODE);
        }

        return objDebitCommandEZLINGWSHEADER;
    }

    public static com.ezlinkwebservices.service.reciept.response.EZLINGWSHEADER RecieptDataResponseHeader(com.ezlinkwebservices.service.reciept.request.EZLINGWSREQENV objRecieptEZLINGWSREQENV) {
        Date dateTime = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        String stringDate = dateFormat.format(dateTime);
        String securityLevel;
        securityLevel = objRecieptEZLINGWSREQENV.getEZLINGWSHEADER().getSECURITYLEVEL();

        com.ezlinkwebservices.service.reciept.response.EZLINGWSHEADER objRecieptEZLINGWSHEADER = new com.ezlinkwebservices.service.reciept.response.EZLINGWSHEADER();

        objRecieptEZLINGWSHEADER.setVERSION(StringConstants.Header.VERSION);
        objRecieptEZLINGWSHEADER.setSOURCETYPE(objRecieptEZLINGWSREQENV.getEZLINGWSHEADER().getSOURCETYPE());
        objRecieptEZLINGWSHEADER.setSOURCEID(objRecieptEZLINGWSREQENV.getEZLINGWSHEADER().getSOURCEID());
        objRecieptEZLINGWSHEADER.setDATETIME(stringDate);
        objRecieptEZLINGWSHEADER.setIPADDRESS(objRecieptEZLINGWSREQENV.getEZLINGWSHEADER().getIPADDRESS());
        objRecieptEZLINGWSHEADER.setSECURITYLEVEL(securityLevel);
        if (securityLevel.equalsIgnoreCase("3")) {
            objRecieptEZLINGWSHEADER.setSIGNATURE(StringConstants.Header.SIGNATURE);
        } else if (securityLevel.equalsIgnoreCase("2")) {
            objRecieptEZLINGWSHEADER.setSIGNATURE(StringConstants.Header.ENCRYPTION_CRYPTOGRAM);
        } else if (securityLevel.equalsIgnoreCase("1")) {
            objRecieptEZLINGWSHEADER.setSIGNATURE(StringConstants.Header.ACCESSCODE);
        }

        return objRecieptEZLINGWSHEADER;
    }
    
    
    public static com.ezlinkwebservices.service.tranxhistory.response.EZLINGWSTRANXRESHEADER TranxHistoryResponseHeader(com.ezlinkwebservices.service.tranxhistory.request.EZLINGWSTRANXREQENV objEZLINGWSTRANXREQENV) {
        Date dateTime = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        String stringDate = dateFormat.format(dateTime);
        String securityLevel;
        securityLevel = objEZLINGWSTRANXREQENV.getEZLINGWSTRANXREQHEADER().getSECURITYLEVEL();

        com.ezlinkwebservices.service.tranxhistory.response.EZLINGWSTRANXRESHEADER objEZLINGWSTRANXRESHEADER = new com.ezlinkwebservices.service.tranxhistory.response.EZLINGWSTRANXRESHEADER();
        objEZLINGWSTRANXRESHEADER.setVERSION(StringConstants.Header.VERSION);
        objEZLINGWSTRANXRESHEADER.setSOURCETYPE(objEZLINGWSTRANXREQENV.getEZLINGWSTRANXREQHEADER().getSOURCETYPE());
        objEZLINGWSTRANXRESHEADER.setSOURCEID(objEZLINGWSTRANXREQENV.getEZLINGWSTRANXREQHEADER().getSOURCEID());
        objEZLINGWSTRANXRESHEADER.setDATETIME(stringDate);
        objEZLINGWSTRANXRESHEADER.setIPADDRESS(objEZLINGWSTRANXREQENV.getEZLINGWSTRANXREQHEADER().getIPADDRESS());
        objEZLINGWSTRANXRESHEADER.setSECURITYLEVEL(securityLevel);
        if (securityLevel.equalsIgnoreCase("3")) {
            objEZLINGWSTRANXRESHEADER.setSIGNATURE(StringConstants.Header.SIGNATURE);
        } else if (securityLevel.equalsIgnoreCase("2")) {
            objEZLINGWSTRANXRESHEADER.setSIGNATURE(StringConstants.Header.ENCRYPTION_CRYPTOGRAM);
        } else if (securityLevel.equalsIgnoreCase("1")) {
            objEZLINGWSTRANXRESHEADER.setSIGNATURE(StringConstants.Header.ACCESSCODE);
        }

        return objEZLINGWSTRANXRESHEADER;
    }
    
    
    public static com.ezlinkwebservices.service.tranxdetails.response.EZLINGWSTRANXDETAILSRESHEADER TranxDetailsResponseHeader(com.ezlinkwebservices.service.tranxdetails.request.EZLINGWSTRANXDETAILSREQENV objEZLINGWSTRANXDETAILSREQENV) {
        Date dateTime = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        String stringDate = dateFormat.format(dateTime);
        String securityLevel;
        securityLevel = objEZLINGWSTRANXDETAILSREQENV.getEZLINGWSTRANXDETAILSREQHEADER().getSECURITYLEVEL();

        com.ezlinkwebservices.service.tranxdetails.response.EZLINGWSTRANXDETAILSRESHEADER objEZLINGWSTRANXDETAILSRESHEADER = new com.ezlinkwebservices.service.tranxdetails.response.EZLINGWSTRANXDETAILSRESHEADER();
        objEZLINGWSTRANXDETAILSRESHEADER.setVERSION(StringConstants.Header.VERSION);
        objEZLINGWSTRANXDETAILSRESHEADER.setSOURCETYPE(objEZLINGWSTRANXDETAILSREQENV.getEZLINGWSTRANXDETAILSREQHEADER().getSOURCETYPE());
        objEZLINGWSTRANXDETAILSRESHEADER.setSOURCEID(objEZLINGWSTRANXDETAILSREQENV.getEZLINGWSTRANXDETAILSREQHEADER().getSOURCEID());
        objEZLINGWSTRANXDETAILSRESHEADER.setDATETIME(stringDate);
        objEZLINGWSTRANXDETAILSRESHEADER.setIPADDRESS(objEZLINGWSTRANXDETAILSREQENV.getEZLINGWSTRANXDETAILSREQHEADER().getIPADDRESS());
        objEZLINGWSTRANXDETAILSRESHEADER.setSECURITYLEVEL(securityLevel);
        if (securityLevel.equalsIgnoreCase("3")) {
            objEZLINGWSTRANXDETAILSRESHEADER.setSIGNATURE(StringConstants.Header.SIGNATURE);
        } else if (securityLevel.equalsIgnoreCase("2")) {
            objEZLINGWSTRANXDETAILSRESHEADER.setSIGNATURE(StringConstants.Header.ENCRYPTION_CRYPTOGRAM);
        } else if (securityLevel.equalsIgnoreCase("1")) {
            objEZLINGWSTRANXDETAILSRESHEADER.setSIGNATURE(StringConstants.Header.ACCESSCODE);
        }

        return objEZLINGWSTRANXDETAILSRESHEADER;
    }

}
