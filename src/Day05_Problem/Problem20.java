package Day05_Problem;

import java.util.Scanner;

public class Problem20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Age: ");
        if (sc.hasNextInt()){
            int age = sc.nextInt();
            if (age<0 || age>=120){
                System.out.println("Please Enter valid Age");
            } else if (age>=18) {
                System.out.println("You are eligible to Vote ");
            }else {
                System.out.println("You are not eligible to Vote ");
            }
        }else {
            System.out.println("Enter only Digit");
        }
    sc.close();
    }
}
