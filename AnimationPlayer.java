import java.io.File;  
import java.io.FileNotFoundException;  
import java.util.Scanner; 


class AnimationPlayer {
  public void LoadAnimationFromFile(String filename)
{
  
   
  
  try {
      File myObj = new File("animation1.txt");
      Scanner myReader = new Scanner(myObj);
     int static counter=0;
      while (myReader.hasNextLine()) {
         String data = myReader.nextLine();
         counter++;
         if(counter==4)
         {
           hfu
         }
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
}
  public void player()
{

}

  public void run() {
  
  }


  
  AnimationPlayer player = new AnimationPlayer();

    player.LoadAnimationFromFile("animation1.txt");
   player.run();
  }
}
