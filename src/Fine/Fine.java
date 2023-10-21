package Fine;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Adria
 */
import Person.User;
import Book.Book;
import java.util.Date;

public class Fine {

    private String amount;
    private User user;
    private String fineDate;
    private String paymentDate;
    private String dueDate;
    private String comment;

    public double applyFine(User user, Book book, double amount) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Fine() {
    }

    public Fine(String amount, User user, String fineDate, String paymentDate, String dueDate, String comment) {
        this.amount = amount;
        this.user = user;
        this.fineDate = fineDate;
        this.paymentDate = paymentDate;
        this.dueDate = dueDate;
        this.comment = comment;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getFineDate() {
        return fineDate;
    }

    public void setFineDate(String fineDate) {
        this.fineDate = fineDate;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Fine{" + "amount=" + amount + ", user=" + user + ", fineDate=" + fineDate + ", paymentDate=" + paymentDate + ", dueDate=" + dueDate + ", comment=" + comment + '}';
    }
    
    
}
