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
public class cTestValidaciones extends TestCase {
 
    public void testValidarCorreoVerdadero() {
        cValidaciones valCorreo = new cValidaciones();
        // Check if the e-mail is valid using our method.
        Boolean valid = valCorreo.validaEmail("test@example.com");
        // All of e-mails of this test must be valid.
        assertTrue(valid);
    }

    public void testValidarCorreoFalso() {
        cValidaciones valCorreo = new cValidaciones();
        // Check if the e-mail is valid using our method.
        Boolean valid = valCorreo.validaEmail("exampel101@.com");
        // All of e-mails of this test must be valid.
        assertFalse(valid);
    }

    public static Test suite() {
        return new TestSuite(cTestValidaciones.class);
    }

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

}
