/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ashley Mendoza V
 */
public class MultaIT {
    
    public MultaIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of aplicarMulta method, of class Multa.
     */
    @Test
    public void testAplicarMulta() {
        System.out.println("aplicarMulta");
        Usuario usuario = null;
        Libro libro = null;
        double monto = 0.0;
        Multa instance = new Multa();
        double expResult = 0.0;
        double result = instance.aplicarMulta(usuario, libro, monto);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMonto method, of class Multa.
     */
    @Test
    public void testGetMonto() {
        System.out.println("getMonto");
        Multa instance = new Multa();
        int expResult = 0;
        int result = instance.getMonto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMonto method, of class Multa.
     */
    @Test
    public void testSetMonto() {
        System.out.println("setMonto");
        int monto = 0;
        Multa instance = new Multa();
        instance.setMonto(monto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsuario method, of class Multa.
     */
    @Test
    public void testGetUsuario() {
        System.out.println("getUsuario");
        Multa instance = new Multa();
        Usuario expResult = null;
        Usuario result = instance.getUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsuario method, of class Multa.
     */
    @Test
    public void testSetUsuario() {
        System.out.println("setUsuario");
        Usuario usuario = null;
        Multa instance = new Multa();
        instance.setUsuario(usuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaMulta method, of class Multa.
     */
    @Test
    public void testGetFechaMulta() {
        System.out.println("getFechaMulta");
        Multa instance = new Multa();
        Date expResult = null;
        Date result = instance.getFechaMulta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaMulta method, of class Multa.
     */
    @Test
    public void testSetFechaMulta() {
        System.out.println("setFechaMulta");
        Date fechaMulta = null;
        Multa instance = new Multa();
        instance.setFechaMulta(fechaMulta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaPago method, of class Multa.
     */
    @Test
    public void testGetFechaPago() {
        System.out.println("getFechaPago");
        Multa instance = new Multa();
        Date expResult = null;
        Date result = instance.getFechaPago();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaPago method, of class Multa.
     */
    @Test
    public void testSetFechaPago() {
        System.out.println("setFechaPago");
        Date fechaPago = null;
        Multa instance = new Multa();
        instance.setFechaPago(fechaPago);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaVencimiento method, of class Multa.
     */
    @Test
    public void testGetFechaVencimiento() {
        System.out.println("getFechaVencimiento");
        Multa instance = new Multa();
        Date expResult = null;
        Date result = instance.getFechaVencimiento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaVencimiento method, of class Multa.
     */
    @Test
    public void testSetFechaVencimiento() {
        System.out.println("setFechaVencimiento");
        Date fechaVencimiento = null;
        Multa instance = new Multa();
        instance.setFechaVencimiento(fechaVencimiento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComentario method, of class Multa.
     */
    @Test
    public void testGetComentario() {
        System.out.println("getComentario");
        Multa instance = new Multa();
        String expResult = "";
        String result = instance.getComentario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setComentario method, of class Multa.
     */
    @Test
    public void testSetComentario() {
        System.out.println("setComentario");
        String comentario = "";
        Multa instance = new Multa();
        instance.setComentario(comentario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
