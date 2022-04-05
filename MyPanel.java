/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animation;

import java.util.concurrent.TimeUnit;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Arvind
 */
public class MyPanel extends JPanel implements ActionListener{
  Timer timer;
  final int PANEL_WIDTH= 400;
  final int PANEL_HEIGHT= 300;
  int xVelocity=1;
  int yVelocity=1;
  int timelength = 10;
  
   int x=0;
   int y=2;
   int timespan= PANEL_WIDTH / 100 ;
   
   int xnew=100;//for jump effect
   int ynew=200;//for jump effect
           
   //int radius=c[i].getR(); //only for circle
   int r=50;
   String choice="circle"; //choice 
   String Effect="hide";
   //long startTime = System.currentTimeMillis();
   //long end = System.currentTimeMillis() + timespan*1000;
    
    
    MyPanel(){
       
        this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
        this.setBackground(Color.black);
        timer= new Timer(timelength, this);
        timer.start();

      
    }
    
    public void paint(Graphics g){

      super.paint(g);//backround 
      
        Graphics2D g2D= (Graphics2D) g;
        if(choice=="circle"){
          g2D.setStroke(new BasicStroke(5)); //changes width
        g2D.setPaint(new Color(0,0,255)); //colour
     //g2D.setPaint(new Color(0,0,255,0)); //hide
          //g2D.drawOval(x, y, r*2, r*2); //creates circle
         g2D.fillOval(x, y, r*2, r*2);
       
        }
        if(choice=="rec"){
              g2D.setPaint(new Color(0,0,255)); //colour
             g2D.setStroke(new BasicStroke(4)); //changes width
             g2D.drawRect(x, y, r, r*2);
           
        }
        if(choice=="line"){
            g2D.setPaint(new Color(0,0,255)); //colour
             g2D.setStroke(new BasicStroke(9)); //changes width
            g2D.drawLine(x, y+10, x+10, y+10);
        }
              
  
             
    }
   @Override
    public void actionPerformed(ActionEvent e){
        
       

        if (System.currentTimeMillis() >= end)
        {
            System.exit(0);
        }
        
        
        if(x>=PANEL_WIDTH-r*2 || x<0){
           xVelocity= xVelocity * -1;
        
        
        }


            x=x+xVelocity;
        
     if(Effect=="jump"){ //for the jump effect
         x=xnew;
        y=ynew;
        }

         repaint();
        
    }

}
