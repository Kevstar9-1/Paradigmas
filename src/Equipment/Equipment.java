package Equipment;


import Interface.EquipmentInterface;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Adria
 */
public class Equipment  {

    private String name;
    private String type;
    private boolean available;
    private String quantity;

    public Equipment() {
    }

    public Equipment(String name, String type, String quantity) {
        this.name = name;
        this.type = type;
        this.available = available;
        this.quantity = quantity;
    }


    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    

    @Override
    public String toString() {
        return "Equipment{" + "name=" + name + ", type=" + type + ", available=" + available + ", quantity=" + quantity + '}';
    }
    
    
}
