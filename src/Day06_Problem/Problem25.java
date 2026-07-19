package Day06_Problem;

import java.util.Scanner;

public class Problem25 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        int sum = 0;
        if (num<=0){
            System.out.println("Please Enter Valid Natural Number..");
        }else {
            for (int i = 1; i <= num; i++) {
                sum = sum + i;
            }
            System.out.println("Sum of All Natural Number : " + sum);
        }
        sc.close();
    }
}
