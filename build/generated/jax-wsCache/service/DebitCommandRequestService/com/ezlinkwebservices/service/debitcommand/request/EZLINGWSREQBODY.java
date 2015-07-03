
package com.ezlinkwebservices.service.debitcommand.request;

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
 *         &lt;element ref="{http://ezlinkwebservices.com/service/DebitCommand/request}DebitCommandReq"/>
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
    "debitCommandReq"
})
@XmlRootElement(name = "EZLING_WS_REQ_BODY")
public class EZLINGWSREQBODY {

    @XmlElement(name = "DebitCommandReq", required = true)
    protected DebitCommandReq debitCommandReq;

    /**
     * Gets the value of the debitCommandReq property.
     * 
     * @return
     *     possible object is
     *     {@link DebitCommandReq }
     *     
     */
    public DebitCommandReq getDebitCommandReq() {
        return debitCommandReq;
    }

    /**
     * Sets the value of the debitCommandReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitCommandReq }
     *     
     */
    public void setDebitCommandReq(DebitCommandReq value) {
        this.debitCommandReq = value;
    }

}
