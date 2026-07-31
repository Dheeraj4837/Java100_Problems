package Day18_Problem;

import java.util.Scanner;

public class Problem54 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        int count =0;
        System.out.print("All factor: ");
        for (int i=1; i<=num; i++){
            if (num % i ==0){
                System.out.print(i +", ");
                count++;
            }
        }
        System.out.println("Total factor count : "+ count);
        sc.close();
    }

}
