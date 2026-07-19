package Day06_Problem;

import java.util.Scanner;

public class Problem24 {
    // .
    //Write a program to display all odd numbers from 1 to n.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        for (int i=1; i<=num; i+=2){
            System.out.println(i + " : is odd Number");
        }
        sc.close();
    }
}
