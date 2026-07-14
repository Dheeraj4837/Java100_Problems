package Day01_Problem;

import java.util.Scanner;

public class Problem04 {
    //Write a program to read the radius of a circle and print its area and circumference
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        double radius = sc.nextDouble();
//        double area =(double) 3.141*(radius*radius);
        double area = Math.PI* (radius*radius);
//        double circumference = (double) 2*3.141 *(radius);
        double circumference = 2*Math.PI *(radius);
        System.out.println("Area of Circle :" + area);
        System.out.println("Circumference Of Circle : " + circumference);

    }
}
