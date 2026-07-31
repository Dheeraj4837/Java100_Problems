package Day18_Problem;

import java.util.Scanner;

public class Problem52 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        int sum =0;
        int originalNum = num;
        while (num!=0){
            int lastDigit = num % 10;
            sum = sum + lastDigit;
            num = num/10;
        }
        if (originalNum % sum == 0){
            System.out.println(originalNum + " : is Harshad (Niven) Number");
        }else {
            System.out.println(originalNum + " : is Not Harshad (Niven) Number");
        }
        sc.close();
    }
}
