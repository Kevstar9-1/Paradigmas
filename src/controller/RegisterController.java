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
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

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
    @FXML
    private TextField tf_cedula;

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
        String repassword = tf_repassword.getText();

        if (validarDatos(nombre, apellidos, username, email, password) && password.equals(repassword)) {
            guardarUsuarioEnArchivo(nombre, apellidos, username, email, password);
            mostrarAlerta(AlertType.INFORMATION, "Registro exitoso", "Los datos se han guardado con éxito.");

            // Cerrar la ventana actual
            Stage stage = (Stage) tf_nombre.getScene().getWindow();
            stage.close();

            // Abrir una nueva ventana de inicio de sesión
            abrirVentanaInicioSesion();
        } else if (!password.equals(repassword)) {
            mostrarAlerta(AlertType.ERROR, "Error en el registro", "Las contraseñas no coinciden. Por favor, inténtelo de nuevo.");
        } else {
            mostrarAlerta(AlertType.ERROR, "Error en el registro", "Por favor, complete todos los campos.");
        }

        tf_nombre.clear();
        tf_apellidos.clear();
        tf_username.clear();
        tf_email.clear();
        tf_password.clear();
        tf_repassword.clear();
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

    private void guardarUsuarioEnArchivo(String nombre, String apellidos, String username, String email, String password) {
        String rutaArchivo = "C:\\Users\\Adria\\OneDrive\\Documentos\\GitHub\\Paradigmas\\usuarios.txt";

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