
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

    private final static QName _WsTestConexion_QNAME = new QName("http://ws.accesodatos.jhano.lewissa.com/", "wsTestConexion");
    private final static QName _WsTestConexionResponse_QNAME = new QName("http://ws.accesodatos.jhano.lewissa.com/", "wsTestConexionResponse");
    private final static QName _ActualizaBaseResponse_QNAME = new QName("http://ws.accesodatos.jhano.lewissa.com/", "actualizaBaseResponse");
    private final static QName _ActualizaBase_QNAME = new QName("http://ws.accesodatos.jhano.lewissa.com/", "actualizaBase");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.lewissa.proveedor.wsc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ActualizaBase }
     * 
     */
    public ActualizaBase createActualizaBase() {
        return new ActualizaBase();
    }

    /**
     * Create an instance of {@link ActualizaBaseResponse }
     * 
     */
    public ActualizaBaseResponse createActualizaBaseResponse() {
        return new ActualizaBaseResponse();
    }

    /**
     * Create an instance of {@link WsTestConexion }
     * 
     */
    public WsTestConexion createWsTestConexion() {
        return new WsTestConexion();
    }

    /**
     * Create an instance of {@link WsTestConexionResponse }
     * 
     */
    public WsTestConexionResponse createWsTestConexionResponse() {
        return new WsTestConexionResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsTestConexion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.accesodatos.jhano.lewissa.com/", name = "wsTestConexion")
    public JAXBElement<WsTestConexion> createWsTestConexion(WsTestConexion value) {
        return new JAXBElement<WsTestConexion>(_WsTestConexion_QNAME, WsTestConexion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsTestConexionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.accesodatos.jhano.lewissa.com/", name = "wsTestConexionResponse")
    public JAXBElement<WsTestConexionResponse> createWsTestConexionResponse(WsTestConexionResponse value) {
        return new JAXBElement<WsTestConexionResponse>(_WsTestConexionResponse_QNAME, WsTestConexionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizaBaseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.accesodatos.jhano.lewissa.com/", name = "actualizaBaseResponse")
    public JAXBElement<ActualizaBaseResponse> createActualizaBaseResponse(ActualizaBaseResponse value) {
        return new JAXBElement<ActualizaBaseResponse>(_ActualizaBaseResponse_QNAME, ActualizaBaseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizaBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.accesodatos.jhano.lewissa.com/", name = "actualizaBase")
    public JAXBElement<ActualizaBase> createActualizaBase(ActualizaBase value) {
        return new JAXBElement<ActualizaBase>(_ActualizaBase_QNAME, ActualizaBase.class, null, value);
    }

}
