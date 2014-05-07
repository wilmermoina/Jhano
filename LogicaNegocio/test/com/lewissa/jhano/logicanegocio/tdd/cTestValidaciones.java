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
        Boolean booFlag = valCorreo.validaEmail("exampel101@.com");
        // All of e-mails of this test must be valid.
        assertFalse(booFlag);
    }

    public void testValidarCedula() {

        cValidaciones valCedula = new cValidaciones();
        Boolean booFlag = valCedula.validaCedula("0604949891");
        assertTrue(booFlag);
    }

    public void testValidarCedulaLetra() {

        cValidaciones valCedula = new cValidaciones();
        Boolean booFlag = valCedula.validaCedula("060494989q");
        assertFalse(booFlag);
    }

    public void testValidarCedulaIncompleta() {

        cValidaciones valCedula = new cValidaciones();
        Boolean booFlag = valCedula.validaCedula("06049498");
        assertFalse(booFlag);
    }
    
    public void testValidarCedulaDigitoVerificadorErroneo() {

        cValidaciones valCedula = new cValidaciones();
        Boolean booFlag = valCedula.validaCedula("0604106861");
        assertFalse(booFlag);
    }
    
    public void testValidarCedulaDigitoVerificadorCorrecto() {

        cValidaciones valCedula = new cValidaciones();
        Boolean booFlag = valCedula.validaCedula("0604949891");
        assertTrue(booFlag);
    }
    
    public void testValidarRuc() {
        cValidaciones valRuc = new cValidaciones();
        Boolean booFlag = valRuc.validaRuc("0604949891001");
        assertTrue(booFlag);
    }

    public void testValidarRucIncompleto() {
        cValidaciones valRuc = new cValidaciones();
        Boolean booFlag = valRuc.validaRuc("060494989100");
        assertFalse(booFlag);
    }

    public void testValidarRucErroneo() {
        cValidaciones valRuc = new cValidaciones();
        Boolean booFlag = valRuc.validaRuc("0604949891231");
        assertFalse(booFlag);
    }

    public void testValidarRucLetra() {
        cValidaciones valRuc = new cValidaciones();
        Boolean booFlag = valRuc.validaRuc("0604949a9001");
        assertFalse(booFlag);
    }

    public static Test suite() {
        return new TestSuite(cTestValidaciones.class);
    }

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

}
