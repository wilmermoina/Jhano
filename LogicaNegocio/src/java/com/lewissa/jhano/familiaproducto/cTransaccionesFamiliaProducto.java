/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lewissa.jhano.familiaproducto;
import com.lewissa.jhano.familiaproducto.cFamiliaProducto;

/**
 *
 * @author Usuario
 */
public class cTransaccionesFamiliaProducto {
    
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
