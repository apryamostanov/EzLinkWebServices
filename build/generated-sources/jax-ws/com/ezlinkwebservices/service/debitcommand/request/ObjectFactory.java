
package com.ezlinkwebservices.service.debitcommand.request;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ezlinkwebservices.service.debitcommand.request package. 
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

    private final static QName _SOURCETYPE_QNAME = new QName("http://ezlinkwebservices.com/service/DebitCommand/request", "SOURCETYPE");
    private final static QName _ORDERNO_QNAME = new QName("http://ezlinkwebservices.com/service/DebitCommand/request", "ORDERNO");
    private final static QName _AMOUNT_QNAME = new QName("http://ezlinkwebservices.com/service/DebitCommand/request", "AMOUNT");
    private final static QName _CURRENCY_QNAME = new QName("http://ezlinkwebservices.com/service/DebitCommand/request", "CURRENCY");
    private final static QName _CARDSNO_QNAME = new QName("http://ezlinkwebservices.com/service/DebitCommand/request", "CARDSNO");
    private final static QName _ENCRYPTIONCRYPTOGRAM_QNAME = new QName("http://ezlinkwebservices.com/service/DebitCommand/request", "ENCRYPTIONCRYPTOGRAM");
    private final static QName _MERCHANTREFNO_QNAME = new QName("http://ezlinkwebservices.com/service/DebitCommand/request", "MERCHANTREFNO");
    private final static QName _RETRYCNT_QNAME = new QName("http://ezlinkwebservices.com/service/DebitCommand/request", "RETRYCNT");
    private final static QName _SOURCEID_QNAME = new QName("http://ezlinkwebservices.com/service/DebitCommand/request", "SOURCEID");
    private final static QName _DATETIME_QNAME = new QName("http://ezlinkwebservices.com/service/DebitCommand/request", "DATETIME");
    private final static QName _SECURITYLEVEL_QNAME = new QName("http://ezlinkwebservices.com/service/DebitCommand/request", "SECURITYLEVEL");
    private final static QName _STATUS_QNAME = new QName("http://ezlinkwebservices.com/service/DebitCommand/request", "STATUS");
    private final static QName _MERCHANTNO_QNAME = new QName("http://ezlinkwebservices.com/service/DebitCommand/request", "MERCHANTNO");
    private final static QName _SIGNATURE_QNAME = new QName("http://ezlinkwebservices.com/service/DebitCommand/request", "SIGNATURE");
    private final static QName _VERSION_QNAME = new QName("http://ezlinkwebservices.com/service/DebitCommand/request", "VERSION");
    private final static QName _ACCESSCODE_QNAME = new QName("http://ezlinkwebservices.com/service/DebitCommand/request", "ACCESSCODE");
    private final static QName _TERMINALRANDOMNO_QNAME = new QName("http://ezlinkwebservices.com/service/DebitCommand/request", "TERMINALRANDOMNO");
    private final static QName _PURSEDATA_QNAME = new QName("http://ezlinkwebservices.com/service/DebitCommand/request", "PURSEDATA");
    private final static QName _IPADDRESS_QNAME = new QName("http://ezlinkwebservices.com/service/DebitCommand/request", "IPADDRESS");
    private final static QName _CARDRANDOMNO_QNAME = new QName("http://ezlinkwebservices.com/service/DebitCommand/request", "CARDRANDOMNO");
    private final static QName _CAN_QNAME = new QName("http://ezlinkwebservices.com/service/DebitCommand/request", "CAN");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ezlinkwebservices.service.debitcommand.request
     * 
     */
    public ObjectFactory() {
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
     * Create an instance of {@link DebitCommandReq }
     * 
     */
    public DebitCommandReq createDebitCommandReq() {
        return new DebitCommandReq();
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
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/DebitCommand/request", name = "SOURCETYPE")
    public JAXBElement<String> createSOURCETYPE(String value) {
        return new JAXBElement<String>(_SOURCETYPE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/DebitCommand/request", name = "ORDERNO")
    public JAXBElement<String> createORDERNO(String value) {
        return new JAXBElement<String>(_ORDERNO_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/DebitCommand/request", name = "AMOUNT")
    public JAXBElement<BigDecimal> createAMOUNT(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AMOUNT_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/DebitCommand/request", name = "CURRENCY")
    public JAXBElement<String> createCURRENCY(String value) {
        return new JAXBElement<String>(_CURRENCY_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/DebitCommand/request", name = "CARDSNO")
    public JAXBElement<String> createCARDSNO(String value) {
        return new JAXBElement<String>(_CARDSNO_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/DebitCommand/request", name = "ENCRYPTIONCRYPTOGRAM")
    public JAXBElement<String> createENCRYPTIONCRYPTOGRAM(String value) {
        return new JAXBElement<String>(_ENCRYPTIONCRYPTOGRAM_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/DebitCommand/request", name = "MERCHANTREFNO")
    public JAXBElement<String> createMERCHANTREFNO(String value) {
        return new JAXBElement<String>(_MERCHANTREFNO_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/DebitCommand/request", name = "RETRYCNT")
    public JAXBElement<BigInteger> createRETRYCNT(BigInteger value) {
        return new JAXBElement<BigInteger>(_RETRYCNT_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/DebitCommand/request", name = "SOURCEID")
    public JAXBElement<String> createSOURCEID(String value) {
        return new JAXBElement<String>(_SOURCEID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/DebitCommand/request", name = "DATETIME")
    public JAXBElement<String> createDATETIME(String value) {
        return new JAXBElement<String>(_DATETIME_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/DebitCommand/request", name = "SECURITYLEVEL")
    public JAXBElement<String> createSECURITYLEVEL(String value) {
        return new JAXBElement<String>(_SECURITYLEVEL_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/DebitCommand/request", name = "STATUS")
    public JAXBElement<String> createSTATUS(String value) {
        return new JAXBElement<String>(_STATUS_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/DebitCommand/request", name = "MERCHANTNO")
    public JAXBElement<String> createMERCHANTNO(String value) {
        return new JAXBElement<String>(_MERCHANTNO_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/DebitCommand/request", name = "SIGNATURE")
    public JAXBElement<String> createSIGNATURE(String value) {
        return new JAXBElement<String>(_SIGNATURE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/DebitCommand/request", name = "VERSION")
    public JAXBElement<BigDecimal> createVERSION(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_VERSION_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/DebitCommand/request", name = "ACCESSCODE")
    public JAXBElement<String> createACCESSCODE(String value) {
        return new JAXBElement<String>(_ACCESSCODE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/DebitCommand/request", name = "TERMINALRANDOMNO")
    public JAXBElement<String> createTERMINALRANDOMNO(String value) {
        return new JAXBElement<String>(_TERMINALRANDOMNO_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/DebitCommand/request", name = "PURSEDATA")
    public JAXBElement<String> createPURSEDATA(String value) {
        return new JAXBElement<String>(_PURSEDATA_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/DebitCommand/request", name = "IPADDRESS")
    public JAXBElement<String> createIPADDRESS(String value) {
        return new JAXBElement<String>(_IPADDRESS_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/DebitCommand/request", name = "CARDRANDOMNO")
    public JAXBElement<String> createCARDRANDOMNO(String value) {
        return new JAXBElement<String>(_CARDRANDOMNO_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/DebitCommand/request", name = "CAN")
    public JAXBElement<String> createCAN(String value) {
        return new JAXBElement<String>(_CAN_QNAME, String.class, null, value);
    }

}
