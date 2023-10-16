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
public class AutorIT {
    
    public AutorIT() {
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
     * Test of getId method, of class Autor.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Autor instance = new Autor();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Autor.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Autor instance = new Autor();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Autor.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Autor instance = new Autor();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Autor.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Autor instance = new Autor();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNacionalidad method, of class Autor.
     */
    @Test
    public void testGetNacionalidad() {
        System.out.println("getNacionalidad");
        Autor instance = new Autor();
        String expResult = "";
        String result = instance.getNacionalidad();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setNacionalidad method, of class Autor.
     */
    @Test
    public void testSetNacionalidad() {
        System.out.println("setNacionalidad");
        String nacionalidad = "";
        Autor instance = new Autor();
        instance.setNacionalidad(nacionalidad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
