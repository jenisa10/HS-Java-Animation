import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.awt.event.*;

public class MyPanel extends JPanel
{

    Timer t = new Timer(500, new Listener());

    //base
    int xB1 = 340;


    //sunRoof
    int xS = 400;
    int yS = 320;

    //roof
    int [ ] x = {360, 440, 460, 340};
    int [ ] y = {280, 280, 320, 320};

    //sunRoof2
    int [ ] a = {400, 400, 430, 460, 460};
    int [ ] b = {320, 300, 260, 300, 320};
    int [ ] c = {360, 360, 370, 380, 380};
    int [ ] d = {310, 300, 280, 300, 310};

    //chimney
    int xC = 380;
    int yC1 = 260;
    int yC2 = 340;

    //windows
    int xW1 = 365;
    int xW2 = 420;
    int xW3 = 350;
    int xW4 = 410;
    int xW5 = 425;
    int xW6 = 440;
    int yW1 = 300;
    int yW2 = 290;
    int yW3 = 340;

    //background
    int cRed = 160;
    int cGreen = 210;
    int cBlue = 250;

    //balloon
    int xmb1 = 460;
    int xnb1 = 320;
    int ymb1 = 120;
    int ynb1 = 100;

    int xmb2 = 480;
    int xnb2 = 300;
    int ymb2 = 140;
    int ynb2 = 120;

    int xmb3 = 460;
    int xnb3 = 320;
    int ymb3 = 160;
    int ynb3 = 140;

    int xmb4 = 440;
    int xnb4 = 340;
    int ymb4 = 180;
    int ynb4 = 160;

    int xmb5 = 420;
    int xnb5 = 360;
    int ymb5 = 200;
    int ynb5 = 180;

    int xmb6 = 400;
    int xnb6 = 380;
    int ymb6 = 220;
    int ynb6 = 200;

    int xmb7 = 395;
    int xnb7 = 380;
    int ymb7 = 250;
    int ynb7 = 220;



    //sun
    int sun1 = 0;
    int sun = 0;
    int xcheeks1 = 40;
    int ycheeks2 = 80;
    int xcheeks2 = 115;
    int yEyes1 = 50;
    int yEyes2 = 95;
    int yEyes3 = 50;
    int xsmile = 40;
    int ysmile = 90;

    //moon
    int xmoon = 180;
    int ymoon = 250;
    int xcheeks1m = 210;
    int ycheeks2m = 330;
    int xcheeks2m = 285;
    int yEyes1m = 300;
    int xEyes2m = 260;
    int xEyes3m = 220;
    int xsmilem = 210;
    int ysmilem = 340;

    //car
    int xCar = 1000;
    int xHood = 1020;
    int xWheel = 1020;
    int xWheel2 = 1140;
    int xWin = 1040;

    public MyPanel()
     {t.start();}

    public void paintComponent(Graphics pen)

