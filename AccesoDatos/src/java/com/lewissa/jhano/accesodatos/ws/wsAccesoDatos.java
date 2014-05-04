/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lewissa.jhano.accesodatos.ws;

import com.lewissa.jhano.accesodatos.cAccesoDatos;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author eborja
 */
@WebService(serviceName = "wsAccesoDatos")
public class wsAccesoDatos {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "insertarProveedor")
    public Boolean insertarProveedor(@WebParam(name = "strSql") String strSql) {
        //TODO write your implementation code here:
        Boolean flag1 = false; // revisa la respuesta de la base
        Boolean flag2 = false; // revisa la conexion
        cAccesoDatos accConexion = new cAccesoDatos();
        if (!accConexion.conectarDataBase()) {
            flag2 = false; //error en la conexion
        } else {
            flag2 = true; // conexion correcta
            flag1 = accConexion.actualizarDataBase(strSql);
        }
        flag1 = (flag1.equals(true)) && (flag2.equals(true));
        return flag1;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "wsTestConexion")
    public Boolean wsTestConexion() {
        //TODO write your implementation code here:
        cAccesoDatos accTest = new cAccesoDatos();
        return accTest.conectarDataBase();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "insertarCliente")
    public Boolean insertarCliente(@WebParam(name = "strSql") String strSql) {
        Boolean flag1 = false; // revisa la respuesta de la base
        Boolean flag2 = false; // revisa la conexion
        cAccesoDatos accConexion = new cAccesoDatos();
        if (!accConexion.conectarDataBase()) {
            flag2 = false; //error en la conexion
        } else {
            flag2 = true; // conexion correcta
            flag1 = accConexion.actualizarDataBase(strSql);
        }
        flag1 = (flag1.equals(true)) && (flag2.equals(true));
        return flag1;
    }
}
