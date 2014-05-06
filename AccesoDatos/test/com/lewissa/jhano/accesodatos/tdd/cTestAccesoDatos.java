/*
 * Pruebas Unitaria
 * Esta clase me permite verificar el comportamiento de los metodos de la clase cAccesoDatos
 * 
 */

package com.lewissa.jhano.accesodatos.tdd;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.framework.Test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import com.lewissa.jhano.accesodatos.cAccesoDatos;
import java.sql.SQLException;

/**
 * Verificacion de los metodos del la cAccesoDatos
 * @author Fredy Janeta
 * @version 1.0 05-05-2014
 */
public class cTestAccesoDatos extends TestCase{
    private cAccesoDatos oAccesoDatos;
    /**
     * Este metodo permite verificar si el metodo conectarDataBase() permite conectar la DB
     */
    public void testConectarDataBase()
    {
       oAccesoDatos  = new cAccesoDatos();
       
       assertTrue(oAccesoDatos.conectarDataBase());
    }
   /**
    * Este metodo me permite verificar si el metodo desconectarDataBase() permite desconectar la DB
    */
    public void testDesconectarDataBase()
    {
        oAccesoDatos =  new cAccesoDatos();
        assertTrue(oAccesoDatos.desconectarDataBase());
    }
    /**
     * Este metodo me permite virificar que el resultado de la consulta no sea NULL
     * NOTA: para que esta prueba se a exitosa debe de existir elementos la tabla Cliente de la DB
     */
    public void testConsultarDataBase()
    {
        oAccesoDatos = new cAccesoDatos();
        String strQuery = "SELECT * FROM cliente";
        String strResultado = null;
        strResultado = oAccesoDatos.consultarDataBase(strQuery);
        assertNotNull(strResultado);
        
    }
    /**
     * Este metodo me permite verificar que la sentencia sql (strQuery) se ejecuta coorrectamente
     * y me devovera un True en caso de ser exitosa la ejecucion de dicha consulta
     */
    public void testActualizarDataBase()
    {
        oAccesoDatos = new cAccesoDatos();
        String strQuery = "INSERT INTO familia VALUES('LAPTOP')";
        Boolean booResultado = false;
        booResultado = oAccesoDatos.actualizarDataBase(strQuery);
        assertTrue(booResultado);
    }
    
 public static Test suite()
 {
     return new TestSuite(cTestAccesoDatos.class);
 }
 
 public static void main(String [] args)
 {
     junit.textui.TestRunner.run(suite());
 }
    
}
