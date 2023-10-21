package loan;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Adria
 */
import Equipment.Equipment;
import Interface.EquipmentInterface;
import Person.User;
import Interface.BookInterface;
import Book.Book;
import java.util.Date;
import java.util.List;

public class Loan implements BookInterface, EquipmentInterface {

    private Book book;
    private User user;
    private String loanDate;
    private String returnDate;
    private boolean status;
    private Equipment equipment;

    public Loan() {
    }

    /**
     * 
     * @param book
     * @param user
     * @param loanDate
     * @param returnDate
     * @param status
     * @param equipment 
     */
    
    
    

    public Loan( User user, String loanDate, String returnDate) {
        this.book = book;
        this.user = user;
        this.loanDate = loanDate;
        this.returnDate = returnDate;
        this.status = status;
    }


    public Book getBook() {
        return book;
    }

    /**
     * 
     * @param book 
     */
    public void setBook(Book book) {
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    /**
     * 
     * @param user 
     */
    public void setUser(User user) {
        this.user = user;
    }

    public String getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(String loanDate) {
        this.loanDate = loanDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }


    public boolean isStatus() {
        return status;
    }

    /**
     * 
     * @param status 
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    /**
     * 
     * @param equipment 
     */
    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

   

    @Override
    public String toString() {
        return "Loan{" + "book=" + book + ", user=" + user + ", loanDate=" + loanDate + ", returnDate=" + returnDate + ", status=" + status + ", equipment=" + equipment + '}';
    }

    @Override
    public Book addBook(Book book) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Book deleteBook(Book book) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Equipment loanDevice(User user, Equipment equipment) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Equipment returnDevice(Equipment equipment) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Equipment> obtainDeviceAvailable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
