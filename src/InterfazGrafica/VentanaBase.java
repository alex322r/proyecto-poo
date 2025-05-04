/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfazGrafica;
import Clases.SistemaReportes;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author alexis
 */
public class VentanaBase extends JFrame {
    
    private SistemaReportes sr;
    
    public VentanaBase(String titulo, int ancho, int alto) {
       
        sr = new SistemaReportes();
        
        setTitle(titulo);
        setSize(ancho, alto);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        
        CardLayout cardLayout = new CardLayout();
        JPanel panelPrincipal = new JPanel(cardLayout);
        
        
        VistaInicio vistaInicio = new VistaInicio(cardLayout, panelPrincipal);
        VistaIniciarSesion vistaIs = new VistaIniciarSesion(cardLayout, panelPrincipal, sr);
        //VistaTest vistaTest = new VistaTest(cardLayout, panelPrincipal, sr);
        panelPrincipal.add(vistaInicio, "inicio");
        panelPrincipal.add(vistaIs, "login");
        //panelPrincipal.add(vistaTest, "test");
        
        add(panelPrincipal);
        setLocationRelativeTo(null);
        
    }
    
    public VentanaBase(int ancho, int alto) {
        
        setSize(ancho, alto);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    
    public void mostrar() {
        setVisible(true);
    }
    
}
