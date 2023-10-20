/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

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
    }

    @FXML
    private void onRegresar(ActionEvent event) {
    }
    
}
