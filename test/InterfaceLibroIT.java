/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

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
public class InterfaceLibroIT {
    
    public InterfaceLibroIT() {
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
     * Test of getAutor method, of class InterfaceLibro.
     */
    @Test
    public void testGetAutor() {
        System.out.println("getAutor");
        InterfaceLibro instance = new InterfaceLibroImpl();
        Autor expResult = null;
        Autor result = instance.getAutor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitulo method, of class InterfaceLibro.
     */
    @Test
    public void testGetTitulo() {
        System.out.println("getTitulo");
        InterfaceLibro instance = new InterfaceLibroImpl();
        String expResult = "";
        String result = instance.getTitulo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAutor method, of class InterfaceLibro.
     */
    @Test
    public void testSetAutor() {
        System.out.println("setAutor");
        Autor autor = null;
        InterfaceLibro instance = new InterfaceLibroImpl();
        instance.setAutor(autor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitulo method, of class InterfaceLibro.
     */
    @Test
    public void testSetTitulo() {
        System.out.println("setTitulo");
        String titulo = "";
        InterfaceLibro instance = new InterfaceLibroImpl();
        instance.setTitulo(titulo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class InterfaceLibroImpl implements InterfaceLibro {

        public Autor getAutor() {
            return null;
        }

        public String getTitulo() {
            return "";
        }

        public void setAutor(Autor autor) {
        }

        public void setTitulo(String titulo) {
        }
    }
    
}
