/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Dialog;
import javafx.scene.control.DialogEvent;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.effect.BoxBlur;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Ashley Mendoza V
 */
public class AlertMaker {
     public static void showSimpleAlert() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        styleAlert(alert);
        alert.showAndWait();
    }
     
      private static void styleAlert(Alert alert) {
        Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();

        DialogPane dialogPane = alert.getDialogPane();
        dialogPane.getStylesheets().add(AlertMaker.class.getResource("/resources/dark-theme.css").toExternalForm());
        dialogPane.getStyleClass().add("custom-alert");
    }
      
      public static void showMaterialDialog( List<Button> controls, String header, String body) {
       BoxBlur blur = new BoxBlur(3, 3, 3);
        if (controls.isEmpty()) {
            controls.add(new Button("Okay"));
        }
       
        Dialog dialog = new Dialog( );

        controls.forEach(controlButton -> {
            controlButton.getStyleClass().add("dialog-button");
            controlButton.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent mouseEvent) -> {
                dialog.close();
            });
        });

        
    }
}
