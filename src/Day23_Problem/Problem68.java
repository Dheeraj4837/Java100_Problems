package Day23_Problem;

import java.util.Scanner;

public class Problem68 {
    // Write a program to find the length of a string without using an inbuilt function.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        int count =0;

        char[] arr = str.toCharArray();
        for (char ch : arr){
            count++;
        }
        System.out.println("Length of Character is : " + count);
        sc.close();
    }
}
