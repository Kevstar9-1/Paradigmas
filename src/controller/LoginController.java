/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.StringTokenizer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;


/**
 * FXML Controller class
 *
 * @author Adria
 */
public class LoginController implements Initializable {

    @FXML
    private TextField tf_username;
    @FXML
    private PasswordField tf_password;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onLogin(ActionEvent event) {
        String username = tf_username.getText();
        String password = tf_password.getText();

        if (validarCredenciales(username, password)) {
            mostrarAlerta(AlertType.INFORMATION, "Inicio de sesión exitoso", "¡Bienvenido, " + username + "!");
            
        } else {
            mostrarAlerta(AlertType.ERROR, "Error de inicio de sesión", "Credenciales incorrectas.");
        }
        
        
    }
    
    private void mostrarAlerta(AlertType tipo, String titulo, String contenido) {
        Alert alert = new Alert(tipo);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(contenido);
        alert.showAndWait();
    }

   
   private boolean validarCredenciales(String username, String password) {
        String rutaArchivo = "C:\\Documentos\\PARADIGMAS DE PROGRAMACION\\Base de datos para proyecto#2\\usuarios.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                StringTokenizer tokenizer = new StringTokenizer(linea, ", ");
                String nombre = tokenizer.nextToken().trim();
                String apellidos = tokenizer.nextToken().trim();
                String usuario = tokenizer.nextToken().trim();
                String email = tokenizer.nextToken().trim();
                String contraseña = tokenizer.nextToken().trim();

                if (usuario.equals(username) && contraseña.equals(password)) {
                    return true; // Credenciales válidas
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return false; // Credenciales no encontradas o inválidas
    }
   
   
        

    @FXML
    private void onRegistrar(ActionEvent event)  {
       try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/user.fxml"));
                Parent root = loader.load();

                Stage stage = new Stage();

                stage.setTitle("Agregar usuario");

                stage.setTitle("Registro de usuarios");
                stage.setScene(new Scene(root));
                stage.show();
                Stage loginStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                loginStage.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
       
       String filePath = "ruta/a/tu/archivo.xlsx";

      /*  try (FileInputStream fileInputStream = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(fileInputStream)) {

            // Obtén la primera hoja del libro de trabajo
            Sheet sheet = workbook.getSheetAt(0);

            // Itera sobre las filas de la hoja
            for (Row row : sheet) {
                // Itera sobre las celdas de cada fila
                for (Cell cell : row) {
                    // Obtén el contenido de la celda y muestra su valor
                    System.out.print(cell.toString() + "\t");
                }
                System.out.println(); // Nueva línea para cada fila
            }

        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
    
    
}
