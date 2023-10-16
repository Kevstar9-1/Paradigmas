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
public class LibroIT {
    
    public LibroIT() {
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
     * Test of getTitulo method, of class Libro.
     */
    @Test
    public void testGetTitulo() {
        System.out.println("getTitulo");
        Libro instance = null;
        String expResult = "";
        String result = instance.getTitulo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitulo method, of class Libro.
     */
    @Test
    public void testSetTitulo() {
        System.out.println("setTitulo");
        String titulo = "";
        Libro instance = null;
        instance.setTitulo(titulo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAutor method, of class Libro.
     */
    @Test
    public void testGetAutor() {
        System.out.println("getAutor");
        Libro instance = null;
        Autor expResult = null;
        Autor result = instance.getAutor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAutor method, of class Libro.
     */
    @Test
    public void testSetAutor() {
        System.out.println("setAutor");
        Autor autor = null;
        Libro instance = null;
        instance.setAutor(autor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGenero method, of class Libro.
     */
    @Test
    public void testGetGenero() {
        System.out.println("getGenero");
        Libro instance = null;
        String expResult = "";
        String result = instance.getGenero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGenero method, of class Libro.
     */
    @Test
    public void testSetGenero() {
        System.out.println("setGenero");
        String genero = "";
        Libro instance = null;
        instance.setGenero(genero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isDisponible method, of class Libro.
     */
    @Test
    public void testIsDisponible() {
        System.out.println("isDisponible");
        Libro instance = null;
        boolean expResult = false;
        boolean result = instance.isDisponible();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDisponible method, of class Libro.
     */
    @Test
    public void testSetDisponible() {
        System.out.println("setDisponible");
        boolean disponible = false;
        Libro instance = null;
        instance.setDisponible(disponible);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCategorias method, of class Libro.
     */
    @Test
    public void testGetCategorias() {
        System.out.println("getCategorias");
        Libro instance = null;
        List<Categoria> expResult = null;
        List<Categoria> result = instance.getCategorias();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCategorias method, of class Libro.
     */
    @Test
    public void testSetCategorias() {
        System.out.println("setCategorias");
        List<Categoria> categorias = null;
        Libro instance = null;
        instance.setCategorias(categorias);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEditoriales method, of class Libro.
     */
    @Test
    public void testGetEditoriales() {
        System.out.println("getEditoriales");
        Libro instance = null;
        Editorial expResult = null;
        Editorial result = instance.getEditoriales();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEditoriales method, of class Libro.
     */
    @Test
    public void testSetEditoriales() {
        System.out.println("setEditoriales");
        Editorial editoriales = null;
        Libro instance = null;
        instance.setEditoriales(editoriales);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCriticas method, of class Libro.
     */
    @Test
    public void testGetCriticas() {
        System.out.println("getCriticas");
        Libro instance = null;
        List<Critica> expResult = null;
        List<Critica> result = instance.getCriticas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCriticas method, of class Libro.
     */
    @Test
    public void testSetCriticas() {
        System.out.println("setCriticas");
        List<Critica> criticas = null;
        Libro instance = null;
        instance.setCriticas(criticas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
