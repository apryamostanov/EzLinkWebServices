
package com.ezlinkwebservices.service.debitcommand.response;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ezlinkwebservices.service.debitcommand.response package. 
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

    private final static QName _DCERRORCODE_QNAME = new QName("http://ezlinkwebservices.com/service/DebitCommand/response", "DCERRORCODE");
    private final static QName _ENCRYPTIONCRYPTOGRAM_QNAME = new QName("http://ezlinkwebservices.com/service/DebitCommand/response", "ENCRYPTIONCRYPTOGRAM");
    private final static QName _SECURITYLEVEL_QNAME = new QName("http://ezlinkwebservices.com/service/DebitCommand/response", "SECURITYLEVEL");
    private final static QName _DATETIME_QNAME = new QName("http://ezlinkwebservices.com/service/DebitCommand/response", "DATETIME");
    private final static QName _STATUS_QNAME = new QName("http://ezlinkwebservices.com/service/DebitCommand/response", "STATUS");
    private final static QName _SOURCEID_QNAME = new QName("http://ezlinkwebservices.com/service/DebitCommand/response", "SOURCEID");
    private final static QName _DCERRORDESC_QNAME = new QName("http://ezlinkwebservices.com/service/DebitCommand/response", "DCERRORDESC");
    private final static QName _MERCHANTREFNO_QNAME = new QName("http://ezlinkwebservices.com/service/DebitCommand/response", "MERCHANTREFNO");
    private final static QName _SIGNATURE_QNAME = new QName("http://ezlinkwebservices.com/service/DebitCommand/response", "SIGNATURE");
    private final static QName _VERSION_QNAME = new QName("http://ezlinkwebservices.com/service/DebitCommand/response", "VERSION");
    private final static QName _IPADDRESS_QNAME = new QName("http://ezlinkwebservices.com/service/DebitCommand/response", "IPADDRESS");
    private final static QName _CAN_QNAME = new QName("http://ezlinkwebservices.com/service/DebitCommand/response", "CAN");
    private final static QName _ACCESSCODE_QNAME = new QName("http://ezlinkwebservices.com/service/DebitCommand/response", "ACCESSCODE");
    private final static QName _SOURCETYPE_QNAME = new QName("http://ezlinkwebservices.com/service/DebitCommand/response", "SOURCETYPE");
    private final static QName _ORDERNO_QNAME = new QName("http://ezlinkwebservices.com/service/DebitCommand/response", "ORDERNO");
    private final static QName _DEBITCOMMAND_QNAME = new QName("http://ezlinkwebservices.com/service/DebitCommand/response", "DEBITCOMMAND");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ezlinkwebservices.service.debitcommand.response
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DebitCommandRes }
     * 
     */
    public DebitCommandRes createDebitCommandRes() {
        return new DebitCommandRes();
    }

    /**
     * Create an instance of {@link DebitCommandResError }
     * 
     */
    public DebitCommandResError createDebitCommandResError() {
        return new DebitCommandResError();
    }

    /**
     * Create an instance of {@link EZLINGWSHEADER }
     * 
     */
    public EZLINGWSHEADER createEZLINGWSHEADER() {
        return new EZLINGWSHEADER();
    }

    /**
     * Create an instance of {@link EZLINGWSRESBODY }
     * 
     */
    public EZLINGWSRESBODY createEZLINGWSRESBODY() {
        return new EZLINGWSRESBODY();
    }

    /**
     * Create an instance of {@link EZLINGWSRESENV }
     * 
     */
    public EZLINGWSRESENV createEZLINGWSRESENV() {
        return new EZLINGWSRESENV();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/DebitCommand/response", name = "DCERRORCODE")
    public JAXBElement<String> createDCERRORCODE(String value) {
        return new JAXBElement<String>(_DCERRORCODE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/DebitCommand/response", name = "ENCRYPTIONCRYPTOGRAM")
    public JAXBElement<String> createENCRYPTIONCRYPTOGRAM(String value) {
        return new JAXBElement<String>(_ENCRYPTIONCRYPTOGRAM_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/DebitCommand/response", name = "SECURITYLEVEL")
    public JAXBElement<String> createSECURITYLEVEL(String value) {
        return new JAXBElement<String>(_SECURITYLEVEL_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/DebitCommand/response", name = "DATETIME")
    public JAXBElement<String> createDATETIME(String value) {
        return new JAXBElement<String>(_DATETIME_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/DebitCommand/response", name = "STATUS")
    public JAXBElement<String> createSTATUS(String value) {
        return new JAXBElement<String>(_STATUS_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/DebitCommand/response", name = "SOURCEID")
    public JAXBElement<String> createSOURCEID(String value) {
        return new JAXBElement<String>(_SOURCEID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/DebitCommand/response", name = "DCERRORDESC")
    public JAXBElement<String> createDCERRORDESC(String value) {
        return new JAXBElement<String>(_DCERRORDESC_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/DebitCommand/response", name = "MERCHANTREFNO")
    public JAXBElement<String> createMERCHANTREFNO(String value) {
        return new JAXBElement<String>(_MERCHANTREFNO_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/DebitCommand/response", name = "SIGNATURE")
    public JAXBElement<String> createSIGNATURE(String value) {
        return new JAXBElement<String>(_SIGNATURE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/DebitCommand/response", name = "VERSION")
    public JAXBElement<BigDecimal> createVERSION(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_VERSION_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/DebitCommand/response", name = "IPADDRESS")
    public JAXBElement<String> createIPADDRESS(String value) {
        return new JAXBElement<String>(_IPADDRESS_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/DebitCommand/response", name = "CAN")
    public JAXBElement<String> createCAN(String value) {
        return new JAXBElement<String>(_CAN_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/DebitCommand/response", name = "ACCESSCODE")
    public JAXBElement<String> createACCESSCODE(String value) {
        return new JAXBElement<String>(_ACCESSCODE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/DebitCommand/response", name = "SOURCETYPE")
    public JAXBElement<String> createSOURCETYPE(String value) {
        return new JAXBElement<String>(_SOURCETYPE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/DebitCommand/response", name = "ORDERNO")
    public JAXBElement<String> createORDERNO(String value) {
        return new JAXBElement<String>(_ORDERNO_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/DebitCommand/response", name = "DEBITCOMMAND")
    public JAXBElement<String> createDEBITCOMMAND(String value) {
        return new JAXBElement<String>(_DEBITCOMMAND_QNAME, String.class, null, value);
    }

}
