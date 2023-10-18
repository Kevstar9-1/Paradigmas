/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Adria
 */
import java.util.Date;

public class Fine {

    private int amount;
    private User user;
    private Date fineDate;
    private Date paymentDate;
    private Date dueDate;
    private String comment;

    public double applyFine(User user, Book book, double amount) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Fine() {
    }

    public Fine(int amount, User user, Date fineDate, Date paymentDate, Date dueDate, String comment) {
        this.amount = amount;
        this.user = user;
        this.fineDate = fineDate;
        this.paymentDate = paymentDate;
        this.dueDate = dueDate;
        this.comment = comment;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getFineDate() {
        return fineDate;
    }

    public void setFineDate(Date fineDate) {
        this.fineDate = fineDate;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
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
