/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import java.util.List;
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
public class UsuarioIT {
    
    public UsuarioIT() {
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
     * Test of getMultas method, of class Usuario.
     */
    @Test
    public void testGetMultas() {
        System.out.println("getMultas");
        Usuario instance = new Usuario();
        List<Multa> expResult = null;
        List<Multa> result = instance.getMultas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMultas method, of class Usuario.
     */
    @Test
    public void testSetMultas() {
        System.out.println("setMultas");
        List<Multa> multas = null;
        Usuario instance = new Usuario();
        instance.setMultas(multas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
