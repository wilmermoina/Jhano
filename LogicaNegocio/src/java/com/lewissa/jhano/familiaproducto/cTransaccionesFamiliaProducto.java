/*
 *Esta clae permite realizar las transacciones(Inserta, modificar, eliminar y 
 *consultar) de la familia de producto
 */

package com.lewissa.jhano.familiaproducto;
import com.lewissa.jhano.familiaproducto.cFamiliaProducto;

/**
 *
 * @author Usuario
 */
public class cTransaccionesFamiliaProducto {
    
    /**
     * Este metodo que permite Insertar un Objeto Familia de Producto
     * @param familiaProducto, Objeto que represnta a la tabla Familia Producto
     * @return booResultado, Boolean que retorna la confimacion de la realizacion del metodo
     */
    
    public Boolean insertarFamiliaProducto(cFamiliaProducto familiaProducto){
        Boolean booResultado=false;
        String strQuery;
        com.lewissa.proveedor.wsc.WsAccesoDatos_Service serviceAD = new com.lewissa.proveedor.wsc.WsAccesoDatos_Service();
        com.lewissa.proveedor.wsc.WsAccesoDatos  serviceADPort = serviceAD.getWsAccesoDatosPort();
        strQuery = "INSERT INTO familiaproducto VALUES ('" + familiaProducto.getIntId()+ "', '" + familiaProducto.getStrDescripcion()+ "')";
        booResultado= serviceADPort.actualizarDataBase(strQuery);
        return booResultado;
    
    }
    
}
