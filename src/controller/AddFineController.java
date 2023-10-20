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
public class AddFineController implements Initializable {

    @FXML
    private TextField name;
    @FXML
    private TextField amountFine;
    @FXML
    private TextField fineDate;
    @FXML
    private TextField paymentDate;
    @FXML
    private TextField dueDate;
    @FXML
    private TextField descriptionFine;
    @FXML
    private Button btnAddFine;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void onAddFine(ActionEvent event) {
        String nameText = name.getText();
        String amountFineText = amountFine.getText();
        String fineDateText = fineDate.getText();
        String paymentDateText = paymentDate.getText();
        String dueDateText = dueDate.getText();
        String descriptionFineText = descriptionFine.getText();

        if (nameText.isEmpty() || amountFineText.isEmpty() || fineDateText.isEmpty()
                || paymentDateText.isEmpty() || dueDateText.isEmpty() || descriptionFineText.isEmpty()) {
            showAlert("Error de crear", "Por favor ingrese todos los datos.");
        } else {

        }

        name.clear();
        amountFine.clear();
        fineDate.clear();
        paymentDate.clear();
        dueDate.clear();
        descriptionFine.clear();
    }

    @FXML
    private void onRegresar(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/fine.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setTitle("Multa");
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
