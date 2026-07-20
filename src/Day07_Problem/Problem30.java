package Day07_Problem;

import java.util.Scanner;

public class Problem30 {
    // Write a program to display all multiples of a number m up to n terms.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Multiple Number :");
        int multi = sc.nextInt();
        System.out.print("Enter the Terms of Number: ");
        int term = sc.nextInt();
        if (multi<=0 || term<=0){
            System.out.println("Enter positive number only: ");
        }else {
            for (int i=1; i<=term; i++){
                System.out.println(multi + " * " + i + " = "+ multi*i);
            }
        }
        sc.close();
    }
}
