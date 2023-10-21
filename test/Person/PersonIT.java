/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Person;

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
public class PersonIT {

    public PersonIT() {
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
     * Test of getId method, of class Person.
     */
    @Test
    public void testGetId() {
        Person person = new Person("123", "John");
        assertEquals("123", person.getId());
    }

    /**
     * Test of testSetId method, of class Person.
     */
    @Test
    public void testSetId() {
        Person person = new Person();
        person.setId("456");
        assertEquals("456", person.getId());
    }

    /**
     * Test of testGetName method, of class Person.
     */
    @Test
    public void testGetName() {
        Person person = new Person("123", "John");
        assertEquals("John", person.getName());
    }

    /**
     * Test of testSetName method, of class Person.
     */
    @Test
    public void testSetName() {
        Person person = new Person();
        person.setName("Alice");
        assertEquals("Alice", person.getName());
    }

    /**
     * Test of testGetLastName method, of class Person.
     */
    @Test
    public void testGetLastName() {
        Person person = new Person("123", "John");
        person.setLastName("Doe");
        assertEquals("Doe", person.getLastName());
    }

    /**
     * Test of testGetPhone method, of class Person.
     */
    @Test
    public void testGetPhone() {
        Person person = new Person("123", "John");
        person.setPhone("123456789");
        assertEquals("123456789", person.getPhone());
    }

    /**
     * Test of testGetEmail method, of class Person.
     */
    @Test
    public void testGetEmail() {
        Person person = new Person("123", "John");
        person.setEmail("john@example.com");
        assertEquals("john@example.com", person.getEmail());
    }

    /**
     * Test of testGetAddress method, of class Person.
     */
    @Test
    public void testGetAddress() {
        Person person = new Person("123", "John");
        person.setAddress("123 Main St");
        assertEquals("123 Main St", person.getAddress());
    }

    /**
     * Test of testGetUserName method, of class Person.
     */
    @Test
    public void testGetUserName() {
        Person person = new Person("123", "John");
        person.setUserName("johndoe");
        assertEquals("johndoe", person.getUserName());
    }

    /**
     * Test of testGetPassword method, of class Person.
     */
    @Test
    public void testGetPassword() {
        Person person = new Person("123", "John");
        person.setPassword("password");
        assertEquals("password", person.getPassword());
    }

    /**
     * Test of testGetType method, of class Person.
     */
    @Test
    public void testGetType() {
        Person person = new Person("123", "John");
        person.setType("User");
        assertEquals("User", person.getType());
    }

    /**
     * Test of testToString method, of class Person.
     */
    @Test
    public void testToString() {
        Person person = new Person("123", "John");
        person.setLastName("Doe");
        person.setPhone("123456789");
        person.setEmail("john@example.com");
        person.setAddress("123 Main St");
        person.setUserName("johndoe");
        person.setPassword("password");
        person.setType("User");

        String expected = "Person{id=123, name=John, lastName=Doe, phone=123456789, email=john@example.com, address=123 Main St, userName=johndoe, password=password, type=User}";
        assertEquals(expected, person.toString());
    }
}
