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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Adria
 */
public class HomeController implements Initializable {

    @FXML
    private Button btn_register;
    @FXML
    private Button btn_registerEquipment;
    @FXML
    private Button btn_bookLoan;
    @FXML
    private Button btn_bookSearch;
    @FXML
    private Button btn_exitSession;
    @FXML
    private Button btn_SearchUser;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btn_exitSession(ActionEvent event) {
         try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/login.fxml"));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setTitle("Inicio de Sesión");
            stage.setScene(new Scene(root));
            stage.show();

            Stage loginStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            loginStage.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void onBookRegister(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/addBook.fxml"));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setTitle("Registro de libros");
            stage.setScene(new Scene(root));
            stage.show();

            Stage loginStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            loginStage.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void onEquipmentRegister(ActionEvent event) {
         try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/addEquipment.fxml"));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setTitle("Registro de equipos");
            stage.setScene(new Scene(root));
            stage.show();

            Stage loginStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            loginStage.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void onBookLoan(ActionEvent event) {
         try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(""));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setTitle("");
            stage.setScene(new Scene(root));
            stage.show();

            Stage loginStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            loginStage.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void onSearchBook(ActionEvent event) {
         try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/bookSearch.fxml"));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setTitle("Busqueda de libros");
            stage.setScene(new Scene(root));
            stage.show();

            Stage loginStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            loginStage.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void onSearchUser(ActionEvent event) {
         try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/userSearch.fxml"));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setTitle("Busqueda de usuarios");
            stage.setScene(new Scene(root));
            stage.show();

            Stage loginStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            loginStage.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
