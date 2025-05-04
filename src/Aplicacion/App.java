package Aplicacion;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alexis
 * 
 */

//import InterfazGrafica.VentanaBase;
//import InterfazGrafica.VisualizadorImagen;
import Clases.BaseDeDatos;
import java.sql.*;
import java.util.Scanner;
import Clases.Usuario;
import Clases.SistemaReportes;
import InterfazGrafica.VentanaBase;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Console;
import javax.swing.*;
import javax.swing.border.Border;

public class App {
    
    private static Usuario usuarioActual;
    private static Scanner sc;
    private static SistemaReportes sr;
    private static Console console;
    
    
    
    public static void main(String[] args) {
        
        //new VentanaBase("titulo",1200,800).mostrar();
        
        /*
        ImageIcon image = new ImageIcon("detective.png");
        
        
        Border border = BorderFactory.createLineBorder(Color.GREEN, 2);
        JLabel etiqueta = new JLabel();
        
        
        
        etiqueta.setText("bro, siquiera codeas");
        etiqueta.setIcon(image);
        etiqueta.setHorizontalTextPosition(JLabel.CENTER);
        etiqueta.setVerticalTextPosition(JLabel.CENTER);
        etiqueta.setForeground(new Color(0x00FF00));
        etiqueta.setFont(new Font("MV Boli", Font.PLAIN, 20));
        //etiqueta.setIconTextGap(-25);
        etiqueta.setBackground(Color.red);
        etiqueta.setOpaque(true);
        etiqueta.setBorder(border);
        etiqueta.setVerticalAlignment(JLabel.CENTER);
        etiqueta.setHorizontalAlignment(JLabel.RIGHT);
        etiqueta.setBounds(100,100,250,250);
        
        
        JFrame ventana = new JFrame();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //ventana.setSize(1000,800);
        //ventana.setLayout(null);
        ventana.add(etiqueta);
        ventana.pack();
        ventana.setLocationRelativeTo(null);
        
        ventana.setVisible(true);
        
        
        
        
        
        
        try {
            
      
            
            Connection conn = BaseDeDatos.getConnection();
            System.out.println("Conexion exitosa");
            Statement st = conn.createStatement();
            
            
            ResultSet rs = st.executeQuery("CREATE TABLE usuarios("
                    + "dni VARCHAR(8) "
                    + "PRIMARY KEY, nombre VARCHAR(20) NOT NULL, "
                    + "apellido VARCHAR(20) NOT NULL, "
                    + "correo VARCHAR(50) NOT NULL UNIQUE, rol rol"
                    + ")"
            );
            
                 
             
            rs.close();
            st.close();
            
        } catch(SQLException e) {
            System.out.println("Error al conectar");
            e.printStackTrace();
        } 
        
        
        
        sc = new Scanner(System.in);
        sr = new SistemaReportes();
        
        System.out.println("\t\tSISTEMA DE REPORTE DE INCIDENTES"); 
        System.out.println("-".repeat(100));
        System.out.println("\t\tINICIAR SESION o REGISTRAR USUARIO");
        
        
        String opcion;
        
        
        do {
            System.out.println("pulse i para iniciar sesion o r para registrar usuario");
            
            console = System.console();
            
            opcion = sc.nextLine();
            
        
            switch(opcion) {
                case "i":
                    System.out.println("INICIAR SESION");
                    String nombre;
                    String password;
                    Usuario user;
                    do {
                        
                        System.out.println("Ingrese su usuario");
                        nombre = sc.nextLine();
                        System.out.println("Ingrese su contraseña");
                        if(console == null) {
                            System.out.println("No se puede ocultar la contraseña en este entorno.");
                            
                            password = sc.nextLine();
                           
                        } else {
                            char[] passwordChars = console.readPassword();
                            password = new String(passwordChars);
                         
                        }
                        
                        user = sr.iniciarSesion(nombre, password);
                    if(user != null) {
                        System.out.println("Inicio de sesion correcto");
                        System.out.println(user.toString());
                        usuarioActual = user;
                    } else {
                        System.out.println("fallo al iniciar sesion");
                    }
                        
                        
                    } while(nombre.equals("") || password.equals("") || usuarioActual == null);
                    
                    
                    
                
                    break;
                case "r":
                    System.out.println("REGISTRAR USUARIO");
                    break;
                default:
                    System.out.println("opcion invalida");
            }
            
        } while(!opcion.equals("r") && !opcion.equals("i"));
        
        
        
        
        sc.close();
    
        
      
        
        
        ImageIcon icon = new ImageIcon("detective.png");
        
        JButton button = new JButton();
        button.setBounds(100, 200 , 150, 50);
        button.setText("Soy un boton");
        button.setFocusable(false);
        
        
        
        JLabel label = new JLabel();
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                System.out.println("Hello word");
                label.setVisible(true);
            }
        });
        
        
        
        Border border = BorderFactory.createLineBorder(Color.yellow);
        
        label.setText("HOLA");
        label.setBounds(0,0, 100,100);
        
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        
        label.setBorder(border);
        label.setIcon(icon);
        label.setVisible(false);
        
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,250,250);
        redPanel.setLayout(null);
        
        
        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250,0,250,250);
        bluePanel.setLayout(null);
        
        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,250,500,250);
        greenPanel.setLayout(new BorderLayout());
        greenPanel.setLayout(null);
        
        
        JFrame frame = new JFrame();
        frame.setTitle("Hello world");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750,750);
        
        
        bluePanel.add(label);
        bluePanel.add(button);
        
        
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
        
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        
      
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        
        frame.setTitle("MI PROGRAMA");
        
        
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();
        
        panel1.setBackground(Color.red);
        panel2.setBackground(Color.green);
        panel3.setBackground(Color.yellow);
        panel4.setBackground(Color.magenta);
        panel5.setBackground(Color.blue);
        
        
        
        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));
        panel5.setPreferredSize(new Dimension(100,100));
        
        panel5.setLayout(new BorderLayout());
        
        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        JPanel panel10 = new JPanel();
        
        panel6.setBackground(Color.red);
        panel7.setBackground(Color.green);
        panel8.setBackground(Color.yellow);
        panel9.setBackground(Color.magenta);
        panel10.setBackground(Color.blue);
        
        panel6.setPreferredSize(new Dimension(50,50));
        panel7.setPreferredSize(new Dimension(50,50));
        panel8.setPreferredSize(new Dimension(50,50));
        panel9.setPreferredSize(new Dimension(50,50));
        panel10.setPreferredSize(new Dimension(50,50));
        
        
        
        panel5.add(panel6, BorderLayout.NORTH);
        panel5.add(panel7, BorderLayout.WEST);
        panel5.add(panel8, BorderLayout.EAST);
        panel5.add(panel9, BorderLayout.SOUTH);
        panel5.add(panel10, BorderLayout.CENTER);
        
        panel1.setBackground(Color.red);
        panel2.setBackground(Color.green);
        panel3.setBackground(Color.yellow);
        panel4.setBackground(Color.magenta);
        panel5.setBackground(Color.blue);
        
        
        
        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.WEST);
        frame.add(panel3, BorderLayout.EAST);
        frame.add(panel4, BorderLayout.SOUTH);
        frame.add(panel5, BorderLayout.CENTER);
        
        frame.setVisible(true);
        */
        
        new VentanaBase("MI PROGRAMA",800,600).mostrar();
        
    }
    
        
    }
    
    
    
    
  
    
    

  