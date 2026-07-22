package Day09_Problem;

import java.util.Scanner;

public class Problem35 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the digit: ");
        int num = sc.nextInt();
        int sum =0;
        if (num<0){
            System.out.println("Please Enter Positive Number:");
        }else {
            while (num!=0){
                int lastDigit = num%10;
                sum = sum+lastDigit;
                num = num/10;
            }
            System.out.println("Sum of All Digit : " +sum);
        }
        sc.close();
    }
}
