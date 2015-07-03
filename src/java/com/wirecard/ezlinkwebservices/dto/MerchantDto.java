package com.wirecard.ezlinkwebservices.dto;

import java.math.BigDecimal;
import java.util.Date;
import org.springframework.stereotype.Component;

@Component
public class MerchantDto {
    private String merchantNo;

    private String merchantName;

    private String merchantDesc;

    private String parentMerchant;

    private String bussAddress1;

    private String bussAddress2;

    private String bussCountry;

    private String bussPostalCode;

    private String bussWebSite;

    private String contactName;

    private String contactPhone;

    private String contactFax;

    private String contactEmail;

    private String merchantStatus;

    private String settlementFrequency;

    private String settlementEmail;

    private String paymentType;

    private String paymentOption;

    private String createdBy;

    private Date createdOn;

    private String modifiedBy;

    private Date modifiedOn;

    private String acqId;

    private String mccCode;

    private Short rskNooftopupsallowed;

    private BigDecimal rskMaxtopuplimit;

    private String rskTranxtypeallowed;

    private BigDecimal accTopuptranxfee;

    private BigDecimal accTopupfeepayable;

    private String accMerchantbank;

    private String accBankcode;

    private String accBranchcode;

    private String accAccountno;

    private String accAccountname;

    private Short accPaymentdays;

    private Date lastPaymentDate;

    private String forcePayment;

    private BigDecimal accForcepaymentfee;

    private Short settlemetDays;

    private Date lastSettlemetDate;

    private BigDecimal accSalemdr;

    private String accAcqbank;

    private String trpPayment;

    private String trpTopup;

    private String contactMobile;

    private String mailAddress1;

    private String mailAddress2;

    private String mailCountry;

    private String mailPostalCode;

    private Integer ezAgentId;

    private String accSalemdrType;

    private String accTopupfeeType;

    private String discountSettlement;

    private BigDecimal vaccBalance;

    private BigDecimal vaccCheckpoint;

    private String topupSettlement;

    private Date vaccLastCredit;

    private Date vaccLastDebit;

    private BigDecimal vaccTransferCharge;

    private BigDecimal accRetailTopuptranxfee;

    private BigDecimal accRetailTopupfeepayable;

    private String storefrontName;

    private String ngfsDebit;

    private Short ngfsDebitDays;

    private Short ruvCreditDays;

    private String ruvCredit;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getMerchantDesc() {
        return merchantDesc;
    }

    public void setMerchantDesc(String merchantDesc) {
        this.merchantDesc = merchantDesc;
    }

    public String getParentMerchant() {
        return parentMerchant;
    }

    public void setParentMerchant(String parentMerchant) {
        this.parentMerchant = parentMerchant;
    }

    public String getBussAddress1() {
        return bussAddress1;
    }

    public void setBussAddress1(String bussAddress1) {
        this.bussAddress1 = bussAddress1;
    }

    public String getBussAddress2() {
        return bussAddress2;
    }

    public void setBussAddress2(String bussAddress2) {
        this.bussAddress2 = bussAddress2;
    }

    public String getBussCountry() {
        return bussCountry;
    }

    public void setBussCountry(String bussCountry) {
        this.bussCountry = bussCountry;
    }

    public String getBussPostalCode() {
        return bussPostalCode;
    }

    public void setBussPostalCode(String bussPostalCode) {
        this.bussPostalCode = bussPostalCode;
    }

    public String getBussWebSite() {
        return bussWebSite;
    }

