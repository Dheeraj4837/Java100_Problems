package Day22_Problem;

import java.util.Scanner;

public class Problem67 {
    // Write a program to print Pascal's triangle for n rows
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Pascal's Triangle Rows: ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++){
            for (int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            int value =1;
            for (int k=0; k<=i; k++){
                System.out.print(value + " ");
                value = value* (i - k) /(k + 1);
            }
            System.out.println();
        }
    }
}
