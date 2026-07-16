package Day03_Problem;

import java.util.Scanner;

public class Problem12 {
    //Write a program to read a number and check whether it is positive, negative or zero
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();

        if (num>0){
            System.out.println(num + " is an Positive Number");
        } else if (num<0) {
            System.out.println(num + " is an Negative Number");
        }else {
            System.out.println(num + " This is Zero and neutral number");
        }
        sc.close();
    }


}
