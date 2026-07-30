package Day17_Problem;

import java.util.Scanner;

public class Problem50 {
    // Write a program to check whether a number is a strong number (sum of factorials of its digits).
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        int original = num; // save original number kuki compare karne ke liye.
        int sum =0; // sare fact ko add karne ke liye.

        while (num!=0){
            int lastDigit = num%10;
            int fact =1;
            for (int i=1; i<=lastDigit; i++){
                fact = fact * i;
            }
            sum = sum+ fact;
            num = num/10;
        }
        if (sum == original){
            System.out.println("Strong Number");
        }else {
            System.out.println("Not strong number:");
        }
    }
}
