
package com.ezlinkwebservices.service.reciept;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ezlinkwebservices.service.reciept package. 
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

    private final static QName _RecieptFault_QNAME = new QName("http://ezlinkwebservices.com/service/Reciept", "RecieptFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ezlinkwebservices.service.reciept
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RecieptFault }
     * 
     */
    public RecieptFault createRecieptFault() {
        return new RecieptFault();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecieptFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ezlinkwebservices.com/service/Reciept", name = "RecieptFault")
    public JAXBElement<RecieptFault> createRecieptFault(RecieptFault value) {
        return new JAXBElement<RecieptFault>(_RecieptFault_QNAME, RecieptFault.class, null, value);
    }

}
