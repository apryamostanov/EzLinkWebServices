
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
 *         &lt;element ref="{http://ezlinkwebservices.com/service/Reciept/response}EZLING_WS_HEADER"/>
 *         &lt;element ref="{http://ezlinkwebservices.com/service/Reciept/response}EZLING_WS_RES_BODY"/>
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
    "ezlingwsheader",
    "ezlingwsresbody"
})
@XmlRootElement(name = "EZLING_WS_RES_ENV")
public class EZLINGWSRESENV {

    @XmlElement(name = "EZLING_WS_HEADER", required = true)
    protected EZLINGWSHEADER ezlingwsheader;
    @XmlElement(name = "EZLING_WS_RES_BODY", required = true)
    protected EZLINGWSRESBODY ezlingwsresbody;

    /**
     * Gets the value of the ezlingwsheader property.
     * 
     * @return
     *     possible object is
     *     {@link EZLINGWSHEADER }
     *     
     */
    public EZLINGWSHEADER getEZLINGWSHEADER() {
        return ezlingwsheader;
    }

    /**
     * Sets the value of the ezlingwsheader property.
     * 
     * @param value
     *     allowed object is
     *     {@link EZLINGWSHEADER }
     *     
     */
    public void setEZLINGWSHEADER(EZLINGWSHEADER value) {
        this.ezlingwsheader = value;
    }

    /**
     * Gets the value of the ezlingwsresbody property.
     * 
     * @return
     *     possible object is
     *     {@link EZLINGWSRESBODY }
     *     
     */
    public EZLINGWSRESBODY getEZLINGWSRESBODY() {
        return ezlingwsresbody;
    }

    /**
     * Sets the value of the ezlingwsresbody property.
     * 
     * @param value
     *     allowed object is
     *     {@link EZLINGWSRESBODY }
     *     
     */
    public void setEZLINGWSRESBODY(EZLINGWSRESBODY value) {
        this.ezlingwsresbody = value;
    }

}
