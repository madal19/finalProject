
import java.awt.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
a *
 * @author Arvind
 */
public class MyPanel extends JPanel implements ActionListener{
   int PANEL_WIDTH= 100;
   int PANEL_HEIGHT= 100;
   Timer timer;
   int xVelocity=1;
   int yVecloxity=1;
   int x=0;
   int y=0;
   int r=60;
   
    
    
    MyPanel(){
        this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
        this.setBackground(Color.black);
        timer= new Timer(10, this);
        timer.start();
    }
    
    public void paint(Graphics g){
        super.paint(g);//backround 
        Graphics2D g2D= (Graphics2D) g;
        g2D.setStroke(new BasicStroke(5)); //changes width
        g2D.setPaint(new Color(0,0,255)); //colour
          g2D.drawOval(x, y, r*2, r*2); //creates circle
      
             
    }
   @Override
    public void actionPerformed(ActionEvent e){
       if(x>=PANEL_WIDTH-r*2 || x<0){
          xVelocity= xVelocity * -1;
       }
        x=x+xVelocity;
        repaint();
    }
    
}
