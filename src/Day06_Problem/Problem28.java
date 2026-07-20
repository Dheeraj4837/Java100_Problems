package Day06_Problem;

import java.util.Scanner;

public class Problem28 {
    //Write a program to find the product of all natural numbers from 1 to n (factorial of n).
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        long fact=1;
        if (num<0){
            System.out.println("Please Enter Positive Number");
        }else {
            for (int i=1; i<=num; i++){
                 fact = fact*i;

            }
            System.out.println("Factorial Of " + num + " is :" + fact );
        }
        sc.close();
    }
}
