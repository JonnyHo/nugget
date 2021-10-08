
/**
 * Lab 6.1
 * Jonathan Ho
 * 9/24/21
 * 
 * Description: In this lab we will calculate a students GPA using three grades
 * Purpose: Learn to make a class and use the methods in the class.
 */
import chn.util.*;
import apcslib.*;

public class StudentGPA                                                     //class
{
    public static void main(String[] args){                                 //main method
        ConsoleIO console = new ConsoleIO();                                //construct new console object from the ConsoleIO class
        
        System.out.print("Student's name: ");                               //print a statement that prompts the user to give their name
        String name = console.readToken();                                  //declare string name as the user input  
        
        System.out.print("Student's ID: ");                                 //print a statement that prompts the user for their ID
        String studentID = console.readToken();                             //declare string studentID as the user input
        
        StudentGPAClass studentGPA = new StudentGPAClass(name, studentID);  //construct new studentGPA object from the StudentGPAClass class
        
        System.out.println("\nInitial GPA: 0.0\n");                         //print a statement that states the initial gpa as 0
        
        System.out.print("Enter a grade: ");                                //print a statement that prompts the user for their first grade
        int grade1 = console.readInt();                                     //declare integer grade1 as the user input
        studentGPA.addGrade(grade1);                                        //user method addGrade with the parameter grade1 to add grade1 to myTotalPoints
        double GPA = studentGPA.getGPA();                                   //declare double GPA as the output from the getGPA method
        System.out.println("GPA: " + Format.left(GPA, 0, 1) + "\n");        //print the GPA rounded to two decimal places
        
        System.out.print("Enter a grade: ");                                //print a statement that prompts the user for their second grade
        int grade2 = console.readInt();                                     //declare integer grade2 as the user input
        studentGPA.addGrade(grade2);                                        //user method addGrade with the parameter grade2 to add grade2 to myTotalPoints
        GPA = studentGPA.getGPA();                                          //set GPA as the output from the getGPA method
        System.out.println("GPA: " + Format.left(GPA, 0, 1) + "\n");        //print the GPA rounded to two decimal places
        
        System.out.print("Enter a grade: ");                                //print a statement that prompts the user for their third grade
        int grade3 = console.readInt();                                     //declare integer grade3 as the user input
        studentGPA.addGrade(grade3);                                        //user method addGrade with the parameter grade3 to add grade3 to myTotalPoints
        GPA = studentGPA.getGPA();                                          //set GPA as the output from the getGPA method
        System.out.println("GPA: " + Format.left(GPA, 0, 2) + "\n");        //print the GPA rounded to two decimal places
    }
}
