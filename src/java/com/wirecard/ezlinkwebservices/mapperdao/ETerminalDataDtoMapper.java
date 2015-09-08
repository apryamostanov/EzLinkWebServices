/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wirecard.ezlinkwebservices.mapperdao;

import com.wirecard.ezlinkwebservices.dto.ETerminalDataDto;
import java.sql.SQLException;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 *
 * @author WCCTTI-JANAHAN
 */
@Component
public interface ETerminalDataDtoMapper {
    
    int insert(ETerminalDataDto objETerminalDataDto) throws SQLException;
    
    int updateETerminalDataBySNo(ETerminalDataDto objETerminalDataDto) throws SQLException;
    
            ETerminalDataDto isRepeatedMerchantTranxRefNo(@Param("merchantNo") String merchantNo,@Param("merchantTranxRefNo") String merchantTranxRefNo,@Param("orderNo") String orderNo, @Param("cardNo") String cardNo) throws SQLException;

    
    List<ETerminalDataDto> isRecordAvailable(@Param("merchantNo") String merchantNo,@Param("merchantTranxRefNo") String merchantTranxRefNo,@Param("orderNo") String orderNo,@Param("cardNo") String cardNo) throws SQLException;
    
        List<ETerminalDataDto> getTranxLogIdByCan(@Param("can") String merchantNo) throws SQLException;

    
}
