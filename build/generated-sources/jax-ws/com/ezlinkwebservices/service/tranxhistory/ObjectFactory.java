
package com.ezlinkwebservices.service.tranxhistory;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ezlinkwebservices.service.tranxhistory package. 
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

    private final static QName _TranxHistoryFault_QNAME = new QName("http://ezlinkwebservices.com/service/TranxHistory", "TranxHistoryFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ezlinkwebservices.service.tranxhistory
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TranxHistoryFault }
     * 
     */
    public TranxHistoryFault createTranxHistoryFault() {
        return new TranxHistoryFault();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TranxHistoryFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/TranxHistory", name = "TranxHistoryFault")
    public JAXBElement<TranxHistoryFault> createTranxHistoryFault(TranxHistoryFault value) {
        return new JAXBElement<TranxHistoryFault>(_TranxHistoryFault_QNAME, TranxHistoryFault.class, null, value);
    }

}
