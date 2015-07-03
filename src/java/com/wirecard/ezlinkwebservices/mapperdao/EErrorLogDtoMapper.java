package com.wirecard.ezlinkwebservices.mapperdao;

import java.sql.SQLException;

import org.springframework.stereotype.Component;

import com.wirecard.ezlinkwebservices.dto.EErrorLogDto;

@Component
public interface EErrorLogDtoMapper {
    int insert(EErrorLogDto record) throws SQLException;

    int insertSelective(EErrorLogDto record);
}