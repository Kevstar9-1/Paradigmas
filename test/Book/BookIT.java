/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Book;

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
public class BookIT {
    
    public BookIT() {
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
     * Test of getGenre method, of class Book.
     */
    @Test
    public void testGetGenre() {
        System.out.println("getGenre");
        String expectedGenre = "Fiction";
        Book instance = new Book();
        instance.setGenre(expectedGenre);
        String result = instance.getGenre();
        assertEquals(expectedGenre, result);
    }


    /**
     * Test of setGenre method, of class Book.
     */
    @Test
    public void testSetGenre() {
        Book book = new Book();
        book.setGenre("Paperback");
        assertEquals("Paperback", book.getGenre());
     
    }

    /**
     * Test of isAvailable method, of class Book.
     */
    @Test
    public void testIsAvailable() {
        System.out.println("isAvailable");
        Book instance = new Book();
        instance.setAvailable(false);
        boolean expResult = false;
        boolean result = instance.isAvailable();
        assertEquals(expResult, result);
    }


    /**
     * Test of setAvailable method, of class Book.
     */
    @Test
    public void testSetAvailable() {
        System.out.println("setAvailable");
        boolean available = false; 
        Book instance = new Book();
        instance.setAvailable(available);
        boolean result = instance.isAvailable(); 
        assertEquals(available, result);
    }


    /**
     * Test of getCategories method, of class Book.
     */
    @Test
    public void testGetCategories() {
        System.out.println("getCategories");
        Book instance = new Book();

        instance.setCategories("Fiction, Mystery");
        String expectedCategories = "Fiction, Mystery"; // Define las categorías esperadas
        String result = instance.getCategories();
        assertEquals(expectedCategories, result);
    }


    /**
     * Test of setCategories method, of class Book.
     */
    @Test
    public void testSetCategories() {
        System.out.println("setCategories");
        String categories = "Fiction, Mystery, Thriller";
        Book instance = new Book();
        instance.setCategories(categories);
        String result = instance.getCategories();
        assertEquals(categories, result);
    }


    /**
     * Test of getPublisher method, of class Book.
     */
    @Test
    public void testGetPublisher() {
        System.out.println("getPublisher");
        Book instance = new Book();

        String expectedPublisher = "Bantom";
        instance.setPublisher(expectedPublisher);

        String result = instance.getPublisher();
        assertEquals(expectedPublisher, result);
    }
    /**
     * Test of setPublisher method, of class Book.
     */
    @Test
    public void testSetPublisher() {
    System.out.println("setPublisher");
    String publisher = "Example Publisher"; 
    Book instance = new Book();
    instance.setPublisher(publisher);
    String result = instance.getPublisher();
    assertEquals(publisher, result);
}


    /**
     * Test of getUrl method, of class Book.
     */
    @Test
    public void testGetUrl() {
        System.out.println("getUrl");
        Book instance = new Book();
        String expectedUrl = "http://example.com/book123"; 
        instance.setUrl(expectedUrl);
        String result = instance.getUrl();
        assertEquals(expectedUrl, result);
    }


    /**
     * Test of setUrl method, of class Book.
     */
    @Test
    public void testSetUrl() {
        System.out.println("setUrl");
        String url = "http://example.com/book123";
        Book instance = new Book();
        instance.setUrl(url);
        String result = instance.getUrl();
        assertEquals(url, result);
    }


    /**
     * Test of getTitle method, of class Book.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        Book instance = new Book();
        String expectedTitle = "Fuego y sangre";
        instance.setTitle(expectedTitle);
        String result = instance.getTitle();
        assertEquals(expectedTitle, result);
    }


    /**
     * Test of setTitle method, of class Book.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String title = "Fuego y sangre";
        Book instance = new Book();
        instance.setTitle(title);
        String result = instance.getTitle();
        assertEquals(title, result);
    }


    /**
     * Test of getAuthor method, of class Book.
     */
    @Test
    public void testGetAuthor() {
        System.out.println("getAuthor");
        Book instance = new Book();
        String expectedAuthor = "John Doe"; 
        instance.setAuthor(expectedAuthor);
        String result = instance.getAuthor();
        assertEquals(expectedAuthor, result);
    }

    @Test
    public void testSetAuthor() {
        System.out.println("setAuthor");
        String author = "Jane Smith"; 
        Book instance = new Book();
        instance.setAuthor(author);
        String result = instance.getAuthor(); // Suponiendo que la clase Book tiene un método getAuthor para obtener el autor
        assertEquals(author, result);
    }
    @Test
    public void testToString() {
        System.out.println("toString");
        Book instance = new Book();

        instance.setTitle("Example Book Title");
        instance.setAuthor("John Doe");
        instance.setPublisher("Example Publisher");
        instance.setCategories("Fiction, Mystery");
        instance.setUrl("http://example.com/book123");
        
        String expectedString = "Book{title=Example Book Title, author=John Doe, genre=null, available=false, categories=Fiction, Mystery, url=http://example.com/book123, publisher=Example Publisher}";
        String result = instance.toString();
        assertEquals(expectedString, result);
    }

}
