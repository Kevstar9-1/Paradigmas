/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import DB.conexionDB;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.StringTokenizer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

/**
 * FXML Controller class
 *
 * @author Adria
 */
public class LoginController implements Initializable {

    @FXML
    private TextField tf_username;
    @FXML
    private PasswordField tf_password;

    conexionDB DB_Connection = conexionDB.getconnector();
    Connection connection = DB_Connection.getConn();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void onLogin(ActionEvent event) {
        String username = tf_username.getText();
        String password = tf_password.getText();

        if (username.isEmpty() || password.isEmpty()) {
            mostrarAlerta(AlertType.ERROR, "Error de inicio de sesión", "Por favor, complete todos los campos.");
        } else {
            String userType = getUserType(username, password);

            if (userType.equals("Empleado")) {
                mostrarAlerta(AlertType.INFORMATION, "Inicio de sesión exitoso", "¡Bienvenido, " + username + "!");
                cambiarAPantallaHome(event, "/view/home.fxml");
            } else if (userType.equals("Normal")) {
                mostrarAlerta(AlertType.INFORMATION, "Inicio de sesión exitoso", "¡Bienvenido, " + username + "!");
                cambiarAPantallaHome(event, "/view/homeClient.fxml");
            } else {
                mostrarAlerta(AlertType.ERROR, "Error de inicio de sesión", "Credenciales incorrectas.");
            }
        }
    }

    private String getUserType(String username, String password) {
        try {
            String selectQuery = "SELECT type FROM persons WHERE userName = ? AND pass = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                return resultSet.getString("type");
            }
        } catch (SQLException e) {
            System.out.println("Error al realizar la consulta en la base de datos.");
            e.printStackTrace();
        }

        return "No Encontrado"; // Puedes ajustar este valor predeterminado según tus necesidades
    }

    private void cambiarAPantallaHome(ActionEvent event, String fxmlPath) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setTitle("Pantalla de inicio");
            stage.setScene(new Scene(root));
            stage.show();

            Stage loginStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            loginStage.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void cambiarAPantallaHome(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/home.fxml"));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setTitle("Pantalla de inicio");
            stage.setScene(new Scene(root));
            stage.show();

            Stage loginStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            loginStage.close();
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

    private boolean validarCredenciales(String username, String password) {

        try {
            String selectQuery = "SELECT * FROM persons WHERE userName = ? AND pass = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            ResultSet resultSet = preparedStatement.executeQuery();

            // Si la consulta devuelve algún resultado, significa que el usuario y la contraseña existen en la base de datos.
            return resultSet.next();
        } catch (SQLException e) {
            System.out.println("Error al realizar la consulta en la base de datos.");
            e.printStackTrace();
        }

        return false;
    }

    @FXML
    private void onRegistrar(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/user.fxml"));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setTitle("Registro de usuarios");
            stage.setScene(new Scene(root));
            stage.show();

            Stage loginStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            loginStage.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
