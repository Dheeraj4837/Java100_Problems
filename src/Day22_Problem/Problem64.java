package Day22_Problem;

import java.util.Scanner;

public class Problem64 {
    // Write a program to print an inverted right-angled triangle pattern of stars of height n.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre the Height os Stars: ");
        int n =sc.nextInt();
        for (int i=1; i<=n; i++){
            for (int j=n; j>=i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
