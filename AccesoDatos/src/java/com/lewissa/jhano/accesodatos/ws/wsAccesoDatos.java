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
     * Test de Conexión
     * @author Wilmer Moina, Juan Moyano
     * @version 1.0 02-05-2014
     * 
     * Método que permite realizar una prueba de conexión con la base de datos.
     * 
     * @return accTest.conectarDataBase , Booleano que contiene la confirmacion
     * de conexión
     */
    @WebMethod(operationName = "wsTestConexion")
    public Boolean wsTestConexion() {
        //TODO write your implementation code here:
        cAccesoDatos accTest = new cAccesoDatos();
        return accTest.conectarDataBase();
    }

    /**
     * Actualizar Base de Datos Servicio Web
     * @author Wilmer Moina, Esteban Borja
     * @version 1.0 06-05-2014
     * 
     * Servicio web que llama a la conexion de base de datos y resliza una actualizacion
     * en la base y retorna un bolleano.
     * 
     * @param strSql, String que contiene la sentencia SQL a ejecutar.
     * @return flag1, Booleano que retorna confirmacion de ingreso de los datos.
     */
    @WebMethod(operationName = "actualizaBase")
    public Boolean actualizaBase(@WebParam(name = "strSql") String strSql) {
        Boolean flag1 = false; // revisa la respuesta de la base
        Boolean flag2 = false; // revisa la conexion
        cAccesoDatos accConexion = new cAccesoDatos();
        if (!accConexion.conectarDataBase()) {
            flag2 = false; //error en la conexion
        } else {
            flag2 = true; // conexion correcta
            flag1 = accConexion.actualizarDataBase(strSql);
            if (flag1 == null) {
                flag1 = false;
            }
        }
        flag1 = (flag1.equals(true)) && (flag2.equals(true));
        return flag1;
    }
}
