package Person;

import Person.Person;
import Book.Book;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Adria
 */
public class Employee extends Person {

    private String position;

    public Employee() {
    }

    public Employee(String position) {
        this.position = position;
    }

    public Employee(String position, String id, String name, String lastName, String phone, String email, String address, String userName, String password, String type) {
        super(id, name, lastName, phone, email, address, userName, password, type);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" + "position=" + position + '}';
    }

    public Book registerLoan(User user, Book book) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Book registerReturn(User user, Book book) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
