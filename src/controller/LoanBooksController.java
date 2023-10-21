/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import Book.Book;
import DB.conexionDB;
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
public class LoanBooksController implements Initializable {

    @FXML
    private TextField tf_userName;
    @FXML
    private TextField tf_titleBookLoan;
    private TextField tf_authorBookLoan;
    @FXML
    private TextField tf_dateLoan;
    @FXML
    private TextField tf_returnDateLoan;
    @FXML
    private Button btn_addBookLoan;
    @FXML
    private Button btn_back;
    
    conexionDB DB_Connection = conexionDB.getconnector();
    Connection connection = DB_Connection.getConn();
    Loan loan;
    User searhUser;
    Book searhBooktitle;
    Book searhBookauthor;
    ObservableList<User> users = FXCollections.observableArrayList();
    ObservableList<Book> list_combox = FXCollections.observableArrayList();
    ObservableList<Book> list_book = FXCollections.observableArrayList();
    ResultSet resultSet;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        fillListUser();
        fillListBook();
    }

    @FXML
    private void onAddBookLoan(ActionEvent event) {
        String userName = tf_userName.getText();
        String titleBookLoan = tf_titleBookLoan.getText();
        String dateLoan = tf_dateLoan.getText();
        String returnDateLoan = tf_returnDateLoan.getText();

        if (userName.isEmpty() || titleBookLoan.isEmpty() || dateLoan.isEmpty() || returnDateLoan.isEmpty()) {
            showAlert("Error de agregar", "Por favor ingrese todos los datos.");
        } else {
            addLoanBook();
        }
        
        tf_userName.clear();
        tf_titleBookLoan.clear();
        tf_authorBookLoan.clear();
        tf_dateLoan.clear();
        tf_returnDateLoan.clear();
    }

    public void addLoanBook() {

        searhUser = users.filtered(user -> user.getId().equals(tf_userName.getText())).stream().findFirst().
                orElse(null);
        fillListBook();
        searhBooktitle = list_book.filtered(book -> book.getTitle().equals(tf_titleBookLoan.getText())).stream().findFirst().
                orElse(null);
        
        
        loan = new Loan(searhUser, tf_dateLoan.getText(), tf_returnDateLoan.getText());

        int rows = 0;
        try {
            String insertQuery = "INSERT INTO loans ( book_id, person_id,  "
                    + "loanDate, returnDate, status)"
                    + "VALUES (?, ?, ?, ?, ?)";

            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, searhBooktitle.getId());
            preparedStatement.setString(2, searhUser.getId());
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
    
    public void fillListUser() {
        try {

            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM persons");

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
    
     public void fillListBook() {
        try {

            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM books");

            fillBooksListRecursive();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fillBooksListRecursive() {
        try {
            if (resultSet.next()) {
                String id = resultSet.getString("id");
                String title = resultSet.getString("title");
                String author = resultSet.getString("author");
                String publisher = resultSet.getString("publisher");
                String genre = resultSet.getString("genre");
                String category = resultSet.getString("categories");

                Book book = new Book(id,title, author, genre, category, publisher, category);
                list_book.add(book);
                fillBooksListRecursive(); 
            }
        } catch (SQLException e) {
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

    private void showAlert(String title, String content) {
        Alert alert = new Alert(AlertType.WARNING);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }

}
