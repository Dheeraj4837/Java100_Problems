package Day03_Problem;

import java.util.Scanner;

public class Problem13 {
    //Write a program to read three numbers and find the largest among them.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number:");
        int num1 = sc.nextInt();
        System.out.print("Enter Second Number:");
        int num2 = sc.nextInt();
        System.out.print("Enter Third Number:");
        int num3 = sc.nextInt();

        if (num1>num2 && num1>num3){
            System.out.println(num1 + " is an largest number");
        } else if (num2>num3 && num2>num1) {
            System.out.println(num2 + " is an Largest Number");
        }else{
            System.out.println(num3 + " is an largest Number");
        }
    }
}
