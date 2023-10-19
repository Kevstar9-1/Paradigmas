package Review;


import Book.Book;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Adria
 */
public class Review {

    private Book book;
    private int rating;
    private String comment;

    public Review() {
    }

    public Review(Book book, int rating, String comment) {
        this.book = book;
        this.rating = rating;
        this.comment = comment;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Review{" + "book=" + book + ", rating=" + rating + ", comment=" + comment + '}';
    }
    
    
    
}