        {
        //background
        Color bgBlue = new Color (cRed, cGreen, cBlue);
        pen.setColor(bgBlue);
        pen.fillRect(0, 0, 1000, 400);

        //stars
        pen.setColor(Color.white);
        if (cBlue <= 100)
        {
        for (int stars = 1; stars <200; stars++)
             {
             int xStars = (int)(Math.random( )*(1000-0))+0;
             int yStars = (int)(Math.random( )*(350-0))+0;

             pen.drawString("*", xStars, yStars);
             }
        }
        //sun
        Color sunYellow = new Color (253, 245, 151);
        pen.setColor(sunYellow);
        pen.fillOval(sun1, sun,  160, 160);

        Color sunPink = new Color (255, 128, 192);
        pen.setColor(sunPink);
        pen.fillOval(xcheeks1, ycheeks2, 10, 10);
        pen.fillOval(xcheeks2, ycheeks2, 10, 10);

        pen.setColor(Color.black);
        pen.fillOval(yEyes3, yEyes1, 20, 20);
        pen.fillOval(yEyes2, yEyes1, 20, 20);
        pen.drawArc(xsmile, ysmile, 85, 30, 180, 180);

        //moon
        Color moonGrey = new Color (171, 171, 171);
        pen.setColor(moonGrey);
        pen.fillOval(xmoon, ymoon,  160, 160);

        pen.setColor(sunPink);
        pen.fillOval(xcheeks1m, ycheeks2m, 10, 10);
        pen.fillOval(xcheeks2m, ycheeks2m, 10, 10);

        pen.setColor(Color.black);
        pen.fillOval(xEyes3m, yEyes1m, 20, 20);
        pen.fillOval(xEyes2m, yEyes1m, 20, 20);
        pen.drawArc(xsmilem, ysmilem, 85, 30, 180, 180);

        //grass
        Color grass = new Color (0, 193, 50);
        pen.setColor(grass);
        pen.fillRect(0, 340, 1000, 360);

        //house
        Color base = new Color (255, 215, 245);
        pen.setColor(base);
        pen.fillRect(xB1, yS, 60, 60);

        Color sunRoom = new Color (190, 239, 143);
        pen.setColor(sunRoom);
        pen.fillRect(xS, yS, 60, 60);

        pen.setColor(Color.black);
        pen.fillPolygon(x, y, 4);

        Color sunRoof = new Color (255, 255, 205);
        pen.setColor(sunRoof);
        pen.fillPolygon(a, b, 5);
        pen.fillPolygon(c, d, 5);

        Color chimney = new Color (208, 160, 117);
        pen.setColor(chimney);
        pen.fillRect(xC, yC1, 20, 20);
        pen.fillRect(xC, yC2, 15, 40);

        pen.setColor(Color.blue);
        pen.fillRect(xW1, yW1, 10, 10);
        pen.fillRect(xW2, yW2, 20, 20);
        pen.fillRect(xW3, yW3, 10, 20);
        pen.fillRect(xW4, yW3, 10, 30);
        pen.fillRect(xW5, yW3, 10, 30);
        pen.fillRect(xW6, yW3, 10, 30);



        //balloon
        int R, G, B;
        Random rand = new Random();
        int xb, yb;

        for (int i = 1; i <= 50; i++)
            {
              R = rand.nextInt(256);
              G = rand.nextInt(256);
              B = rand.nextInt(256);
              Color randomColor1 = new Color(R, G, B);
              pen.setColor(randomColor1);


              xb = (int)(Math.random( )*(xmb1-xnb1))+xnb1;
              yb = (int)(Math.random( )*(ymb1-ynb1))+ynb1;
              pen.fillOval(xb, yb, 10, 10);
            }

        for (int i = 1; i <= 45; i++)
            {
              R = rand.nextInt(256);
              G = rand.nextInt(256);
              B = rand.nextInt(256);
              Color randomColor1 = new Color(R, G, B);
              pen.setColor(randomColor1);


              xb = (int)(Math.random( )*(xmb2-xnb2))+xnb2;
              yb = (int)(Math.random( )*(ymb2-ynb2))+ynb2;
              pen.fillOval(xb, yb, 10, 10);
            }

        for (int i = 1; i <= 40; i++)
            {
              R = rand.nextInt(256);
              G = rand.nextInt(256);
              B = rand.nextInt(256);
              Color randomColor1 = new Color(R, G, B);
              pen.setColor(randomColor1);


              xb = (int)(Math.random( )*(xmb3-xnb3))+xnb3;
              yb = (int)(Math.random( )*(ymb3-ynb3))+ynb3;
              pen.fillOval(xb, yb, 10, 10);
            }

        for (int i = 1; i <= 35; i++)
            {
              R = rand.nextInt(256);
              G = rand.nextInt(256);
              B = rand.nextInt(256);
              Color randomColor1 = new Color(R, G, B);
              pen.setColor(randomColor1);


              xb = (int)(Math.random( )*(xmb4-xnb4))+xnb4;
              yb = (int)(Math.random( )*(ymb4-ynb4))+ynb4;
              pen.fillOval(xb, yb, 10, 10);
            }

        for (int i = 1; i <= 20; i++)
            {
              R = rand.nextInt(256);
              G = rand.nextInt(256);
              B = rand.nextInt(256);
              Color randomColor1 = new Color(R, G, B);
              pen.setColor(randomColor1);


              xb = (int)(Math.random( )*(xmb5-xnb5))+xnb5;
              yb = (int)(Math.random( )*(ymb5-ynb5))+ynb5;
              pen.fillOval(xb, yb, 10, 10);
            }

        for (int i = 1; i <= 15; i++)
            {
              R = rand.nextInt(256);
              G = rand.nextInt(256);
              B = rand.nextInt(256);
              Color randomColor1 = new Color(R, G, B);
              pen.setColor(randomColor1);


              xb = (int)(Math.random( )*(xmb6-xnb6))+xnb6;
              yb = (int)(Math.random( )*(ymb6-ynb6))+ynb6;
              pen.fillOval(xb, yb, 10, 10);
            }

         for (int i = 1; i <= 5; i++)
            {
              R = rand.nextInt(256);
              G = rand.nextInt(256);
              B = rand.nextInt(256);
              Color randomColor1 = new Color(R, G, B);
              pen.setColor(randomColor1);


              xb = (int)(Math.random( )*(xmb7-xnb7))+xnb7;
              yb = (int)(Math.random( )*(ymb7-ynb7))+ynb7;
              pen.fillOval(xb, yb, 10, 10);
            }

        //road and fence
        Color road = new Color (128, 128, 128);
        pen.setColor(road);
        int [ ] e = {100, 380, 400, 660};
        int [ ] f = {600, 380, 380, 600};
        pen.fillPolygon(e, f, 4);
        pen.fillRect(0, 500, 1000, 200);

        pen.setColor(Color.WHITE);
        for(int fc = 280; fc <= 520; fc+=5)
           {
           pen.drawLine(fc, 370, fc, 380);
           }

        //car vroom vroom
        pen.setColor(Color.yellow);
        pen.fillRect(xCar, 450, 200, 50);
        pen.fillArc(xHood, 400, 160, 120, 0, 180);
        pen.setColor(Color.black);
        pen.fillOval(xWheel, 475, 50, 50);
        pen.fillOval(xWheel2, 475, 50, 50);
        pen.setColor(Color.blue);
        pen.fillArc(xWin, 410, 120, 80, 0, 180);
        }

