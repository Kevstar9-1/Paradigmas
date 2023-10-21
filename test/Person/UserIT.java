/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Person;

import Fine.Fine;
import java.util.ArrayList;
import java.util.Collections;
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
public class UserIT {
    
    public UserIT() {
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
     * Test of getFines method, of class User.
     */
     @Test
    public void testGetFines() {
        User instance = new User(); 
        assertNotNull(instance.getFines()); 
        assertEquals(0, instance.getFines().size()); 
    }


    /**
     * Test of setFines method, of class User.
     */
    @Test
    public void testSetFines() {
        System.out.println("setFines");
        List<Fine> fines = null;
        User instance = new User();
        instance.setFines(fines);
        
    }
    
}
