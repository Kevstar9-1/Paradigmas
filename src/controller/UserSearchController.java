/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import Person.Person;
import Person.User;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import loan.Loan;

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
    private TableView<User> tb_user;
    @FXML
    private TableColumn<User, String> tc_id;
    @FXML
    private TableColumn<Person, String> tc_name;
    @FXML
    private TableColumn<Person, String> tc_fine;
    @FXML
    private TableColumn<Loan, String> tc_load;
    @FXML
    private Button btn_Back;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void onuserSearch(ActionEvent event) {
        String username = tf_user.getText();

        if (username.isEmpty()) {
            showAlert("Campo de usuario vacío", "Por favor, ingrese un nombre de usuario antes de buscar.");
        } else {

        }
        
        tf_user.clear();
    }

    @FXML
    private void onBack(ActionEvent event) {
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

    private void showAlert(String title, String content) {
        Alert alert = new Alert(AlertType.WARNING);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }

}
