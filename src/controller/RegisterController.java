/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Adria
 */
public class RegisterController implements Initializable {

    @FXML
    private TextField tf_nombre;
    @FXML
    private TextField tf_apellidos;
    @FXML
    private TextField tf_username;
    @FXML
    private TextField tf_email;
    @FXML
    private PasswordField tf_password;
    @FXML
    private PasswordField tf_repassword;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onRegistrar(ActionEvent event) {
        String nombre = tf_nombre.getText();
        String apellidos = tf_apellidos.getText();
        String username = tf_username.getText();
        String email = tf_email.getText();
        String password = tf_password.getText();

        // Validación de datos (puedes agregar tu lógica de validación aquí)

        if (!nombre.isEmpty() && !apellidos.isEmpty() && !username.isEmpty() && !email.isEmpty() && !password.isEmpty()) {
            // Luego, guarda los datos en un archivo .txt
            guardarUsuarioEnArchivo(nombre, apellidos, username, email, password);
        } else {
            // Mostrar mensaje de error al usuario si falta información
        }
    }
    
    private void guardarUsuarioEnArchivo(String nombre, String apellidos, String username, String email, String password) {
        String rutaArchivo = "C:\\Documentos\\PARADIGMAS DE PROGRAMACION\\Base de datos para proyecto#2\\usuarios.txt";
        
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo, true));
            writer.write(nombre + ", " + apellidos + ", " + username + ", " + email + ", " + password);
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            // Manejo de excepciones si ocurre algún error al guardar en el archivo
            e.printStackTrace();
        }
    }
    
}
