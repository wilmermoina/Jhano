/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lewissa.jhano.logicanegocio.tdd;

import com.lewissa.jhano.proveedor.cProveedor;
import com.lewissa.jhano.proveedor.cTransaccionProveedor;
import static junit.framework.Assert.assertTrue;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


/**
 *
 * @author Usuario
 */

public class cTestTransaccionProveedor extends TestCase{

   // Este test prueba el ingreso de un proveedor
    public void testIngresarProveedor() {
        cTransaccionProveedor proProveedor = new cTransaccionProveedor();
        cProveedor datDatosProveedor = new cProveedor();
        Boolean flag;
        //INSERT INTO proveedor VALUES ('pv003', 'asdfg', 'jhbsdcbhd', 'kjdbkhbd', '2378628', '0984486880', 'agshdc@sjgdv.com')
        datDatosProveedor.setId("pv019");
        datDatosProveedor.setNombreFiscal("Prueba");
        datDatosProveedor.setNombreComercial("Comercial");
        datDatosProveedor.setDireccion("Direccion");
        datDatosProveedor.setConvencional("2968473");
        datDatosProveedor.setCelular("0987777283");
        datDatosProveedor.setCorreo("asdfg@kk.com");
        flag = proProveedor.ingresarProveedor(datDatosProveedor);
        assertTrue(flag);
    }
     public static Test suite() {
        return new TestSuite(cTestTransaccionProveedor.class);
    }

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }
}
