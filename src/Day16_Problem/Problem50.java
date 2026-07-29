package Day16_Problem;

import java.util.Scanner;

public class Problem50 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        int sum =0;
        while (num!=0){
            int lastDigit = num%10;
            for (int i=1; i<=lastDigit; i++){
                int fact = lastDigit * (lastDigit-i);
                sum = sum+ fact;
            }
            num = num/10;
        }
    }
}
