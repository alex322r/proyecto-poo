/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfazGrafica;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

/**
 *
 * @author alexis
 */
public class VistaBase extends JPanel {
    
    protected JPanel centerPanel;
    protected JPanel footerPanel;
    
    public VistaBase() {
        setLayout(new BorderLayout());
        JPanel headPanel = new JPanel();
        headPanel.setPreferredSize(new Dimension(200, 100));
        headPanel.setBackground(Color.blue);
        
        JPanel leftPanel = new JPanel();
        leftPanel.setPreferredSize(new Dimension(250,200));
        leftPanel.setBackground(Color.red);
        
        JPanel rightPanel = new JPanel();
        rightPanel.setPreferredSize(new Dimension(250,200));
        rightPanel.setBackground(Color.yellow);
        
        centerPanel = new JPanel();
        centerPanel.setBackground(Color.white);
        
        footerPanel = new JPanel();
        footerPanel.setPreferredSize(new Dimension(200, 50));
        footerPanel.setBackground(Color.magenta);
        
        add(footerPanel, BorderLayout.SOUTH);
        add(headPanel, BorderLayout.NORTH);
        add(leftPanel, BorderLayout.WEST);
        add(rightPanel, BorderLayout.EAST);
        add(centerPanel, BorderLayout.CENTER);
    }
    
}
