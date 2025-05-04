/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfazGrafica;
import Clases.SistemaReportes;
import Clases.Usuario;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


/**
 *
 * @author alexis
 */
public class VistaIniciarSesion extends VistaBase {
    
    public VistaIniciarSesion(CardLayout cardLayout, JPanel panelContenedor, SistemaReportes sr) {
        //setLayout(new BorderLayout());
        //add(new JLabel("Vista de Inicio de Sesion", SwingConstants.CENTER), BorderLayout.CENTER);

        /*
        JLabel usuarioLabel = new JLabel("usuario");
        
        JLabel password = new JLabel("contraseña");
        
        JTextField usuarioInput = new JTextField();
        usuarioInput.setPreferredSize(new Dimension(100,25));
        JPasswordField passwordInput = new JPasswordField();
        passwordInput.setPreferredSize(new Dimension(100,25));
        
        
        
        centerPanel.add(usuarioLabel);
        centerPanel.add(usuarioInput);
        centerPanel.add(password);
        centerPanel.add(passwordInput);
        
        
        
        
        
        JButton btnIniciarSesion = new JButton("Iniciar Sesion");

        */
        
                // Creamos un nuevo panel con GridBagLayout para centrar todo
        JPanel loginPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        JLabel usuarioLabel = new JLabel("Usuario");
        JLabel password = new JLabel("Contraseña");

        JTextField usuarioInput = new JTextField();
        usuarioInput.setPreferredSize(new Dimension(150, 25));

        JPasswordField passwordInput = new JPasswordField();
        passwordInput.setPreferredSize(new Dimension(150, 25));

        JButton btnIniciarSesion = new JButton("Iniciar Sesión");

        // Configuración base de GridBagConstraints
        gbc.insets = new Insets(5, 5, 5, 5); // Espaciado
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.NONE;

        // Fila 1: etiqueta usuario
        loginPanel.add(usuarioLabel, gbc);

        // Fila 2: input usuario
        gbc.gridy++;
        loginPanel.add(usuarioInput, gbc);

        // Fila 3: etiqueta contraseña
        gbc.gridy++;
        loginPanel.add(password, gbc);

        // Fila 4: input contraseña
        gbc.gridy++;
        loginPanel.add(passwordInput, gbc);

        // Fila 5: botón
        gbc.gridy++;
        loginPanel.add(btnIniciarSesion, gbc);

        // Agregamos loginPanel al centro del centerPanel
        centerPanel.setLayout(new BorderLayout());
        centerPanel.add(loginPanel, BorderLayout.CENTER);
        
        btnIniciarSesion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                System.out.println("Iniciando sesion");
                Usuario u = sr.iniciarSesion(usuarioInput.getText(), new String(passwordInput.getPassword()));
                if (u != null) {
                    System.out.println("Sesion iniciada");
                    VistaTest vistaTest = new VistaTest(cardLayout, panelContenedor, u);
                    panelContenedor.add(vistaTest, "test");
                    cardLayout.show(panelContenedor, "test");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al iniciar sesion");
                }
                
            }
        });
        
    }
    
}
