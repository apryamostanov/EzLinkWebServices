package com.wirecard.ezlinkwebservices.dto;

import java.math.BigDecimal;
import org.springframework.stereotype.Component;
@Component
public class ViewEZBlacklistDto {
    private BigDecimal fileSeq;

    private String fromCard;

    private String toCard;

    private String reasonCode;

    private String type;

    private String binval;

    private String bdc;

    private String bin;

    public BigDecimal getFileSeq() {
        return fileSeq;
    }

    public void setFileSeq(BigDecimal fileSeq) {
        this.fileSeq = fileSeq;
    }

    public String getFromCard() {
        return fromCard;
    }

    public void setFromCard(String fromCard) {
        this.fromCard = fromCard;
    }

    public String getToCard() {
        return toCard;
    }

    public void setToCard(String toCard) {
        this.toCard = toCard;
    }

    public String getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBinval() {
        return binval;
    }

    public void setBinval(String binval) {
        this.binval = binval;
    }

    public String getBdc() {
        return bdc;
    }

    public void setBdc(String bdc) {
        this.bdc = bdc;
    }

    public String getBin() {
        return bin;
    }

    public void setBin(String bin) {
        this.bin = bin;
    }
}