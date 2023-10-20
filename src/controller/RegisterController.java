/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import DB.conexionDB;
import Person.Person;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Adria
 */
public class RegisterController implements Initializable {

    @FXML
    private TextField tf_name;
    @FXML
    private TextField tf_lastName;
    @FXML
    private TextField tf_username;
    @FXML
    private TextField tf_email;
    @FXML
    private PasswordField tf_password;
    @FXML
    private PasswordField tf_repassword;
    @FXML
    private TextField tf_cedula;
    
    Person person;

    conexionDB DB_Connection = conexionDB.getconnector();
    Connection connection = DB_Connection.getConn();
    @FXML
    private TextField tf_address;
    @FXML
    private ComboBox<String> cb_typeUser;
    @FXML
    private TextField tf_phone;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cb_typeUser.getItems().add("Empleado");
        cb_typeUser.getItems().add("Usuario Normal");
    }

    @FXML
    private void onRegistrar(ActionEvent event) {
        String nombre = tf_name.getText();
        String apellidos = tf_lastName.getText();
        String username = tf_username.getText();
        String email = tf_email.getText();
        String password = tf_password.getText();
        String repassword = tf_repassword.getText();

        if (validarDatos(nombre, apellidos, username, email, password) && password.equals(repassword)) {
            saveUser();
            mostrarAlerta(AlertType.INFORMATION, "Registro exitoso", "Los datos se han guardado con éxito.");

            // Cerrar la ventana actual
            Stage stage = (Stage) tf_name.getScene().getWindow();
            stage.close();

            // Abrir una nueva ventana de inicio de sesión
            abrirVentanaInicioSesion();
        } else if (!password.equals(repassword)) {
            mostrarAlerta(AlertType.ERROR, "Error en el registro", "Las contraseñas no coinciden. Por favor, inténtelo de nuevo.");
        } else {
            mostrarAlerta(AlertType.ERROR, "Error en el registro", "Por favor, complete todos los campos.");
        }

        tf_name.clear();
        tf_lastName.clear();
        tf_username.clear();
        tf_email.clear();
        tf_password.clear();
        tf_repassword.clear();
        tf_cedula.clear();
        tf_address.clear();
        tf_phone.clear();
    }

    private void abrirVentanaInicioSesion() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/login.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);

            Stage stage = new Stage();
            stage.setTitle("Inicio de Sesión");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void mostrarAlerta(AlertType tipo, String titulo, String contenido) {
        Alert alert = new Alert(tipo);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(contenido);
        alert.showAndWait();
    }

    private boolean validarDatos(String nombre, String apellidos, String username, String email, String password) {
        return !nombre.isEmpty() && !apellidos.isEmpty() && !username.isEmpty() && !email.isEmpty() && !password.isEmpty();
    }

    private void saveUser() {
        person = new Person(tf_cedula.getText(), tf_name.getText(), tf_name.getText(),
                tf_phone.getText(), tf_email.getText(), tf_address.getText(), tf_username.getText(),
                tf_password.getText(), cb_typeUser.getValue());

        int rows = 0;
        try {
            String insertQuery = "INSERT INTO persons (id, name, lastName, "
                    + "userName, phone, email, address, pass, type)"
                    + "VALUES (?, ?, ?, ?, ?, ?,?,?, ?)";

            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, person.getId());
            preparedStatement.setString(2, person.getName());
            preparedStatement.setString(3, person.getLastName());
            preparedStatement.setString(4, person.getUserName());
            preparedStatement.setString(5, person.getPhone());
            preparedStatement.setString(6, person.getEmail());
            preparedStatement.setString(7, person.getAddress());
            preparedStatement.setString(8, person.getPassword());
            if (cb_typeUser.getValue().equals("Empleado")) {
                preparedStatement.setString(9, "Empleado");
            } else {
                preparedStatement.setString(9, "Normal");
            }

            rows = preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println("Error al insertar datos.");
            e.printStackTrace();
        }
    }

    @FXML
    private void onRegresar(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/login.fxml"));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setTitle("Inicio de Sesión");
            stage.setScene(new Scene(root));
            stage.show();

            Stage loginStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            loginStage.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
