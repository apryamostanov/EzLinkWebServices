
package com.ezlinkwebservices.service.tranxhistory.response;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ezlinkwebservices.service.tranxhistory.response package. 
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

    private final static QName _AMOUNT_QNAME = new QName("http://ezlinkwebservices.com/service/TranxHistory/response", "AMOUNT");
    private final static QName _SOURCETYPE_QNAME = new QName("http://ezlinkwebservices.com/service/TranxHistory/response", "SOURCETYPE");
    private final static QName _MERCHANTNAME_QNAME = new QName("http://ezlinkwebservices.com/service/TranxHistory/response", "MERCHANTNAME");
    private final static QName _IPADDRESS_QNAME = new QName("http://ezlinkwebservices.com/service/TranxHistory/response", "IPADDRESS");
    private final static QName _ACCESSCODE_QNAME = new QName("http://ezlinkwebservices.com/service/TranxHistory/response", "ACCESSCODE");
    private final static QName _SIGNATURE_QNAME = new QName("http://ezlinkwebservices.com/service/TranxHistory/response", "SIGNATURE");
    private final static QName _VERSION_QNAME = new QName("http://ezlinkwebservices.com/service/TranxHistory/response", "VERSION");
    private final static QName _DCERRORDESC_QNAME = new QName("http://ezlinkwebservices.com/service/TranxHistory/response", "DCERRORDESC");
    private final static QName _SOURCEID_QNAME = new QName("http://ezlinkwebservices.com/service/TranxHistory/response", "SOURCEID");
    private final static QName _STATUS_QNAME = new QName("http://ezlinkwebservices.com/service/TranxHistory/response", "STATUS");
    private final static QName _DATETIME_QNAME = new QName("http://ezlinkwebservices.com/service/TranxHistory/response", "DATETIME");
    private final static QName _SECURITYLEVEL_QNAME = new QName("http://ezlinkwebservices.com/service/TranxHistory/response", "SECURITYLEVEL");
    private final static QName _TRANXDATE_QNAME = new QName("http://ezlinkwebservices.com/service/TranxHistory/response", "TRANXDATE");
    private final static QName _DCERRORCODE_QNAME = new QName("http://ezlinkwebservices.com/service/TranxHistory/response", "DCERRORCODE");
    private final static QName _ENCRYPTIONCRYPTOGRAM_QNAME = new QName("http://ezlinkwebservices.com/service/TranxHistory/response", "ENCRYPTIONCRYPTOGRAM");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ezlinkwebservices.service.tranxhistory.response
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TranxList }
     * 
     */
    public TranxList createTranxList() {
        return new TranxList();
    }

    /**
     * Create an instance of {@link TranxHistoryDetail }
     * 
     */
    public TranxHistoryDetail createTranxHistoryDetail() {
        return new TranxHistoryDetail();
    }

    /**
     * Create an instance of {@link EZLINGWSTRANXRESHEADER }
     * 
     */
    public EZLINGWSTRANXRESHEADER createEZLINGWSTRANXRESHEADER() {
        return new EZLINGWSTRANXRESHEADER();
    }

    /**
     * Create an instance of {@link EZLINGWSTRANXRESENV }
     * 
     */
    public EZLINGWSTRANXRESENV createEZLINGWSTRANXRESENV() {
        return new EZLINGWSTRANXRESENV();
    }

    /**
     * Create an instance of {@link EZLINGWSTRANXRESBODY }
     * 
     */
    public EZLINGWSTRANXRESBODY createEZLINGWSTRANXRESBODY() {
        return new EZLINGWSTRANXRESBODY();
    }

    /**
     * Create an instance of {@link TranxHistoryResError }
     * 
     */
    public TranxHistoryResError createTranxHistoryResError() {
        return new TranxHistoryResError();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/TranxHistory/response", name = "AMOUNT")
    public JAXBElement<BigDecimal> createAMOUNT(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AMOUNT_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/TranxHistory/response", name = "SOURCETYPE")
    public JAXBElement<String> createSOURCETYPE(String value) {
        return new JAXBElement<String>(_SOURCETYPE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/TranxHistory/response", name = "MERCHANTNAME")
    public JAXBElement<String> createMERCHANTNAME(String value) {
        return new JAXBElement<String>(_MERCHANTNAME_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/TranxHistory/response", name = "IPADDRESS")
    public JAXBElement<String> createIPADDRESS(String value) {
        return new JAXBElement<String>(_IPADDRESS_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/TranxHistory/response", name = "ACCESSCODE")
    public JAXBElement<String> createACCESSCODE(String value) {
        return new JAXBElement<String>(_ACCESSCODE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/TranxHistory/response", name = "SIGNATURE")
    public JAXBElement<String> createSIGNATURE(String value) {
        return new JAXBElement<String>(_SIGNATURE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/TranxHistory/response", name = "VERSION")
    public JAXBElement<BigDecimal> createVERSION(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_VERSION_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/TranxHistory/response", name = "DCERRORDESC")
    public JAXBElement<String> createDCERRORDESC(String value) {
        return new JAXBElement<String>(_DCERRORDESC_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/TranxHistory/response", name = "SOURCEID")
    public JAXBElement<String> createSOURCEID(String value) {
        return new JAXBElement<String>(_SOURCEID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/TranxHistory/response", name = "STATUS")
    public JAXBElement<String> createSTATUS(String value) {
        return new JAXBElement<String>(_STATUS_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/TranxHistory/response", name = "DATETIME")
    public JAXBElement<String> createDATETIME(String value) {
        return new JAXBElement<String>(_DATETIME_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/TranxHistory/response", name = "SECURITYLEVEL")
    public JAXBElement<String> createSECURITYLEVEL(String value) {
        return new JAXBElement<String>(_SECURITYLEVEL_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/TranxHistory/response", name = "TRANXDATE")
    public JAXBElement<String> createTRANXDATE(String value) {
        return new JAXBElement<String>(_TRANXDATE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/TranxHistory/response", name = "DCERRORCODE")
    public JAXBElement<String> createDCERRORCODE(String value) {
        return new JAXBElement<String>(_DCERRORCODE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/TranxHistory/response", name = "ENCRYPTIONCRYPTOGRAM")
    public JAXBElement<String> createENCRYPTIONCRYPTOGRAM(String value) {
        return new JAXBElement<String>(_ENCRYPTIONCRYPTOGRAM_QNAME, String.class, null, value);
    }

}
