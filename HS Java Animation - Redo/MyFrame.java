import javax.swing.*;

public class MyFrame
{
   public static void main(String [] args)
   {

      JFrame myFrame = new JFrame("The Up House");
      myFrame.setSize(1000, 600);

      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      MyPanel customPanel = new MyPanel();
      myFrame.setContentPane(customPanel);

      myFrame.setVisible(true);
   }
}
