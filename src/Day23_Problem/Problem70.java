package Day23_Problem;

import java.util.Scanner;

public class Problem70 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Sentence: ");
        String str = sc.nextLine();
        int count =0;
        char [] arr = str.toCharArray();
        if (str.trim().isEmpty()) {
            System.out.println("Number of Words : 0");
            return;
        }
        for(int i=0; i<arr.length; i++){
            if (Character.isLetter(arr[i]) &&
                    (i == 0 || arr[i - 1] == ' ')){
                count++;
            }
        }
        System.out.println("Numbers of Word in Sentence is: "+count);


    }
}
