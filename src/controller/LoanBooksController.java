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
    }

    @FXML
    private void onRegresar(ActionEvent event) {
    }
    
}
