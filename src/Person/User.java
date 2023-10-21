package Person;

import Fine.Fine;
import java.util.List;

public class User extends Person {
    private List<Fine> fines;

    public User() {
    }

    public User(List<Fine> fines, String id, String name, String lastName, String phone, String email, String address, String userName, String password, String type) {
        super(id, name, lastName, phone, email, address, userName, password, type);
        this.fines = fines;
    }

    public List<Fine> getFines() {
        return fines;
    }

    public void setFines(List<Fine> fines) {
        this.fines = fines;
    }
}
