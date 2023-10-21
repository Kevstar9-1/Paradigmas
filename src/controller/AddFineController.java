/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;


import DB.conexionDB;
import Fine.Fine;
import Person.Person;
import Person.User;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import loan.Loan;

/**
 * FXML Controller class
 *
 * @author Adria
 */
public class AddFineController implements Initializable {

    @FXML
    private TextField name;
    @FXML
    private TextField amountFine;
    @FXML
    private TextField fineDate;
    @FXML
    private TextField paymentDate;
    @FXML
    private TextField dueDate;
    @FXML
    private TextField descriptionFine;
    @FXML
    private Button btnAddFine;

    /**
     * Initializes the controller class.
     */
    
    ObservableList<User> users = FXCollections.observableArrayList();
    Fine fine;
    conexionDB DB_Connection = conexionDB.getconnector();
    Connection connection = DB_Connection.getConn();
    ResultSet resultSet;
    User searhUser;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        fillListUser();
    }

    @FXML
    private void onAddFine(ActionEvent event) {
        String nameText = name.getText();
        String amountFineText = amountFine.getText();
        String fineDateText = fineDate.getText();
        String paymentDateText = paymentDate.getText();
        String dueDateText = dueDate.getText();
        String descriptionFineText = descriptionFine.getText();

        if (nameText.isEmpty() || amountFineText.isEmpty() || fineDateText.isEmpty()
                || paymentDateText.isEmpty() || dueDateText.isEmpty() || descriptionFineText.isEmpty()) {
            showAlert("Error de crear", "Por favor ingrese todos los datos.");
        } else {
            fillListUser();
            addFine();
        }

        name.clear();
        amountFine.clear();
        fineDate.clear();
        paymentDate.clear();
        dueDate.clear();
        descriptionFine.clear();
    }

    @FXML
    private void onRegresar(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/fine.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setTitle("Multa");
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

    public void addFine(){
        
        searhUser = users.filtered(user -> user.getId().equals(name.getText())).stream().findFirst().orElse(null);
        fine = new Fine(amountFine.getText(), searhUser, fineDate.getText(), paymentDate.getText(),
        dueDate.getText(),descriptionFine.getText());


        int rows = 0;
        try {
            String insertQuery = "INSERT INTO fines (amount, person_id, fineDate, "
                    + "paymentDate, dueDate, comment)"
                    + "VALUES (?, ?, ?, ?, ?, ?)";

            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, fine.getAmount());
            preparedStatement.setString(2, searhUser.getId());
            preparedStatement.setString(3, fine.getFineDate());
            preparedStatement.setString(4, fine.getPaymentDate());
            preparedStatement.setString(5, fine.getDueDate());
            preparedStatement.setString(6, fine.getComment());
            rows = preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println("Error al insertar datos.");
            e.printStackTrace();
        }
    }
    
    public void fillListUser() {
        try {

            // Consulta SQL
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM persons");

            // Llama a la función recursiva
            fillUsersListRecursive();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void fillUsersListRecursive() {
        try {
            if (resultSet.next()) {
            String id = resultSet.getString("id"); 
            String name = resultSet.getString("name"); 
            String lastName = resultSet.getString("lastName"); 
            String phone = resultSet.getString("phone"); 
            String email = resultSet.getString("email"); 
            String address = resultSet.getString("address"); 
            String userName = resultSet.getString("userName"); 
            String password = resultSet.getString("pass"); 
            String type = resultSet.getString("type"); 

            User user = new User(id, name, lastName, phone, email, address, userName, password, type);
                users.add(user);
                fillUsersListRecursive(); // Llamada recursiva para procesar el siguiente resultado
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
