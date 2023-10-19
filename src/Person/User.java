package Person;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Adria
 */
import Fine.Fine;
import Person.Person;
import java.util.List;

public class User extends Person {

    private List<Fine> fines;

    public User() {
    }

    /**
     * 
     * @param fines 
     */
    public User(List<Fine> fines) {
        this.fines = fines;
    }

    /**
     * 
     * @param fines
     * @param id
     * @param name
     * @param phone
     * @param email
     * @param address 
     */
    public User(List<Fine> fines, String id, String name, String phone, String email, String address) {
        super(id, name, phone, email, address);
        this.fines = fines;
    }

    public List<Fine> getFines() {
        return fines;
    }
    
    /**
     * 
     * @param fines 
     */
    public void setFines(List<Fine> fines) {
        this.fines = fines;
    }
}
