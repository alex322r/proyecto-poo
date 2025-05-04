/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfazGrafica;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author alexis
 */
public class VistaInicio extends VistaBase {
    
    public VistaInicio(CardLayout cardLayout, JPanel panelContenedor) {
        
        //add(new JLabel("Vista de Inicio", SwingConstants.CENTER), BorderLayout.CENTER);

        centerPanel.add(new JLabel("Vista de  Inicio", SwingConstants.CENTER), BorderLayout.CENTER);
        
        JButton btnIniciarSesion = new JButton("Ir a Inicio de Sesion");
        btnIniciarSesion.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent evt) {
             cardLayout.show(panelContenedor, "login");
         }
        });
        
        
        JButton btnRegistrarse = new JButton("Registrarse");
        btnRegistrarse.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                cardLayout.show(panelContenedor, "register");
                
            }

            
        });
        
        centerPanel.add(btnIniciarSesion);
        centerPanel.add(btnRegistrarse);
    }
    
    
    
}
