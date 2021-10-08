
/**
 * Jonathan Ho
 * Lab 5.1
 * Purpose: Utilize the keyword final to save and reference numbers later in code. Also learned to format output in a neat way.
 * Description: Program that calculates how much money out of your salary you need to forfeit due to taxes.
 * 9/16/21
 */

import chn.util.*;
import apcslib.*;
public class Taxes                                                              //main class
{
    public static void main (String [] args)                                    //main method 
    {
      ConsoleIO input = new ConsoleIO();                                        //creates Console object named input 
      
      System.out.println("How many hours you have worked: ");                   //prints line prompting the user for how many hours they have worked
      int hoursWorked = input.readInt();                                        //declares hoursWorked as an int for the user input of hours
        
      System.out.println("How much money you earn an hour: ");                  //prints line prompting the user for how much money they make an hour
      double hourlyRate = input.readDouble();                                   //declares hourlyRate as a double for the user input of salary
      
      double grossPay = hoursWorked * hourlyRate;                               //declares grossPay as the total money made without taxes 
      
      final double federalTaxRate = 0.15;                                       //saving federalTaxRate as the federal tax rate of 0.15
      double federalTax = grossPay * federalTaxRate;                            //declares federalTax as the amount of gross pay needs to be given up due to federal tax
      
      final double ficaTaxRate = 0.0765;                                        //saving ficaTaxRate as the federal tax rate of 0.0765
      double ficaTax = grossPay * ficaTaxRate;                                  //declares ficaTax as the amount of gross pay needs to be given up due to fica tax
      
      final double stateTaxRate = 0.04;                                         //saving stateTaxRate as the federal tax rate of 0.04
      double stateTax = grossPay * stateTaxRate;                                //declares stateTax as the amount of gross pay needs to be given up due to state tax
        
      double netPay = grossPay - federalTax - ficaTax - stateTax;               //declares netPay as the gross pay with all taxes subtracted         
      
      System.out.print(Format.left("Hours worked", 20));                        //print statement for hours worked
      System.out.println(Format.right(hoursWorked, 10));                        //print the value for variable hoursWorked
     
      System.out.print(Format.left("Hourly rate", 20));                         //print statement for hourly rate
      System.out.println(Format.right(hourlyRate, 10, 2));                      //print the value for variable hourlyRate
      
      System.out.print(Format.left("\nGross pay", 21));                         //print statement for gross pay
      System.out.println(Format.right(grossPay, 10, 2));                        //print the value for variable grossPay
      
      System.out.print(Format.left("\nFederal tax (15%)", 21));                 //print statement for federal tax
      System.out.println(Format.right(federalTaxRate, 10, 2));                  //print the value for variable federalTaxRate
      
      System.out.print(Format.left("FICA (7.65%)", 20));                        //print statement for fica tax
      System.out.println(Format.right(ficaTaxRate, 10, 2));                     //print the value for variable ficaTaxRate
      
      System.out.print(Format.left("State tax (4%)", 20));                      //print statement for state tax
      System.out.println(Format.right(stateTaxRate, 10, 2));                    //print the value for variable stateTaxRate
      
      System.out.print(Format.left("\nNet pay", 21));                           //print statement for net pay
      System.out.println(Format.right(netPay, 10, 2));                          //print the value for variable netPay
      
     
    
    }
}
