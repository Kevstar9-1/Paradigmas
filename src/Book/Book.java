package Book;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Adria
 */
import Review.Review;
import java.util.List;

public class Book{

    private String title;
    private String author;
    private String genre;
    private boolean available;
    private String categories;
    private String url;
    private String publisher;

    public Book() {
    }

    public Book(String title, String author, String genre, String categories, String publisher, String url) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.available = available;
        this.categories = categories;
        this.publisher = publisher;
        this.url = url;

    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", author=" + author + ", genre=" + genre + ", available=" + available + ", categories=" + categories + ", url=" + url + ", publisher=" + publisher + '}';
    }

    

}
