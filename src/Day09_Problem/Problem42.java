package Day09_Problem;

import java.util.Scanner;

public class Problem42 {
    // Write a program to replace all zeros in a number n with the digit 5.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        int newNumber =  0;
        int reverse =0;
        if (num ==0){
            System.out.println(5);
            return;
        }
        while (num!=0){
            int lastDigit = num%10;
            if (lastDigit == 0){
                lastDigit =5;
            }
            newNumber = newNumber * 10 + lastDigit;
            num = num/10;
        }
        while (newNumber!=0){
            int last = newNumber %10;
            reverse = reverse *10 + last;
            newNumber = newNumber/10;
        }
        System.out.println(reverse);
        sc.close();
    }
}
