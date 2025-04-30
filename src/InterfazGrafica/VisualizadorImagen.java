/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfazGrafica;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.ImageIcon;
import java.io.File;


/**
 *
 * @author alexis
 */
public class VisualizadorImagen extends VentanaBase {
    
    
    
    
    String TITULO = "Visualizador de Imagenes";
    private JLabel etiquetaImagen;
    
    public VisualizadorImagen(int ancho, int alto) {
        super(ancho, alto);
        setTitle(TITULO);
        setLayout(new BorderLayout());
        
        etiquetaImagen = new JLabel("hola", SwingConstants.CENTER);
        
        add(etiquetaImagen, BorderLayout.CENTER);
        
        JButton botonCargar = new JButton("Cargar imagen");
        
        botonCargar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evn) {
             cargarImagen();
              
            }
        });
        
        add(botonCargar, BorderLayout.SOUTH);
        
        
        
    }
    
    private void cargarImagen() {
        JFileChooser selector = new JFileChooser();
        int resultado = selector.showOpenDialog(this);

        if (resultado == JFileChooser.APPROVE_OPTION) {
            File archivo = selector.getSelectedFile();
            TITULO = archivo.getName();
            setTitle(TITULO);
            ImageIcon imagen = new ImageIcon(archivo.getAbsolutePath());

            // Redimensionar imagen para ajustarse al tamaño del JLabel
            Image imgRedimensionada = imagen.getImage().getScaledInstance(
                imagen.getIconWidth() , imagen.getIconHeight()  , Image.SCALE_SMOOTH
            );
            etiquetaImagen.setIcon(new ImageIcon(imgRedimensionada));
        }
        
    }
    
}
