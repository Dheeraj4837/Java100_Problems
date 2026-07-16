package Day03_Problem;

import java.util.Scanner;

public class Problem10 {
    //Write a program to read seconds and convert them into hours, minutes and seconds.
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the Seconds: ");
        int second = sc.nextInt();

        int hour = second/3600;
        int remaning_second = second%3600;
        int minutes = remaning_second/60;
        int final_second = remaning_second%60;

        System.out.println(hour+ "Hours " + minutes+ "Minutes " + final_second+ "Second");
    }
}
