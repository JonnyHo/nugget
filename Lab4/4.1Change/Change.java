
/**
 * Jonathan Ho
 * Lab 4.1
 * Create a program that will calculate the amount of change needed after a bill or set of bills is tendered.
 * Description: Create a program that will calculate how much change in coins we need.
 * Purpose: Learn about the new ConsoleIO command and how to use it
 * September 8th, 2021
 */

import apcslib.*;           //imports apcs library          
import chn.util.*;          //imports chn.util
public class Change
{
    public static void main(String [] args){                            // Main method
        double purchaseAmount, cashPaid, temp;                          // Declares purchaseAmount, cashPaid, and temp as a double
        int change;                                                     // Declares change as an integer
        ConsoleIO keyboard = new ConsoleIO();                           // Creates object ConsoleIO 
        System.out.println("Amount of purchase = ");                    // Class:System Object: out Method:println Argument:"Amount of purchase"
        purchaseAmount = keyboard.readDouble();                         // Declares purchaseAmount as an input of keyboard
        System.out.println("Amount of cash tendered = ");               // Class:System Object: out Method:println Argument: "Amount of cash tendered = "
        cashPaid = keyboard.readDouble();                               // Declares cashPaid as an input of keyboard

        temp = cashPaid - purchaseAmount;                               // Declares temp as a variable of cashPaid - purchaseAmount
        temp = temp - (int)temp + 0.00001;                              // Declares temp as a variable of temp - temp +.00001
        change = (int)(temp * 100);                                     // Declares change as a variable of temp*100

        System.out.println("Amount of Purchase " + purchaseAmount);     // Class:System Object: out Method:println Argument:"Amount of Purchase " + purchaseAmount
        System.out.println("\nCash tendered = " + cashPaid);            // Class:System Object: out Method:println Argument:"\nCash tendered = " + cashPaid
        System.out.println("\nAmount of Coins needed: ");               // Class:System Object: out Method:println Argument:"\nAmount of Coins needed: "
        System.out.println();                                           // Class:System Object: out Method:println Argument:
        System.out.println("   " + (change) + " cents");                // Class:System Object: out Method:println Argument:"   " + (change) + " cents"
        System.out.println();                                           // Class:System Object: out Method:println Argument:
        System.out.println("   " + change/25 + " quarters");            // Class:System Object: out Method:println Argument:"   " + change/25 + " quarters"
        change = change%25;                                             // Calculates change as change modulus 25
        System.out.println("   " + change/10 + " dimes");               // Class:System Object: out Method:println Argument:"   " + change/10 + " dimes"
        change = change%10;                                             // Calculates change as change modulus 10
        System.out.println("   " + change/5 +  " nickels");             // Class:System Object: out Method:println Argument:"   " + change/5 +  " nickels"
        change = change%5;                                              // Calculates change as change modulus 5
        System.out.println("   " + change/1 +  " pennies");             // Class:System Object: out Method:println Argument:"   " + change/1 +  " pennies"
        change = change%1;                                              // Calculates change as change modulus 1
            
        

         
        
        
    
     }
}    
