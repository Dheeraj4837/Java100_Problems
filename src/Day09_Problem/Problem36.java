package Day09_Problem;

import java.util.Scanner;

public class Problem36 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Digit: ");
        int num = sc.nextInt();
        int multi =1;
        if (num<0){
            System.out.println("Enter Positive Number: ");
        }else {
            while (num!=0){
                int lastDigit = num%10;
                multi = multi*lastDigit;
                num =  num/10;
            }
            System.out.println("Product of All Digit: "+multi);
        }
        sc.close();
    }
}
