// ****************************************************************
//   Student.java
//
//   Define a student class that stores name, score on test 1, and
//   score on test 2.  Methods prompt for and read in grades,
//   compute the average, and return a string containing student's info.
// ****************************************************************
import java.util.Scanner;
public class Student
{
    //declare instance data
    private String name;
    private int test1Score;
    private int test2Score;
    //-----------------------------------------------
    //constructor
    Scanner scanner = new Scanner(System. in);
    //-----------------------------------------------
    public Student(String studentName)
    {
        this.name = studentName;
    }
    //-----------------------------------------------
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    //-----------------------------------------------
    public void inputGrades()
    {
        System.out.println("Test 1: Enter grade for " + this.name);
        this.test1Score = scanner.nextInt();
        System.out.println("Test 2: Enter grade for " + this.name);
        this.test2Score = scanner.nextInt();
    }
    //-----------------------------------------------
    //getAverage: compute and return the student's test average
    //-----------------------------------------------
    public int getAverage()
    {
        return ((this.test1Score+this.test2Score)/2);
    }
    //-----------------------------------------------
    //getName: return the student's name
    //-----------------------------------------------
    public String getName()
    {
        return this.name;
    }
    //-----------------------------------------------
    //printName: print the student's name
    //-----------------------------------------------
    public String printName()
    {
        //add body of printName
    }
