package com.wirecard.ezlinkwebservices.mapperdao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Component;

import com.wirecard.ezlinkwebservices.dto.MerchantDto;
import org.apache.ibatis.annotations.Param;

@Component
public interface MerchantDtoMapper {
	public MerchantDto getMCCByMerchantId(String merchantNo) throws SQLException;
        
        public MerchantDto getMerchantNameByMerchantId(@Param("merchantNo") String merchantNo) throws SQLException;
	
    int deleteByPrimaryKey(String merchantNo);

    int insert(MerchantDto record);

    int insertSelective(MerchantDto record);

    MerchantDto selectByPrimaryKey(String merchantNo);

    int updateByPrimaryKeySelective(MerchantDto record);

    int updateByPrimaryKey(MerchantDto record);
    
    public List<MerchantDto> getMerchant();
}