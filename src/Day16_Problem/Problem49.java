package Day16_Problem;

import java.util.Scanner;

public class Problem49 {
    // Write a program to check whether a number is a perfect number.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        int sum =0;
        if (num<=0){
            System.out.println("Enter Positive Number: ");
        }else {
            for (int i=1; i<num; i++){
                if (num % i ==0){
                    sum = sum+ i;
                }
            }
            if (sum == num){
                System.out.println(num + " : is Perfect number");
            }else {
                System.out.println( num + " : is Not perfect Number");
            }
        }
sc.close();
    }
}
