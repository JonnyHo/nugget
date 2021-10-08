
/**
 * Jonathan Ho
 * 9/22/21
 * Purpose: to learn how to apply real mathematical formulas into coding and the order of operations
 * Description: a program that outputs the 2 roots of a quadratic equation 
 */

import java.lang.*;
import apcslib.*;
import chn.util.*;
public class Quadratic                                                                                              //class
{
    public static void main (String [] args)                                                                        //main method
    {
       ConsoleIO input = new ConsoleIO();                                                                           //makes new input object
       
       System.out.println("Select coefficients a, b, and c for a quadratic equation:\na=");                         //prints statement to prompt user to input values
    
       double a = input.readDouble();                                                                               //declares a as the double value inputted by the user
       
       System.out.println("b=");                                                                                    //prints statement to prompt user to input values                                                                     
       double b = input.readDouble();                                                                               //declares b as the double value inputted by the user
       
       System.out.println("c=");                                                                                    //prints statement to prompt user to input values
       double c = input.readDouble();                                                                               //declares c as the double value inputted by the user
       
       double zero1 = (- b + (Math.sqrt( b * b - 4 * a * c)))/ 2 * a;                                               //declares zero1 as the first root of the quadratic equation
       double zero2 = (- b - (Math.sqrt( b * b - 4 * a * c)))/ 2 * a;                                               //declares zero2 as the first root of the quadratic equation                                
       
       System.out.println("First root of your quadratic equation: x = " + Format.left(zero1, 0, 4));        //prints statement to show user what the first root is       
       System.out.println("Second root of your quadratic equation: x = " + Format.left(zero2, 0, 4));       //prints statement to show user what the second root is
       
     }
}


