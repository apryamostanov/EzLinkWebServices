
package com.ezlinkwebservices.service.tranxdetails.request;

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
 *         &lt;element ref="{http://ezlinkwebservices.com/service/TranxDetails/request}EZLING_WS_TRANX_DETAILS_REQ_HEADER"/>
 *         &lt;element ref="{http://ezlinkwebservices.com/service/TranxDetails/request}EZLING_WS_TRANX_DETAILS_REQ_BODY"/>
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
    "ezlingwstranxdetailsreqheader",
    "ezlingwstranxdetailsreqbody"
})
@XmlRootElement(name = "EZLING_WS_TRANX_DETAILS_REQ_ENV")
public class EZLINGWSTRANXDETAILSREQENV {

    @XmlElement(name = "EZLING_WS_TRANX_DETAILS_REQ_HEADER", required = true)
    protected EZLINGWSTRANXDETAILSREQHEADER ezlingwstranxdetailsreqheader;
    @XmlElement(name = "EZLING_WS_TRANX_DETAILS_REQ_BODY", required = true)
    protected EZLINGWSTRANXDETAILSREQBODY ezlingwstranxdetailsreqbody;

    /**
     * Gets the value of the ezlingwstranxdetailsreqheader property.
     * 
     * @return
     *     possible object is
     *     {@link EZLINGWSTRANXDETAILSREQHEADER }
     *     
     */
    public EZLINGWSTRANXDETAILSREQHEADER getEZLINGWSTRANXDETAILSREQHEADER() {
        return ezlingwstranxdetailsreqheader;
    }

    /**
     * Sets the value of the ezlingwstranxdetailsreqheader property.
     * 
     * @param value
     *     allowed object is
     *     {@link EZLINGWSTRANXDETAILSREQHEADER }
     *     
     */
    public void setEZLINGWSTRANXDETAILSREQHEADER(EZLINGWSTRANXDETAILSREQHEADER value) {
        this.ezlingwstranxdetailsreqheader = value;
    }

    /**
     * Gets the value of the ezlingwstranxdetailsreqbody property.
     * 
     * @return
     *     possible object is
     *     {@link EZLINGWSTRANXDETAILSREQBODY }
     *     
     */
    public EZLINGWSTRANXDETAILSREQBODY getEZLINGWSTRANXDETAILSREQBODY() {
        return ezlingwstranxdetailsreqbody;
    }

    /**
     * Sets the value of the ezlingwstranxdetailsreqbody property.
     * 
     * @param value
     *     allowed object is
     *     {@link EZLINGWSTRANXDETAILSREQBODY }
     *     
     */
    public void setEZLINGWSTRANXDETAILSREQBODY(EZLINGWSTRANXDETAILSREQBODY value) {
        this.ezlingwstranxdetailsreqbody = value;
    }

}
