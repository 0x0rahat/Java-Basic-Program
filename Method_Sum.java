package javaallprogram;
import java.util.Scanner;
public class Method_Sum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int num1=input.nextInt();
        System.out.print("Enter 2nd Number: ");
        int num2=input.nextInt();
        System.out.println("sum is: "+sum(num1,num2));
    }
    static int sum(int num1,int num2)
    {
        int add=num1+num2;
        return add;
    }
}
