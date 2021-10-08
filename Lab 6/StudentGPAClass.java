
/**
 * Lab 6.1
 * Jonathan Ho
 * 9/24/21
 * 
 * Description: In this lab we will calculate a students GPA using three grades
 * Purpose: Learn to make a class and use the methods in the class.
 */

class StudentGPAClass{                              //new class
    private double myTotalPoints;                   //declare double myTotalPoints with private accessor
    private double myNumGrades;                     //declare double myNumGrades with private accessor
    private double myGPA;                           //declare double myGPA with private accessor

    public StudentGPAClass(String name, String id){ //new method with parameters name and  id
        myTotalPoints = 0;                          //set myTotalPooints equal to zero
        myNumGrades = 0;                            //set myNumGrades equal to zero
        myGPA = 0;                                  //set myGPA equal to zero
    }    
    
    public void addGrade(double grade){             //new method addGrade with parameter grade
        myNumGrades += grade;                       //add grade to myNumGrades
        myTotalPoints++;                            //add 1 to myTotalPoints
    }
    
    public double getGPA(){                         //new method getGPA
        myGPA = myNumGrades/myTotalPoints;          //set myGPA equal to myNumGrades over myTotalPoints
        return myGPA;                               //return myGPA
    }
}