    private class Listener implements ActionListener
       {
          public void actionPerformed(ActionEvent e)
           {
              //base
              xB1 = xB1 + 30;


             //sdkhaoe
              xS = xS+ 30;
              yS = yS- 10;


             //chimney
              xC = xC+ 30;
              yC1 = yC1- 10;
              yC2 = yC2- 10;

             //windows
              xW1 = xW1 + 30;
              xW2 = xW2 + 30;
              xW3 = xW3 + 30;
              xW4 = xW4 + 30;
              xW5 = xW5 + 30;
              xW6 = xW6 + 30;
              yW1 = yW1 - 10;
              yW2 = yW2 - 10;
              yW3 = yW3 - 10;


              //background change
              if (cRed>=10){
              cRed = cRed - 10;
              } else {
                cRed = 0;
              }

              if (cGreen>=10){
              cGreen = cGreen - 10;
              } else {
                cGreen = 0;
              }

              if (cBlue>=10){
              cBlue = cBlue - 10;
              } else {
                cBlue = 0;
              }


              //car
              if (xCar>=510){
              xCar -= 20;
              xHood -= 20;
              xWheel -= 20;
              xWheel2 -=20;
              xWin -=20;
              } else {
              xCar = 500;
              xHood = 520;
              xWheel = 520;
              xWheel2 = 640;
              xWin = 540;
              }

              //sun
              if (sun<=330){
              sun = sun + 20;
              ycheeks2 = ycheeks2 + 20;
              yEyes1 = yEyes1 + 20;
              ysmile = ysmile + 20;
              } else {
              sun = 340;
              ycheeks2 = 420;
              yEyes1 = 390;
              ysmile = 430;
              }


              //moon
              if (ymoon>=15){
              ymoon = ymoon - 15;
              ycheeks2m = ycheeks2m - 15;
              yEyes1m = yEyes1m - 15;
              ysmilem = ysmilem - 15;
              } else {
              ymoon = 0;
              ycheeks2m = 80;
              yEyes1m = 50;
              ysmilem = 90;
              }


              //balloons
              xmb1 = xmb1 + 30;
              xnb1 = xnb1 + 30;
              ymb1 = ymb1 - 10;
              ynb1 = ynb1 - 10;

              xmb2 = xmb2 + 30;
              xnb2 = xnb2 + 30;
              ymb2 = ymb2 - 10;
              ynb2 = ynb2 - 10;

              xmb3 = xmb3 + 30;
              xnb3 = xnb3 + 30;
              ymb3 = ymb3 - 10;
              ynb3 = ynb3 - 10;

              xmb4 = xmb4 + 30;
              xnb4 = xnb4 + 30;
              ymb4 = ymb4 - 10;
              ynb4 = ynb4 - 10;

              xmb5 = xmb5 + 30;
              xnb5 = xnb5 + 30;
              ymb5 = ymb5 - 10;
              ynb5 = ynb5 - 10;

              xmb6 = xmb6 + 30;
              xnb6 = xnb6 + 30;
              ymb6 = ymb6 - 10;
              ynb6 = ynb6 - 10;

              xmb7 = xmb7 + 30;
              xnb7 = xnb7 + 30;
              ymb7 = ymb7 - 10;
              ynb7 = ynb7 - 10;

              for(int p=0;p<x.length;p++)
              x[p]+=30;
              for(int p=0;p<y.length;p++)
              y[p]-=10;

              //sunRoof2
              for(int p=0;p<a.length;p++)
              a[p]+=30;
              for(int p=0;p<b.length;p++)
              b[p]-=10;
              for(int p=0;p<c.length;p++)
              c[p]+=30;
              for(int p=0;p<d.length;p++)
              d[p]-=10;

              repaint();
           }
       }
}