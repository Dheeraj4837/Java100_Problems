package Day21_Problem;

import java.util.Scanner;

public class Problem61 {
    // Write a program to find the sum of the series 1 + 1/2 + 1/3 + ... + 1/n.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of nth Series : ");
        int num = sc.nextInt();
        double sum =0;
        if (num<0){
            System.out.println("Enter the positive number: ");
            return;
        }
        if (num ==0){
            System.out.println("sum of  series is : 0");
        }else {
            for (int i=1; i<=num; i++){
                double divs = 1.0 / i;
                System.out.print( divs + " ");
                sum = sum + divs;
            }
            System.out.println("Sum of Series is : "+ sum);
        }
        sc.close();
    }

}
