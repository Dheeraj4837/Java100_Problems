package Day20_Problem;

import java.util.Scanner;

public class Problem58 {
    //Write a program to find the sum of the first n terms of the Fibonacci series.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the terms of Fibonacci Series: ");
        int num = sc.nextInt();
        int firstNum =0;
        int secondNum =1;
        if (num <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }
        if (num ==1){
            System.out.print("Sum of Fibonacci Series is : "+firstNum);
        } else if (num ==2) {
            int sum = firstNum+ secondNum;
            System.out.println("Sum of Fibonacci Series is : "+sum);
        }else
        {
            int sum =1;
            while (num>2){
                int nextNum = firstNum + secondNum;
                sum = sum+ nextNum;
                firstNum =secondNum;
                secondNum =nextNum;
                num--;
            }
            System.out.println("Sum of Fibonacci Series is : "+ sum);
        }
        sc.close();
    }
}
