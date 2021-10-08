package daily;

/**
 * Write a description of class tree here.
 *
 * @author Jason Ballinger
 * @version 9/23/2021
 * 
 */

import apcslib.*;
import chn.util.*;

public class tree
{
    public static void main(String[] args){
        ConsoleIO input = new ConsoleIO();
        
        System.out.print("size: ");
        int size = input.readInt();
        
        System.out.println(Format.right("*", size + 1));
        for (int cnt = size; cnt > 1; cnt--)
            System.out.println(Format.right("*", cnt) + Format.right("*", ((size+1)-cnt) * 2));
        
        for (int cnt = (size * 2) + 1; cnt > 0; cnt --)
            System.out.print("*");
    }
}
