package Day07_Problem;

import java.util.Scanner;

public class Problem31 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int count =0;
        if (num<=0){
            System.out.println("Enter Positive Number only");
        }else {
            for (int i=1; i<=num; i++){
                if (i%3==0){
                    count=count+1;
                }

            }
            System.out.println("Count of numbers divisible by 3: " + count);
        }
    }
}
