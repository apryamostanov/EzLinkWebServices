/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wirecard.ezlinkwebservices.services;

import com.ezlinkwebservices.service.reciept.request.EZLINGWSREQENV;
import com.ezlinkwebservices.service.reciept.RecieptFault_Exception;
import com.ezlinkwebservices.service.reciept.response.RecieptRes;
import org.springframework.stereotype.Component;

/**
 *
 * @author WCCTTI-JANAHAN
 */
@Component
public interface RecieptService {

    public RecieptRes getReciept(EZLINGWSREQENV parameters) throws RecieptFault_Exception;

}
