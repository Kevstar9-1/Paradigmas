/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Equipment;

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
public class EquipmentIT {
    
    public EquipmentIT() {
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
     * Test of isAvailable method, of class Equipment.
     */
    @Test
    public void testIsAvailable() {
        System.out.println("isAvailable");
        Equipment instance = new Equipment();
        instance.setAvailable(false);
        boolean expResult = false;
        boolean result = instance.isAvailable();
        assertEquals(expResult, result);
    }


    /**
     * Test of setAvailable method, of class Equipment.
     */
    @Test
    public void testSetAvailable() {
        System.out.println("setAvailable");
        boolean available = false;
        Equipment instance = new Equipment();
        instance.setAvailable(available);
    }



    /**
     * Test of getName method, of class Equipment.
     */
   @Test
    public void testGetName() {
        System.out.println("getName");
        Equipment instance = new Equipment();
       
        String expectedName = "Example Equipment Name"; 
        instance.setName(expectedName);

        String result = instance.getName();
        assertEquals(expectedName, result);
    }


    /**
     * Test of setName method, of class Equipment.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Example Equipment Name";
        Equipment instance = new Equipment();
        instance.setName(name);

        String result = instance.getName();
        assertEquals(name, result);
}


    /**
     * Test of getType method, of class Equipment.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Equipment instance = new Equipment();

        // Establecer el tipo esperado en la instancia
        String expectedType = "Example Equipment Type"; // Reemplaza con el tipo deseado
        instance.setType(expectedType);
        String result = instance.getType();
        assertEquals(expectedType, result);
    }


    /**
     * Test of setType method, of class Equipment.
     */
   @Test
    public void testSetType() {
        System.out.println("setType");
        String type = "Example Equipment Type"; 
        Equipment instance = new Equipment();
        instance.setType(type);

        String result = instance.getType();
        assertEquals(type, result);
    }


    /**
     * Test of getQuantity method, of class Equipment.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        int expectedQuantity = 10; 
        int result = expectedQuantity;
        assertEquals(expectedQuantity, result);
    }

    /**
     * Test of setQuantity method, of class Equipment.
     */
    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        int expectedQuantity = 10; // Define la cantidad que deseas establecer
        Equipment instance = new Equipment();

        int result = expectedQuantity;
        assertEquals(expectedQuantity, result);
    }

    /**
     * Test of toString method, of class Equipment.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Equipment instance = new Equipment();

        String result = instance.toString();
        assertNotNull(result);
    }

}
