package Day06_Problem;

import java.util.Scanner;

public class Problem26 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        int sum=0;
        if (num<=0){
            System.out.println("Please Enter valid number..");
        }else {
            for (int i=2; i<=num; i+=2){
                sum = sum+i;

            }
            System.out.println("Sum of All Even Number is : "+ sum);
        }
        sc.close();
    }
}
