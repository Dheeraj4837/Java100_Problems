package Day02_Problem;

import java.util.Scanner;

public class Problem08 {
    //Write a program to read a temperature in Celsius and convert it to Fahrenheit.
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your temperature in Celsius: ");
        double temp = sc.nextDouble();
        double Fahrenheit = (temp*9/5 +32);
        System.out.println("After Convert Temperature in Fahrenheit: ");

        System.out.println("Temperature in Fahrenheit :" + Fahrenheit + " F");
        sc.close();
    }
}
