/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import DB.conexionDB;
import Equipment.Equipment;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.Alert;

/**
 * FXML Controller class
 *
 * @author Adria
 */
public class addEquipmentController implements Initializable {

    @FXML
    private TextField tf_EquipmentName;
    @FXML
    private TextField tf_typeEquipment;
    @FXML
    private TextField tf_quantityEquipment;

    Equipment equip;

    conexionDB DB_Connection = conexionDB.getconnector();
    Connection connection = DB_Connection.getConn();

    private Boolean isInEditMode = Boolean.FALSE;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void onRegistrar(ActionEvent event) {
        String equipName = tf_EquipmentName.getText();
        String equipType = tf_typeEquipment.getText();
        String equipQuantity = tf_quantityEquipment.getText();

        if (equipName.isEmpty() || equipType.isEmpty() || equipQuantity.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Error en el registro");
            alert.setHeaderText(null);
            alert.setContentText("Por favor, complete todos los campos.");
            alert.showAndWait();
            return;
        }

        // Validar si equipQuantity es numérico
        if (!isNumeric(equipQuantity)) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Error en el registro");
            alert.setHeaderText(null);
            alert.setContentText("El campo 'Cantidad' debe contener solo valores numéricos.");
            alert.showAndWait();
            return;
        }

        if (isInEditMode) {
            return;
        }

        DBSaveEquip();
        clearEntries();
    }

    private boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private void clearEntries() {
        tf_EquipmentName.clear();
        tf_typeEquipment.clear();
        tf_quantityEquipment.clear();
    }

    public void DBSaveEquip() {
        equip = new Equipment(tf_EquipmentName.getText(), tf_typeEquipment.getText(), tf_quantityEquipment.getText());
        int rows = 0;

        try {
            String insertQuery = "INSERT INTO equipment (name, type, available, "
                    + "quantity) VALUES (?, ?, ?, ?)";

            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, equip.getName());
            preparedStatement.setString(2, equip.getType());
            preparedStatement.setString(3, "T");
            preparedStatement.setString(4, equip.getQuantity());

            rows = preparedStatement.executeUpdate();
            preparedStatement.close();

            if (rows > 0) {
                // Mostrar una alerta de éxito
                Alert successAlert = new Alert(Alert.AlertType.INFORMATION);
                successAlert.setTitle("Éxito");
                successAlert.setHeaderText(null);
                successAlert.setContentText("Equipo añadido exitosamente a la base de datos.");
                successAlert.showAndWait();
            }
        } catch (SQLException e) {
            System.out.println("Error al insertar datos.");
            e.printStackTrace();
        }
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
