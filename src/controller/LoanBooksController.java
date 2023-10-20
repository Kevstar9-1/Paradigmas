/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Adria
 */
public class LoanBooksController implements Initializable {

    @FXML
    private TextField tf_userName;
    @FXML
    private TextField tf_titleBookLoan;
    @FXML
    private TextField tf_authorBookLoan;
    @FXML
    private TextField tf_dateLoan;
    @FXML
    private TextField tf_returnDateLoan;
    @FXML
    private Button btn_addBookLoan;
    @FXML
    private Button btn_back;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void onAddBookLoan(ActionEvent event) {
        String userName = tf_userName.getText();
        String titleBookLoan = tf_titleBookLoan.getText();
        String authorBookLoan = tf_authorBookLoan.getText();
        String dateLoan = tf_dateLoan.getText();
        String returnDateLoan = tf_returnDateLoan.getText();

        if (userName.isEmpty() || titleBookLoan.isEmpty() || authorBookLoan.isEmpty() || dateLoan.isEmpty() || returnDateLoan.isEmpty()) {
            showAlert("Error de agregar", "Por favor ingrese todos los datos.");
        } else {

        }
        
        tf_userName.clear();
        tf_titleBookLoan.clear();
        tf_authorBookLoan.clear();
        tf_dateLoan.clear();
        tf_returnDateLoan.clear();
    }

    @FXML
    private void onRegresar(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/home.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setTitle("Inicio");
            stage.setScene(new Scene(root));
            stage.show();
            Stage loginStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            loginStage.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(AlertType.WARNING);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }

}
