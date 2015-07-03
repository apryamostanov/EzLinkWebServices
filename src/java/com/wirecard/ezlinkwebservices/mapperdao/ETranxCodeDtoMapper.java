package com.wirecard.ezlinkwebservices.mapperdao;
import java.sql.SQLException;

import org.springframework.stereotype.Component;

import com.wirecard.ezlinkwebservices.dto.ETranxCodeDto;

@Component
public interface ETranxCodeDtoMapper {
	
	public ETranxCodeDto getTRANXCODEByDesc(String codeDesc) throws SQLException;
	
    int deleteByPrimaryKey(String tranxcode);

    int insert(ETranxCodeDto record);

    int insertSelective(ETranxCodeDto record);

    ETranxCodeDto selectByPrimaryKey(String tranxcode);

    int updateByPrimaryKeySelective(ETranxCodeDto record);

    int updateByPrimaryKey(ETranxCodeDto record);
}