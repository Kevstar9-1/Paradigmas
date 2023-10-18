/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Adria
 */
public class addBookController implements Initializable {

    @FXML
    private TextField bookTitle;
    @FXML
    private TextField idBook;
    @FXML
    private TextField genreBook;
    @FXML
    private TextField categorieBook;
    @FXML
    private TextField publisherBook;
    @FXML
    private TextField authorBook;

    
    private Boolean isInEditMode = Boolean.FALSE;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Register(ActionEvent event) {
        String bookID = idBook.getText();
        String bookAuthor = authorBook.getText();
        String bookName = bookTitle.getText();
        String bookPublisher = publisherBook.getText();
        
        if (bookID.isEmpty() || bookAuthor.isEmpty() || bookName.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Insufficient Data");
        alert.setHeaderText(null);
        alert.setContentText("Please enter data in all fields.");
        alert.showAndWait();
        return;
        }

        if (isInEditMode) {
            
            return;
        }
        
    }
    
    private void clearEntries() {
        bookTitle.clear();
        idBook.clear();
        authorBook.clear();
        publisherBook.clear();
    }
    
}
