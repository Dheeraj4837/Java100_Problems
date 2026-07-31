package Day18_Problem;

import java.util.Scanner;

public class Problem56 {
    //  Write a program to find the LCM of two numbers.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the First Number: ");
        int num2 = sc.nextInt();

        int max = Math.max(num1, num2);
        while (true){
            if (max % num1==0 && max % num2 ==0){
                System.out.println("Lowest Common Multiple (LCM) is : " + max);
                break;
            }else {
                max++;
            }
        }
        sc.close();
    }
}
