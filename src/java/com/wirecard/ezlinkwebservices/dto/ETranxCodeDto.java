package com.wirecard.ezlinkwebservices.dto;

import org.springframework.stereotype.Component;

@Component
public class ETranxCodeDto {
    private String tranxcode;

    private String codeDesc;

    public String getTranxcode() {
        return tranxcode;
    }

    public void setTranxcode(String tranxcode) {
        this.tranxcode = tranxcode;
    }

    public String getCodeDesc() {
        return codeDesc;
    }

    public void setCodeDesc(String codeDesc) {
        this.codeDesc = codeDesc;
    }
}