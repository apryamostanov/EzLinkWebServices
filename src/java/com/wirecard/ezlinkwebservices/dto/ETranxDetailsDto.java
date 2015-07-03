/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wirecard.ezlinkwebservices.dto;


import java.util.Date;
import org.springframework.stereotype.Component;

/**
 *
 * @author WCCTTI-JANAHAN
 */

@Component
public class ETranxDetailsDto {
  private String sno;

    private String tranxlogId;

    private String tranxtype;

    private Date datetime;
    
    private String responseCode;
    
    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getTranxlogId() {
        return tranxlogId;
    }

    public void setTranxlogId(String tranxlogId) {
        this.tranxlogId = tranxlogId;
    }

    public String getTranxtype() {
        return tranxtype;
    }

    public void setTranxtype(String tranxtype) {
        this.tranxtype = tranxtype;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

}
