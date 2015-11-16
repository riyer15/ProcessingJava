import processing.core.PApplet;
import processing.core.PFont;

public class BounceR extends PApplet
{
  boolean drawR = false;
  int frame = 0;
  int radius = 45;
  float posx1, posx2, posx3, posy1, posy2, posy3, posx4, posy4;
  float xspeed = (float)2.0;
  float yspeed = (float)1.4;
  int y1direction = 1;
  int y2direction = 1;
  int y3direction = 1;
  int y4direction = 1;
  int x1direction = 1;
  int x2direction = 1;
  int x3direction = 1;
  int x4direction = 1;
  PFont Bebas;

  public void setup()
  {
    size(400, 400);
    Bebas = createFont("BebasNeueBold", 64);
    textFont(Bebas);
    noStroke();
    posx1 = width/4;
    posy1 = height/4;
    posx2 = width*3/4;
    posy2 = height/4;
    posx3 = width/4;
    posy3 = height*3/4;
    posx4 = width/2;
    posy4 = height/2;
  }
  public void draw() 
  {
      posx1 = posx1 + (xspeed*x1direction);
      posx2 = posx2 + (xspeed*x2direction);
      posx3 = posx3 + (xspeed*x3direction);
      posx4 = posx4 + (xspeed*x4direction);
      posy1 = posy1 + (yspeed*y1direction);
      posy2 = posy2 + (yspeed*y2direction); 
      posy3 = posy3 + (yspeed*y3direction);  
      posy4 = posy4 + (yspeed*y4direction);  
      background(255);
      fill(mouseX, 150, mouseY);
      ellipse(posx1, posy1, radius*2, radius*2);  
      fill(mouseX, 175, 150);
      ellipse(posx2, posy2, radius*2,radius*2);
      fill(mouseY, mouseX, 150);
      ellipse(posx3, posy3, radius*2, radius*2);
      fill(125, mouseX, mouseY);
      ellipse(posx4, posy4, radius*2, radius*2);
      
      if (posx1 > width-radius || posx1 < radius ) 
      {x1direction *= -1;}
      
      if (posy1> height-radius || posy1 < radius) 
      { y1direction *= -1;}
      
      if (posx2 > width-radius || posx2 < radius ) 
      { x2direction *= -1;}
      
      if (posy2> height-radius || posy2 < radius) 
      {y2direction *= -1;}
      
      if (posx3 > width-radius || posx3 < radius ) 
      { x3direction *= -1;}
      
      if (posy3> height-radius || posy3 < radius) 
      { y3direction *= -1;}
      
      if (posx4 > width-radius || posx4 < radius ) 
      { x4direction *= -1;}
      
      if (posy4> height-radius || posy4 < radius) 
      { y4direction *= -1;}
      
      if (drawR == true) 
      {
        fill(0, mouseX/5+55);
        text("Rani", 100, 200);
        for(int i = 0; i < 6; i++)
        {
         fill(mouseY, mouseY+50, 150);
         ellipse(mouseX, mouseY, radius*2, radius*2);
        }
      }
      frame++;
  }

 public void keyPressed() 
  {
    if ((key == 'R') || (key == 'r')) 
    {
      drawR = true;
    }
  }

}
