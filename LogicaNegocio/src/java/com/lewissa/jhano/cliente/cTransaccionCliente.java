package com.lewissa.jhano.cliente;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Clase Transacción de Clientes
 *
 * Gestiona el comportamiento de la clase cCliente, mediante los métodos
 * creados
 *
 * @version 1.0 03/05/2014
 * @author Wilmer Moina, Juan Moyano
 */
public class cTransaccionCliente {
  

    public Boolean ingresarCliente(cCliente datDatos) {

        com.lewissa.proveedor.wsc.WsAccesoDatos_Service service = new com.lewissa.proveedor.wsc.WsAccesoDatos_Service();
        com.lewissa.proveedor.wsc.WsAccesoDatos flag = service.getWsAccesoDatosPort();
        String strSqlIngreso;
        Boolean booFlag=false;
        booFlag=testCorreo(datDatos.getStrCorreo());
        strSqlIngreso = "INSERT INTO cliente VALUES ('" + datDatos.getStrIdCliente() + "', '" + datDatos.getStrNombreFiscal() + "'"
                + ", '" + datDatos.getStrNombreComercial() + "', '" + datDatos.getStrDireccion() + "', '" + datDatos.getStrConvencional() + "'"
                + ", '" + datDatos.getStrCelular() + "', '" + datDatos.getStrCorreo() + "', '" + datDatos.getStrTipoCliente() + "')";
        return flag.actualizaBase(strSqlIngreso);
    }

     private static final String PATTERN_EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
     
    private Boolean testCorreo(String strCorreo) {
        // Compiles the given regular expression into a pattern.
        Pattern pattern = Pattern.compile(PATTERN_EMAIL);
        // Match the given input against this pattern
        Matcher matcher = pattern.matcher(strCorreo);
        return matcher.matches();
    }

}


