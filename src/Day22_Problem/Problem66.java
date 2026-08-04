package Day22_Problem;

import java.util.Scanner;

public class Problem66 {
    // Write a program to print a number triangle (row i contains numbers 1 to i).
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Triangle Rows: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
