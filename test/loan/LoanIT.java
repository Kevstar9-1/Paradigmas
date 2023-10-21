/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package loan;

import Book.Book;
import Equipment.Equipment;
import Person.User;
import java.util.List;
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
public class LoanIT {
    
    public LoanIT() {
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
     * Test of getBook method, of class Loan.
     */
    @Test
    public void testGetBook() {
        System.out.println("getBook");
        Loan instance = new Loan();
        Book expResult = null;
        Book result = instance.getBook();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBook method, of class Loan.
     */
    @Test
    public void testSetBook() {
        System.out.println("setBook");
        Book book = null;
        Loan instance = new Loan();
        instance.setBook(book);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUser method, of class Loan.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        Loan instance = new Loan();
        User expResult = null;
        User result = instance.getUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUser method, of class Loan.
     */
    @Test
    public void testSetUser() {
        System.out.println("setUser");
        User user = null;
        Loan instance = new Loan();
        instance.setUser(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLoanDate method, of class Loan.
     */
    @Test
    public void testGetLoanDate() {
        System.out.println("getLoanDate");
        Loan instance = new Loan();
        String expResult = "";
        String result = instance.getLoanDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLoanDate method, of class Loan.
     */
    @Test
    public void testSetLoanDate() {
        System.out.println("setLoanDate");
        String loanDate = "";
        Loan instance = new Loan();
        instance.setLoanDate(loanDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReturnDate method, of class Loan.
     */
    @Test
    public void testGetReturnDate() {
        System.out.println("getReturnDate");
        Loan instance = new Loan();
        String expResult = "";
        String result = instance.getReturnDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReturnDate method, of class Loan.
     */
    @Test
    public void testSetReturnDate() {
        System.out.println("setReturnDate");
        String returnDate = "";
        Loan instance = new Loan();
        instance.setReturnDate(returnDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isStatus method, of class Loan.
     */
    @Test
    public void testIsStatus() {
        System.out.println("isStatus");
        Loan instance = new Loan();
        boolean expResult = false;
        boolean result = instance.isStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatus method, of class Loan.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        boolean status = false;
        Loan instance = new Loan();
        instance.setStatus(status);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEquipment method, of class Loan.
     */
    @Test
    public void testGetEquipment() {
        System.out.println("getEquipment");
        Loan instance = new Loan();
        Equipment expResult = null;
        Equipment result = instance.getEquipment();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEquipment method, of class Loan.
     */
    @Test
    public void testSetEquipment() {
        System.out.println("setEquipment");
        Equipment equipment = null;
        Loan instance = new Loan();
        instance.setEquipment(equipment);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Loan.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Loan instance = new Loan();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addBook method, of class Loan.
     */
    @Test
    public void testAddBook() {
        System.out.println("addBook");
        Book book = null;
        Loan instance = new Loan();
        Book expResult = null;
        Book result = instance.addBook(book);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteBook method, of class Loan.
     */
    @Test
    public void testDeleteBook() {
        System.out.println("deleteBook");
        Book book = null;
        Loan instance = new Loan();
        Book expResult = null;
        Book result = instance.deleteBook(book);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loanDevice method, of class Loan.
     */
    @Test
    public void testLoanDevice() {
        System.out.println("loanDevice");
        User user = null;
        Equipment equipment = null;
        Loan instance = new Loan();
        Equipment expResult = null;
        Equipment result = instance.loanDevice(user, equipment);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnDevice method, of class Loan.
     */
    @Test
    public void testReturnDevice() {
        System.out.println("returnDevice");
        Equipment equipment = null;
        Loan instance = new Loan();
        Equipment expResult = null;
        Equipment result = instance.returnDevice(equipment);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtainDeviceAvailable method, of class Loan.
     */
    @Test
    public void testObtainDeviceAvailable() {
        System.out.println("obtainDeviceAvailable");
        Loan instance = new Loan();
        List<Equipment> expResult = null;
        List<Equipment> result = instance.obtainDeviceAvailable();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
