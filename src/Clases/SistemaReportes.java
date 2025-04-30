/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import java.sql.*;



/**
 *
 * @author alexis
 */
public class SistemaReportes {
    
    private Usuario usuario;
    private Connection conn;
    
    public SistemaReportes() {
        
    }
    
    public Usuario iniciarSesion(String dni, String password) {
            
        try {
                  
            conn = BaseDeDatos.getConnection();
          
            String query = "SELECT dni, nombre, apellido, correo, rol FROM "
                    + "usuarios WHERE dni = ? AND password = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, dni);
            ps.setString(2, password);
            
            ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            usuario = new Usuario(
                rs.getString("dni"),
                rs.getString("nombre"),
                rs.getString("apellido"),
                rs.getString("correo"),
                rs.getString("rol")
            );
        }
           
            ps.close();
             
        } catch(SQLException e) {
            System.out.println("Error al conectar");
            e.printStackTrace();
        } 
    
        return usuario;
    }

    public void registrarUsuario(Usuario u) {
        
    
    }
    public void registrarIncidente(Incidente i) {
        
    }
    public void notificarEncargado(Incidente i) {  }
    
}