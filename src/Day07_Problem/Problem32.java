package Day07_Problem;

import java.util.Scanner;

public class Problem32 {
    //Write a program to display all numbers from 1 to n that are divisible by 3 or 5.
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        if (num<=0){
            System.out.println("Please Enter Positive Number:");
        }else {
            for (int i=1; i<=num; i++){
                if (i%3==0 || i%5==0){
                    System.out.println( i+ " : is Divisible by 3 or 5" );
                }
            }
        }
        sc.close();
    }
}
