package Day01_Problem;

import java.util.Scanner;
    //Write a program to read the length and breadth of a rectangle and print its area and perimeter.
public class Problem05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Rectangle: ");
        float length = sc.nextFloat();
        System.out.println("Enter the breadth of Rectangle: ");
        float breadth = sc.nextFloat();
        float Area = length*breadth;
        float Perimeter = 2*(length+breadth);

        System.out.println("Area of Rectangle : "+ Area);
        System.out.println("Perimeter of Rectangle : "+ Perimeter);
    }
}
