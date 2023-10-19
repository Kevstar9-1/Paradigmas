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
public class UserSearchController implements Initializable {

    @FXML
    private TextField tf_user;
    @FXML
    private Button btn_userSearch;
    @FXML
    private TableView<?> tb_user;
    @FXML
    private TableColumn<?, ?> tc_id;
    @FXML
    private TableColumn<?, ?> tc_name;
    @FXML
    private TableColumn<?, ?> tc_fine;
    @FXML
    private TableColumn<?, ?> tc_load;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onuserSearch(ActionEvent event) {
    }
    
}
