package Day04_Problem;

import java.util.Scanner;

public class Problem17 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your character: ");
        char ch = sc.next().charAt(0);

        if ((ch>= 'A' && ch<='Z') || (ch>= 'a' && ch<= 'z')){
            System.out.println(ch + ": This is a Alphabet");
        } else if (ch>= '0' && ch<= '9') {
            System.out.println(ch + ": This is Digit");
        }else {
            System.out.println(ch + ": This is Special Symbol");
        }
    }
}
