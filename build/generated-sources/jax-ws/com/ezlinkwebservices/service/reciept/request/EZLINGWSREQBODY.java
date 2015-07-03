
package com.ezlinkwebservices.service.reciept.request;

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
 *         &lt;element ref="{http://ezlinkwebservices.com/service/Reciept/request}RecieptReq"/>
 *         &lt;element ref="{http://ezlinkwebservices.com/service/Reciept/request}RecieptReqError"/>
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
    "recieptReq",
    "recieptReqError"
})
@XmlRootElement(name = "EZLING_WS_REQ_BODY")
public class EZLINGWSREQBODY {

    @XmlElement(name = "RecieptReq", required = true)
    protected RecieptReq recieptReq;
    @XmlElement(name = "RecieptReqError", required = true)
    protected RecieptReqError recieptReqError;

    /**
     * Gets the value of the recieptReq property.
     * 
     * @return
     *     possible object is
     *     {@link RecieptReq }
     *     
     */
    public RecieptReq getRecieptReq() {
        return recieptReq;
    }

    /**
     * Sets the value of the recieptReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecieptReq }
     *     
     */
    public void setRecieptReq(RecieptReq value) {
        this.recieptReq = value;
    }

    /**
     * Gets the value of the recieptReqError property.
     * 
     * @return
     *     possible object is
     *     {@link RecieptReqError }
     *     
     */
    public RecieptReqError getRecieptReqError() {
        return recieptReqError;
    }

    /**
     * Sets the value of the recieptReqError property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecieptReqError }
     *     
     */
    public void setRecieptReqError(RecieptReqError value) {
        this.recieptReqError = value;
    }

}
