/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfazGrafica;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import Clases.Usuario;
import java.awt.Color;
import javax.swing.BorderFactory;


/**
 *
 * @author alexis
 */
public class VistaTest extends JPanel {
    
    
    public VistaTest(CardLayout cardLayout, JPanel panelContenerdor, Usuario u) {
        
        setLayout(null);
        
        
        JLabel dniLabel = new JLabel();
        
        dniLabel.setText(" " + u.getDni());
        //dniLabel.setBorder(BorderFactory.createLineBorder(Color.red, 2));
        
        
        JLabel nombreLabel = new JLabel();
        
        nombreLabel.setText(" " + u.getNombre());
        //nombreLabel.setBorder(BorderFactory.createLineBorder(Color.red, 2));
        
        
        JLabel apellidoLabel = new JLabel();
        
        apellidoLabel.setText(" " + u.getApellido());
        //apellidoLabel.setBorder(BorderFactory.createLineBorder(Color.red, 2));
        
        
        JLabel correoLabel = new JLabel();
        
        correoLabel.setText(" " + u.getCorreo());
        //correoLabel.setBorder(BorderFactory.createLineBorder(Color.red, 2));
        
        
        JLabel rolLabel = new JLabel();
        
        rolLabel.setText(" " + u.getRol());
        //rolLabel.setBorder(BorderFactory.createLineBorder(Color.red, 2));
        
        String [] strings = {"DNI", "NOMBRE", "APELLIDO", "CORREO", "ROL"};
        
        
        JLabel [] infoLabels = {dniLabel, nombreLabel, apellidoLabel, correoLabel, rolLabel};
        
        
        for(int i = 0; i<5; i++) {
            JPanel panel = new JPanel();
            panel.setLayout(null);
            panel.setBounds(20,20 + 30*i,300,25);
            //panel.setBorder(BorderFactory.createLineBorder(Color.blue, 2));
            
            JLabel textLabel = new JLabel(strings[i]+ " :");
            textLabel.setBounds(2,2,96,21);
            //textLabel.setBorder(BorderFactory.createLineBorder(Color.red, 2));
            textLabel.setHorizontalAlignment(JLabel.RIGHT);
            panel.add(textLabel);
            
            JLabel infoLabel = infoLabels[i];
            infoLabel.setBounds(98, 2,200,21);
            //infoLabel.setBorder(BorderFactory.createLineBorder(Color.green, 2));
            
            panel.add(infoLabel);
            
            
            this.add(panel);
        }
        
        
        
        
    }
    
    
    
}
