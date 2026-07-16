package Day03_Problem;

import java.util.Scanner;

public class Problem16 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your character Symbol: ");
        String ch = sc.next();

        if (ch.length() != 1){
            System.out.println("Please enter only One character");
        }

       if (ch.equals("a") || ch.equals("e") || ch.equals("i") || ch.equals("o") || ch.equals("u") || ch.equals("A") ||
       ch.equals("E") || ch.equals("I") || ch.equals("O") ||ch.equals("U")
       ){
           System.out.println(ch + " : this is vowel");
       }
       else {
           System.out.println(ch + " : this is consonant");
       }
       sc.close();
    }
}
