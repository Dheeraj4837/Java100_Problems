package Day03_Problem;

import java.util.Scanner;

public class Problem15 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        if (year%4==0){
            if (year%100==0){
                if (year%400==0){
                    System.out.println(year + " is an Leap year");
                }else System.out.println(year + " is not leap year");

            }else System.out.println(year + " is an Leap year");
        }
        else System.out.println(year + " is not Leap year");
        sc.close();
    }
}
