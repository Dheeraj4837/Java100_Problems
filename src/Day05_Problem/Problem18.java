package Day05_Problem;

import java.util.Scanner;

public class Problem18 {
    //Write a program to read the marks of a student and print the grade (A/B/C/D/Fail).
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks:");
        int marks = sc.nextInt();
        if (marks>= 80 && marks<=100){
            System.out.println("A : Grade");
        }else if (marks>=60 && marks<=79){
            System.out.println("B : Grade");
        } else if (marks>=40 && marks<=59) {
            System.out.println("C : Grade");
        } else if (marks>=30 && marks<=39) {
            System.out.println("D : Grade");
        } else if (marks>100 || marks<0) {
            System.out.println("Please Enter valid Marks");
        } else {
            System.out.println("Student Fail...");
        }
    }
}
