package Day11_Problem;

import java.util.Scanner;

public class Problem44 {
    //Write a program to read a number and check whether it is prime or not
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        boolean isPrime = true;
        if (num<=1){
            System.out.println("Not prime");
            return;
        }
            for (int i =2; i<=Math.sqrt(num); i++){
                if (num%i==0){
                    isPrime =false;
                    break;
                }
            }
            if (isPrime){
                System.out.println("Prime");
            }else {
                System.out.println("not prime");
            }
            sc.close();
    }
}
