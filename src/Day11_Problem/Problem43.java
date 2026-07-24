package Day11_Problem;

import java.util.Scanner;

public class Problem43 {
   // Write a program to find the sum of the first and last digit of a number n.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        int lastDigit = num% 10 ;
        if (num <0){
            System.out.println("Please Enter Positvie Number: ");
            return;
        }
        while (num>= 10){
            num = num/10;
        }
        int firstDigit = num;
        int sum = firstDigit + lastDigit;
        System.out.println("Sum of First Digit and Last Digit : " +sum);
    }
}
