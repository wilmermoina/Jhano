/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lewissa.jhano.cliente;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author eborja
 */
@WebService(serviceName = "wsLogicaNegocioCliente")
public class wsLogicaNegocioCliente {

   /**
    * 
    * @param cliCliente
    * @return 
    */
    @WebMethod(operationName = "actualizaDataBaseCliente")
    public Boolean actualizaDataBaseCliente(@WebParam(name = "cliCliente") cCliente cliCliente) {
        cTransaccionCliente traTransaccion= new cTransaccionCliente();
        return traTransaccion.ingresarCliente(cliCliente);
    }
}
