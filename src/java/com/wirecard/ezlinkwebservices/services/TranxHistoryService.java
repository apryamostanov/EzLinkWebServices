/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wirecard.ezlinkwebservices.services;

import com.ezlinkwebservices.service.tranxhistory.TranxHistoryFault_Exception;
import com.ezlinkwebservices.service.tranxhistory.request.EZLINGWSTRANXREQENV;
import com.ezlinkwebservices.service.tranxhistory.response.EZLINGWSTRANXRESBODY;

/**
 *
 * @author WCCTTI-JANAHAN
 */
public interface TranxHistoryService {
    
     public EZLINGWSTRANXRESBODY getTranxHistory(EZLINGWSTRANXREQENV parameters) throws TranxHistoryFault_Exception;
    
}
