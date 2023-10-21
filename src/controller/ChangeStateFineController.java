/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;


import Book.Book;
import DB.conexionDB;


import Person.User;
import Review.Review;
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
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import loan.Loan;

/**
 * FXML Controller class
 *
 * @author Adria
 */
public class ChangeStateFineController implements Initializable {


    private TextField fineDate;
    @FXML
    private Button btnChangeStateFine;
    @FXML
    private TextField rating;
    @FXML
    private TextField comment;
    @FXML
    private TextField bookName;

    /**
     * Initializes the controller class.
     */
    
    conexionDB DB_Connection = conexionDB.getconnector();
    Connection connection = DB_Connection.getConn();
    Review review;
    User searhUser;
    Book searhBooktitle;
    Book searhBookauthor;
    ObservableList<User> users = FXCollections.observableArrayList();
    ObservableList<Book> list_combox = FXCollections.observableArrayList();
    ObservableList<Book> list_book = FXCollections.observableArrayList();
    ResultSet resultSet;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        fillListBook();
    }
    
     public void addReview() {

        searhBooktitle = list_book.filtered(book -> book.getTitle().equals(bookName.getText())).stream().findFirst().
                orElse(null);
        
        
        review = new Review(searhBooktitle, rating.getText(), comment.getText());

        int rows = 0;
        try {
            String insertQuery = "INSERT INTO reviews (book_id, rating, comment) VALUES (?, ?, ?)";

            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, searhBooktitle.getId());
            preparedStatement.setString(2, review.getRating());
            preparedStatement.setString(3, review.getComment());
            rows = preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println("Error al insertar datos.");
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
    private void onChangeStateFine(ActionEvent event) {
        String fineDateText = bookName.getText();

        if ( fineDateText.isEmpty()) {
            showAlert("Error de modificar", "Por favor ingrese todos los datos.");
        } else {
            addReview();
        }

        comment.clear();
        rating.clear();
        bookName.clear();
    }

    @FXML
    private void onRegresar(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/homeClient.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setTitle("Inicio cliente");
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
