package Day10_Problem;

import java.util.Scanner;

public class Problem41 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int reverse =0;
        int original = num;
        if (num<0){
            System.out.println("Enter valid Number");
        }else {
            while (num!=0){
                int lastDigit = num%10;
                reverse =reverse * 10 + lastDigit;
                num = num/10;

            }
            if (original == reverse){
                System.out.println("Number is Palindrome");
            }else {
                System.out.println("Number is Not Palindrome ");
            }
        }

        sc.close();
    }
}
