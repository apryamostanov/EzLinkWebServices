
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
 *         &lt;element ref="{http://ezlinkwebservices.com/service/TranxDetails/response}EZLING_WS_TRANX_DETAILS_RES_HEADER"/>
 *         &lt;element ref="{http://ezlinkwebservices.com/service/TranxDetails/response}EZLING_WS__TRANX_DETAILS_RES_BODY"/>
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
    "ezlingwstranxdetailsresheader",
    "ezlingwstranxdetailsresbody"
})
@XmlRootElement(name = "EZLING_WS_TRANX_DETAILS_RES_ENV")
public class EZLINGWSTRANXDETAILSRESENV {

    @XmlElement(name = "EZLING_WS_TRANX_DETAILS_RES_HEADER", required = true)
    protected EZLINGWSTRANXDETAILSRESHEADER ezlingwstranxdetailsresheader;
    @XmlElement(name = "EZLING_WS__TRANX_DETAILS_RES_BODY", required = true)
    protected EZLINGWSTRANXDETAILSRESBODY ezlingwstranxdetailsresbody;

    /**
     * Gets the value of the ezlingwstranxdetailsresheader property.
     * 
     * @return
     *     possible object is
     *     {@link EZLINGWSTRANXDETAILSRESHEADER }
     *     
     */
    public EZLINGWSTRANXDETAILSRESHEADER getEZLINGWSTRANXDETAILSRESHEADER() {
        return ezlingwstranxdetailsresheader;
    }

    /**
     * Sets the value of the ezlingwstranxdetailsresheader property.
     * 
     * @param value
     *     allowed object is
     *     {@link EZLINGWSTRANXDETAILSRESHEADER }
     *     
     */
    public void setEZLINGWSTRANXDETAILSRESHEADER(EZLINGWSTRANXDETAILSRESHEADER value) {
        this.ezlingwstranxdetailsresheader = value;
    }

    /**
     * Gets the value of the ezlingwstranxdetailsresbody property.
     * 
     * @return
     *     possible object is
     *     {@link EZLINGWSTRANXDETAILSRESBODY }
     *     
     */
    public EZLINGWSTRANXDETAILSRESBODY getEZLINGWSTRANXDETAILSRESBODY() {
        return ezlingwstranxdetailsresbody;
    }

    /**
     * Sets the value of the ezlingwstranxdetailsresbody property.
     * 
     * @param value
     *     allowed object is
     *     {@link EZLINGWSTRANXDETAILSRESBODY }
     *     
     */
    public void setEZLINGWSTRANXDETAILSRESBODY(EZLINGWSTRANXDETAILSRESBODY value) {
        this.ezlingwstranxdetailsresbody = value;
    }

}
