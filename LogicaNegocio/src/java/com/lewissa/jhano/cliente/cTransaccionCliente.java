package com.lewissa.jhano.cliente;

import com.lewissa.jhano.utilidades.cCedula;
import com.lewissa.jhano.utilidades.cCorreo;
import com.lewissa.jhano.utilidades.cRuc;
import com.lewissa.jhano.wscAccesoDatos.WsAccesoDatos_Service;

/**
 * Clase Transacción de Clientes
 *
 * Gestiona el comportamiento de la clase cCliente, mediante los métodos creados
 *
 * @version 1.0 03/05/2014
 * @author
 */
public class cTransaccionCliente {

    /**
     *
     * @param datDatos
     * @return
     */
    public Boolean ingresarCliente(cCliente datDatos) {
        com.lewissa.jhano.wscAccesoDatos.WsAccesoDatos_Service service = new WsAccesoDatos_Service();
        com.lewissa.jhano.wscAccesoDatos.WsAccesoDatos flag = service.getWsAccesoDatosPort();
        String strSqlIngreso;
        Boolean booFlag = false;
        cCedula cedCedula=new cCedula(datDatos.getStrIdCliente());
        cRuc rucRuc=new cRuc(datDatos.getStrIdCliente());
        cCorreo corCorreo=new cCorreo(datDatos.getStrCorreo());
        if ((cedCedula.validaCedula() || rucRuc.validaRuc()) && corCorreo.validaEmail()) {
            strSqlIngreso = "INSERT INTO cliente VALUES ('" + datDatos.getStrIdCliente() + "', '" + datDatos.getStrNombreFiscal() + "'"
                    + ", '" + datDatos.getStrNombreComercial() + "', '" + datDatos.getStrDireccion() + "', '" + datDatos.getStrConvencional() + "'"
                    + ", '" + datDatos.getStrCelular() + "', '" + datDatos.getStrCorreo() + "', '" + datDatos.getStrTipoCliente() + "')";
            booFlag = flag.actualizarDataBase(strSqlIngreso);
        }
        return booFlag;
    }

}
