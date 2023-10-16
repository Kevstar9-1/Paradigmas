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
public class BibliotecaIT {
    
    public BibliotecaIT() {
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
     * Test of getLibros method, of class Biblioteca.
     */
    @Test
    public void testGetLibros() {
        System.out.println("getLibros");
        Biblioteca instance = new Biblioteca();
        List<Libro> expResult = null;
        List<Libro> result = instance.getLibros();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLibros method, of class Biblioteca.
     */
    @Test
    public void testSetLibros() {
        System.out.println("setLibros");
        List<Libro> libros = null;
        Biblioteca instance = new Biblioteca();
        instance.setLibros(libros);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrestamos method, of class Biblioteca.
     */
    @Test
    public void testGetPrestamos() {
        System.out.println("getPrestamos");
        Biblioteca instance = new Biblioteca();
        List<Prestamo> expResult = null;
        List<Prestamo> result = instance.getPrestamos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrestamos method, of class Biblioteca.
     */
    @Test
    public void testSetPrestamos() {
        System.out.println("setPrestamos");
        List<Prestamo> prestamos = null;
        Biblioteca instance = new Biblioteca();
        instance.setPrestamos(prestamos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEquipos method, of class Biblioteca.
     */
    @Test
    public void testGetEquipos() {
        System.out.println("getEquipos");
        Biblioteca instance = new Biblioteca();
        List<Equipo> expResult = null;
        List<Equipo> result = instance.getEquipos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEquipos method, of class Biblioteca.
     */
    @Test
    public void testSetEquipos() {
        System.out.println("setEquipos");
        List<Equipo> equipos = null;
        Biblioteca instance = new Biblioteca();
        instance.setEquipos(equipos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registrarLibro method, of class Biblioteca.
     */
    @Test
    public void testRegistrarLibro() {
        System.out.println("registrarLibro");
        Libro libro = null;
        Biblioteca instance = new Biblioteca();
        Libro expResult = null;
        Libro result = instance.registrarLibro(libro);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registrarUsuario method, of class Biblioteca.
     */
    @Test
    public void testRegistrarUsuario() {
        System.out.println("registrarUsuario");
        Usuario usuario = null;
        Biblioteca instance = new Biblioteca();
        Usuario expResult = null;
        Usuario result = instance.registrarUsuario(usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registrarEmpleado method, of class Biblioteca.
     */
    @Test
    public void testRegistrarEmpleado() {
        System.out.println("registrarEmpleado");
        Empleado empleados = null;
        Biblioteca instance = new Biblioteca();
        Empleado expResult = null;
        Empleado result = instance.registrarEmpleado(empleados);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prestarLibro method, of class Biblioteca.
     */
    @Test
    public void testPrestarLibro() {
        System.out.println("prestarLibro");
        Libro libro = null;
        Usuario usuario = null;
        Biblioteca instance = new Biblioteca();
        Usuario expResult = null;
        Usuario result = instance.prestarLibro(libro, usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pretarEquipo method, of class Biblioteca.
     */
    @Test
    public void testPretarEquipo() {
        System.out.println("pretarEquipo");
        Equipo equipos = null;
        Usuario usuarios = null;
        Biblioteca instance = new Biblioteca();
        Usuario expResult = null;
        Usuario result = instance.pretarEquipo(equipos, usuarios);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarLibro method, of class Biblioteca.
     */
    @Test
    public void testBuscarLibro() {
        System.out.println("buscarLibro");
        String titulo = "";
        String autor = "";
        String genero = "";
        Biblioteca instance = new Biblioteca();
        String expResult = "";
        String result = instance.buscarLibro(titulo, autor, genero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarLibroTitulo method, of class Biblioteca.
     */
    @Test
    public void testBuscarLibroTitulo() {
        System.out.println("buscarLibroTitulo");
        String titulo = "";
        Biblioteca instance = new Biblioteca();
        String expResult = "";
        String result = instance.buscarLibroTitulo(titulo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarLibroAutor method, of class Biblioteca.
     */
    @Test
    public void testBuscarLibroAutor() {
        System.out.println("buscarLibroAutor");
        String autor = "";
        Biblioteca instance = new Biblioteca();
        String expResult = "";
        String result = instance.buscarLibroAutor(autor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarLibroGenero method, of class Biblioteca.
     */
    @Test
    public void testBuscarLibroGenero() {
        System.out.println("buscarLibroGenero");
        String genero = "";
        Biblioteca instance = new Biblioteca();
        String expResult = "";
        String result = instance.buscarLibroGenero(genero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
