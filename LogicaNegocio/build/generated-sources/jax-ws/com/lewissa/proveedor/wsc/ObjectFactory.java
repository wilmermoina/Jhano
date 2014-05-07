
package com.lewissa.proveedor.wsc;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.lewissa.proveedor.wsc package. 
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

    private final static QName _ActualizarDataBase_QNAME = new QName("http://ws.accesodatos.jhano.lewissa.com/", "actualizarDataBase");
    private final static QName _ActualizarDataBaseResponse_QNAME = new QName("http://ws.accesodatos.jhano.lewissa.com/", "actualizarDataBaseResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.lewissa.proveedor.wsc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ActualizarDataBaseResponse }
     * 
     */
    public ActualizarDataBaseResponse createActualizarDataBaseResponse() {
        return new ActualizarDataBaseResponse();
    }

    /**
     * Create an instance of {@link ActualizarDataBase }
     * 
     */
    public ActualizarDataBase createActualizarDataBase() {
        return new ActualizarDataBase();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarDataBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.accesodatos.jhano.lewissa.com/", name = "actualizarDataBase")
    public JAXBElement<ActualizarDataBase> createActualizarDataBase(ActualizarDataBase value) {
        return new JAXBElement<ActualizarDataBase>(_ActualizarDataBase_QNAME, ActualizarDataBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarDataBaseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.accesodatos.jhano.lewissa.com/", name = "actualizarDataBaseResponse")
    public JAXBElement<ActualizarDataBaseResponse> createActualizarDataBaseResponse(ActualizarDataBaseResponse value) {
        return new JAXBElement<ActualizarDataBaseResponse>(_ActualizarDataBaseResponse_QNAME, ActualizarDataBaseResponse.class, null, value);
    }

}
