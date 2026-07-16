package Day03_Problem;

import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you Number: ");
        int num=sc.nextInt();

        if (num%2==0){
            System.out.println(num+ " This number is Even");

        }else {
            System.out.println(num+ " This number is Odd");
        }
        sc.close();
    }


}
