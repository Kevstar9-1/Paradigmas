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
    private int quantity;

    public Equipment() {
    }

    public Equipment(String name, String type, boolean available, int quantity) {
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Equipment{" + "name=" + name + ", type=" + type + ", available=" + available + ", quantity=" + quantity + '}';
    }
    
    
}
