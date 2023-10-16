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
public class InterfaceEquipoIT {
    
    public InterfaceEquipoIT() {
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
     * Test of getNombre method, of class InterfaceEquipo.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        InterfaceEquipo instance = new InterfaceEquipoImpl();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipo method, of class InterfaceEquipo.
     */
    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        InterfaceEquipo instance = new InterfaceEquipoImpl();
        String expResult = "";
        String result = instance.getTipo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class InterfaceEquipo.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        InterfaceEquipo instance = new InterfaceEquipoImpl();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipo method, of class InterfaceEquipo.
     */
    @Test
    public void testSetTipo() {
        System.out.println("setTipo");
        String tipo = "";
        InterfaceEquipo instance = new InterfaceEquipoImpl();
        instance.setTipo(tipo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class InterfaceEquipoImpl implements InterfaceEquipo {

        public String getNombre() {
            return "";
        }

        public String getTipo() {
            return "";
        }

        public void setNombre(String nombre) {
        }

        public void setTipo(String tipo) {
        }
    }
    
}
