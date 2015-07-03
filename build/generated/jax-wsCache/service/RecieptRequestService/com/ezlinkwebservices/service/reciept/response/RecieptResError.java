
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
 *         &lt;element ref="{http://ezlinkwebservices.com/service/Reciept/response}REERRORCODE"/>
 *         &lt;element ref="{http://ezlinkwebservices.com/service/Reciept/response}REERRORDESC"/>
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
    "reerrorcode",
    "reerrordesc"
})
@XmlRootElement(name = "RecieptResError")
public class RecieptResError {

    @XmlElement(name = "REERRORCODE", required = true)
    protected String reerrorcode;
    @XmlElement(name = "REERRORDESC", required = true)
    protected String reerrordesc;

    /**
     * Gets the value of the reerrorcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREERRORCODE() {
        return reerrorcode;
    }

    /**
     * Sets the value of the reerrorcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREERRORCODE(String value) {
        this.reerrorcode = value;
    }

    /**
     * Gets the value of the reerrordesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREERRORDESC() {
        return reerrordesc;
    }

    /**
     * Sets the value of the reerrordesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREERRORDESC(String value) {
        this.reerrordesc = value;
    }

}
