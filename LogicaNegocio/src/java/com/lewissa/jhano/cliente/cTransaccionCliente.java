package com.lewissa.jhano.cliente;

import com.lewissa.jhano.utilidades.cValidaciones;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Clase Transacción de Clientes
 *
 * Gestiona el comportamiento de la clase cCliente, mediante los métodos creados
 *
 * @version 1.0 03/05/2014
 * @author Wilmer Moina, Juan Moyano
 */
public class cTransaccionCliente {

    public Boolean ingresarCliente(cCliente datDatos) {

        com.lewissa.proveedor.wsc.WsAccesoDatos_Service service = new com.lewissa.proveedor.wsc.WsAccesoDatos_Service();
        com.lewissa.proveedor.wsc.WsAccesoDatos flag = service.getWsAccesoDatosPort();
        String strSqlIngreso;
        Boolean booFlag = false;
        cValidaciones valCorreo = new cValidaciones();
        booFlag = valCorreo.validaEmail(datDatos.getStrCorreo());
        strSqlIngreso = "INSERT INTO cliente VALUES ('" + datDatos.getStrIdCliente() + "', '" + datDatos.getStrNombreFiscal() + "'"
                + ", '" + datDatos.getStrNombreComercial() + "', '" + datDatos.getStrDireccion() + "', '" + datDatos.getStrConvencional() + "'"
                + ", '" + datDatos.getStrCelular() + "', '" + datDatos.getStrCorreo() + "', '" + datDatos.getStrTipoCliente() + "')";
        return flag.actualizaBase(strSqlIngreso);
    }
}