    public void setBussWebSite(String bussWebSite) {
        this.bussWebSite = bussWebSite;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getContactFax() {
        return contactFax;
    }

    public void setContactFax(String contactFax) {
        this.contactFax = contactFax;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getMerchantStatus() {
        return merchantStatus;
    }

    public void setMerchantStatus(String merchantStatus) {
        this.merchantStatus = merchantStatus;
    }

    public String getSettlementFrequency() {
        return settlementFrequency;
    }

    public void setSettlementFrequency(String settlementFrequency) {
        this.settlementFrequency = settlementFrequency;
    }

    public String getSettlementEmail() {
        return settlementEmail;
    }

    public void setSettlementEmail(String settlementEmail) {
        this.settlementEmail = settlementEmail;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getPaymentOption() {
        return paymentOption;
    }

    public void setPaymentOption(String paymentOption) {
        this.paymentOption = paymentOption;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Date getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Date modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public String getAcqId() {
        return acqId;
    }

    public void setAcqId(String acqId) {
        this.acqId = acqId;
    }

    public String getMccCode() {
        return mccCode;
    }

    public void setMccCode(String mccCode) {
        this.mccCode = mccCode;
    }

    public Short getRskNooftopupsallowed() {
        return rskNooftopupsallowed;
    }

    public void setRskNooftopupsallowed(Short rskNooftopupsallowed) {
        this.rskNooftopupsallowed = rskNooftopupsallowed;
    }

    public BigDecimal getRskMaxtopuplimit() {
        return rskMaxtopuplimit;
    }

    public void setRskMaxtopuplimit(BigDecimal rskMaxtopuplimit) {
        this.rskMaxtopuplimit = rskMaxtopuplimit;
    }

    public String getRskTranxtypeallowed() {
        return rskTranxtypeallowed;
    }

    public void setRskTranxtypeallowed(String rskTranxtypeallowed) {
        this.rskTranxtypeallowed = rskTranxtypeallowed;
    }

    public BigDecimal getAccTopuptranxfee() {
        return accTopuptranxfee;
    }

    public void setAccTopuptranxfee(BigDecimal accTopuptranxfee) {
        this.accTopuptranxfee = accTopuptranxfee;
    }

    public BigDecimal getAccTopupfeepayable() {
        return accTopupfeepayable;
    }

    public void setAccTopupfeepayable(BigDecimal accTopupfeepayable) {
        this.accTopupfeepayable = accTopupfeepayable;
    }

    public String getAccMerchantbank() {
        return accMerchantbank;
    }

    public void setAccMerchantbank(String accMerchantbank) {
        this.accMerchantbank = accMerchantbank;
    }

    public String getAccBankcode() {
        return accBankcode;
    }

    public void setAccBankcode(String accBankcode) {
        this.accBankcode = accBankcode;
    }

    public String getAccBranchcode() {
        return accBranchcode;
    }

    public void setAccBranchcode(String accBranchcode) {
        this.accBranchcode = accBranchcode;
    }

    public String getAccAccountno() {
        return accAccountno;
    }

    public void setAccAccountno(String accAccountno) {
        this.accAccountno = accAccountno;
    }

    public String getAccAccountname() {
        return accAccountname;
    }

    public void setAccAccountname(String accAccountname) {
        this.accAccountname = accAccountname;
    }

    public Short getAccPaymentdays() {
        return accPaymentdays;
    }

    public void setAccPaymentdays(Short accPaymentdays) {
        this.accPaymentdays = accPaymentdays;
    }

    public Date getLastPaymentDate() {
        return lastPaymentDate;
    }

    public void setLastPaymentDate(Date lastPaymentDate) {
        this.lastPaymentDate = lastPaymentDate;
    }

    public String getForcePayment() {
        return forcePayment;
    }

    public void setForcePayment(String forcePayment) {
        this.forcePayment = forcePayment;
    }

    public BigDecimal getAccForcepaymentfee() {
        return accForcepaymentfee;
    }

    public void setAccForcepaymentfee(BigDecimal accForcepaymentfee) {
        this.accForcepaymentfee = accForcepaymentfee;
    }

    public Short getSettlemetDays() {
        return settlemetDays;
    }

    public void setSettlemetDays(Short settlemetDays) {
        this.settlemetDays = settlemetDays;
    }

    public Date getLastSettlemetDate() {
        return lastSettlemetDate;
    }

    public void setLastSettlemetDate(Date lastSettlemetDate) {
        this.lastSettlemetDate = lastSettlemetDate;
    }

    public BigDecimal getAccSalemdr() {
        return accSalemdr;
    }

    public void setAccSalemdr(BigDecimal accSalemdr) {
        this.accSalemdr = accSalemdr;
    }

    public String getAccAcqbank() {
        return accAcqbank;
    }

    public void setAccAcqbank(String accAcqbank) {
        this.accAcqbank = accAcqbank;
    }

    public String getTrpPayment() {
        return trpPayment;
    }

    public void setTrpPayment(String trpPayment) {
        this.trpPayment = trpPayment;
    }

    public String getTrpTopup() {
        return trpTopup;
    }

    public void setTrpTopup(String trpTopup) {
        this.trpTopup = trpTopup;
    }

    public String getContactMobile() {
        return contactMobile;
    }

    public void setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile;
    }

    public String getMailAddress1() {
        return mailAddress1;
    }

    public void setMailAddress1(String mailAddress1) {
        this.mailAddress1 = mailAddress1;
    }

    public String getMailAddress2() {
        return mailAddress2;
    }

    public void setMailAddress2(String mailAddress2) {
        this.mailAddress2 = mailAddress2;
    }

    public String getMailCountry() {
        return mailCountry;
    }

    public void setMailCountry(String mailCountry) {
        this.mailCountry = mailCountry;
    }

    public String getMailPostalCode() {
        return mailPostalCode;
    }

    public void setMailPostalCode(String mailPostalCode) {
        this.mailPostalCode = mailPostalCode;
    }

    public Integer getEzAgentId() {
        return ezAgentId;
    }

    public void setEzAgentId(Integer ezAgentId) {
        this.ezAgentId = ezAgentId;
    }

    public String getAccSalemdrType() {
        return accSalemdrType;
    }

    public void setAccSalemdrType(String accSalemdrType) {
        this.accSalemdrType = accSalemdrType;
    }

    public String getAccTopupfeeType() {
        return accTopupfeeType;
    }

    public void setAccTopupfeeType(String accTopupfeeType) {
        this.accTopupfeeType = accTopupfeeType;
    }

    public String getDiscountSettlement() {
        return discountSettlement;
    }

    public void setDiscountSettlement(String discountSettlement) {
        this.discountSettlement = discountSettlement;
    }

    public BigDecimal getVaccBalance() {
        return vaccBalance;
    }

    public void setVaccBalance(BigDecimal vaccBalance) {
        this.vaccBalance = vaccBalance;
    }

    public BigDecimal getVaccCheckpoint() {
        return vaccCheckpoint;
    }

    public void setVaccCheckpoint(BigDecimal vaccCheckpoint) {
        this.vaccCheckpoint = vaccCheckpoint;
    }

    public String getTopupSettlement() {
        return topupSettlement;
    }

    public void setTopupSettlement(String topupSettlement) {
        this.topupSettlement = topupSettlement;
    }

    public Date getVaccLastCredit() {
        return vaccLastCredit;
    }

    public void setVaccLastCredit(Date vaccLastCredit) {
        this.vaccLastCredit = vaccLastCredit;
    }

    public Date getVaccLastDebit() {
        return vaccLastDebit;
    }

    public void setVaccLastDebit(Date vaccLastDebit) {
        this.vaccLastDebit = vaccLastDebit;
    }

    public BigDecimal getVaccTransferCharge() {
        return vaccTransferCharge;
    }

    public void setVaccTransferCharge(BigDecimal vaccTransferCharge) {
        this.vaccTransferCharge = vaccTransferCharge;
    }

    public BigDecimal getAccRetailTopuptranxfee() {
        return accRetailTopuptranxfee;
    }

    public void setAccRetailTopuptranxfee(BigDecimal accRetailTopuptranxfee) {
        this.accRetailTopuptranxfee = accRetailTopuptranxfee;
    }

    public BigDecimal getAccRetailTopupfeepayable() {
        return accRetailTopupfeepayable;
    }

    public void setAccRetailTopupfeepayable(BigDecimal accRetailTopupfeepayable) {
        this.accRetailTopupfeepayable = accRetailTopupfeepayable;
    }

    public String getStorefrontName() {
        return storefrontName;
    }

    public void setStorefrontName(String storefrontName) {
        this.storefrontName = storefrontName;
    }

    public String getNgfsDebit() {
        return ngfsDebit;
    }

    public void setNgfsDebit(String ngfsDebit) {
        this.ngfsDebit = ngfsDebit;
    }

    public Short getNgfsDebitDays() {
        return ngfsDebitDays;
    }

    public void setNgfsDebitDays(Short ngfsDebitDays) {
        this.ngfsDebitDays = ngfsDebitDays;
    }

    public Short getRuvCreditDays() {
        return ruvCreditDays;
    }

    public void setRuvCreditDays(Short ruvCreditDays) {
        this.ruvCreditDays = ruvCreditDays;
    }

    public String getRuvCredit() {
        return ruvCredit;
    }

    public void setRuvCredit(String ruvCredit) {
        this.ruvCredit = ruvCredit;
    }
}