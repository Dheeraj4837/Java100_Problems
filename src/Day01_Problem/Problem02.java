package Day01_Problem;

import java.util.Scanner;
    // .
    //Write a program to read two numbers and print their sum.
public class Problem02 {
    public static  void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int FirstNum = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int SecondNum = sc.nextInt();
        int sum = FirstNum+SecondNum;
        System.out.println("Sum Of two Number :"+ sum);

    }
}
