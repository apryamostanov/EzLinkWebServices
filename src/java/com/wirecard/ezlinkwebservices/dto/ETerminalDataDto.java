package com.wirecard.ezlinkwebservices.dto;

import java.util.Date;
import org.springframework.stereotype.Component;
@Component
public class ETerminalDataDto {
    private String sno;

    private String orderNo;

    private String merchantTranxRefNo;
    
    private String merchantNo;

    private double amount;

    private String can;

    private String terminalRndNo;

    private String cardRndNo;

    private String debitCmd;

    private String terminalSessionKey;

    private String recieptSessionKey;

    private int terminalCounter;

    private int hostCounter;

    private String recieptData;

    private String updatedBy;

    private Date updatedDate;
    
     private String hostRefNo;
     
     private String purseData;
     
     private String tranxlogId;
     
     private String debitSessionKey;
     
     private String ezLinkString;
     
     private String decryptedRecieptData;
     
     private String decryptReceiptStatus;

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getMerchantTranxRefNo() {
        return merchantTranxRefNo;
    }

    public void setMerchantTranxRefNo(String merchantTranxRefNo) {
        this.merchantTranxRefNo = merchantTranxRefNo;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCan() {
        return can;
    }

    public void setCan(String can) {
        this.can = can;
    }

    public String getTerminalRndNo() {
        return terminalRndNo;
    }

    public void setTerminalRndNo(String terminalRndNo) {
        this.terminalRndNo = terminalRndNo;
    }

    public String getCardRndNo() {
        return cardRndNo;
    }

    public void setCardRndNo(String cardRndNo) {
        this.cardRndNo = cardRndNo;
    }

    public String getDebitCmd() {
        return debitCmd;
    }

    public void setDebitCmd(String debitCmd) {
        this.debitCmd = debitCmd;
    }

    public String getTerminalSessionKey() {
        return terminalSessionKey;
    }

    public void setTerminalSessionKey(String terminalSessionKey) {
        this.terminalSessionKey = terminalSessionKey;
    }

    public String getRecieptSessionKey() {
        return recieptSessionKey;
    }

    public void setRecieptSessionKey(String recieptSessionKey) {
        this.recieptSessionKey = recieptSessionKey;
    }

    public int getTerminalCounter() {
        return terminalCounter;
    }

    public void setTerminalCounter(int terminalCounter) {
        this.terminalCounter = terminalCounter;
    }

    public int getHostCounter() {
        return hostCounter;
    }

    public void setHostCounter(int hostCounter) {
        this.hostCounter = hostCounter;
    }

    public String getRecieptData() {
        return recieptData;
    }

    public void setRecieptData(String recieptData) {
        this.recieptData = recieptData;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getHostRefNo() {
        return hostRefNo;
    }

    public void setHostRefNo(String hostRefNo) {
        this.hostRefNo = hostRefNo;
    }

    public String getPurseData() {
        return purseData;
    }

    public void setPurseData(String purseData) {
        this.purseData = purseData;
    }

    public String getTranxlogId() {
        return tranxlogId;
    }

    public void setTranxlogId(String tranxlogId) {
        this.tranxlogId = tranxlogId;
    }

    public String getDebitSessionKey() {
        return debitSessionKey;
    }

    public void setDebitSessionKey(String debitSessionKey) {
        this.debitSessionKey = debitSessionKey;
    }

    public String getEzLinkString() {
        return ezLinkString;
    }

    public void setEzLinkString(String ezLinkString) {
        this.ezLinkString = ezLinkString;
    }

    public String getDecryptedRecieptData() {
        return decryptedRecieptData;
    }

    public void setDecryptedRecieptData(String decryptedRecieptData) {
        this.decryptedRecieptData = decryptedRecieptData;
    }

    public String getDecryptReceiptStatus() {
        return decryptReceiptStatus;
    }

    public void setDecryptReceiptStatus(String decryptReceiptStatus) {
        this.decryptReceiptStatus = decryptReceiptStatus;
    }

    @Override
    public String toString() {
        return "ETerminalDataDto{" + "sno=" + sno + ", orderNo=" + orderNo + ", merchantTranxRefNo=" + merchantTranxRefNo + ", merchantNo=" + merchantNo + ", amount=" + amount + ", can=" + can + ", terminalRndNo=" + terminalRndNo + ", cardRndNo=" + cardRndNo + ", debitCmd=" + debitCmd + ", terminalSessionKey=" + terminalSessionKey + ", recieptSessionKey=" + recieptSessionKey + ", terminalCounter=" + terminalCounter + ", hostCounter=" + hostCounter + ", recieptData=" + recieptData + ", updatedBy=" + updatedBy + ", updatedDate=" + updatedDate + ", hostRefNo=" + hostRefNo + ", purseData=" + purseData + ", tranxlogId=" + tranxlogId + ", debitSessionKey=" + debitSessionKey + ", ezLinkString=" + ezLinkString + ", decryptedRecieptData=" + decryptedRecieptData + '}';
    }
    
    

   
  
}