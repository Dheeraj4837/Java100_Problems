package Day21_Problem;

import java.util.Scanner;

public class Problem59 {
    // Write a program to find the sum of the series 1 + 2 + 3 + ... + n.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nth Term of Series: ");
        int num = sc.nextInt();
        int sum =0;
        if (num<0){
            System.out.println("Entre positive Number: ");
            return;
        }
        if (num==0){
            System.out.println("sum of series : 0");
        }else {
            for (int i=1; i<=num; i++){
                System.out.print(i + " ");
                sum = sum + i;
            }
            System.out.println("Sum of nth Series : " + sum);
        }
        sc.close();
    }
}
