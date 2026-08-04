package Day22_Problem;

import java.util.Scanner;

public class Problem65 {
    //Write a program to print a pyramid pattern of stars of height n.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Pyramid Star Height: ");
        int n = sc.nextInt();
        for (int i=1; i<=n; i++){
            for (int j=i; j<n; j++){
                System.out.print(" ");
            }
            for (int k= 1; k<=2 * i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
