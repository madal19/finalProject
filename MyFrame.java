
import java.awt.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Arvind
 */
public class MyFrame extends JFrame{
   String shape;
   MyPanel panel;
   MyFrame(){
       panel= new MyPanel();
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
         
         this.add(panel);
         this.pack();
         this.setLocationRelativeTo(null);
         this.setVisible(false);     
     }

    
   
}
