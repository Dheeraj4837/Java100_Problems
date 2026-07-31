package Day18_Problem;

import java.util.Scanner;

public class Problem53 {
   // Write a program to find all factors (divisors) of a number n.
    public static void main(String[] args){
        Scanner sc  =new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("Enter a positive number");
            return;
        }
        System.out.println("All factor Number: ");
        for (int i=1; i<=num; i++){
            if (num % i == 0){
                System.out.println(i);
            }
        }
    }
}
