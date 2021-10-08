package daily;


/**
 * Write a description of class Precedence here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import chn.util.*;

public class Precedence
{
    public static void main(String[] args){
        int num;
        ConsoleIO input = new ConsoleIO();
        
        System.out.println("Enter int -->");
        num = input.readInt();
        
        System.out.println("\nnum = " + num + " ++num = " + (++num));
        System.out.println("num = " + num + " --num = " + (--num));
        System.out.println("\nnum = " + num + " num++ = " + (num++));
        System.out.println("num = " + num + " num-- = " + (num--));
    }
}
