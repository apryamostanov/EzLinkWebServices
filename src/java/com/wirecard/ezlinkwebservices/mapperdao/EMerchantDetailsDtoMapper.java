package com.wirecard.ezlinkwebservices.mapperdao;
import java.sql.SQLException;

import com.wirecard.ezlinkwebservices.dto.EMerchantDetailsDto;
import com.wirecard.ezlinkwebservices.dto.EMerchantDetailsDtoExample;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface EMerchantDetailsDtoMapper {
	public EMerchantDetailsDto getMerchantByMerchantId(String merchantNo) throws SQLException;
	
    int insert(EMerchantDetailsDto record);

    int insertSelective(EMerchantDetailsDto record);

    int updateByExampleSelective(@Param("record") EMerchantDetailsDto record, @Param("example") EMerchantDetailsDtoExample example);

    int updateByExample(@Param("record") EMerchantDetailsDto record, @Param("example") EMerchantDetailsDtoExample example);
}