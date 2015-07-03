
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
 *         &lt;element ref="{http://ezlinkwebservices.com/service/TranxHistory/request}EZLING_WS_TRANX_REQ_HEADER"/>
 *         &lt;element ref="{http://ezlinkwebservices.com/service/TranxHistory/request}EZLING_WS_TRANX_REQ_BODY"/>
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
    "ezlingwstranxreqheader",
    "ezlingwstranxreqbody"
})
@XmlRootElement(name = "EZLING_WS_TRANX_REQ_ENV")
public class EZLINGWSTRANXREQENV {

    @XmlElement(name = "EZLING_WS_TRANX_REQ_HEADER", required = true)
    protected EZLINGWSTRANXREQHEADER ezlingwstranxreqheader;
    @XmlElement(name = "EZLING_WS_TRANX_REQ_BODY", required = true)
    protected EZLINGWSTRANXREQBODY ezlingwstranxreqbody;

    /**
     * Gets the value of the ezlingwstranxreqheader property.
     * 
     * @return
     *     possible object is
     *     {@link EZLINGWSTRANXREQHEADER }
     *     
     */
    public EZLINGWSTRANXREQHEADER getEZLINGWSTRANXREQHEADER() {
        return ezlingwstranxreqheader;
    }

    /**
     * Sets the value of the ezlingwstranxreqheader property.
     * 
     * @param value
     *     allowed object is
     *     {@link EZLINGWSTRANXREQHEADER }
     *     
     */
    public void setEZLINGWSTRANXREQHEADER(EZLINGWSTRANXREQHEADER value) {
        this.ezlingwstranxreqheader = value;
    }

    /**
     * Gets the value of the ezlingwstranxreqbody property.
     * 
     * @return
     *     possible object is
     *     {@link EZLINGWSTRANXREQBODY }
     *     
     */
    public EZLINGWSTRANXREQBODY getEZLINGWSTRANXREQBODY() {
        return ezlingwstranxreqbody;
    }

    /**
     * Sets the value of the ezlingwstranxreqbody property.
     * 
     * @param value
     *     allowed object is
     *     {@link EZLINGWSTRANXREQBODY }
     *     
     */
    public void setEZLINGWSTRANXREQBODY(EZLINGWSTRANXREQBODY value) {
        this.ezlingwstranxreqbody = value;
    }

}
