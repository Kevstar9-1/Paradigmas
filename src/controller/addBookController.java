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
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Adria
 */
public class addBookController implements Initializable {

    @FXML
    private TextField tf_bookTitle;
    @FXML
    private TextField tf_idBook;
    @FXML
    private TextField tf_genreBook;
    @FXML
    private TextField tf_categorieBook;
    @FXML
    private TextField tf_publisherBook;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onRegistrar(ActionEvent event) {
        
    }
    
}
