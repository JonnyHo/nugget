
/**
 *  8/28/21
 *  Author:      Jonathan Ho
 *  Description: Creates a piece of paper and a pencil,
 *               and draws a benzene symbol.
 *  Purpose:     Reuse old draw commands as well as learn the circle command
 *  Lab:         LA2.1 - Benzene 
 */


import apcslib.*;

public class Benzene
{
    public static void main(String[] args) {
    DrawingTool pencil;
    SketchPad paper;

    paper = new SketchPad(300, 300);
    pencil = new DrawingTool(paper);

    //hexagon
    pencil.forward(300);   //draws a line 300 units long
    pencil.turnRight(60);  //rotates drawing tool 60 degrees to the right
    pencil.forward(300);   //draws a line 300 units long
    pencil.turnRight(60);  //rotates drawing tool 60 degrees to the right
    pencil.forward(300);   //draws a line 300 units long
    pencil.turnRight(60);  //rotates drawing tool 60 degrees to the right
    pencil.forward(300);   //draws a line 300 units long
    pencil.turnRight(60);  //rotates drawing tool 60 degrees to the right
    pencil.forward(300);   //draws a line 300 units long
    pencil.turnRight(60);  //rotates drawing tool 60 degrees to the right
    pencil.forward(300);   //draws a line 300 units long
   
    
   //circle
   pencil.up();            //lifts drawing tool off the page
   pencil.turnRight(120);  //rotates drawing tool 120 degrees to the right
   pencil.forward(300);    //draws a line 300 units long
   pencil.down();          //places drawing tool back on the page
   pencil.drawCircle(150); //draws a circle with radius 150 units
   
    }
}
