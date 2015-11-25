package com.wirecard.ezlinkwebservices.mapperdao;

import com.wirecard.ezlinkwebservices.dto.ETerminalDataDto;
import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wirecard.ezlinkwebservices.dto.ETranxLogDto;
import org.springframework.stereotype.Component;

@Component
public interface ETranxLogDtoMapper {
	
	ETranxLogDto isUniqueTransaction(@Param("merchantNo") String merchantNo,@Param("orderNo") String orderNo) throws SQLException;
        
        ETranxLogDto isRepeatedMerchantTranxRefNo(@Param("merchantNo") String merchantNo,@Param("orderNo") String orderNo) throws SQLException;
        
        ETranxLogDto validateTransactionLog(@Param("merchantNo") String merchantNo,@Param("orderNo") String orderNo,@Param("amount") Double amount) throws SQLException;
        
       ETranxLogDto isTransactionAvailable(@Param("merchantNo") String merchantNo,@Param("orderNo") String orderNo,@Param("amount") Double amount,@Param("tranxStatus") String tranxStatus,@Param("responseCode") String responseCode) throws SQLException;

	 List<ETranxLogDto> getTranxByTranxLogId(@Param("objETerminalDataDtoList") List<ETerminalDataDto> objETerminalDataDtoList) throws SQLException;
         
         ETranxLogDto getTranxDetails(@Param("merchantNo") String merchantNo,@Param("orderNo") String orderNo,@Param("amount") Double amount) throws SQLException;;
       
    int insert(ETranxLogDto record) throws SQLException;

    int insertSelective(ETranxLogDto record) throws SQLException;
    
    int updateDebitCommandStatus(ETranxLogDto record) throws SQLException;
    
    int updateRecieptDataStatus(ETranxLogDto record) throws SQLException;
    
    int updateResponseCode(ETranxLogDto record) throws SQLException;
    
}