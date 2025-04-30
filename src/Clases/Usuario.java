/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author alexis
 */
public class Usuario {
    
    private String nombre;
    private String apellido;
    private String dni;
    private String correo;
    private String rol;

    public Usuario(String dni,String nombre, String apellido, String correo, String rol) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.correo = correo;
        this.rol = rol;
    }
    
    public void registrarIncidente(String tipo, String descripcion, String fecha, String hora, String lugar, String gravedad, String imagenRuta) {
        
        Incidente incidente = new Incidente(tipo, descripcion, fecha, hora, lugar, gravedad, imagenRuta ,this);
        
    }
    

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public String getCorreo() {
        return correo;
    }

    public String getRol() {
        return rol;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", correo=" + correo + ", rol=" + rol + '}';
    }
    
    
    


    
    


    
    
    
}
