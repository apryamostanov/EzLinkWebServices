
package com.ezlinkwebservices.service.debitcommand.response;

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
 *         &lt;element ref="{http://ezlinkwebservices.com/service/DebitCommand/response}ORDERNO"/>
 *         &lt;element ref="{http://ezlinkwebservices.com/service/DebitCommand/response}MERCHANTREFNO"/>
 *         &lt;element ref="{http://ezlinkwebservices.com/service/DebitCommand/response}CAN"/>
 *         &lt;element ref="{http://ezlinkwebservices.com/service/DebitCommand/response}DEBITCOMMAND"/>
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
    "orderno",
    "merchantrefno",
    "can",
    "debitcommand"
})
@XmlRootElement(name = "DebitCommandRes")
public class DebitCommandRes {

    @XmlElement(name = "ORDERNO", required = true)
    protected String orderno;
    @XmlElement(name = "MERCHANTREFNO", required = true)
    protected String merchantrefno;
    @XmlElement(name = "CAN", required = true)
    protected String can;
    @XmlElement(name = "DEBITCOMMAND", required = true)
    protected String debitcommand;

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
     * Gets the value of the can property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAN() {
        return can;
    }

    /**
     * Sets the value of the can property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAN(String value) {
        this.can = value;
    }

    /**
     * Gets the value of the debitcommand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEBITCOMMAND() {
        return debitcommand;
    }

    /**
     * Sets the value of the debitcommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEBITCOMMAND(String value) {
        this.debitcommand = value;
    }

}
