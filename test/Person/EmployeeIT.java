/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Person;

import Book.Book;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Adria
 */
public class EmployeeIT {
    
    public EmployeeIT() {
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
     * Test of getPosition method, of class Employee.
     */
    @Test
    public void testGetPosition() {
        Employee instance = new Employee("Juan");
        String expResult = "Juan"; 
        String result = instance.getPosition();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPosition method, of class Employee.
     */
   @Test
    public void testSetPosition() {
        Employee instance = new Employee();
        String position = "Employee"; 
        instance.setPosition(position);
        String result = instance.getPosition();
        assertEquals(position, result); 
    }

    /**
     * Test of toString method, of class Employee.
     */
    @Test
    public void testToString() {
        Employee instance = new Employee();
        String expResult = "Employee";

        String result = instance.toString();
        assertEquals(expResult, result); 
    }

    /**
     * Test of registerLoan method, of class Employee.
     */
    @Test
    public void testRegisterLoan() {
        System.out.println("registerLoan");
        User user = null;
        Book book = null;
        Employee instance = new Employee();
        Book expResult = null;
        Book result = instance.registerLoan(user, book);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerReturn method, of class Employee.
     */
    @Test
    public void testRegisterReturn() {
        System.out.println("registerReturn");
        User user = null;
        Book book = null;
        Employee instance = new Employee();
        Book expResult = null;
        Book result = instance.registerReturn(user, book);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
