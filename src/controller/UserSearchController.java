/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import DB.conexionDB;
import Person.Person;
import Person.User;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import loan.Loan;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.cell.PropertyValueFactory;

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
    private TableView<Person> tb_user;
    @FXML
    private TableColumn<Person, String> tc_id;
    @FXML
    private TableColumn<Person, String> tc_name;
    @FXML
    private TableColumn<Person, String> tc_fine;
    @FXML
    private TableColumn<Loan, String> tc_load;
    @FXML
    private Button btn_Back;

    conexionDB DB_Connection = conexionDB.getconnector();
    Connection connection = DB_Connection.getConn();

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
            ObservableList<Person> userList = searchUser(username);

            tc_id.setCellValueFactory(new PropertyValueFactory<>("id"));
            tc_name.setCellValueFactory(new PropertyValueFactory<>("name"));

            tb_user.setItems(userList);
        }

        tf_user.clear();
    }

    private ObservableList<Person> searchUser(String username) {
        ObservableList<Person> userList = FXCollections.observableArrayList();

        try {
            String selectQuery = "SELECT id, name FROM persons WHERE username = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
            preparedStatement.setString(1, username);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String name = resultSet.getString("name");

                Person person = new Person(id, name); // O User si corresponde
                userList.add(person);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return userList;
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
