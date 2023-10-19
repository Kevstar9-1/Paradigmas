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
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

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
    @FXML
    private Button btn_bookSearch;
    @FXML
    private Button btn_Regresar;

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

    @FXML
    private void onRegresar(ActionEvent event) {
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
    
}
