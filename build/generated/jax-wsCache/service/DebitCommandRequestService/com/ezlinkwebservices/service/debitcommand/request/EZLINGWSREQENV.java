
package com.ezlinkwebservices.service.debitcommand.request;

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
 *         &lt;element ref="{http://ezlinkwebservices.com/service/DebitCommand/request}EZLING_WS_HEADER"/>
 *         &lt;element ref="{http://ezlinkwebservices.com/service/DebitCommand/request}EZLING_WS_REQ_BODY"/>
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
    "ezlingwsreqbody"
})
@XmlRootElement(name = "EZLING_WS_REQ_ENV")
public class EZLINGWSREQENV {

    @XmlElement(name = "EZLING_WS_HEADER", required = true)
    protected EZLINGWSHEADER ezlingwsheader;
    @XmlElement(name = "EZLING_WS_REQ_BODY", required = true)
    protected EZLINGWSREQBODY ezlingwsreqbody;

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
     * Gets the value of the ezlingwsreqbody property.
     * 
     * @return
     *     possible object is
     *     {@link EZLINGWSREQBODY }
     *     
     */
    public EZLINGWSREQBODY getEZLINGWSREQBODY() {
        return ezlingwsreqbody;
    }

    /**
     * Sets the value of the ezlingwsreqbody property.
     * 
     * @param value
     *     allowed object is
     *     {@link EZLINGWSREQBODY }
     *     
     */
    public void setEZLINGWSREQBODY(EZLINGWSREQBODY value) {
        this.ezlingwsreqbody = value;
    }

}
