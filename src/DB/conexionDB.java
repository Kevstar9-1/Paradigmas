/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ashley Mendoza V
 */
public class conexionDB {
    
    private static conexionDB connector;
    private Connection conn;
    private String url = "jdbc:mysql://localhost:3306/library";
    private String user = "library";
    private String password = "library";


    private conexionDB() {
        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static conexionDB getconnector() {
        if (connector == null) {
            connector = new conexionDB();
        }
        return connector;
    }

    public Connection getConn() {
        return conn;
    }
}
