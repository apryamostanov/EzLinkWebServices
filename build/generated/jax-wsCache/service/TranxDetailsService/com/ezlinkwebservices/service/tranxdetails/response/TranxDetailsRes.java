
package com.ezlinkwebservices.service.tranxdetails.response;

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
 *         &lt;element ref="{http://ezlinkwebservices.com/service/TranxDetails/response}MERCHANTNO"/>
 *         &lt;element ref="{http://ezlinkwebservices.com/service/TranxDetails/response}MERCHANTREFNO"/>
 *         &lt;element ref="{http://ezlinkwebservices.com/service/TranxDetails/response}ORDERNO"/>
 *         &lt;element ref="{http://ezlinkwebservices.com/service/TranxDetails/response}AMOUNT"/>
 *         &lt;element ref="{http://ezlinkwebservices.com/service/TranxDetails/response}CURRENCYCODE"/>
 *         &lt;element ref="{http://ezlinkwebservices.com/service/TranxDetails/response}TRANXDATE"/>
 *         &lt;element ref="{http://ezlinkwebservices.com/service/TranxDetails/response}TRANXSTATUS"/>
 *         &lt;element ref="{http://ezlinkwebservices.com/service/TranxDetails/response}RESPONSECODE"/>
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
    "merchantno",
    "merchantrefno",
    "orderno",
    "amount",
    "currencycode",
    "tranxdate",
    "tranxstatus",
    "responsecode"
})
@XmlRootElement(name = "TranxDetailsRes")
public class TranxDetailsRes {

    @XmlElement(name = "MERCHANTNO", required = true)
    protected String merchantno;
    @XmlElement(name = "MERCHANTREFNO", required = true)
    protected String merchantrefno;
    @XmlElement(name = "ORDERNO", required = true)
    protected String orderno;
    @XmlElement(name = "AMOUNT", required = true)
    protected String amount;
    @XmlElement(name = "CURRENCYCODE", required = true)
    protected String currencycode;
    @XmlElement(name = "TRANXDATE", required = true)
    protected String tranxdate;
    @XmlElement(name = "TRANXSTATUS", required = true)
    protected String tranxstatus;
    @XmlElement(name = "RESPONSECODE", required = true)
    protected String responsecode;

    /**
     * Gets the value of the merchantno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMERCHANTNO() {
        return merchantno;
    }

    /**
     * Sets the value of the merchantno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMERCHANTNO(String value) {
        this.merchantno = value;
    }

    /**
     * Gets the value of the merchantrefno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMERCHANTREFNO() {
        return merchantrefno;
    }

    /**
     * Sets the value of the merchantrefno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMERCHANTREFNO(String value) {
        this.merchantrefno = value;
    }

    /**
     * Gets the value of the orderno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORDERNO() {
        return orderno;
    }

    /**
     * Sets the value of the orderno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORDERNO(String value) {
        this.orderno = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAMOUNT() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAMOUNT(String value) {
        this.amount = value;
    }

    /**
     * Gets the value of the currencycode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCURRENCYCODE() {
        return currencycode;
    }

    /**
     * Sets the value of the currencycode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCURRENCYCODE(String value) {
        this.currencycode = value;
    }

    /**
     * Gets the value of the tranxdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRANXDATE() {
        return tranxdate;
    }

    /**
     * Sets the value of the tranxdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRANXDATE(String value) {
        this.tranxdate = value;
    }

    /**
     * Gets the value of the tranxstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRANXSTATUS() {
        return tranxstatus;
    }

    /**
     * Sets the value of the tranxstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRANXSTATUS(String value) {
        this.tranxstatus = value;
    }

    /**
     * Gets the value of the responsecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESPONSECODE() {
        return responsecode;
    }

    /**
     * Sets the value of the responsecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESPONSECODE(String value) {
        this.responsecode = value;
    }

}
