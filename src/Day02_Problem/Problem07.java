package Day02_Problem;

import java.util.Scanner;

public class Problem07 {
    //Write a program to swap two numbers without using a third variable.
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int b = sc.nextInt();
        System.out.println("Before Swapping Two Numbers: ");
        System.out.println("First Number is : " + a);
        System.out.println("Second Number is : " + b);

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swapping Two Number:");

        System.out.println("First Number is :" + a);
        System.out.println("Second Number is :" + b);
    }
}
