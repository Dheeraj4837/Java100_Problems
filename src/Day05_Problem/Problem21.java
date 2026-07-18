package Day05_Problem;

import java.util.Scanner;

public class Problem21 {
    // Write a program to display all the natural numbers from 1 to n. (n is user input)
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The number: ");
        int num = sc.nextInt();
        if (num<=0){
            System.out.println("Please Enter Positive Number");
        }else {
            for (int i = 1; i <= num; i++) {
                System.out.println(i + " This is natural Number");
            }
            sc.close();
        }
        }

}
