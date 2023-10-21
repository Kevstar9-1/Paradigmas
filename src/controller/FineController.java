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
import javafx.stage.Stage;

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
    private Button btn_Regresar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void onAddFine(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/addFine.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setTitle("Crear multa");
            stage.setScene(new Scene(root));
            stage.show();
            Stage loginStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            loginStage.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void onChangeStateFine(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/changeStateFine.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setTitle("Modificar multa");
            stage.setScene(new Scene(root));
            stage.show();
            Stage loginStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            loginStage.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void onRegresar(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/home.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setTitle("Inicio");
            stage.setScene(new Scene(root));
            stage.show();
            Stage loginStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            loginStage.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
