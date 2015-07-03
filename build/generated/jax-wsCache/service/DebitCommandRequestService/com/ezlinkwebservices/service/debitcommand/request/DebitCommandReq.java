
package com.ezlinkwebservices.service.debitcommand.request;

import java.math.BigDecimal;
import java.math.BigInteger;
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
 *         &lt;element ref="{http://ezlinkwebservices.com/service/DebitCommand/request}MERCHANTNO"/>
 *         &lt;element ref="{http://ezlinkwebservices.com/service/DebitCommand/request}ORDERNO"/>
 *         &lt;element ref="{http://ezlinkwebservices.com/service/DebitCommand/request}MERCHANTREFNO"/>
 *         &lt;element ref="{http://ezlinkwebservices.com/service/DebitCommand/request}AMOUNT"/>
 *         &lt;element ref="{http://ezlinkwebservices.com/service/DebitCommand/request}CURRENCY"/>
 *         &lt;element ref="{http://ezlinkwebservices.com/service/DebitCommand/request}TERMINALRANDOMNO"/>
 *         &lt;element ref="{http://ezlinkwebservices.com/service/DebitCommand/request}CARDRANDOMNO"/>
 *         &lt;element ref="{http://ezlinkwebservices.com/service/DebitCommand/request}CAN"/>
 *         &lt;element ref="{http://ezlinkwebservices.com/service/DebitCommand/request}CARDSNO"/>
 *         &lt;element ref="{http://ezlinkwebservices.com/service/DebitCommand/request}PURSEDATA"/>
 *         &lt;element ref="{http://ezlinkwebservices.com/service/DebitCommand/request}RETRYCNT"/>
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
    "amount",
    "currency",
    "terminalrandomno",
    "cardrandomno",
    "can",
    "cardsno",
    "pursedata",
    "retrycnt"
})
@XmlRootElement(name = "DebitCommandReq")
public class DebitCommandReq {

    @XmlElement(name = "MERCHANTNO", required = true)
    protected String merchantno;
    @XmlElement(name = "ORDERNO", required = true)
    protected String orderno;
    @XmlElement(name = "MERCHANTREFNO", required = true)
    protected String merchantrefno;
    @XmlElement(name = "AMOUNT", required = true)
    protected BigDecimal amount;
    @XmlElement(name = "CURRENCY", required = true)
    protected String currency;
    @XmlElement(name = "TERMINALRANDOMNO", required = true)
    protected String terminalrandomno;
    @XmlElement(name = "CARDRANDOMNO", required = true)
    protected String cardrandomno;
    @XmlElement(name = "CAN", required = true)
    protected String can;
    @XmlElement(name = "CARDSNO", required = true)
    protected String cardsno;
    @XmlElement(name = "PURSEDATA", required = true)
    protected String pursedata;
    @XmlElement(name = "RETRYCNT", required = true)
    protected BigInteger retrycnt;

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
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCURRENCY() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCURRENCY(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the terminalrandomno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTERMINALRANDOMNO() {
        return terminalrandomno;
    }

    /**
     * Sets the value of the terminalrandomno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTERMINALRANDOMNO(String value) {
        this.terminalrandomno = value;
    }

    /**
     * Gets the value of the cardrandomno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCARDRANDOMNO() {
        return cardrandomno;
    }

    /**
     * Sets the value of the cardrandomno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCARDRANDOMNO(String value) {
        this.cardrandomno = value;
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
     * Gets the value of the cardsno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCARDSNO() {
        return cardsno;
    }

    /**
     * Sets the value of the cardsno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCARDSNO(String value) {
        this.cardsno = value;
    }

    /**
     * Gets the value of the pursedata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPURSEDATA() {
        return pursedata;
    }

    /**
     * Sets the value of the pursedata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPURSEDATA(String value) {
        this.pursedata = value;
    }

    /**
     * Gets the value of the retrycnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRETRYCNT() {
        return retrycnt;
    }

    /**
     * Sets the value of the retrycnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRETRYCNT(BigInteger value) {
        this.retrycnt = value;
    }

}
