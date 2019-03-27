package ejemplo_eventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Eventos implements ActionListener {
    
    JFrame marco;
    JPanel panel;
    JButton bAzul;
    //añadimos dos botones más
    JButton bVerde;
    JButton bAmarillo;
    
    public void crearVentana(){
        
        marco = new JFrame("Eventos");
        panel = new JPanel();
        bAzul = new JButton("azul");
        bVerde = new JButton("verde");
        bAmarillo = new JButton("amarillo");
        
        marco.setSize(400, 200);
        panel.add(bAzul);
        panel.add(bVerde);
        panel.add(bAmarillo);
        marco.add(panel);
        
        //gestion de eventos
        
        bAzul.addActionListener(this);
        bVerde.addActionListener(this);
        bAmarillo.addActionListener(this);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(3);
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton boton = (JButton)   e.getSource();
        //este metodo nos dice de que tipo es el elemento
        if(boton == bAzul)
            panel.setBackground(Color.blue);
        else if(boton == bVerde)
            panel.setBackground(Color.green);
        else if(boton == bAmarillo)
            panel.setBackground(Color.yellow);
        
        
        } 
    // otra forma de hacerlo
    /*
    @Override
    public void actionPerformed(ActionEvent e) {
                //este metodo nos dice de que tipo es el elemento
        if(e.getSource() == bAzul)
            panel.setBackground(Color.blue);
        else if(e.getSource() == bVerde)
            panel.setBackground(Color.green);
        else if(e.getSource() == bAmarillo)
            panel.setBackground(Color.yellow);
    */
}
