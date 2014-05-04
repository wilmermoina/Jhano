/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lewissa.jhano.logicanegocio.tdd;

import com.lewissa.jhano.cliente.cCliente;
import com.lewissa.jhano.cliente.cTransaccionCliente;
import junit.framework.*;

/**
 *
 * @author eborja
 */
public class cTestTransaccionCliente extends TestCase {

    

    public void testIngresarCliente() {
        cTransaccionCliente cliCliente = new cTransaccionCliente();
        cCliente datDatosCliente = new cCliente();
        Boolean flag;
        // INSERT INTO cliente VALUES ('cl002','Wilmer Moina2','Wilmer Moina2',
        //'24 de Mayo','2607620','0994296010','wilmermoina@homtail.com','tc001')
        datDatosCliente.setStrIdCliente("cl018");
        datDatosCliente.setStrNombreFiscal("Prueba");
        datDatosCliente.setStrNombreComercial("Comercial");
        datDatosCliente.setStrDireccion("Direccion");
        datDatosCliente.setStrConvencional("2968473");
        datDatosCliente.setStrCelular("0987777283");
        datDatosCliente.setStrCorreo("asdfg@kk.com");
        datDatosCliente.setStrTipoCliente("tc001");
        flag = cliCliente.ingresarCliente(datDatosCliente);
        assertTrue(flag);
    }

    public static Test suite() {
        return new TestSuite(cTestTransaccionCliente.class);
    }

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

}
