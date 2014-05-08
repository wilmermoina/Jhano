/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lewissa.jhano.logicanegocio.tdd;


import com.lewissa.jhano.utilidades.cCedula;
import com.lewissa.jhano.utilidades.cCorreo;
import com.lewissa.jhano.utilidades.cRuc;
import junit.framework.*;

/**
 *
 * @author eborja
 */
public class cTestValidacionesUtilidades extends TestCase {

    public void testValidarCorreoVerdadero() {
        cCorreo corCorreo = new cCorreo("test@example.com");
        Boolean booFlag = corCorreo.validaEmail();
        assertTrue(booFlag);
    }

    public void testValidarCorreoFalso() {
        cCorreo corCorreo = new cCorreo("exampel101@.com");
        Boolean booFlag = corCorreo.validaEmail();
        assertFalse(booFlag);
    }

    public void testValidarCedula() {

        cCedula cedCedula = new cCedula("0604949891");
        Boolean booFlag = cedCedula.validaCedula();
        assertTrue(booFlag);
    }

    public void testValidarCedulaLetra() {

        cCedula cedCedula = new cCedula("060494989q");
        Boolean booFlag = cedCedula.validaCedula();
        assertFalse(booFlag);
    }

    public void testValidarCedulaIncompleta() {

        cCedula cedCedula = new cCedula("06049498");
        Boolean booFlag = cedCedula.validaCedula();
        assertFalse(booFlag);
    }
    
    public void testValidarCedulaDigitoVerificadorErroneo() {

        cCedula cedCedula = new cCedula("0604106861");
        Boolean booFlag = cedCedula.validaCedula();
        assertFalse(booFlag);
    }
    
    public void testValidarCedulaDigitoVerificadorCorrecto() {

        cCedula cedCedula = new cCedula("0604949891");
        Boolean booFlag = cedCedula.validaCedula();
        assertTrue(booFlag);
    }
    
    public void testValidarRuc() {
        cRuc rucRuc = new cRuc("0604949891001");
        Boolean booFlag = rucRuc.validaRuc();
        assertTrue(booFlag);
    }

    public void testValidarRucIncompleto() {
        cRuc rucRuc = new cRuc("060494989100");
        Boolean booFlag = rucRuc.validaRuc();
        assertFalse(booFlag);
    }

    public void testValidarRucErroneo() {
        cRuc rucRuc = new cRuc("0604949891231");
        Boolean booFlag = rucRuc.validaRuc();
        assertFalse(booFlag);
    }

    public void testValidarRucLetra() {
        cRuc rucRuc = new cRuc("0604949a9001");
        Boolean booFlag = rucRuc.validaRuc();
        assertFalse(booFlag);
    }

    public static Test suite() {
        return new TestSuite(cTestValidacionesUtilidades.class);
    }

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

}
