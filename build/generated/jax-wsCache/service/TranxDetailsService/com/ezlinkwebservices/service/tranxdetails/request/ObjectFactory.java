
package com.ezlinkwebservices.service.tranxdetails.request;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ezlinkwebservices.service.tranxdetails.request package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SIGNATURE_QNAME = new QName("http://ezlinkwebservices.com/service/TranxDetails/request", "SIGNATURE");
    private final static QName _VERSION_QNAME = new QName("http://ezlinkwebservices.com/service/TranxDetails/request", "VERSION");
    private final static QName _MERCHANTNO_QNAME = new QName("http://ezlinkwebservices.com/service/TranxDetails/request", "MERCHANTNO");
    private final static QName _IPADDRESS_QNAME = new QName("http://ezlinkwebservices.com/service/TranxDetails/request", "IPADDRESS");
    private final static QName _ACCESSCODE_QNAME = new QName("http://ezlinkwebservices.com/service/TranxDetails/request", "ACCESSCODE");
    private final static QName _ENCRYPTIONCRYPTOGRAM_QNAME = new QName("http://ezlinkwebservices.com/service/TranxDetails/request", "ENCRYPTIONCRYPTOGRAM");
    private final static QName _SECURITYLEVEL_QNAME = new QName("http://ezlinkwebservices.com/service/TranxDetails/request", "SECURITYLEVEL");
    private final static QName _DATETIME_QNAME = new QName("http://ezlinkwebservices.com/service/TranxDetails/request", "DATETIME");
    private final static QName _SOURCEID_QNAME = new QName("http://ezlinkwebservices.com/service/TranxDetails/request", "SOURCEID");
    private final static QName _MERCHANTREFNO_QNAME = new QName("http://ezlinkwebservices.com/service/TranxDetails/request", "MERCHANTREFNO");
    private final static QName _SOURCETYPE_QNAME = new QName("http://ezlinkwebservices.com/service/TranxDetails/request", "SOURCETYPE");
    private final static QName _AMOUNT_QNAME = new QName("http://ezlinkwebservices.com/service/TranxDetails/request", "AMOUNT");
    private final static QName _ORDERNO_QNAME = new QName("http://ezlinkwebservices.com/service/TranxDetails/request", "ORDERNO");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ezlinkwebservices.service.tranxdetails.request
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EZLINGWSTRANXDETAILSREQENV }
     * 
     */
    public EZLINGWSTRANXDETAILSREQENV createEZLINGWSTRANXDETAILSREQENV() {
        return new EZLINGWSTRANXDETAILSREQENV();
    }

    /**
     * Create an instance of {@link EZLINGWSTRANXDETAILSREQHEADER }
     * 
     */
    public EZLINGWSTRANXDETAILSREQHEADER createEZLINGWSTRANXDETAILSREQHEADER() {
        return new EZLINGWSTRANXDETAILSREQHEADER();
    }

    /**
     * Create an instance of {@link EZLINGWSTRANXDETAILSREQBODY }
     * 
     */
    public EZLINGWSTRANXDETAILSREQBODY createEZLINGWSTRANXDETAILSREQBODY() {
        return new EZLINGWSTRANXDETAILSREQBODY();
    }

    /**
     * Create an instance of {@link TranxDetailsReq }
     * 
     */
    public TranxDetailsReq createTranxDetailsReq() {
        return new TranxDetailsReq();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/TranxDetails/request", name = "SIGNATURE")
    public JAXBElement<String> createSIGNATURE(String value) {
        return new JAXBElement<String>(_SIGNATURE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/TranxDetails/request", name = "VERSION")
    public JAXBElement<BigDecimal> createVERSION(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_VERSION_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/TranxDetails/request", name = "MERCHANTNO")
    public JAXBElement<String> createMERCHANTNO(String value) {
        return new JAXBElement<String>(_MERCHANTNO_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/TranxDetails/request", name = "IPADDRESS")
    public JAXBElement<String> createIPADDRESS(String value) {
        return new JAXBElement<String>(_IPADDRESS_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/TranxDetails/request", name = "ACCESSCODE")
    public JAXBElement<String> createACCESSCODE(String value) {
        return new JAXBElement<String>(_ACCESSCODE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/TranxDetails/request", name = "ENCRYPTIONCRYPTOGRAM")
    public JAXBElement<String> createENCRYPTIONCRYPTOGRAM(String value) {
        return new JAXBElement<String>(_ENCRYPTIONCRYPTOGRAM_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/TranxDetails/request", name = "SECURITYLEVEL")
    public JAXBElement<String> createSECURITYLEVEL(String value) {
        return new JAXBElement<String>(_SECURITYLEVEL_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/TranxDetails/request", name = "DATETIME")
    public JAXBElement<String> createDATETIME(String value) {
        return new JAXBElement<String>(_DATETIME_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/TranxDetails/request", name = "SOURCEID")
    public JAXBElement<String> createSOURCEID(String value) {
        return new JAXBElement<String>(_SOURCEID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/TranxDetails/request", name = "MERCHANTREFNO")
    public JAXBElement<String> createMERCHANTREFNO(String value) {
        return new JAXBElement<String>(_MERCHANTREFNO_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/TranxDetails/request", name = "SOURCETYPE")
    public JAXBElement<String> createSOURCETYPE(String value) {
        return new JAXBElement<String>(_SOURCETYPE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/TranxDetails/request", name = "AMOUNT")
    public JAXBElement<BigDecimal> createAMOUNT(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AMOUNT_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/TranxDetails/request", name = "ORDERNO")
    public JAXBElement<String> createORDERNO(String value) {
        return new JAXBElement<String>(_ORDERNO_QNAME, String.class, null, value);
    }

}
