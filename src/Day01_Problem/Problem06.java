package Day01_Problem;

public class Problem06 {
    //Write a program to swap two numbers using a third variable.
    public static void main(String[] args){
        System.out.println("Before Swap two number:");

        int a =10;
        System.out.println("First Number:" + a);

        int b= 20;
        System.out.println("Second Number:"+b);
        int temp;
        System.out.println("After Swap");
        temp=a;
        a=b;
        b=temp;
        System.out.println("First Number: " + a);
        System.out.println("Second Number: " + b);


    }
}
