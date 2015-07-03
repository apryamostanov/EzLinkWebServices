
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
 *         &lt;element ref="{http://ezlinkwebservices.com/service/TranxDetails/response}TranxDetailsRes"/>
 *         &lt;element ref="{http://ezlinkwebservices.com/service/TranxDetails/response}TranxDetailsResError"/>
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
    "tranxDetailsRes",
    "tranxDetailsResError"
})
@XmlRootElement(name = "EZLING_WS__TRANX_DETAILS_RES_BODY")
public class EZLINGWSTRANXDETAILSRESBODY {

    @XmlElement(name = "TranxDetailsRes", required = true)
    protected TranxDetailsRes tranxDetailsRes;
    @XmlElement(name = "TranxDetailsResError", required = true)
    protected TranxDetailsResError tranxDetailsResError;

    /**
     * Gets the value of the tranxDetailsRes property.
     * 
     * @return
     *     possible object is
     *     {@link TranxDetailsRes }
     *     
     */
    public TranxDetailsRes getTranxDetailsRes() {
        return tranxDetailsRes;
    }

    /**
     * Sets the value of the tranxDetailsRes property.
     * 
     * @param value
     *     allowed object is
     *     {@link TranxDetailsRes }
     *     
     */
    public void setTranxDetailsRes(TranxDetailsRes value) {
        this.tranxDetailsRes = value;
    }

    /**
     * Gets the value of the tranxDetailsResError property.
     * 
     * @return
     *     possible object is
     *     {@link TranxDetailsResError }
     *     
     */
    public TranxDetailsResError getTranxDetailsResError() {
        return tranxDetailsResError;
    }

    /**
     * Sets the value of the tranxDetailsResError property.
     * 
     * @param value
     *     allowed object is
     *     {@link TranxDetailsResError }
     *     
     */
    public void setTranxDetailsResError(TranxDetailsResError value) {
        this.tranxDetailsResError = value;
    }

}
