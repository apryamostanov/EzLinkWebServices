
package com.ezlinkwebservices.service.tranxhistory.request;

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
 *         &lt;element ref="{http://ezlinkwebservices.com/service/TranxHistory/request}CARDNO"/>
 *         &lt;element ref="{http://ezlinkwebservices.com/service/TranxHistory/request}REQUIREDNOOFREC"/>
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
    "cardno",
    "requirednoofrec"
})
@XmlRootElement(name = "TranxHistoryReq")
public class TranxHistoryReq {

    @XmlElement(name = "CARDNO", required = true)
    protected String cardno;
    @XmlElement(name = "REQUIREDNOOFREC", required = true)
    protected BigInteger requirednoofrec;

    /**
     * Gets the value of the cardno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCARDNO() {
        return cardno;
    }

    /**
     * Sets the value of the cardno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCARDNO(String value) {
        this.cardno = value;
    }

    /**
     * Gets the value of the requirednoofrec property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getREQUIREDNOOFREC() {
        return requirednoofrec;
    }

    /**
     * Sets the value of the requirednoofrec property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setREQUIREDNOOFREC(BigInteger value) {
        this.requirednoofrec = value;
    }

}
