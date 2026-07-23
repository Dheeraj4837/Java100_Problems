package Day09_Problem;

import java.util.Scanner;

public class Problem42 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        while (num!=0){
            int lastDigit = num%10;
            if (lastDigit == 0){
                lastDigit =5;
            }
            num = num/10;
        }
        System.out.println(num);
    }
}
