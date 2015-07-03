
package com.ezlinkwebservices.service.tranxhistory.request;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ezlinkwebservices.service.tranxhistory.request package. 
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

    private final static QName _SIGNATURE_QNAME = new QName("http://ezlinkwebservices.com/service/TranxHistory/request", "SIGNATURE");
    private final static QName _VERSION_QNAME = new QName("http://ezlinkwebservices.com/service/TranxHistory/request", "VERSION");
    private final static QName _CARDNO_QNAME = new QName("http://ezlinkwebservices.com/service/TranxHistory/request", "CARDNO");
    private final static QName _IPADDRESS_QNAME = new QName("http://ezlinkwebservices.com/service/TranxHistory/request", "IPADDRESS");
    private final static QName _ACCESSCODE_QNAME = new QName("http://ezlinkwebservices.com/service/TranxHistory/request", "ACCESSCODE");
    private final static QName _ENCRYPTIONCRYPTOGRAM_QNAME = new QName("http://ezlinkwebservices.com/service/TranxHistory/request", "ENCRYPTIONCRYPTOGRAM");
    private final static QName _REQUIREDNOOFREC_QNAME = new QName("http://ezlinkwebservices.com/service/TranxHistory/request", "REQUIREDNOOFREC");
    private final static QName _SECURITYLEVEL_QNAME = new QName("http://ezlinkwebservices.com/service/TranxHistory/request", "SECURITYLEVEL");
    private final static QName _DATETIME_QNAME = new QName("http://ezlinkwebservices.com/service/TranxHistory/request", "DATETIME");
    private final static QName _SOURCEID_QNAME = new QName("http://ezlinkwebservices.com/service/TranxHistory/request", "SOURCEID");
    private final static QName _SOURCETYPE_QNAME = new QName("http://ezlinkwebservices.com/service/TranxHistory/request", "SOURCETYPE");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ezlinkwebservices.service.tranxhistory.request
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EZLINGWSTRANXREQENV }
     * 
     */
    public EZLINGWSTRANXREQENV createEZLINGWSTRANXREQENV() {
        return new EZLINGWSTRANXREQENV();
    }

    /**
     * Create an instance of {@link EZLINGWSTRANXREQHEADER }
     * 
     */
    public EZLINGWSTRANXREQHEADER createEZLINGWSTRANXREQHEADER() {
        return new EZLINGWSTRANXREQHEADER();
    }

    /**
     * Create an instance of {@link EZLINGWSTRANXREQBODY }
     * 
     */
    public EZLINGWSTRANXREQBODY createEZLINGWSTRANXREQBODY() {
        return new EZLINGWSTRANXREQBODY();
    }

    /**
     * Create an instance of {@link TranxHistoryReq }
     * 
     */
    public TranxHistoryReq createTranxHistoryReq() {
        return new TranxHistoryReq();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/TranxHistory/request", name = "SIGNATURE")
    public JAXBElement<String> createSIGNATURE(String value) {
        return new JAXBElement<String>(_SIGNATURE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/TranxHistory/request", name = "VERSION")
    public JAXBElement<BigDecimal> createVERSION(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_VERSION_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/TranxHistory/request", name = "CARDNO")
    public JAXBElement<String> createCARDNO(String value) {
        return new JAXBElement<String>(_CARDNO_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/TranxHistory/request", name = "IPADDRESS")
    public JAXBElement<String> createIPADDRESS(String value) {
        return new JAXBElement<String>(_IPADDRESS_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/TranxHistory/request", name = "ACCESSCODE")
    public JAXBElement<String> createACCESSCODE(String value) {
        return new JAXBElement<String>(_ACCESSCODE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/TranxHistory/request", name = "ENCRYPTIONCRYPTOGRAM")
    public JAXBElement<String> createENCRYPTIONCRYPTOGRAM(String value) {
        return new JAXBElement<String>(_ENCRYPTIONCRYPTOGRAM_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/TranxHistory/request", name = "REQUIREDNOOFREC")
    public JAXBElement<BigInteger> createREQUIREDNOOFREC(BigInteger value) {
        return new JAXBElement<BigInteger>(_REQUIREDNOOFREC_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/TranxHistory/request", name = "SECURITYLEVEL")
    public JAXBElement<String> createSECURITYLEVEL(String value) {
        return new JAXBElement<String>(_SECURITYLEVEL_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/TranxHistory/request", name = "DATETIME")
    public JAXBElement<String> createDATETIME(String value) {
        return new JAXBElement<String>(_DATETIME_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/TranxHistory/request", name = "SOURCEID")
    public JAXBElement<String> createSOURCEID(String value) {
        return new JAXBElement<String>(_SOURCEID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/TranxHistory/request", name = "SOURCETYPE")
    public JAXBElement<String> createSOURCETYPE(String value) {
        return new JAXBElement<String>(_SOURCETYPE_QNAME, String.class, null, value);
    }

}
