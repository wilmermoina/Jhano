
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

    private final static QName _InsertarProveedor_QNAME = new QName("http://ws.accesodatos.jhano.lewissa.com/", "insertarProveedor");
    private final static QName _WsTestConexion_QNAME = new QName("http://ws.accesodatos.jhano.lewissa.com/", "wsTestConexion");
    private final static QName _WsTestConexionResponse_QNAME = new QName("http://ws.accesodatos.jhano.lewissa.com/", "wsTestConexionResponse");
    private final static QName _InsertarCliente_QNAME = new QName("http://ws.accesodatos.jhano.lewissa.com/", "insertarCliente");
    private final static QName _InsertarClienteResponse_QNAME = new QName("http://ws.accesodatos.jhano.lewissa.com/", "insertarClienteResponse");
    private final static QName _InsertarProveedorResponse_QNAME = new QName("http://ws.accesodatos.jhano.lewissa.com/", "insertarProveedorResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.lewissa.proveedor.wsc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InsertarProveedorResponse }
     * 
     */
    public InsertarProveedorResponse createInsertarProveedorResponse() {
        return new InsertarProveedorResponse();
    }

    /**
     * Create an instance of {@link InsertarClienteResponse }
     * 
     */
    public InsertarClienteResponse createInsertarClienteResponse() {
        return new InsertarClienteResponse();
    }

    /**
     * Create an instance of {@link InsertarCliente }
     * 
     */
    public InsertarCliente createInsertarCliente() {
        return new InsertarCliente();
    }

    /**
     * Create an instance of {@link WsTestConexion }
     * 
     */
    public WsTestConexion createWsTestConexion() {
        return new WsTestConexion();
    }

    /**
     * Create an instance of {@link InsertarProveedor }
     * 
     */
    public InsertarProveedor createInsertarProveedor() {
        return new InsertarProveedor();
    }

    /**
     * Create an instance of {@link WsTestConexionResponse }
     * 
     */
    public WsTestConexionResponse createWsTestConexionResponse() {
        return new WsTestConexionResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarProveedor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.accesodatos.jhano.lewissa.com/", name = "insertarProveedor")
    public JAXBElement<InsertarProveedor> createInsertarProveedor(InsertarProveedor value) {
        return new JAXBElement<InsertarProveedor>(_InsertarProveedor_QNAME, InsertarProveedor.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.accesodatos.jhano.lewissa.com/", name = "insertarCliente")
    public JAXBElement<InsertarCliente> createInsertarCliente(InsertarCliente value) {
        return new JAXBElement<InsertarCliente>(_InsertarCliente_QNAME, InsertarCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.accesodatos.jhano.lewissa.com/", name = "insertarClienteResponse")
    public JAXBElement<InsertarClienteResponse> createInsertarClienteResponse(InsertarClienteResponse value) {
        return new JAXBElement<InsertarClienteResponse>(_InsertarClienteResponse_QNAME, InsertarClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarProveedorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.accesodatos.jhano.lewissa.com/", name = "insertarProveedorResponse")
    public JAXBElement<InsertarProveedorResponse> createInsertarProveedorResponse(InsertarProveedorResponse value) {
        return new JAXBElement<InsertarProveedorResponse>(_InsertarProveedorResponse_QNAME, InsertarProveedorResponse.class, null, value);
    }

}
