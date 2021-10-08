
/**
 * Jonathan Ho
 * September 12th, 2021
 * Lab 4.2
 * Description: A program that prints the license plate of a car into ASCII values
 * Purpose: Convert a license plate from 6 letters and numbers into ASCII values 
 *
 * 
 */
import apcslib.*;
import chn.util.*;

public class Car_Rental
{
    public static void main(String [] args){        // Main Method
        ConsoleIO input = new ConsoleIO();                                                          // Declares ConsoleIO as an object of class ConsoleIo

        String carLetter, carMake, model;                                                           // Declares carLetter, carMake, model as strings
        int carNumber;                                                                              // Declares carNumber as an integer
        
        System.out.println("Make = ");                                                              // Class is System Object is out Method is println and Argument is "Make = "
        carMake = input.readToken();                                                                // Reads what the user has inputted and assigns that as carMake
        
        System.out.println("Model = ");                                                             // Class is System Object is out Method is println and Argument is "Model = "
        model = input.readToken();                                                                  // Reads what the user has inputted and assigns that as model

        System.out.print("Enter license plate (3 letters - 3 digits) --> ");                        // Class:System Object:out Method:println Argument:"Enter license plate (3 letters - 3 digits) --> "
        carLetter = input.readToken();                                                              // Reads what the user has inputted and assigns that as carLetter
        carNumber = input.readInt();                                                                // Reads what the user has inputted and assigns that as carNumber
        
        int sumofAscii = (carLetter.charAt(0)) + (carLetter.charAt(1)) + (carLetter.charAt(2));     // Declares sumofAscii as adding all ASCII values of carLetter using .charAt(position)
        
        int totalSum = sumofAscii + carNumber;                                                      // Declares totalSum as sumofAscii plus carNumber
        char letter = (char) (totalSum%26 + 'A');                                                   // Converts totalSum into characters 

        
        System.out.println("Make =  " + carMake);                                                    // Class is System Object is out Method is println and Argument is "Make = " + carMake
        System.out.println("Model = " + model);                                                     // Class is System Object is out Method is println and Argument is "Model = " + model
        System.out.println(carLetter + " " +carNumber + " = " +letter + ""+ totalSum);               // Class is System Object is out Method is println and Argument is carLetter + " " +carNumber 

        
    }
}
