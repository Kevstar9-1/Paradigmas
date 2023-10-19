package Interface;

import Equipment.Equipment;
import Person.User;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */ /**
 *
 * @author Ashley Mendoza V
 */
public interface EquipmentInterface {

    /**
     * Realiza un préstamo de un dispositivo a un usuario.
     *
     * @param user El usuario al que se le prestará el dispositivo.
     * @param equipment El dispositivo que se prestará.
     * @return El dispositivo prestado.
     */
    public Equipment loanDevice(User user, Equipment equipment);

    /**
     * Devuelve un dispositivo prestado.
     *
     * @param device El dispositivo que se devolverá.
     * @return El dispositivo devuelto.
     */
    public Equipment returnDevice(Equipment equipment);

    /**
     * Obtiene una lista de dispositivos disponibles para préstamo.
     *
     * @return Una lista de dispositivos disponibles.
     */
    public List<Equipment> obtainDeviceAvailable();
}
