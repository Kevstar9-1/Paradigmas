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
public class PrestamoIT {
    
    public PrestamoIT() {
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
     * Test of getLibro method, of class Prestamo.
     */
    @Test
    public void testGetLibro() {
        System.out.println("getLibro");
        Prestamo instance = new Prestamo();
        Libro expResult = null;
        Libro result = instance.getLibro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLibro method, of class Prestamo.
     */
    @Test
    public void testSetLibro() {
        System.out.println("setLibro");
        Libro libro = null;
        Prestamo instance = new Prestamo();
        instance.setLibro(libro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsuario method, of class Prestamo.
     */
    @Test
    public void testGetUsuario() {
        System.out.println("getUsuario");
        Prestamo instance = new Prestamo();
        Usuario expResult = null;
        Usuario result = instance.getUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsuario method, of class Prestamo.
     */
    @Test
    public void testSetUsuario() {
        System.out.println("setUsuario");
        Usuario usuario = null;
        Prestamo instance = new Prestamo();
        instance.setUsuario(usuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaPrestado method, of class Prestamo.
     */
    @Test
    public void testGetFechaPrestado() {
        System.out.println("getFechaPrestado");
        Prestamo instance = new Prestamo();
        Date expResult = null;
        Date result = instance.getFechaPrestado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaPrestado method, of class Prestamo.
     */
    @Test
    public void testSetFechaPrestado() {
        System.out.println("setFechaPrestado");
        Date fechaPrestado = null;
        Prestamo instance = new Prestamo();
        instance.setFechaPrestado(fechaPrestado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaDevolucion method, of class Prestamo.
     */
    @Test
    public void testGetFechaDevolucion() {
        System.out.println("getFechaDevolucion");
        Prestamo instance = new Prestamo();
        Date expResult = null;
        Date result = instance.getFechaDevolucion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaDevolucion method, of class Prestamo.
     */
    @Test
    public void testSetFechaDevolucion() {
        System.out.println("setFechaDevolucion");
        Date fechaDevolucion = null;
        Prestamo instance = new Prestamo();
        instance.setFechaDevolucion(fechaDevolucion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEstado method, of class Prestamo.
     */
    @Test
    public void testIsEstado() {
        System.out.println("isEstado");
        Prestamo instance = new Prestamo();
        boolean expResult = false;
        boolean result = instance.isEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class Prestamo.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        boolean estado = false;
        Prestamo instance = new Prestamo();
        instance.setEstado(estado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEquipo method, of class Prestamo.
     */
    @Test
    public void testGetEquipo() {
        System.out.println("getEquipo");
        Prestamo instance = new Prestamo();
        Equipo expResult = null;
        Equipo result = instance.getEquipo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEquipo method, of class Prestamo.
     */
    @Test
    public void testSetEquipo() {
        System.out.println("setEquipo");
        Equipo equipo = null;
        Prestamo instance = new Prestamo();
        instance.setEquipo(equipo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAutor method, of class Prestamo.
     */
    @Test
    public void testGetAutor() {
        System.out.println("getAutor");
        Prestamo instance = new Prestamo();
        Autor expResult = null;
        Autor result = instance.getAutor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitulo method, of class Prestamo.
     */
    @Test
    public void testGetTitulo() {
        System.out.println("getTitulo");
        Prestamo instance = new Prestamo();
        String expResult = "";
        String result = instance.getTitulo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAutor method, of class Prestamo.
     */
    @Test
    public void testSetAutor() {
        System.out.println("setAutor");
        Autor autor = null;
        Prestamo instance = new Prestamo();
        instance.setAutor(autor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitulo method, of class Prestamo.
     */
    @Test
    public void testSetTitulo() {
        System.out.println("setTitulo");
        String titulo = "";
        Prestamo instance = new Prestamo();
        instance.setTitulo(titulo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Prestamo.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Prestamo instance = new Prestamo();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipo method, of class Prestamo.
     */
    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        Prestamo instance = new Prestamo();
        String expResult = "";
        String result = instance.getTipo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Prestamo.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Prestamo instance = new Prestamo();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipo method, of class Prestamo.
     */
    @Test
    public void testSetTipo() {
        System.out.println("setTipo");
        String tipo = "";
        Prestamo instance = new Prestamo();
        instance.setTipo(tipo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
