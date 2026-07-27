package Day14_Problem;

import java.util.Scanner;

public class Problem46 {
    // Write a program to display the first n prime numbers.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();

        int count =0;
        int number =2;

        if (num<=1){
            System.out.println("Not prime");
            return;
        }
        while (count<num){
            boolean isPrime = true;
            for (int i=2; i<=Math.sqrt(number); i++){
                if (number % i ==0){
                    isPrime = false;

                    break;
                }

            }
            if (isPrime){
                System.out.println(number);
                count++;
            }
            number++;
        }

    }
}
