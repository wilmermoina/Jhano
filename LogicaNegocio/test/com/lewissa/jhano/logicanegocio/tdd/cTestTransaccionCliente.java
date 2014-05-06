/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lewissa.jhano.logicanegocio.tdd;

import com.lewissa.jhano.cliente.cCliente;
import com.lewissa.jhano.cliente.cTransaccionCliente;
import com.lewissa.jhano.utilidades.cValidaciones;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
        datDatosCliente.setStrIdCliente("0604106864");
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

    public void testIngresarCliente1() {
        cTransaccionCliente cliCliente = new cTransaccionCliente();
        cCliente datDatosCliente = new cCliente();
        Boolean flag;
        // INSERT INTO cliente VALUES ('cl002','Wilmer Moina2','Wilmer Moina2',
        //'24 de Mayo','2607620','0994296010','wilmermoina@homtail.com','tc001')
        datDatosCliente.setStrIdCliente("15");
        datDatosCliente.setStrNombreFiscal("Prueba");
        datDatosCliente.setStrNombreComercial("Comercial");
        datDatosCliente.setStrDireccion("Direccion");
        datDatosCliente.setStrConvencional("2968473");
        datDatosCliente.setStrCelular("0987777283");
        datDatosCliente.setStrCorreo("asdfg@kk.com");
        datDatosCliente.setStrTipoCliente("tc001");
        flag = cliCliente.ingresarCliente(datDatosCliente);
        assertFalse(flag);
    }

    public void testIngresarCliente2() {
        cTransaccionCliente cliCliente = new cTransaccionCliente();
        cCliente datDatosCliente = new cCliente();
        Boolean flag;
        // INSERT INTO cliente VALUES ('cl002','Wilmer Moina2','Wilmer Moina2',
        //'24 de Mayo','2607620','0994296010','wilmermoina@homtail.com','tc001')
        datDatosCliente.setStrIdCliente("15");
        datDatosCliente.setStrNombreFiscal("Prueba");
        datDatosCliente.setStrNombreComercial("Comercial");
        datDatosCliente.setStrDireccion("Direccion");
        datDatosCliente.setStrConvencional("2968473");
        datDatosCliente.setStrCelular("0987777283");
        datDatosCliente.setStrCorreo("asdfg@kk.com");
        datDatosCliente.setStrTipoCliente("xxx");
        flag = cliCliente.ingresarCliente(datDatosCliente);
        assertFalse(flag);
    }

    public void testIngresarCliente3() {
        cTransaccionCliente cliCliente = new cTransaccionCliente();
        cCliente datDatosCliente = new cCliente();
        Boolean flag;
        // INSERT INTO cliente VALUES ('cl002','Wilmer Moina2','Wilmer Moina2',
        //'24 de Mayo','2607620','0994296010','wilmermoina@homtail.com','tc001')
        datDatosCliente.setStrIdCliente("15");
        datDatosCliente.setStrNombreFiscal("Prueba");
        datDatosCliente.setStrNombreComercial("Comercial");
        datDatosCliente.setStrDireccion("Direccion");
        datDatosCliente.setStrConvencional("xxxxxxx");
        datDatosCliente.setStrCelular("0987777283");
        datDatosCliente.setStrCorreo("asdfg@kk.com");
        datDatosCliente.setStrTipoCliente("xxx");
        flag = cliCliente.ingresarCliente(datDatosCliente);
        assertFalse(flag);
    }

    public void testIngresarCliente4() {
        cTransaccionCliente cliCliente = new cTransaccionCliente();
        cCliente datDatosCliente = new cCliente();
        Boolean flag;
        // INSERT INTO cliente VALUES ('cl002','Wilmer Moina2','Wilmer Moina2',
        //'24 de Mayo','2607620','0994296010','wilmermoina@homtail.com','tc001')
        datDatosCliente.setStrIdCliente("15");
        datDatosCliente.setStrNombreFiscal("Prueba");
        datDatosCliente.setStrNombreComercial("Comercial");
        datDatosCliente.setStrDireccion("Direccion");
        datDatosCliente.setStrConvencional("29477464");
        datDatosCliente.setStrCelular("0987777283");
        datDatosCliente.setStrCorreo("asdfg@kk.com");
        datDatosCliente.setStrTipoCliente("xxx");
        flag = cliCliente.ingresarCliente(datDatosCliente);
        assertFalse(flag);
    }

    public void testIngresarCliente5() {
        cTransaccionCliente cliCliente = new cTransaccionCliente();
        cCliente datDatosCliente = new cCliente();
        Boolean flag;
        // INSERT INTO cliente VALUES ('cl002','Wilmer Moina2','Wilmer Moina2',
        //'24 de Mayo','2607620','0994296010','wilmermoina@homtail.com','tc001')
        datDatosCliente.setStrIdCliente("15");
        datDatosCliente.setStrNombreFiscal("Prueba");
        datDatosCliente.setStrNombreComercial("Comercial");
        datDatosCliente.setStrDireccion("Direccion");
        datDatosCliente.setStrConvencional("2947746");
        datDatosCliente.setStrCelular("09877772834");
        datDatosCliente.setStrCorreo("asdfg@kk.com");
        datDatosCliente.setStrTipoCliente("xxx");
        flag = cliCliente.ingresarCliente(datDatosCliente);
        assertFalse(flag);
    }

    public void testIngresarCliente6() {
        cTransaccionCliente cliCliente = new cTransaccionCliente();
        cCliente datDatosCliente = new cCliente();
        Boolean flag;
        // INSERT INTO cliente VALUES ('cl002','Wilmer Moina2','Wilmer Moina2',
        //'24 de Mayo','2607620','0994296010','wilmermoina@homtail.com','tc001')
        datDatosCliente.setStrIdCliente("15");
        datDatosCliente.setStrNombreFiscal("Prueba");
        datDatosCliente.setStrNombreComercial("Comercial");
        datDatosCliente.setStrDireccion("Direccion");
        datDatosCliente.setStrConvencional("2947746");
        datDatosCliente.setStrCelular("qqqqqqqqqq");
        datDatosCliente.setStrCorreo("asdfg@kk.com");
        datDatosCliente.setStrTipoCliente("tc001");
        flag = cliCliente.ingresarCliente(datDatosCliente);
        assertFalse(flag);
    }
   
    public static Test suite() {
        return new TestSuite(cTestTransaccionCliente.class);
    }

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

}
