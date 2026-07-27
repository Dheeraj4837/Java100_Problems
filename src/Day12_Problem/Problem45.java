package Day12_Problem;

import java.util.Scanner;

public class Problem45 {
    // . Write a program to display all prime numbers from 1 to n.
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        if (num<=1){
            System.out.println("Not prime");
            return;
        }
        for (int i=2; i<=num; i++){
             boolean isPrime = true;
                for (int j=2; j<=Math.sqrt(i); j++){
                    if (i%j==0){
                        isPrime =false;
                        break;
                    }
                }
                if (isPrime){
                    System.out.println(i);
                }
            }



    }
}
