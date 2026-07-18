package Day05_Problem;

import java.util.Scanner;

public class Problem19 {
    // Write a program to read a number and check whether it is divisible by both 3 and 5.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();

        if (num%3==0 && num %5==0){
            System.out.println(num + " : This number is Divisible by Both 3 And 5");
        }else {
            System.out.println(num + " : This number is Not Divisible by Both 3 And 5");
        }


    }
}
