
package com.ezlinkwebservices.service.reciept.request;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ezlinkwebservices.com/service/Reciept/request}VERSION"/>
 *         &lt;element ref="{http://ezlinkwebservices.com/service/Reciept/request}SOURCETYPE"/>
 *         &lt;element ref="{http://ezlinkwebservices.com/service/Reciept/request}SOURCEID"/>
 *         &lt;element ref="{http://ezlinkwebservices.com/service/Reciept/request}DATETIME"/>
 *         &lt;element ref="{http://ezlinkwebservices.com/service/Reciept/request}IPADDRESS"/>
 *         &lt;element ref="{http://ezlinkwebservices.com/service/Reciept/request}SECURITYLEVEL"/>
 *         &lt;element ref="{http://ezlinkwebservices.com/service/Reciept/request}SIGNATURE"/>
 *         &lt;element ref="{http://ezlinkwebservices.com/service/Reciept/request}ENCRYPTIONCRYPTOGRAM"/>
 *         &lt;element ref="{http://ezlinkwebservices.com/service/Reciept/request}ACCESSCODE"/>
 *         &lt;element ref="{http://ezlinkwebservices.com/service/Reciept/request}STATUS"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "version",
    "sourcetype",
    "sourceid",
    "datetime",
    "ipaddress",
    "securitylevel",
    "signature",
    "encryptioncryptogram",
    "accesscode",
    "status"
})
@XmlRootElement(name = "EZLING_WS_HEADER")
public class EZLINGWSHEADER {

    @XmlElement(name = "VERSION", required = true)
    protected BigDecimal version;
    @XmlElement(name = "SOURCETYPE", required = true)
    protected String sourcetype;
    @XmlElement(name = "SOURCEID", required = true)
    protected String sourceid;
    @XmlElement(name = "DATETIME", required = true)
    protected String datetime;
    @XmlElement(name = "IPADDRESS", required = true)
    protected String ipaddress;
    @XmlElement(name = "SECURITYLEVEL", required = true)
    protected String securitylevel;
    @XmlElement(name = "SIGNATURE", required = true)
    protected String signature;
    @XmlElement(name = "ENCRYPTIONCRYPTOGRAM", required = true)
    protected String encryptioncryptogram;
    @XmlElement(name = "ACCESSCODE", required = true)
    protected String accesscode;
    @XmlElement(name = "STATUS", required = true)
    protected String status;

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVERSION() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVERSION(BigDecimal value) {
        this.version = value;
    }

    /**
     * Gets the value of the sourcetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOURCETYPE() {
        return sourcetype;
    }

    /**
     * Sets the value of the sourcetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOURCETYPE(String value) {
        this.sourcetype = value;
    }

    /**
     * Gets the value of the sourceid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOURCEID() {
        return sourceid;
    }

    /**
     * Sets the value of the sourceid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOURCEID(String value) {
        this.sourceid = value;
    }

    /**
     * Gets the value of the datetime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATETIME() {
        return datetime;
    }

    /**
     * Sets the value of the datetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATETIME(String value) {
        this.datetime = value;
    }

    /**
     * Gets the value of the ipaddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPADDRESS() {
        return ipaddress;
    }

    /**
     * Sets the value of the ipaddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPADDRESS(String value) {
        this.ipaddress = value;
    }

    /**
     * Gets the value of the securitylevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSECURITYLEVEL() {
        return securitylevel;
    }

    /**
     * Sets the value of the securitylevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSECURITYLEVEL(String value) {
        this.securitylevel = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIGNATURE() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIGNATURE(String value) {
        this.signature = value;
    }

    /**
     * Gets the value of the encryptioncryptogram property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENCRYPTIONCRYPTOGRAM() {
        return encryptioncryptogram;
    }

    /**
     * Sets the value of the encryptioncryptogram property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENCRYPTIONCRYPTOGRAM(String value) {
        this.encryptioncryptogram = value;
    }

    /**
     * Gets the value of the accesscode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCESSCODE() {
        return accesscode;
    }

    /**
     * Sets the value of the accesscode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCESSCODE(String value) {
        this.accesscode = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATUS(String value) {
        this.status = value;
    }

}
