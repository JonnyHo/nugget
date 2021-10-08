
/** 
 * Author: Jonathan Ho
 * Lab: LA1.1 - DrawSquare
 * Description: Creates a piece of paper and a pencil, and draws a squre 100 units on each side.
 * 8/25/21
 */

import apcslib.*;
import java.awt.Color;

public class DrawSquare
{
  public static void main(String[] args)
  {
    DrawingTool pencil;
    SketchPad paper;

    paper = new SketchPad(300, 300);
    pencil = new DrawingTool(paper);

    // draw the square
    
    pencil.setColor(Color.blue); //sets color of drawing tool to blue
    pencil.forward(100);         //draws a line 100 units long
    pencil.turnLeft(90);         //turns drawing tool 90 degrees to the left
    pencil.forward(100);         //draws a line 100 units long
    pencil.turnLeft(90);         //turns drawing tool 90 degrees to the left
    pencil.forward(100);         //draws a line 100 units long
    pencil.turnLeft(90);         //turns drawing tool 90 degrees to the left
    pencil.forward(100);         //draws a line 100 units long
    
    // draw the roof
    pencil.setColor(Color.orange); //sets color of drawing tool to orange
    pencil.up();                   //lifts the drawing tool off of the page
    pencil.move(-100,100);         //moves the drawing tool to the coordinates shown
    pencil.down();                 //places the drawing tool back onto the page
    pencil.turnRight(70);          //turns the drawing tool 70 degrees to the right
    pencil.forward(125);           //draws a line 125 units long
    pencil.turnRight(132.5);       //turns the drawing tool 132.5 degrees to the right
    pencil.forward(125);           //draws a line 125 units long
    
    //draw the door
    pencil.setColor(Color.red);    //sets color of drawing tool to red
    pencil.up();                   //lifts the drawing tool off of the page       
    pencil.move(-60,0);            //moves the drawing tool to the coordinates shown
    pencil.down();                 //places the drawing tool back onto the page
    pencil.turnLeft(210);          //turns the drawing tool 210 degrees to the left
    pencil.forward(30);            //draws a line 30 units long
    pencil.turnRight(90);          //turns the drawing tool 90 degrees to the right
    pencil.forward(15);            //moves the drawing tool 15 units forward
    pencil.turnRight(90);          //turns the drawing tool 90 degrees to the right
    pencil.forward(30);            //draws a line 30 units long
    
    
    
  }
}
