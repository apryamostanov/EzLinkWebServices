
package com.ezlinkwebservices.service.tranxdetails;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ezlinkwebservices.service.tranxdetails package. 
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

    private final static QName _TranxDetailsFault_QNAME = new QName("http://ezlinkwebservices.com/service/TranxDetails", "TranxDetailsFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ezlinkwebservices.service.tranxdetails
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TranxDetailsFault }
     * 
     */
    public TranxDetailsFault createTranxDetailsFault() {
        return new TranxDetailsFault();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TranxDetailsFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/TranxDetails", name = "TranxDetailsFault")
    public JAXBElement<TranxDetailsFault> createTranxDetailsFault(TranxDetailsFault value) {
        return new JAXBElement<TranxDetailsFault>(_TranxDetailsFault_QNAME, TranxDetailsFault.class, null, value);
    }

}
