package Aplicacion;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alexis
 * 
 */

//import InterfazGrafica.VentanaBase;
//import InterfazGrafica.VisualizadorImagen;
import Clases.BaseDeDatos;
import java.sql.*;
import java.util.Scanner;
import Clases.Usuario;
import Clases.SistemaReportes;
import InterfazGrafica.VentanaBase;
import java.io.Console;
import javax.swing.SwingUtilities;

public class App {
    
    private static Usuario usuarioActual;
    private static Scanner sc;
    private static SistemaReportes sr;
    private static Console console;
    
    
    
    public static void main(String[] args) {
        
        new VentanaBase("titulo",1200,800).mostrar();
        
        
        /*
        try {
            
      
            
            Connection conn = BaseDeDatos.getConnection();
            System.out.println("Conexion exitosa");
            Statement st = conn.createStatement();
            
            
            ResultSet rs = st.executeQuery("CREATE TABLE usuarios("
                    + "dni VARCHAR(8) "
                    + "PRIMARY KEY, nombre VARCHAR(20) NOT NULL, "
                    + "apellido VARCHAR(20) NOT NULL, "
                    + "correo VARCHAR(50) NOT NULL UNIQUE, rol rol"
                    + ")"
            );
            
                 
             
            rs.close();
            st.close();
            
        } catch(SQLException e) {
            System.out.println("Error al conectar");
            e.printStackTrace();
        } 
        
        */
        
        sc = new Scanner(System.in);
        sr = new SistemaReportes();
        
        System.out.println("\t\tSISTEMA DE REPORTE DE INCIDENTES"); 
        System.out.println("-".repeat(100));
        System.out.println("\t\tINICIAR SESION o REGISTRAR USUARIO");
        
        
        String opcion;
        
        
        do {
            System.out.println("pulse i para iniciar sesion o r para registrar usuario");
            
            console = System.console();
            
            opcion = sc.nextLine();
            
        
            switch(opcion) {
                case "i":
                    System.out.println("INICIAR SESION");
                    String nombre;
                    String password;
                    Usuario user;
                    do {
                        
                        System.out.println("Ingrese su usuario");
                        nombre = sc.nextLine();
                        System.out.println("Ingrese su contraseña");
                        if(console == null) {
                            System.out.println("No se puede ocultar la contraseña en este entorno.");
                            
                            password = sc.nextLine();
                           
                        } else {
                            char[] passwordChars = console.readPassword();
                            password = new String(passwordChars);
                         
                        }
                        
                        user = sr.iniciarSesion(nombre, password);
                    if(user != null) {
                        System.out.println("Inicio de sesion correcto");
                        System.out.println(user.toString());
                        usuarioActual = user;
                    } else {
                        System.out.println("fallo al iniciar sesion");
                    }
                        
                        
                    } while(nombre.equals("") || password.equals("") || usuarioActual == null);
                    
                    
                    
                
                    break;
                case "r":
                    System.out.println("REGISTRAR USUARIO");
                    break;
                default:
                    System.out.println("opcion invalida");
            }
            
        } while(!opcion.equals("r") && !opcion.equals("i"));
        
        
        
        
        sc.close();
    
        
        
    }
    
  
    
    
    
   
}
