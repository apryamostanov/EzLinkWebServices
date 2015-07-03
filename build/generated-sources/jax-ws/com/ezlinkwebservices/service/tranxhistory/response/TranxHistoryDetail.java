
package com.ezlinkwebservices.service.tranxhistory.response;

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
 *         &lt;element ref="{http://ezlinkwebservices.com/service/TranxHistory/response}TRANXDATE"/>
 *         &lt;element ref="{http://ezlinkwebservices.com/service/TranxHistory/response}MERCHANTNAME"/>
 *         &lt;element ref="{http://ezlinkwebservices.com/service/TranxHistory/response}AMOUNT"/>
 *         &lt;element ref="{http://ezlinkwebservices.com/service/TranxHistory/response}STATUS"/>
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
    "tranxdate",
    "merchantname",
    "amount",
    "status"
})
@XmlRootElement(name = "TranxHistoryDetail")
public class TranxHistoryDetail {

    @XmlElement(name = "TRANXDATE", required = true)
    protected String tranxdate;
    @XmlElement(name = "MERCHANTNAME", required = true)
    protected String merchantname;
    @XmlElement(name = "AMOUNT", required = true)
    protected BigDecimal amount;
    @XmlElement(name = "STATUS", required = true)
    protected String status;

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
     * Gets the value of the merchantname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMERCHANTNAME() {
        return merchantname;
    }

    /**
     * Sets the value of the merchantname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMERCHANTNAME(String value) {
        this.merchantname = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAMOUNT() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAMOUNT(BigDecimal value) {
        this.amount = value;
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
