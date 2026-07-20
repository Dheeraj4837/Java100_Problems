package Day07_Problem;

import java.util.Scanner;

public class Problem29 {
    //Write a program to display the multiplication table of a number n.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Table Number: ");
        int num = sc.nextInt();

        if (num<=0){
            System.out.println("Please Enter valid Table number");
        }else {
            for (int i =1; i<=10; i++){
                System.out.println(num + " * " + i + " = " + num*i);
            }

        }
        sc.close();
    }
}
