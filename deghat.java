package javaallprogram;
import java.util.Scanner;
public class deghat {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double a,b,c,D,x,x1,x2;
        System.out.print("Enter the A: ");
        a=input.nextDouble();
        System.out.print("Enter the B: ");
        b=input.nextDouble();
        System.out.print("Enter the C: ");
        c=input.nextDouble();
        D=Math.pow(b, 2)-(4*a*c);
        if (D > 0)
        {
            x1=(-b + Math.sqrt(D))/(2*a);
            x2=(-b - Math.sqrt(D))/(2*a);
            System.out.print("x1=" +x1);
            System.out.print("x2=" +x2);
        }
        else if(D == 0)
        {
            x=(-b)/(2*a);
            System.out.print("x=" +x);
        }
        else if(D < 0)
        {
            System.out.print("root are imaginary");
        }
    }
}
