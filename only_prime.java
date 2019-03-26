package javaallprogram;
import java.util.Scanner;
public class only_prime {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num=input.nextInt();
        int k;
        k=0;
        for (int i=1;i<=num;i++)
        {
            if(num % i == 0)
            {
                k++;
            }
        }
        if (k == 2)
        {
            System.out.println("Prime Number");
        }
        else
        {
            System.out.println("Not a Prime Number");
        }
    }
}
    
