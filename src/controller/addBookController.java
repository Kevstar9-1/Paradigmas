/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;


import java.io.IOException;

import Book.Book;
import DB.conexionDB;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
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

/**
 * FXML Controller class
 *
 * @author Adria
 */
public class addBookController implements Initializable {

    @FXML
    private TextField bookTitle;
    @FXML
    private TextField genreBook;
    @FXML
    private TextField categorieBook;
    @FXML
    private TextField publisherBook;
    @FXML
    private TextField authorBook;
    @FXML
    private TextField urlBook;
    Book book;

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
    private void Register(ActionEvent event) {
        String bookID = urlBook.getText();
        String bookAuthor = authorBook.getText();
        String bookName = bookTitle.getText();
        String bookPublisher = publisherBook.getText();

        if (bookID.isEmpty() || bookAuthor.isEmpty() || bookName.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Insufficient Data");
            alert.setHeaderText(null);
            alert.setContentText("Please enter data in all fields.");
            alert.showAndWait();
            return;
        }

        if (isInEditMode) {

            return;
        }

        DBSaveBook();
        clearEntries();
    }

    private void clearEntries() {
        bookTitle.clear();
        urlBook.clear();
        authorBook.clear();
        publisherBook.clear();
        genreBook.clear();
        categorieBook.clear();
    }

    

    public void DBSaveBook() {
        book = new Book(bookTitle.getText(), authorBook.getText(), genreBook.getText(), categorieBook.getText(),
                publisherBook.getText(), urlBook.getText());
        int rows = 0;
        
        try {
            String insertQuery = "INSERT INTO books (title, author, genre, "
                    + "available, categories, publisher, url) VALUES (?, ?, ?, ?, ?, ?,?)";

            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, book.getTitle());
            preparedStatement.setString(2, book.getAuthor());
            preparedStatement.setString(3, book.getGenre());
            preparedStatement.setString(4, "T");
            preparedStatement.setString(5, book.getCategories());

           
                preparedStatement.setString(6, book.getPublisher());
                preparedStatement.setString(7, book.getUrl());

                rows = preparedStatement.executeUpdate();
            preparedStatement.close();
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

