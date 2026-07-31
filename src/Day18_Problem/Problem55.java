package Day18_Problem;

import java.util.Scanner;

public class Problem55 {
    //  Write a program to find the GCD (HCF) of two numbers.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Factor Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the Second Factor Number: ");
        int num2 = sc.nextInt();
        int Gcd = 1;
        int min = Math.min(num1, num2);
        System.out.println("All common factor : ");
        for (int i =1; i<=min; i++){
            if (num1 % i ==0 && num2 % i ==0){
                Gcd = i;
                System.out.print(Gcd + ", ");
            }
        }
        System.out.println( "Greatest Common Division Number: " + Gcd);
        sc.close();
    }
}
