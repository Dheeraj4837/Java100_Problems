package Day12_Problem;

import java.util.Scanner;

public class Problem45 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        for (int i=1; i<=num; i++){
            if (num%i==0){

            }else {
                System.out.println(i);
            }
        }

    }
}
