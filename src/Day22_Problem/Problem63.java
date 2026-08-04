package Day22_Problem;

import java.util.Scanner;

public class Problem63 {
    //Write a program to print a right-angled triangle pattern of stars of height n.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Height of Stars: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            //outer loop for row
            for (int j =1; j<=i; j++){
                //inner loop for column
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
