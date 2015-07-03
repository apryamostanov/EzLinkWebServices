
package com.ezlinkwebservices.service.debitcommand;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ezlinkwebservices.service.debitcommand package. 
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

    private final static QName _DebitCommandFault_QNAME = new QName("http://ezlinkwebservices.com/service/DebitCommand", "DebitCommandFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ezlinkwebservices.service.debitcommand
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DebitCommandFault }
     * 
     */
    public DebitCommandFault createDebitCommandFault() {
        return new DebitCommandFault();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DebitCommandFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/DebitCommand", name = "DebitCommandFault")
    public JAXBElement<DebitCommandFault> createDebitCommandFault(DebitCommandFault value) {
        return new JAXBElement<DebitCommandFault>(_DebitCommandFault_QNAME, DebitCommandFault.class, null, value);
    }

}
