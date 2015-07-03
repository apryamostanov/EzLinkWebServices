
package com.ezlinkwebservices.service.tranxhistory.request;

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
 *         &lt;element ref="{http://ezlinkwebservices.com/service/TranxHistory/request}TranxHistoryReq"/>
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
    "tranxHistoryReq"
})
@XmlRootElement(name = "EZLING_WS_TRANX_REQ_BODY")
public class EZLINGWSTRANXREQBODY {

    @XmlElement(name = "TranxHistoryReq", required = true)
    protected TranxHistoryReq tranxHistoryReq;

    /**
     * Gets the value of the tranxHistoryReq property.
     * 
     * @return
     *     possible object is
     *     {@link TranxHistoryReq }
     *     
     */
    public TranxHistoryReq getTranxHistoryReq() {
        return tranxHistoryReq;
    }

    /**
     * Sets the value of the tranxHistoryReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link TranxHistoryReq }
     *     
     */
    public void setTranxHistoryReq(TranxHistoryReq value) {
        this.tranxHistoryReq = value;
    }

}
