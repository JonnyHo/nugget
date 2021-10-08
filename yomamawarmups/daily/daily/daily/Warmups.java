package daily;

/**
 * Write a description of class Warmups here.
 *
 * @author Jason Ballinger
 * @version 9/28/2021
 */

import chn.util.*;

public class Warmups
{
    public static void main(String[] args){
        ConsoleIO input = new ConsoleIO();
        
        System.out.print("Enter numA --> ");
        double numA = input.readDouble();
        System.out.print("Enter numB --> ");
        double numB = input.readDouble();
        
        WarmupMethods warmup = new WarmupMethods(numA, numB);
        WarmupMethods dup = new WarmupMethods(warmup);
        System.out.println("\nSum of " + dup.getnuma() + " & " + numB + " = " + dup.sum());
        System.out.println("Quotient of " + numA + " & " + numB + " = " + dup.quotient());
        System.out.println("Difference of " + numA + " & " + numB + " = " + warmup.difference());
    }
}
