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
        Employee employee = new Employee("Manager");
        assertEquals("Manager", employee.getPosition());
    }

    /**
     * Test of setPosition method, of class Employee.
     */
   @Test
    public void testSetPosition() {
        Employee employee = new Employee();
        employee.setPosition("Supervisor");
        assertEquals("Supervisor", employee.getPosition());
    }
    /**
     * Test of testGetId method, of class Employee.
     */
    @Test
    public void testGetId() {
        Employee employee = new Employee("Manager");
        employee.setId("123");
        assertEquals("123", employee.getId());
    }
    /**
     * Test of testSetName method, of class Employee.
     */
    @Test
    public void testSetName() {
        Employee employee = new Employee("Manager");
        employee.setName("John");
        assertEquals("John", employee.getName());
    }
    /**
     * Test of testSetLastName method, of class Employee.
     */
    @Test
    public void testSetLastName() {
        Employee employee = new Employee("Manager");
        employee.setLastName("Doe");
        assertEquals("Doe", employee.getLastName());
    }
    /**
     * Test of testSetPhone method, of class Employee.
     */
    @Test
    public void testSetPhone() {
        Employee employee = new Employee("Manager");
        employee.setPhone("123456789");
        assertEquals("123456789", employee.getPhone());
    }
    /**
     * Test of testSetEmail method, of class Employee.
     */
    @Test
    public void testSetEmail() {
        Employee employee = new Employee("Manager");
        employee.setEmail("john@example.com");
        assertEquals("john@example.com", employee.getEmail());
    }
    /**
     * Test of testSetAddress method, of class Employee.
     */
    @Test
    public void testSetAddress() {
        Employee employee = new Employee("Manager");
        employee.setAddress("123 Main St");
        assertEquals("123 Main St", employee.getAddress());
    }
    /**
     * Test of testSetUserName method, of class Employee.
     */
    @Test
    public void testSetUserName() {
        Employee employee = new Employee("Manager");
        employee.setUserName("johndoe");
        assertEquals("johndoe", employee.getUserName());
    }
    /**
     * Test of testSetPassword method, of class Employee.
     */
    @Test
    public void testSetPassword() {
        Employee employee = new Employee("Manager");
        employee.setPassword("password");
        assertEquals("password", employee.getPassword());
    }
    /**
     * Test of testSetType method, of class Employee.
     */
    @Test
    public void testSetType() {
        Employee employee = new Employee("Manager");
        employee.setType("Employee");
        assertEquals("Employee", employee.getType());
    }
    
}
