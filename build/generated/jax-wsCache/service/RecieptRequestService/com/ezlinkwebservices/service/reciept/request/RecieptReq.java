
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
 *         &lt;element ref="{http://ezlinkwebservices.com/service/Reciept/request}MERCHANTNO"/>
 *         &lt;element ref="{http://ezlinkwebservices.com/service/Reciept/request}ORDERNO"/>
 *         &lt;element ref="{http://ezlinkwebservices.com/service/Reciept/request}MERCHANTREFNO"/>
 *         &lt;element ref="{http://ezlinkwebservices.com/service/Reciept/request}CAN"/>
 *         &lt;element ref="{http://ezlinkwebservices.com/service/Reciept/request}AMOUNT"/>
 *         &lt;element ref="{http://ezlinkwebservices.com/service/Reciept/request}RECIEPTDATA"/>
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
    "orderno",
    "merchantrefno",
    "can",
    "amount",
    "recieptdata"
})
@XmlRootElement(name = "RecieptReq")
public class RecieptReq {

    @XmlElement(name = "MERCHANTNO", required = true)
    protected String merchantno;
    @XmlElement(name = "ORDERNO", required = true)
    protected String orderno;
    @XmlElement(name = "MERCHANTREFNO", required = true)
    protected String merchantrefno;
    @XmlElement(name = "CAN", required = true)
    protected String can;
    @XmlElement(name = "AMOUNT", required = true)
    protected BigDecimal amount;
    @XmlElement(name = "RECIEPTDATA", required = true)
    protected String recieptdata;

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
     * Gets the value of the recieptdata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRECIEPTDATA() {
        return recieptdata;
    }

    /**
     * Sets the value of the recieptdata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRECIEPTDATA(String value) {
        this.recieptdata = value;
    }

}
