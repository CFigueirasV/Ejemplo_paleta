package ejemplo_eventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//clase anonima
 
public class Eventos3 {
     
    JFrame marco;
    JPanel panel;
    JButton bAzul;
    JButton bRojo;
    JButton bNaranja;
    
    
    public void crearVentana3(){
        
        marco = new JFrame("Eventos");
        panel = new JPanel();
        bAzul = new JButton("azul");
        bRojo = new JButton("rojo");
        bNaranja = new JButton("naranja");
        
        
        marco.setSize(400, 200);
        panel.add(bAzul);
        panel.add(bRojo);
        panel.add(bNaranja);
        marco.add(panel);
        
        //gestion de eventos
        bAzul.addActionListener(new ActionListener(){
            
          public void actionPerformed(ActionEvent e){
              panel.setBackground(Color.blue);
                           
          }
        
    });
        bRojo.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
              panel.setBackground(Color.red);
                           
          }
        
    });
        bNaranja.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
              panel.setBackground(Color.orange);
                           
          }

    });
        
        marco.setVisible(true);
        marco.setDefaultCloseOperation(3);
        
}
  /*  public class Ejecutar_evento  implements ActionListener{
    
   @Override
    public void actionPerformed(ActionEvent e) {
         panel.setBackground(Color.blue);
        
        }
    

}*/
    
}