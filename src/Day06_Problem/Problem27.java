package Day06_Problem;

import java.util.Scanner;

public class Problem27 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        int sum =0;
        if (num<=0){
            System.out.println("Enter valid Number..");
        }else {
            for (int i=1; i<=num; i+=2){
                sum =sum + i;
            }
            System.out.println("Sum of all Odd Number is : " + sum);
        }
        sc.close();
    }
}
