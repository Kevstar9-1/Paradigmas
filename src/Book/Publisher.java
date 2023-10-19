package Book;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import Book.Book;
import java.util.List;

public class Publisher {

    private String name;
    private List<Book> publishedBooks;
    private String address;
    private String email;
    private int phone;

    public Publisher() {
    }

    public Publisher(String name, List<Book> publishedBooks, String address, String email, int phone) {
        this.name = name;
        this.publishedBooks = publishedBooks;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getPublishedBooks() {
        return publishedBooks;
    }

    public void setPublishedBooks(List<Book> publishedBooks) {
        this.publishedBooks = publishedBooks;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Publisher{" + "name=" + name + ", publishedBooks=" + publishedBooks + ", address=" + address + ", email=" + email + ", phone=" + phone + '}';
    }
    
    
}

