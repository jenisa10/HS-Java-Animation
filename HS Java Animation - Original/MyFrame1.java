import javax.swing.*;
import java.awt.*;

public class MyFrame1 
{
   public static void main(String [] args)
   {
    
      JFrame myFrame1 = new JFrame("The Up House");
      myFrame1.setSize(1000, 600);   
      
      myFrame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           
      MyPanel2 customPanel = new MyPanel2();
      myFrame1.setContentPane(customPanel);
      
      
         
      
      myFrame1.setVisible(true);
            
   }
       
}    
