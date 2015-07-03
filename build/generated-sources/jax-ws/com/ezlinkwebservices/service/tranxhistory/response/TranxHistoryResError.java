
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
 *         &lt;element ref="{http://ezlinkwebservices.com/service/TranxHistory/response}DCERRORCODE"/>
 *         &lt;element ref="{http://ezlinkwebservices.com/service/TranxHistory/response}DCERRORDESC"/>
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
    "dcerrorcode",
    "dcerrordesc"
})
@XmlRootElement(name = "TranxHistoryResError")
public class TranxHistoryResError {

    @XmlElement(name = "DCERRORCODE", required = true)
    protected String dcerrorcode;
    @XmlElement(name = "DCERRORDESC", required = true)
    protected String dcerrordesc;

    /**
     * Gets the value of the dcerrorcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCERRORCODE() {
        return dcerrorcode;
    }

    /**
     * Sets the value of the dcerrorcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCERRORCODE(String value) {
        this.dcerrorcode = value;
    }

    /**
     * Gets the value of the dcerrordesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCERRORDESC() {
        return dcerrordesc;
    }

    /**
     * Sets the value of the dcerrordesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCERRORDESC(String value) {
        this.dcerrordesc = value;
    }

}
