package Day08_Problem;

import java.util.Scanner;

public class Problem33 {
    // Write a program to count the number of digits in a number n.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();

        if (num<=0){
            System.out.println("Enter Positive number Only");
        }else {
            int count =0;
            while (num!=0){
                num =num/10;
                count++;

            }
            System.out.println("Number of Digits is : " +count);
        }
        sc.close();
    }
}
