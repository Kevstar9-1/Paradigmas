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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author Adria
 */
public class FineController implements Initializable {

    @FXML
    private TableView<?> tb_fine;
    @FXML
    private TableColumn<?, ?> tc_userName;
    @FXML
    private TableColumn<?, ?> tc_amount;
    @FXML
    private TableColumn<?, ?> tc_date;
    @FXML
    private TableColumn<?, ?> tc_loan;
    @FXML
    private Button btn_addFine;
    @FXML
    private Button btn_changeStateFine;

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
    private void onChangeStateFine(ActionEvent event) {
    }
    
}
