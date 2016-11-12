
package com.devalexb.jaxws.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.devalexb.jaxws.service package. 
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

    private final static QName _GeHelloWorldResponse_QNAME = new QName("http://service.jaxws.devalexb.com/", "geHelloWorldResponse");
    private final static QName _InsertHellowWorldResponse_QNAME = new QName("http://service.jaxws.devalexb.com/", "insertHellowWorldResponse");
    private final static QName _InsertHellowWorld_QNAME = new QName("http://service.jaxws.devalexb.com/", "insertHellowWorld");
    private final static QName _GeHelloWorld_QNAME = new QName("http://service.jaxws.devalexb.com/", "geHelloWorld");
    private final static QName _HelloWorld_QNAME = new QName("http://service.jaxws.devalexb.com/", "helloWorld");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.devalexb.jaxws.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InsertHellowWorld }
     * 
     */
    public InsertHellowWorld createInsertHellowWorld() {
        return new InsertHellowWorld();
    }

    /**
     * Create an instance of {@link GeHelloWorldResponse }
     * 
     */
    public GeHelloWorldResponse createGeHelloWorldResponse() {
        return new GeHelloWorldResponse();
    }

    /**
     * Create an instance of {@link InsertHellowWorldResponse }
     * 
     */
    public InsertHellowWorldResponse createInsertHellowWorldResponse() {
        return new InsertHellowWorldResponse();
    }

    /**
     * Create an instance of {@link GeHelloWorld }
     * 
     */
    public GeHelloWorld createGeHelloWorld() {
        return new GeHelloWorld();
    }

    /**
     * Create an instance of {@link HelloWorld }
     * 
     */
    public HelloWorld createHelloWorld() {
        return new HelloWorld();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeHelloWorldResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.jaxws.devalexb.com/", name = "geHelloWorldResponse")
    public JAXBElement<GeHelloWorldResponse> createGeHelloWorldResponse(GeHelloWorldResponse value) {
        return new JAXBElement<GeHelloWorldResponse>(_GeHelloWorldResponse_QNAME, GeHelloWorldResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertHellowWorldResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.jaxws.devalexb.com/", name = "insertHellowWorldResponse")
    public JAXBElement<InsertHellowWorldResponse> createInsertHellowWorldResponse(InsertHellowWorldResponse value) {
        return new JAXBElement<InsertHellowWorldResponse>(_InsertHellowWorldResponse_QNAME, InsertHellowWorldResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertHellowWorld }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.jaxws.devalexb.com/", name = "insertHellowWorld")
    public JAXBElement<InsertHellowWorld> createInsertHellowWorld(InsertHellowWorld value) {
        return new JAXBElement<InsertHellowWorld>(_InsertHellowWorld_QNAME, InsertHellowWorld.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeHelloWorld }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.jaxws.devalexb.com/", name = "geHelloWorld")
    public JAXBElement<GeHelloWorld> createGeHelloWorld(GeHelloWorld value) {
        return new JAXBElement<GeHelloWorld>(_GeHelloWorld_QNAME, GeHelloWorld.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloWorld }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.jaxws.devalexb.com/", name = "helloWorld")
    public JAXBElement<HelloWorld> createHelloWorld(HelloWorld value) {
        return new JAXBElement<HelloWorld>(_HelloWorld_QNAME, HelloWorld.class, null, value);
    }

}
