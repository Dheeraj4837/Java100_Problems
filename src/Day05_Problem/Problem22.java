package Day05_Problem;

import java.util.Scanner;

public class Problem22 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        if (num>=0){
            for (int i =num; i>=1; i --){
                System.out.println(i);
            }
        }else {
            System.out.println("Enter Positive number Only:");
        }
    }
}
