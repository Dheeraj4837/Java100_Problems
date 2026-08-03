package Day21_Problem;

import java.util.Scanner;

public class Problem60 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of nth Series : ");
        int num = sc.nextInt();
        int sum =0;
        if (num<0){
            System.out.println("Enter the positive number: ");
            return;
        }
        if (num ==0){
            System.out.println("sum of Square series is : 0");
        }else {
            for (int i=1; i<=num; i++){
                int sqr = i * i;
                System.out.print( sqr + " ");
                sum = sum+ sqr;
            }
            System.out.println("Sum of Square Series : " +sum);
        }
        sc.close();
    }
}
