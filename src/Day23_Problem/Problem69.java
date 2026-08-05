package Day23_Problem;

import java.util.Scanner;

public class Problem69 {
    //  Write a program to count the number of vowels and consonants in a string.
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        int count =0;
        char [] arr = str.toCharArray();

        int vowel =0;
        int consonant =0;

        for (char ch : arr){
            if (Character.isLetter(ch)){
                if (ch=='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E'|| ch=='I' || ch=='O' || ch=='U'){
                    vowel++;
                }else {
                    consonant++;
                }
            }
        }
        System.out.println("Vowel : " + vowel);
        System.out.println("Consonant : " + consonant);

    }
}
