
package com.ezlinkwebservices.service.tranxhistory.response;

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
 *         &lt;element ref="{http://ezlinkwebservices.com/service/TranxHistory/response}TranxList"/>
 *         &lt;element ref="{http://ezlinkwebservices.com/service/TranxHistory/response}TranxHistoryResError"/>
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
    "tranxList",
    "tranxHistoryResError"
})
@XmlRootElement(name = "EZLING_WS__TRANX_RES_BODY")
public class EZLINGWSTRANXRESBODY {

    @XmlElement(name = "TranxList", required = true)
    protected TranxList tranxList;
    @XmlElement(name = "TranxHistoryResError", required = true)
    protected TranxHistoryResError tranxHistoryResError;

    /**
     * Gets the value of the tranxList property.
     * 
     * @return
     *     possible object is
     *     {@link TranxList }
     *     
     */
    public TranxList getTranxList() {
        return tranxList;
    }

    /**
     * Sets the value of the tranxList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TranxList }
     *     
     */
    public void setTranxList(TranxList value) {
        this.tranxList = value;
    }

    /**
     * Gets the value of the tranxHistoryResError property.
     * 
     * @return
     *     possible object is
     *     {@link TranxHistoryResError }
     *     
     */
    public TranxHistoryResError getTranxHistoryResError() {
        return tranxHistoryResError;
    }

    /**
     * Sets the value of the tranxHistoryResError property.
     * 
     * @param value
     *     allowed object is
     *     {@link TranxHistoryResError }
     *     
     */
    public void setTranxHistoryResError(TranxHistoryResError value) {
        this.tranxHistoryResError = value;
    }

}
