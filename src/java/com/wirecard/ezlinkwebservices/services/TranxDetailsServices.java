/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wirecard.ezlinkwebservices.services;

import com.ezlinkwebservices.service.tranxdetails.TranxDetailsFault_Exception;
import com.ezlinkwebservices.service.tranxdetails.request.EZLINGWSTRANXDETAILSREQENV;
import com.ezlinkwebservices.service.tranxdetails.response.EZLINGWSTRANXDETAILSRESBODY;

/**
 *
 * @author WCCTTI-JANAHAN
 */
public interface TranxDetailsServices {
    
    public EZLINGWSTRANXDETAILSRESBODY getTranxDetails(EZLINGWSTRANXDETAILSREQENV parameters) throws TranxDetailsFault_Exception;
    
}
