package Day10_Problem;

import java.util.Scanner;

public class Problem40 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        int evenCount =0;
        int oddCount =0;
        if (num<0){
            System.out.println("Enter Positive Number: ");
        }else {
            while (num!=0){
                int lastDigit = num%10;
                if (lastDigit%2==0){
                    System.out.println("Even Number - " + lastDigit);
                    evenCount = evenCount+1;
                }else {
                    System.out.println("Odd Number - " + lastDigit);
                    oddCount = oddCount+1;
                }
                num = num/10;
            }
            System.out.println("Total Even Digit : " + evenCount );
            System.out.println("Total Odd Digit : " + oddCount );
        }
        sc.close();
    }
}
