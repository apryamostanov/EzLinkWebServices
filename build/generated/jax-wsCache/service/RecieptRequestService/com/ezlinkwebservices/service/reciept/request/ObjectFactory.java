
package com.ezlinkwebservices.service.reciept.request;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ezlinkwebservices.service.reciept.request package. 
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

    private final static QName _REERRORDESC_QNAME = new QName("http://ezlinkwebservices.com/service/Reciept/request", "REERRORDESC");
    private final static QName _ENCRYPTIONCRYPTOGRAM_QNAME = new QName("http://ezlinkwebservices.com/service/Reciept/request", "ENCRYPTIONCRYPTOGRAM");
    private final static QName _SOURCEID_QNAME = new QName("http://ezlinkwebservices.com/service/Reciept/request", "SOURCEID");
    private final static QName _STATUS_QNAME = new QName("http://ezlinkwebservices.com/service/Reciept/request", "STATUS");
    private final static QName _DATETIME_QNAME = new QName("http://ezlinkwebservices.com/service/Reciept/request", "DATETIME");
    private final static QName _SECURITYLEVEL_QNAME = new QName("http://ezlinkwebservices.com/service/Reciept/request", "SECURITYLEVEL");
    private final static QName _REERRORCODE_QNAME = new QName("http://ezlinkwebservices.com/service/Reciept/request", "REERRORCODE");
    private final static QName _MERCHANTREFNO_QNAME = new QName("http://ezlinkwebservices.com/service/Reciept/request", "MERCHANTREFNO");
    private final static QName _SIGNATURE_QNAME = new QName("http://ezlinkwebservices.com/service/Reciept/request", "SIGNATURE");
    private final static QName _VERSION_QNAME = new QName("http://ezlinkwebservices.com/service/Reciept/request", "VERSION");
    private final static QName _MERCHANTNO_QNAME = new QName("http://ezlinkwebservices.com/service/Reciept/request", "MERCHANTNO");
    private final static QName _CAN_QNAME = new QName("http://ezlinkwebservices.com/service/Reciept/request", "CAN");
    private final static QName _IPADDRESS_QNAME = new QName("http://ezlinkwebservices.com/service/Reciept/request", "IPADDRESS");
    private final static QName _ACCESSCODE_QNAME = new QName("http://ezlinkwebservices.com/service/Reciept/request", "ACCESSCODE");
    private final static QName _SOURCETYPE_QNAME = new QName("http://ezlinkwebservices.com/service/Reciept/request", "SOURCETYPE");
    private final static QName _RECIEPTDATA_QNAME = new QName("http://ezlinkwebservices.com/service/Reciept/request", "RECIEPTDATA");
    private final static QName _AMOUNT_QNAME = new QName("http://ezlinkwebservices.com/service/Reciept/request", "AMOUNT");
    private final static QName _ORDERNO_QNAME = new QName("http://ezlinkwebservices.com/service/Reciept/request", "ORDERNO");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ezlinkwebservices.service.reciept.request
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RecieptReq }
     * 
     */
    public RecieptReq createRecieptReq() {
        return new RecieptReq();
    }

    /**
     * Create an instance of {@link EZLINGWSHEADER }
     * 
     */
    public EZLINGWSHEADER createEZLINGWSHEADER() {
        return new EZLINGWSHEADER();
    }

    /**
     * Create an instance of {@link EZLINGWSREQBODY }
     * 
     */
    public EZLINGWSREQBODY createEZLINGWSREQBODY() {
        return new EZLINGWSREQBODY();
    }

    /**
     * Create an instance of {@link RecieptReqError }
     * 
     */
    public RecieptReqError createRecieptReqError() {
        return new RecieptReqError();
    }

    /**
     * Create an instance of {@link EZLINGWSREQENV }
     * 
     */
    public EZLINGWSREQENV createEZLINGWSREQENV() {
        return new EZLINGWSREQENV();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/Reciept/request", name = "REERRORDESC")
    public JAXBElement<String> createREERRORDESC(String value) {
        return new JAXBElement<String>(_REERRORDESC_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/Reciept/request", name = "ENCRYPTIONCRYPTOGRAM")
    public JAXBElement<String> createENCRYPTIONCRYPTOGRAM(String value) {
        return new JAXBElement<String>(_ENCRYPTIONCRYPTOGRAM_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/Reciept/request", name = "SOURCEID")
    public JAXBElement<String> createSOURCEID(String value) {
        return new JAXBElement<String>(_SOURCEID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/Reciept/request", name = "STATUS")
    public JAXBElement<String> createSTATUS(String value) {
        return new JAXBElement<String>(_STATUS_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/Reciept/request", name = "DATETIME")
    public JAXBElement<String> createDATETIME(String value) {
        return new JAXBElement<String>(_DATETIME_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/Reciept/request", name = "SECURITYLEVEL")
    public JAXBElement<String> createSECURITYLEVEL(String value) {
        return new JAXBElement<String>(_SECURITYLEVEL_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/Reciept/request", name = "REERRORCODE")
    public JAXBElement<String> createREERRORCODE(String value) {
        return new JAXBElement<String>(_REERRORCODE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/Reciept/request", name = "MERCHANTREFNO")
    public JAXBElement<String> createMERCHANTREFNO(String value) {
        return new JAXBElement<String>(_MERCHANTREFNO_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/Reciept/request", name = "SIGNATURE")
    public JAXBElement<String> createSIGNATURE(String value) {
        return new JAXBElement<String>(_SIGNATURE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/Reciept/request", name = "VERSION")
    public JAXBElement<BigDecimal> createVERSION(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_VERSION_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/Reciept/request", name = "MERCHANTNO")
    public JAXBElement<String> createMERCHANTNO(String value) {
        return new JAXBElement<String>(_MERCHANTNO_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/Reciept/request", name = "CAN")
    public JAXBElement<String> createCAN(String value) {
        return new JAXBElement<String>(_CAN_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/Reciept/request", name = "IPADDRESS")
    public JAXBElement<String> createIPADDRESS(String value) {
        return new JAXBElement<String>(_IPADDRESS_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/Reciept/request", name = "ACCESSCODE")
    public JAXBElement<String> createACCESSCODE(String value) {
        return new JAXBElement<String>(_ACCESSCODE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/Reciept/request", name = "SOURCETYPE")
    public JAXBElement<String> createSOURCETYPE(String value) {
        return new JAXBElement<String>(_SOURCETYPE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/Reciept/request", name = "RECIEPTDATA")
    public JAXBElement<String> createRECIEPTDATA(String value) {
        return new JAXBElement<String>(_RECIEPTDATA_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/Reciept/request", name = "AMOUNT")
    public JAXBElement<BigDecimal> createAMOUNT(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AMOUNT_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/Reciept/request", name = "ORDERNO")
    public JAXBElement<String> createORDERNO(String value) {
        return new JAXBElement<String>(_ORDERNO_QNAME, String.class, null, value);
    }

}
