/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import DB.conexionDB;
import Equipment.Equipment;
import Person.Person;
import Person.User;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
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
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import loan.Loan;

/**
 * FXML Controller class
 *
 * @author Adria
 */
public class LoanEquipmentController implements Initializable {

    @FXML
    private TextField tf_userName;
    private TextField tf_equipmentName;
    @FXML
    private ComboBox<String> cb_another;
    @FXML
    private Button btn_addLoad;
    @FXML
    private Button btn_back;
    @FXML
    private TextField tf_dateLoan;
    @FXML
    private TextField tf_returnDateLoan;

    conexionDB DB_Connection = conexionDB.getconnector();
    Connection connection = DB_Connection.getConn();
    Loan loan;
    User searhUser;
    Equipment equipment;
    ObservableList<User> users = FXCollections.observableArrayList();
    ObservableList<Equipment> list_combox = FXCollections.observableArrayList();
    ObservableList<Equipment> list_equip = FXCollections.observableArrayList();
    ResultSet resultSet;
    @FXML
    private ComboBox<String> cb_equip;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cb_another.getItems().add("1");
        cb_another.getItems().add("2");
        fillCbType();
        fillListUser();
    }

    public void fillCbType() {
        try {

           
            String query = "SELECT * FROM equipment ";
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery(query);

           
            fillComboBoxRecursively();

        } catch (Exception e) {
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
                fillUsersListRecursive(); 
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private boolean validarCredenciales(String username, String equipmentname) {
        String personName = tf_userName.getText();

        try {
            String selectPersonQuery = "SELECT * FROM persons WHERE id  LIKE ?";
            PreparedStatement personPreparedStatement = connection.prepareStatement(selectPersonQuery);
            personPreparedStatement.setString(1, personName);

            ResultSet personResultSet = personPreparedStatement.executeQuery();

            // Verificar si existe el nombre de usuario en la tabla "personas"
            if (personResultSet.next()) {

                // El equipo existe en la tabla "equipos"
                return true;

            }

        } catch (SQLException e) {
            System.out.println("Error al realizar la consulta en la base de datos.");
            e.printStackTrace();
        }

        return false;
    }

    public void addLoanEquip() {

        searhUser = users.filtered(user -> user.getId().equals(tf_userName.getText())).stream().findFirst().
                orElse(null);
        // equip = cb_another.getValue();
        String selectedValue = cb_equip.getValue();
        equipment = list_combox.stream()
                                    .filter(equip -> equip.getName().equals(selectedValue))
                                    .findFirst()
                                    .orElse(null);
        
        loan = new Loan(searhUser, tf_dateLoan.getText(), tf_returnDateLoan.getText());

        int rows = 0;
        try {
            String insertQuery = "INSERT INTO loans ( person_id, equipment_id, "
                    + "loanDate, returnDate, status)"
                    + "VALUES (?, ?, ?, ?, ?)";

            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, searhUser.getId());
            preparedStatement.setString(2, selectedValue.toString());
            preparedStatement.setString(3, loan.getLoanDate());
            preparedStatement.setString(4, loan.getReturnDate());
            preparedStatement.setString(5, "Prestado");
            rows = preparedStatement.executeUpdate();
            System.out.println(searhUser + "4" + loan.getLoanDate());
            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println("Error al insertar datos.");
            e.printStackTrace();
        }

    }

    public void equipName(String name) {

    }

    @FXML
    private void onAddLoad(ActionEvent event) {
        String username = tf_userName.getText();
        String equipmentName = cb_equip.getValue();

        if (username.isEmpty() || equipmentName.isEmpty()) {
            showAlert("Error de agregar", "Por favor ingrese todos los datos.");
        } else {

        }
        addLoanEquip();
        tf_userName.clear();
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

    private void showAlert(String title, String content) {
        Alert alert = new Alert(AlertType.WARNING);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }

    public void fillComboBoxRecursively() {
        try {
            if (resultSet.next()) {
                String id = resultSet.getString("id"); 
                String name = resultSet.getString("name"); 
                String type = resultSet.getString("type"); 
                String phone = resultSet.getString("quantity"); 
                

                Equipment equip = new Equipment(id, name, type);
                list_combox.add(equip);
                cb_equip.getItems().add(resultSet.getString("id"));
                fillComboBoxRecursively();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
