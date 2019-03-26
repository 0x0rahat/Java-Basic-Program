package javaallprogram;
import java.util.Scanner;
public class Method_swap {
    public static void main(String[] args) {
      
     swap();
    }
    static void swap()
    {
        Scanner input=new Scanner(System.in) ;
        int a,b,temp;
        System.out.print("Enter the A: ");
        a=input.nextInt();
        System.out.print("Enter the B: ");
        b=input.nextInt();
        temp=a;
        a=b;
        b=temp;
        System.out.println("A= "+a);
        System.out.println("B= "+b);
        
    }
}
