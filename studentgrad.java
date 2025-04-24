package oop;
import java.util.*;
public class studentgrad {
    
    private String Student_name;
    private String Student_roll;
    private int Semester;
    private String Course_name;
    private int Marks;
    private char grades;

    studentgrad(){

        Student_name = null;
        Student_roll = null;
        Semester = 0;
        Course_name = null;
        Marks = 0;
        grades = ' ';
        
    }
    studentgrad(String Student_name,String Student_roll,int Semester,String Course_name,int Marks){
        this.Student_name=Student_name;
        this.Student_roll=Student_roll;
        this.Semester=Semester;
        this.Course_name=Course_name;
        this.Marks=Marks;
        this.grades = calculategrade(Marks);   
}
public void getstudentdata(){
    Scanner sc = new Scanner (System.in);
    System.out.print("ENTER THE STUDENT NAME :");
    Student_name = sc.nextLine();
    System.out.print("ENTER THE STUDENT ROLL :");
    Student_roll = sc.nextLine();
    System.out.print("ENTER THE SEMESTER :");
    Semester = sc.nextInt();
    sc.nextLine();
   System.out.println("ENTER THE COURSE NAME :");
   Course_name = sc.nextLine();
    System.out.print("ENTER THE MARKS :");
    Marks = sc.nextInt();
    
    grades = calculategrade(Marks);
}
private char calculategrade(int marks) {
    if (marks >= 9) return 'A';
    else if (marks >= 7) return 'B';
    else if (marks >= 5) return 'C';
    else return 'F';
}
public void displayQuizGrade() {
    System.out.println("\nStudent Name: " +  Student_name);
    System.out.println("Roll No.: " +Student_roll );
    System.out.println("Semester No.: " + Semester);
    System.out.println("Course Name: " +  Course_name);
    System.out.println("Marks: " + Marks);
    System.out.println("Grade: " + grades);
}
public static void main(String[] args) {
    studentgrad s = new studentgrad();
    s.getstudentdata();
    s.displayQuizGrade();


    studentgrad S1 = new studentgrad("ALI SAJID","SP24-BSE-040",3,"OOP",10);
    S1.displayQuizGrade();
    System.out.println();
    studentgrad S2 = new studentgrad("USAMA KHAN","SP24-BSE-087",3,"OOP",10);
    S2.displayQuizGrade();
}










}
