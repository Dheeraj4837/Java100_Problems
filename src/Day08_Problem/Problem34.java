package Day08_Problem;

import java.util.Scanner;

public class Problem34 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        if(num<0){
            System.out.println("Please Enter positive Number");
        } else if (num==0) {
            System.out.println(0);
        }else {
            {
                while (num!=0){
                    int digit = num%10;
                    System.out.println(digit);
                    num = num /10;
                }
            }
        }
        sc.close();
    }
}
