
package com.ezlinkwebservices.service.reciept.response;

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
 *         &lt;element ref="{http://ezlinkwebservices.com/service/Reciept/response}RecieptRes"/>
 *         &lt;element ref="{http://ezlinkwebservices.com/service/Reciept/response}RecieptResError"/>
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
    "recieptRes",
    "recieptResError"
})
@XmlRootElement(name = "EZLING_WS_RES_BODY")
public class EZLINGWSRESBODY {

    @XmlElement(name = "RecieptRes", required = true)
    protected RecieptRes recieptRes;
    @XmlElement(name = "RecieptResError", required = true)
    protected RecieptResError recieptResError;

    /**
     * Gets the value of the recieptRes property.
     * 
     * @return
     *     possible object is
     *     {@link RecieptRes }
     *     
     */
    public RecieptRes getRecieptRes() {
        return recieptRes;
    }

    /**
     * Sets the value of the recieptRes property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecieptRes }
     *     
     */
    public void setRecieptRes(RecieptRes value) {
        this.recieptRes = value;
    }

    /**
     * Gets the value of the recieptResError property.
     * 
     * @return
     *     possible object is
     *     {@link RecieptResError }
     *     
     */
    public RecieptResError getRecieptResError() {
        return recieptResError;
    }

    /**
     * Sets the value of the recieptResError property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecieptResError }
     *     
     */
    public void setRecieptResError(RecieptResError value) {
        this.recieptResError = value;
    }

}
