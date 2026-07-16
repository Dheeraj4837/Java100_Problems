package Day02_Problem;

import java.util.Scanner;

public class Problem09 {
    //Write a program to read the marks of 5 subjects and print the total and average.
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Five Subject Marks:");
        System.out.print("Enter Hindi Marks:");
        int hindi = sc.nextInt();

        System.out.print("Enter English Marks: ");
        int English = sc.nextInt();

        System.out.print("Enter Math Marks: ");
        int Math = sc.nextInt();

        System.out.print("Enter Science Marks:");
        int Science = sc.nextInt();

        System.out.print("Enter GK marks: ");
        int GK = sc.nextInt();

        int Total_Marks = hindi+English+Math+Science+GK;
        System.out.println("Total Marks Of Five Subjects: " + Total_Marks);

        double Avg =(double) Total_Marks/5;
        System.out.println("Average Marks Of Five Subjects: " + Avg);



    }
}
