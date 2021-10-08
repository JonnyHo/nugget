import apcslib.*;
import chn.util.*;

public class Rect{
    public static void main(String [] args){
        DrawingTool pen = new DrawingTool(new SketchPad(500, 500));
        
        Rectangle rectA = new Rectangle(-150, -150, 300, 300);
        rectA.draw();
        System.out.println("Perimeter of A = " + (int) rectA.getPerimeter()); 
        System.out.println("Area of A = " + (int) rectA.getArea());
        
        Rectangle rectB = new Rectangle(-50, -150, 100, 300);
        rectB.draw();
        System.out.println("Perimeter of B = " + (int) rectB.getPerimeter()); 
        System.out.println("Area of B = " + (int) rectB.getArea());
        
        Rectangle rectC = new Rectangle(-150, -50, 300, 100);
        rectC.draw();
        System.out.println("Perimeter of C = " + (int) rectC.getPerimeter()); 
        System.out.println("Area of C = " + (int) rectC.getArea());
    }
}