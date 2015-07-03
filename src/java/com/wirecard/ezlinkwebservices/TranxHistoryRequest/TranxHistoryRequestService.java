/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wirecard.ezlinkwebservices.TranxHistoryRequest;

import com.ezlinkwebservices.service.tranxhistory.TranxHistoryFault_Exception;
import com.ezlinkwebservices.service.tranxhistory.response.EZLINGWSTRANXRESBODY;
import com.ezlinkwebservices.service.tranxhistory.response.EZLINGWSTRANXRESENV;
import com.wirecard.ezlinkwebservices.services.TranxHistoryService;
import com.wirecard.ezlinkwebservices.services.impl.TranxHistoryServiceImpl;
import com.wirecard.ezlinkwebservices.util.HeaderUtil;
import javax.jws.WebService;

/**
 *
 * @author WCCTTI-JANAHAN
 */
@WebService(serviceName = "TranxHistoryService", portName = "TranxHistorySoap", endpointInterface = "com.ezlinkwebservices.service.tranxhistory.TranxHistoryPortType", targetNamespace = "http://ezlinkwebservices.com/service/TranxHistory", wsdlLocation = "WEB-INF/wsdl/TranxHistoryRequestService/TranxHistory.wsdl")
public class TranxHistoryRequestService {

    private static final org.apache.log4j.Logger ezlink = org.apache.log4j.Logger.getLogger(TranxHistoryRequestService.class);

    public com.ezlinkwebservices.service.tranxhistory.response.EZLINGWSTRANXRESENV getTranxHistory(com.ezlinkwebservices.service.tranxhistory.request.EZLINGWSTRANXREQENV parameters) throws TranxHistoryFault_Exception {

        long tranxHisReqTime = System.currentTimeMillis();
        System.out.println("+++++++++++Recieving from Mobile TranxHistory REQUEST time :+++++ " + tranxHisReqTime);
        ezlink.info("\n-------RECIEVED TRANXHISTORY REQUEST------------------------------------" + tranxHisReqTime);

        EZLINGWSTRANXRESENV objEZLINGWSTRANXRESENV = new EZLINGWSTRANXRESENV();
        //EZLINGWSTRANXRESBODY objEZLINGWSTRANXRESBODY = new EZLINGWSTRANXRESBODY();
        TranxHistoryService objTranxHistoryService = new TranxHistoryServiceImpl();
        EZLINGWSTRANXRESBODY objEZLINGWSTRANXRESBODY = objTranxHistoryService.getTranxHistory(parameters);

        objEZLINGWSTRANXRESENV.setEZLINGWSTRANXRESHEADER((HeaderUtil.TranxHistoryResponseHeader(parameters)));
        objEZLINGWSTRANXRESENV.setEZLINGWSTRANXRESBODY(objEZLINGWSTRANXRESBODY);

        long tranxHistoryResTime = System.currentTimeMillis();
        System.out.println("++++++++++Sending to mobile  TranxHistory REQUEST time :+++++++++++++ " + tranxHistoryResTime);
        long timeTaken = tranxHistoryResTime - tranxHisReqTime;
        System.out.println("++++++++++Time taken to Serve tranxHistory REQUEST ++++++++++++ : " + timeTaken);
        ezlink.info("\n-------SENDING TRANXHISTORY RESPONSE TO MOBILE---TIME------------- : " + tranxHistoryResTime);
        ezlink.info("\n-------TOTAL TIME TAKEN TO SERVE THIS TRANXHISTORY REQUEST-------- : " + timeTaken);

        return objEZLINGWSTRANXRESENV;
    }

}
