import apcslib.*;

public class Rectangle{
    
    
    public int myX;      // the x coordinate of the rectangle
    public int myY;      // the y coordinate of the rectangle
    public int myWidth;  // the width of the rectangle
    public int myHeight; // the height of the rectangle
    
    private static DrawingTool pen = new DrawingTool(new SketchPad(500, 500));
    
    // calculates and returns the perimeter of the rectangle
    Rectangle(){
        myX = 0;
        myY = 0;
        myWidth = 0;
        myHeight = 0;
    }
    
    Rectangle(int x, int y, int width, int height){
        myX = x;
        myY = y;
        myWidth = width;
        myHeight = height;
    }
    
    public double getPerimeter(){
        double myPerim = myWidth * 2 + myHeight * 2;
        return myPerim;
    }
    
    // Calculates and returns the are of the rectangle.
    public double getArea(){
        double myArea = myWidth * myHeight;
        return myArea;
    }
    
    // Draws a new instance of a Rectangle object with the left and right
    // edges of the rectangle at x and x + width. The top and bottom edges
    // are at y and y + height.
    public void draw(){
        pen.up();
        pen.move(myX, myY);
        pen.down();
        
        pen.move(myX, myY + myHeight);
        pen.move(myX + myWidth, myY + myHeight);
        pen.move(myX + myWidth, myY);
        pen.move(myX, myY);
    }
}