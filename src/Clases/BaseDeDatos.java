/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import java.sql.*;
import java.util.Properties;

/**
 *
 * @author alexis
 */
public class BaseDeDatos {
    
    
        
        private static String url = "jdbc:postgresql://localhost/my-db";
        private static Properties props = new Properties();
        
        
        
        public static Connection getConnection() throws SQLException {
            
            props.setProperty("user", "alexis");
            props.setProperty("password", "123456");
            return DriverManager.getConnection(url, props);
                   
        }
       
}
