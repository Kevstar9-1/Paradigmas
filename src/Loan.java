/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Adria
 */
import java.util.Date;

public class Loan implements BookInterface, EquipmentInterface {

    private Book book;
    private User user;
    private Date loanDate;
    private Date returnDate;
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
    public Loan(Book book, User user, Date loanDate, Date returnDate, boolean status, Equipment equipment) {
        this.book = book;
        this.user = user;
        this.loanDate = loanDate;
        this.returnDate = returnDate;
        this.status = status;
        this.equipment = equipment;
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

    public Date getLoanDate() {
        return loanDate;
    }

    /**
     * 
     * @param loanDate 
     */
    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    /**
     * 
     * @param returnDate 
     */
    public void setReturnDate(Date returnDate) {
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
    public Author getAuthor() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getTitle() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setAuthor(Author author) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setTitle(String title) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getName() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getType() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setName(String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setType(String type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String toString() {
        return "Loan{" + "book=" + book + ", user=" + user + ", loanDate=" + loanDate + ", returnDate=" + returnDate + ", status=" + status + ", equipment=" + equipment + '}';
    }
    
    
}
