package Day15_Problem;

import java.util.Scanner;

public class Problem47 {
    //Write a program to check whether a number is an Armstrong number.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        int original = num;
        int digitCount =0;

        if (num ==0){
            System.out.println(num + " : is Armstrong Number");
            return;
        }
        while (num!=0){
            num = num/10;
            digitCount++;
        }
        num =original;
        int sum =0;
        while (num!=0){
            int digit = num%10;
            int result = (int) Math.pow(digit, digitCount);
            num = num/10;
             sum = sum + result;

        }
        if (sum == original){
            System.out.println( original +" : Number is Armstrong");
        }else {
            System.out.println(original + " : Number is Not Armstrong");
        }
        sc.close();
    }
}
