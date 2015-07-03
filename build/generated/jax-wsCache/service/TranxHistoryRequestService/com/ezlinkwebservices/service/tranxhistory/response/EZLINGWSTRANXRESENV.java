
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
 *         &lt;element ref="{http://ezlinkwebservices.com/service/TranxHistory/response}EZLING_WS_TRANX_RES_HEADER"/>
 *         &lt;element ref="{http://ezlinkwebservices.com/service/TranxHistory/response}EZLING_WS__TRANX_RES_BODY"/>
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
    "ezlingwstranxresheader",
    "ezlingwstranxresbody"
})
@XmlRootElement(name = "EZLING_WS_TRANX_RES_ENV")
public class EZLINGWSTRANXRESENV {

    @XmlElement(name = "EZLING_WS_TRANX_RES_HEADER", required = true)
    protected EZLINGWSTRANXRESHEADER ezlingwstranxresheader;
    @XmlElement(name = "EZLING_WS__TRANX_RES_BODY", required = true)
    protected EZLINGWSTRANXRESBODY ezlingwstranxresbody;

    /**
     * Gets the value of the ezlingwstranxresheader property.
     * 
     * @return
     *     possible object is
     *     {@link EZLINGWSTRANXRESHEADER }
     *     
     */
    public EZLINGWSTRANXRESHEADER getEZLINGWSTRANXRESHEADER() {
        return ezlingwstranxresheader;
    }

    /**
     * Sets the value of the ezlingwstranxresheader property.
     * 
     * @param value
     *     allowed object is
     *     {@link EZLINGWSTRANXRESHEADER }
     *     
     */
    public void setEZLINGWSTRANXRESHEADER(EZLINGWSTRANXRESHEADER value) {
        this.ezlingwstranxresheader = value;
    }

    /**
     * Gets the value of the ezlingwstranxresbody property.
     * 
     * @return
     *     possible object is
     *     {@link EZLINGWSTRANXRESBODY }
     *     
     */
    public EZLINGWSTRANXRESBODY getEZLINGWSTRANXRESBODY() {
        return ezlingwstranxresbody;
    }

    /**
     * Sets the value of the ezlingwstranxresbody property.
     * 
     * @param value
     *     allowed object is
     *     {@link EZLINGWSTRANXRESBODY }
     *     
     */
    public void setEZLINGWSTRANXRESBODY(EZLINGWSTRANXRESBODY value) {
        this.ezlingwstranxresbody = value;
    }

}
