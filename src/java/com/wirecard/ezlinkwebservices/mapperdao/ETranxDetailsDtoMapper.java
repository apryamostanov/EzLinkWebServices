/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wirecard.ezlinkwebservices.mapperdao;

import com.wirecard.ezlinkwebservices.dto.ETranxDetailsDto;
import org.springframework.stereotype.Component;

/**
 *
 * @author WCCTTI-JANAHAN
 */
@Component
public interface ETranxDetailsDtoMapper {
    int insert(ETranxDetailsDto record) throws Exception;

   // int insertSelective(ETranxDetailsDto record);
}
