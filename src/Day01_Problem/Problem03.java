package Day01_Problem;

import java.util.Scanner;

public class Problem03 {

    //Write a program to read two numbers and print their sum, difference, product and quotient.
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int FirstNum =sc.nextInt();
        System.out.println("Enter Second Number: ");
        int SecondNum = sc.nextInt();
        int sum = FirstNum+SecondNum;
        int difference = FirstNum-SecondNum;
        int Product = FirstNum*SecondNum;
        double quotient =(double) FirstNum / SecondNum;
        System.out.println("Sum of Two Number :" + sum);
        System.out.println("Difference of Two Number :" + difference);
        System.out.println("Product of Two Number :" + Product);
        System.out.println("Quotient of Two Number :" + quotient);
    }
}
