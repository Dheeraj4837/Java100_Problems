package Day03_Problem;

import java.util.Scanner;

public class Problem14 {
    //Write a program to read three numbers and find the smallest among them
    public static  void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second Number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third Number: ");
        int num3 = sc.nextInt();

        if (num1<=num2 && num1<=num3){
            System.out.println(num1 + " is an Smallest number");
        } else if (num2<=num3 && num2<=num1) {
            System.out.println(num2 + " is an smallest number");
        }else {
            System.out.println(num3 + " is an smallest Number");
        }



    }
}
