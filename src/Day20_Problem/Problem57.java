package Day20_Problem;

import java.util.Scanner;

public class Problem57 {
    // Write a program to display the first n terms of the Fibonacci series.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();

        int firstNum = 0;
        int secondNum = 1;
        if (num==1){
            System.out.print(firstNum);
        }else {
            System.out.print(firstNum +" ");
            System.out.print(secondNum +" ");
            while (num>2){
                int nextNum = firstNum + secondNum;
                System.out.print(nextNum+ " ");
                firstNum = secondNum;
                secondNum = nextNum;
                num--;
            }
        }


        sc.close();
    }
}
