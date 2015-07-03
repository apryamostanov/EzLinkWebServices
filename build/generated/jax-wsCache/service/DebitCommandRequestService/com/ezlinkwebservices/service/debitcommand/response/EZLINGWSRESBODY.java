
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
 *         &lt;element ref="{http://ezlinkwebservices.com/service/DebitCommand/response}DebitCommandRes"/>
 *         &lt;element ref="{http://ezlinkwebservices.com/service/DebitCommand/response}DebitCommandResError"/>
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
    "debitCommandRes",
    "debitCommandResError"
})
@XmlRootElement(name = "EZLING_WS_RES_BODY")
public class EZLINGWSRESBODY {

    @XmlElement(name = "DebitCommandRes", required = true)
    protected DebitCommandRes debitCommandRes;
    @XmlElement(name = "DebitCommandResError", required = true)
    protected DebitCommandResError debitCommandResError;

    /**
     * Gets the value of the debitCommandRes property.
     * 
     * @return
     *     possible object is
     *     {@link DebitCommandRes }
     *     
     */
    public DebitCommandRes getDebitCommandRes() {
        return debitCommandRes;
    }

    /**
     * Sets the value of the debitCommandRes property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitCommandRes }
     *     
     */
    public void setDebitCommandRes(DebitCommandRes value) {
        this.debitCommandRes = value;
    }

    /**
     * Gets the value of the debitCommandResError property.
     * 
     * @return
     *     possible object is
     *     {@link DebitCommandResError }
     *     
     */
    public DebitCommandResError getDebitCommandResError() {
        return debitCommandResError;
    }

    /**
     * Sets the value of the debitCommandResError property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitCommandResError }
     *     
     */
    public void setDebitCommandResError(DebitCommandResError value) {
        this.debitCommandResError = value;
    }

}
