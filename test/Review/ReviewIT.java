/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Review;

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
public class ReviewIT {
    
    public ReviewIT() {
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
     * Test of getBook method, of class Review.
     */
   @Test
    public void testGetBook() {
        System.out.println("getBook");
        Book book = new Book(); // Crear un objeto Book sin un nombre específico
        Review instance = new Review(book, "5 stars", "Great book!");
        Book expResult = book;
        Book result = instance.getBook();
        assertEquals(expResult, result);
    }


    /**
     * Test of setBook method, of class Review.
     */
    @Test
    public void testSetBook() {
        System.out.println("setBook");
        Book book = null;
        Review instance = new Review();
        instance.setBook(book);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getRating method, of class Review.
     */
    @Test
    public void testGetRating() {
        System.out.println("getRating");
        Review instance = new Review(new Book(), "5 stars", "Great review");
        String expResult = "5 stars";
        String result = instance.getRating();
        assertEquals(expResult, result);
    }


    /**
     * Test of setRating method, of class Review.
     */
    @Test
    public void testSetRating() {
        System.out.println("setRating");
        Review instance = new Review();
        String rating = "5 stars";
        instance.setRating(rating);
        String result = instance.getRating(); 
        assertEquals(rating, result); 
    }


    /**
     * Test of getComment method, of class Review.
     */
    @Test
    public void testGetComment() {
        System.out.println("getComment");
        Review instance = new Review(new Book(), "5 stars", "Great review");
        String expResult = "Great review";
        String result = instance.getComment();
        assertEquals(expResult, result);
    }


    /**
     * Test of setComment method, of class Review.
     */
    @Test
    public void testSetComment() {
        System.out.println("setComment");
        Review instance = new Review();
        String comment = "Great review";
        instance.setComment(comment);
        String result = instance.getComment(); 
        assertEquals(comment, result); 
    }

    /**
     * Test of toString method, of class Review.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Review instance = new Review();
        String expResult = "Review{book=null, rating=null, comment=null}";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

}
