/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lewissa.jhano.proveedor;

/**
 *
 * @author eborja
 */
public class cTransaccionProveedor {

    public Boolean ingresarProveedor(cProveedor datDatos) {
        //cAccesoDatos accEjecutaQry=new cAccesoDatos();
        com.lewissa.proveedor.wsc.WsAccesoDatos_Service service = new com.lewissa.proveedor.wsc.WsAccesoDatos_Service();
        com.lewissa.proveedor.wsc.WsAccesoDatos flag = service.getWsAccesoDatosPort();
        String strSqlIngreso;
        strSqlIngreso = "INSERT INTO proveedor VALUES ('"+datDatos.getId()+"', '"+datDatos.getNombreFiscal()+"'"
                + ", '"+datDatos.getNombreComercial()+"', '"+datDatos.getDireccion()+"', '"+datDatos.getConvencional()+"'"
                + ", '"+datDatos.getCelular()+"', '"+datDatos.getCorreo()+"')";
        return flag.actualizarDataBase(strSqlIngreso);
    }  
}
