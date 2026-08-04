package Day22_Problem;

import java.util.Scanner;

public class Problem62 {
    // Write a program to find the value of x raised to the power y without using inbuilt power.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of X: ");
        int x = sc.nextInt();
        System.out.print("Enter the value of Y: ");
        int y =sc.nextInt();
        int result =1;

        for (int i=1; i<=y; i++){
            result = result * x;
        }
        System.out.println("Value of x is: " + x);
        System.out.println("Value of y is: " + y);
        System.out.println("Result  of x to the power of y is: " + result);
        sc.close();
    }
}
