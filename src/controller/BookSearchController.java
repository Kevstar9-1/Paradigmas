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
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Adria
 */
public class BookSearchController implements Initializable {

    @FXML
    private TextField tf_titleBook;
    @FXML
    private TextField tf_bookAuthor;
    @FXML
    private TextField tf_publisher;
    @FXML
    private TextField tf_bookGenre;
    @FXML
    private Button btn_bookSearch;
    @FXML
    private TextField tf_category1;
    @FXML
    private TableView<?> tb_book;
    @FXML
    private TableColumn<?, ?> tc_title;
    @FXML
    private TableColumn<?, ?> tc_author;
    @FXML
    private TableColumn<?, ?> tc_publisher;
    @FXML
    private TableColumn<?, ?> tc_genre;
    @FXML
    private TableColumn<?, ?> tc_category;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onBookSearch(ActionEvent event) {
    }
    
}
