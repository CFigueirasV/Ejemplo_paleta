package ejemplo_eventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Eventos2 {
   
    
    JFrame marco;
    JPanel panel;
    JButton bAzul;
    
    
    public void crearVentana2(){
        
        marco = new JFrame("Eventos");
        panel = new JPanel();
        bAzul = new JButton("azul");
        
        
        marco.setSize(400, 200);
        panel.add(bAzul);
        marco.add(panel);
        
        //gestion de eventos
        bAzul.addActionListener(new Ejecutar_evento());
        
        marco.setVisible(true);
        marco.setDefaultCloseOperation(3);
        
}
    public class Ejecutar_evento  implements ActionListener{
    
   @Override
    public void actionPerformed(ActionEvent e) {
         panel.setBackground(Color.blue);
        
        }
    

}
}