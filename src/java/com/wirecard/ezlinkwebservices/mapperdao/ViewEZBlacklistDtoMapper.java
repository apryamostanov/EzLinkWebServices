package com.wirecard.ezlinkwebservices.mapperdao;

import com.wirecard.ezlinkwebservices.dto.ViewEZBlacklistDto;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface ViewEZBlacklistDtoMapper {
    int insert(ViewEZBlacklistDto record);

    int insertSelective(ViewEZBlacklistDto record);
    
    ViewEZBlacklistDto isBlackList(@Param("cardNo") String cardNo,@Param("bdc") String bdc);
}