package Day16_Problem;

import java.util.Scanner;

public class Problem48 {
    // Write a program to display all Armstrong numbers from 1 to n.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();

        if (num ==0){
            System.out.println("0 is Armstrong Number");
            return;
        }

        for (int i=1; i<=num; i++){
            int digitCount =0;
            int original =i; //compare ke liye
            int temp =i; // process k liye
            while (temp!=0){
                temp =temp/10;
                digitCount++;
            }
            temp =original;

            int sum =0;
            while (temp!=0){
                int digit = temp %10;
                int result = (int) Math.pow(digit, digitCount);
                temp = temp /10;
                sum = sum + result;
            }
            if (sum == original){
                System.out.println(original);
            }
        }
        sc.close();
    }
}
