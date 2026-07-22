package Day09_Problem;

import java.util.Scanner;

public class Problem37 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        int reverse =0;
        if (num<0){
            System.out.println("Enter the Number");
        }else {
            while (num!=0){
                int lastDigit = num%10;
                reverse =reverse* 10 + lastDigit;
                num = num/10;

            }
            System.out.println("Reverse Number is:  "+ reverse);
        }
        sc.close();
    }
}
