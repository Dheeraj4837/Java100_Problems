package Day09_Problem;

import java.util.Scanner;

public class Problem38 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        int largest =0;
        while (num!=0){
            int lastDigit = num%10;
            if (lastDigit > largest){
                largest =lastDigit;
            }
            num=num/10;
        }
        System.out.println("Largest Digit : " + largest);
    }
}
