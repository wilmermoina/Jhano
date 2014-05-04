package com.lewissa.jhano.cliente;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Usuario
 */
public class cTransaccionCliente {

    public Boolean ingresarCliente(cCliente datDatos) {

        com.lewissa.proveedor.wsc.WsAccesoDatos_Service service = new com.lewissa.proveedor.wsc.WsAccesoDatos_Service();
        com.lewissa.proveedor.wsc.WsAccesoDatos flag = service.getWsAccesoDatosPort();
        String strSqlIngreso;
        strSqlIngreso = "INSERT INTO cliente VALUES ('" + datDatos.getStrIdCliente() + "', '" + datDatos.getStrNombreFiscal() + "'"
                + ", '" + datDatos.getStrNombreComercial() + "', '" + datDatos.getStrDireccion() + "', '" + datDatos.getStrConvencional() + "'"
                + ", '" + datDatos.getStrCelular() + "', '" + datDatos.getStrCorreo() + "', '" + datDatos.getStrTipoCliente() + "')";
        return flag.insertarCliente(strSqlIngreso);
    }

}


