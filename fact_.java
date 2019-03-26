package javaallprogram;
import java.util.Scanner;
public class fact_ {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n,fact=1;
        System.out.print("Enter the N: ");
        n=input.nextInt();
        if(n<0)
        {
            System.out.println("Negative numbers are not allowed");
        }
        else
        {
            for(int i=1;i<=n;i++)
            {
                fact=fact*i;
            }
            System.out.println("Fact is: "+fact);
        }
    }
}
