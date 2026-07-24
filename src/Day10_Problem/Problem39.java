package Day10_Problem;

import java.util.Scanner;

public class Problem39 {
    // Write a program to find the smallest digit in a number n.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        int smallest = 9;
        if (num<0){
            System.out.println("Enter the Positive Number:");
        }else {
            while (num!=0){
                int lastDigit = num%10;
                if (smallest>lastDigit){
                    smallest = lastDigit;
                }
                num =num/10;
            }
            System.out.println("Smallest Digit : "+smallest);
        }
        sc.close();
    }
}
