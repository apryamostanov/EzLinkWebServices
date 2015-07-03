/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wirecard.ezlinkwebservices.services;

import com.ezlinkwebservices.service.debitcommand.DebitCommandFault_Exception;
import com.ezlinkwebservices.service.debitcommand.response.DebitCommandRes;
import com.ezlinkwebservices.service.debitcommand.request.EZLINGWSREQENV;

/**
 *
 * @author WCCTTI-JANAHAN
 */
public interface DebitCommandService {

    public DebitCommandRes getDebitCommand(EZLINGWSREQENV parameters) throws DebitCommandFault_Exception;

}
