/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfazGrafica;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;
import javax.swing.*;

/**
 *
 * @author alexis
 */
public class VistaIniciarSesion extends JPanel {
    
    public VistaIniciarSesion(CardLayout cardLayout, JPanel panelContenedor) {
        setLayout(new BorderLayout());
        add(new JLabel("Vista de Inicio de Sesion", SwingConstants.CENTER), BorderLayout.CENTER);

        
        JButton btnIniciarSesion = new JButton("Iniciar Sesion");
        btnIniciarSesion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                System.out.println("Iniciando sesion");
                cardLayout.show(panelContenedor, "test");
            }
        });
        add(btnIniciarSesion, BorderLayout.SOUTH);
    }
    
}
