package Day17_Problem;

import java.util.Scanner;

public class Problem51 {
    // Write a program to check whether a number is an automorphic number.
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        int original = num;
        int square = num * num;
        if (num<=0){
            System.out.println("Enter the positive number");
        }else {
            int digitCount =0;
            while (num!=0){
                num = num / 10;
                digitCount++;
            }
            int divisor = (int) Math.pow(10, digitCount);
            int lastDigit = square % divisor;
            if (lastDigit == original){
                System.out.println(original +" : is Automorphic Number");
            }else {
                System.out.println(original + " : is Not Automorphic Number");
            }
        }

        sc.close();
    }
}
