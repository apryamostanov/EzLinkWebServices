
package com.ezlinkwebservices.service.tranxdetails.response;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ezlinkwebservices.service.tranxdetails.response package. 
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

    private final static QName _RESPONSECODE_QNAME = new QName("http://ezlinkwebservices.com/service/TranxDetails/response", "RESPONSECODE");
    private final static QName _CURRENCYCODE_QNAME = new QName("http://ezlinkwebservices.com/service/TranxDetails/response", "CURRENCYCODE");
    private final static QName _TDERRORCODE_QNAME = new QName("http://ezlinkwebservices.com/service/TranxDetails/response", "TDERRORCODE");
    private final static QName _SOURCETYPE_QNAME = new QName("http://ezlinkwebservices.com/service/TranxDetails/response", "SOURCETYPE");
    private final static QName _AMOUNT_QNAME = new QName("http://ezlinkwebservices.com/service/TranxDetails/response", "AMOUNT");
    private final static QName _ORDERNO_QNAME = new QName("http://ezlinkwebservices.com/service/TranxDetails/response", "ORDERNO");
    private final static QName _VERSION_QNAME = new QName("http://ezlinkwebservices.com/service/TranxDetails/response", "VERSION");
    private final static QName _TRANXSTATUS_QNAME = new QName("http://ezlinkwebservices.com/service/TranxDetails/response", "TRANXSTATUS");
    private final static QName _SIGNATURE_QNAME = new QName("http://ezlinkwebservices.com/service/TranxDetails/response", "SIGNATURE");
    private final static QName _MERCHANTNO_QNAME = new QName("http://ezlinkwebservices.com/service/TranxDetails/response", "MERCHANTNO");
    private final static QName _IPADDRESS_QNAME = new QName("http://ezlinkwebservices.com/service/TranxDetails/response", "IPADDRESS");
    private final static QName _ACCESSCODE_QNAME = new QName("http://ezlinkwebservices.com/service/TranxDetails/response", "ACCESSCODE");
    private final static QName _TDERRORDESC_QNAME = new QName("http://ezlinkwebservices.com/service/TranxDetails/response", "TDERRORDESC");
    private final static QName _ENCRYPTIONCRYPTOGRAM_QNAME = new QName("http://ezlinkwebservices.com/service/TranxDetails/response", "ENCRYPTIONCRYPTOGRAM");
    private final static QName _SOURCEID_QNAME = new QName("http://ezlinkwebservices.com/service/TranxDetails/response", "SOURCEID");
    private final static QName _SECURITYLEVEL_QNAME = new QName("http://ezlinkwebservices.com/service/TranxDetails/response", "SECURITYLEVEL");
    private final static QName _DATETIME_QNAME = new QName("http://ezlinkwebservices.com/service/TranxDetails/response", "DATETIME");
    private final static QName _MERCHANTREFNO_QNAME = new QName("http://ezlinkwebservices.com/service/TranxDetails/response", "MERCHANTREFNO");
    private final static QName _TRANXDATE_QNAME = new QName("http://ezlinkwebservices.com/service/TranxDetails/response", "TRANXDATE");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ezlinkwebservices.service.tranxdetails.response
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TranxDetailsRes }
     * 
     */
    public TranxDetailsRes createTranxDetailsRes() {
        return new TranxDetailsRes();
    }

    /**
     * Create an instance of {@link EZLINGWSTRANXDETAILSRESBODY }
     * 
     */
    public EZLINGWSTRANXDETAILSRESBODY createEZLINGWSTRANXDETAILSRESBODY() {
        return new EZLINGWSTRANXDETAILSRESBODY();
    }

    /**
     * Create an instance of {@link TranxDetailsResError }
     * 
     */
    public TranxDetailsResError createTranxDetailsResError() {
        return new TranxDetailsResError();
    }

    /**
     * Create an instance of {@link EZLINGWSTRANXDETAILSRESHEADER }
     * 
     */
    public EZLINGWSTRANXDETAILSRESHEADER createEZLINGWSTRANXDETAILSRESHEADER() {
        return new EZLINGWSTRANXDETAILSRESHEADER();
    }

    /**
     * Create an instance of {@link EZLINGWSTRANXDETAILSRESENV }
     * 
     */
    public EZLINGWSTRANXDETAILSRESENV createEZLINGWSTRANXDETAILSRESENV() {
        return new EZLINGWSTRANXDETAILSRESENV();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/TranxDetails/response", name = "RESPONSECODE")
    public JAXBElement<String> createRESPONSECODE(String value) {
        return new JAXBElement<String>(_RESPONSECODE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/TranxDetails/response", name = "CURRENCYCODE")
    public JAXBElement<String> createCURRENCYCODE(String value) {
        return new JAXBElement<String>(_CURRENCYCODE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/TranxDetails/response", name = "TDERRORCODE")
    public JAXBElement<String> createTDERRORCODE(String value) {
        return new JAXBElement<String>(_TDERRORCODE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/TranxDetails/response", name = "SOURCETYPE")
    public JAXBElement<String> createSOURCETYPE(String value) {
        return new JAXBElement<String>(_SOURCETYPE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/TranxDetails/response", name = "AMOUNT")
    public JAXBElement<String> createAMOUNT(String value) {
        return new JAXBElement<String>(_AMOUNT_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/TranxDetails/response", name = "ORDERNO")
    public JAXBElement<String> createORDERNO(String value) {
        return new JAXBElement<String>(_ORDERNO_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/TranxDetails/response", name = "VERSION")
    public JAXBElement<BigDecimal> createVERSION(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_VERSION_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/TranxDetails/response", name = "TRANXSTATUS")
    public JAXBElement<String> createTRANXSTATUS(String value) {
        return new JAXBElement<String>(_TRANXSTATUS_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/TranxDetails/response", name = "SIGNATURE")
    public JAXBElement<String> createSIGNATURE(String value) {
        return new JAXBElement<String>(_SIGNATURE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/TranxDetails/response", name = "MERCHANTNO")
    public JAXBElement<String> createMERCHANTNO(String value) {
        return new JAXBElement<String>(_MERCHANTNO_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/TranxDetails/response", name = "IPADDRESS")
    public JAXBElement<String> createIPADDRESS(String value) {
        return new JAXBElement<String>(_IPADDRESS_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/TranxDetails/response", name = "ACCESSCODE")
    public JAXBElement<String> createACCESSCODE(String value) {
        return new JAXBElement<String>(_ACCESSCODE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/TranxDetails/response", name = "TDERRORDESC")
    public JAXBElement<String> createTDERRORDESC(String value) {
        return new JAXBElement<String>(_TDERRORDESC_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/TranxDetails/response", name = "ENCRYPTIONCRYPTOGRAM")
    public JAXBElement<String> createENCRYPTIONCRYPTOGRAM(String value) {
        return new JAXBElement<String>(_ENCRYPTIONCRYPTOGRAM_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/TranxDetails/response", name = "SOURCEID")
    public JAXBElement<String> createSOURCEID(String value) {
        return new JAXBElement<String>(_SOURCEID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/TranxDetails/response", name = "SECURITYLEVEL")
    public JAXBElement<String> createSECURITYLEVEL(String value) {
        return new JAXBElement<String>(_SECURITYLEVEL_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/TranxDetails/response", name = "DATETIME")
    public JAXBElement<String> createDATETIME(String value) {
        return new JAXBElement<String>(_DATETIME_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/TranxDetails/response", name = "MERCHANTREFNO")
    public JAXBElement<String> createMERCHANTREFNO(String value) {
        return new JAXBElement<String>(_MERCHANTREFNO_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/TranxDetails/response", name = "TRANXDATE")
    public JAXBElement<String> createTRANXDATE(String value) {
        return new JAXBElement<String>(_TRANXDATE_QNAME, String.class, null, value);
    }

}
