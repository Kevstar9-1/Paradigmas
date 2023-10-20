/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import Book.Book;
import DB.conexionDB;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
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
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Adria
 */
public class BookSearchController implements Initializable {

    @FXML
    private TextField tf_titleBook;
    @FXML
    private TextField tf_bookAuthor;
    @FXML
    private TextField tf_publisher;
    @FXML
    private TextField tf_bookGenre;
    @FXML
    private TextField tf_category1;
    @FXML
    private TableView<Book> tb_book;
    @FXML
    private TableColumn<Book, String> tc_title;
    @FXML
    private TableColumn<Book, String> tc_author;
    @FXML
    private TableColumn<Book, String> tc_publisher;
    @FXML
    private TableColumn<Book, String> tc_genre;
    @FXML
    private TableColumn<Book, String> tc_category;
    @FXML
    private Button btn_Regresar;
    @FXML
    private Button btn_titleSearch;
    @FXML
    private Button btn_autorSearch;
    @FXML
    private Button btn_publisherSearch;
    @FXML
    private Button btn_GenreSearch;
    @FXML
    private Button btn_categorySearch;
    
    Book book;
    conexionDB DB_Connection = conexionDB.getconnector();
    Connection connection = DB_Connection.getConn();
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tc_title.setCellValueFactory(new PropertyValueFactory<>("title"));
        tc_author.setCellValueFactory(new PropertyValueFactory<>("author"));
        tc_publisher.setCellValueFactory(new PropertyValueFactory<>("publisher"));
        tc_genre.setCellValueFactory(new PropertyValueFactory<>("genre"));
        tc_category.setCellValueFactory(new PropertyValueFactory<>("categories"));
    }

    public void DBSearchTitle(String titleBook) {

        try {
            String searchQuery = "SELECT * FROM books WHERE title LIKE ? ";
            PreparedStatement preparedStatement = connection.prepareStatement(searchQuery);
            preparedStatement.setString(1, "%" + titleBook + "%"); // Búsqueda parcial del título
            ResultSet resultSet = preparedStatement.executeQuery();

            // Limpia la tabla antes de agregar los resultados
            tb_book.getItems().clear();

            while (resultSet.next()) {

                String title = resultSet.getString("title");
                String author = resultSet.getString("author");
                String publisher = resultSet.getString("publisher");
                String genre = resultSet.getString("genre");
                String category = resultSet.getString("categories");

                // Crea un nuevo objeto Book con los datos encontrados en la base de datos
                Book book = new Book(title, author, genre, category, publisher, category);
                // Agrega el libro a la tabla
                tb_book.getItems().add(book);
            }

            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println("Error al buscar libros.");
            e.printStackTrace();
        }
    }

    public void DBSearchAuthor(String authorBook) {

        try {
            String searchQuery = "SELECT * FROM books WHERE author LIKE ? ";
            PreparedStatement preparedStatement = connection.prepareStatement(searchQuery);
            preparedStatement.setString(1, "%" + authorBook + "%"); // Búsqueda parcial del título
            ResultSet resultSet = preparedStatement.executeQuery();

            // Limpia la tabla antes de agregar los resultados
            tb_book.getItems().clear();

            while (resultSet.next()) {

                String title = resultSet.getString("title");
                String author = resultSet.getString("author");
                String publisher = resultSet.getString("publisher");
                String genre = resultSet.getString("genre");
                String category = resultSet.getString("categories");

                // Crea un nuevo objeto Book con los datos encontrados en la base de datos
                Book book = new Book(title, author, genre, category, publisher, category);
                // Agrega el libro a la tabla
                tb_book.getItems().add(book);
            }

            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println("Error al buscar libros.");
            e.printStackTrace();
        }
    }

    public void DBSearchPublisher(String publisherBook) {

        try {
            String searchQuery = "SELECT * FROM books WHERE publisher LIKE ? ";
            PreparedStatement preparedStatement = connection.prepareStatement(searchQuery);
            preparedStatement.setString(1, "%" + publisherBook + "%"); // Búsqueda parcial del título
            ResultSet resultSet = preparedStatement.executeQuery();

            // Limpia la tabla antes de agregar los resultados
            tb_book.getItems().clear();

            while (resultSet.next()) {

                String title = resultSet.getString("title");
                String author = resultSet.getString("author");
                String publisher = resultSet.getString("publisher");
                String genre = resultSet.getString("genre");
                String category = resultSet.getString("categories");

                // Crea un nuevo objeto Book con los datos encontrados en la base de datos
                Book book = new Book(title, author, genre, category, publisher, category);
                // Agrega el libro a la tabla
                tb_book.getItems().add(book);
            }

            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println("Error al buscar libros.");
            e.printStackTrace();
        }
    }
    
    public void DBSearchGenre(String genreBook) {

        try {
            String searchQuery = "SELECT * FROM books WHERE genre LIKE ? ";
            PreparedStatement preparedStatement = connection.prepareStatement(searchQuery);
            preparedStatement.setString(1, "%" + genreBook + "%"); // Búsqueda parcial del título
            ResultSet resultSet = preparedStatement.executeQuery();

            // Limpia la tabla antes de agregar los resultados
            tb_book.getItems().clear();

            while (resultSet.next()) {

                String title = resultSet.getString("title");
                String author = resultSet.getString("author");
                String publisher = resultSet.getString("publisher");
                String genre = resultSet.getString("genre");
                String category = resultSet.getString("categories");

                // Crea un nuevo objeto Book con los datos encontrados en la base de datos
                Book book = new Book(title, author, genre, category, publisher, category);
                // Agrega el libro a la tabla
                tb_book.getItems().add(book);
            }

            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println("Error al buscar libros.");
            e.printStackTrace();
        }
    }
    
    public void DBSearchCategory(String categoryBook) {

        try {
            String searchQuery = "SELECT * FROM books WHERE categories LIKE ? ";
            PreparedStatement preparedStatement = connection.prepareStatement(searchQuery);
            preparedStatement.setString(1, "%" + categoryBook + "%"); // Búsqueda parcial del título
            ResultSet resultSet = preparedStatement.executeQuery();

            // Limpia la tabla antes de agregar los resultados
            tb_book.getItems().clear();

            while (resultSet.next()) {

                String title = resultSet.getString("title");
                String author = resultSet.getString("author");
                String publisher = resultSet.getString("publisher");
                String genre = resultSet.getString("genre");
                String category = resultSet.getString("categories");

                // Crea un nuevo objeto Book con los datos encontrados en la base de datos
                Book book = new Book(title, author, genre, category, publisher, category);
                // Agrega el libro a la tabla
                tb_book.getItems().add(book);
            }

            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println("Error al buscar libros.");
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

    @FXML
    private void onTitleSearch(ActionEvent event) {
        String bookTitle = tf_titleBook.getText();
        //alerta pero solo de titulo
        DBSearchTitle(bookTitle);
    }

    @FXML
    private void onAuthorSearch(ActionEvent event) {
         String bookAuthor = tf_bookAuthor.getText();
         DBSearchAuthor(bookAuthor);
    }

    @FXML
    private void onPubliserSearch(ActionEvent event) {
        String bookPublisher = tf_publisher.getText();
        DBSearchPublisher(bookPublisher);
    }

    @FXML
    private void onGenreearch(ActionEvent event) {
        String bookGenre = tf_bookGenre.getText();
        DBSearchGenre(bookGenre);
    }

    @FXML
    private void onCategorySearch(ActionEvent event) {
        String bookCategory = tf_category1.getText();
        DBSearchCategory(bookCategory);
    }

}
