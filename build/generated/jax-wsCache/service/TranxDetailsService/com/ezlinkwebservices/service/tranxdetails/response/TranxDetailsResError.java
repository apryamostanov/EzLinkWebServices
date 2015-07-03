
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
 *         &lt;element ref="{http://ezlinkwebservices.com/service/TranxDetails/response}TDERRORCODE"/>
 *         &lt;element ref="{http://ezlinkwebservices.com/service/TranxDetails/response}TDERRORDESC"/>
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
    "tderrorcode",
    "tderrordesc"
})
@XmlRootElement(name = "TranxDetailsResError")
public class TranxDetailsResError {

    @XmlElement(name = "TDERRORCODE", required = true)
    protected String tderrorcode;
    @XmlElement(name = "TDERRORDESC", required = true)
    protected String tderrordesc;

    /**
     * Gets the value of the tderrorcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTDERRORCODE() {
        return tderrorcode;
    }

    /**
     * Sets the value of the tderrorcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTDERRORCODE(String value) {
        this.tderrorcode = value;
    }

    /**
     * Gets the value of the tderrordesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTDERRORDESC() {
        return tderrordesc;
    }

    /**
     * Sets the value of the tderrordesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTDERRORDESC(String value) {
        this.tderrordesc = value;
    }

}
