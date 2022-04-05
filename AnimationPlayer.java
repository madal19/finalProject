/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animation;

/**
 *
 * @author Arvind
 */
public class AnimationPlayer {

    
 AnimationPlayer(){   
 }
 
 
 
 public void run() throws InterruptedException{
    MyFrame f= new MyFrame();
   Thread.sleep(10000);  
    f.dispose();
        
 }
   
}
