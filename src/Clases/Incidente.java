/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author alexis
 */
public class Incidente {
    private String tipo; // accidente, fallo técnico, etc.
    private String descripcion;
    private String fecha;
    private String hora;
    private String lugar;
    private String gravedad;
    private String imagenRuta;
    private Usuario reportadoPor;

    public Incidente(String tipo, String descripcion, String fecha, String hora, String lugar, String gravedad, String imagenRuta, Usuario reportadoPor) {
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.gravedad = gravedad;
        this.imagenRuta = imagenRuta;
        this.reportadoPor = reportadoPor;
    }
    
    
    
    
    
}
