package com.wirecard.ezlinkwebservices.dto;

import org.springframework.stereotype.Component;

@Component
public class EMerchantDetailsDto {
    private String merchantNo;

    private String returnUrl;

    private String ipAddress;

    private String ipAddressVal;

    private String businessRefno;

    private String channel;

    private String userInfo;

    private String accessCode;

    private String hashSecreatKey;

    private String hashSecreatKeyVal;

    private String accessCodeSecreatKey;

    private String accessCodeSecreatKeyVal;

    private String accessCodeSecretSalt;
    
    private String securityLevel;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getIpAddressVal() {
        return ipAddressVal;
    }

    public void setIpAddressVal(String ipAddressVal) {
        this.ipAddressVal = ipAddressVal;
    }

    public String getBusinessRefno() {
        return businessRefno;
    }

    public void setBusinessRefno(String businessRefno) {
        this.businessRefno = businessRefno;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo;
    }

    public String getAccessCode() {
        return accessCode;
    }

    public void setAccessCode(String accessCode) {
        this.accessCode = accessCode;
    }

    public String getHashSecreatKey() {
        return hashSecreatKey;
    }

    public void setHashSecreatKey(String hashSecreatKey) {
        this.hashSecreatKey = hashSecreatKey;
    }

    public String getHashSecreatKeyVal() {
        return hashSecreatKeyVal;
    }

    public void setHashSecreatKeyVal(String hashSecreatKeyVal) {
        this.hashSecreatKeyVal = hashSecreatKeyVal;
    }

    public String getAccessCodeSecreatKey() {
        return accessCodeSecreatKey;
    }

    public void setAccessCodeSecreatKey(String accessCodeSecreatKey) {
        this.accessCodeSecreatKey = accessCodeSecreatKey;
    }

    public String getAccessCodeSecreatKeyVal() {
        return accessCodeSecreatKeyVal;
    }

    public void setAccessCodeSecreatKeyVal(String accessCodeSecreatKeyVal) {
        this.accessCodeSecreatKeyVal = accessCodeSecreatKeyVal;
    }

    public String getAccessCodeSecretSalt() {
        return accessCodeSecretSalt;
    }

    public void setAccessCodeSecretSalt(String accessCodeSecretSalt) {
        this.accessCodeSecretSalt = accessCodeSecretSalt;
    }

    public String getSecurityLevel() {
        return securityLevel;
    }

    public void setSecurityLevel(String securityLevel) {
        this.securityLevel = securityLevel;
    }
    
    
}