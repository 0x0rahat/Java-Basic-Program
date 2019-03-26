package javaallprogram;
import java.util.Scanner;
public class larg_3 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        float num1=input.nextFloat();
        System.out.print("Enter the 2nd number: ");
        float num2=input.nextFloat();
        System.out.print("Enter the 3rd numbr: ");
        float num3=input.nextFloat();
        if(num1>num2)
        {
            if(num1>num3)
            {
                System.out.print("1st number is largest "+num1);
            }
            else
            {
                System.out.print("3rd number is largest "+num3);
            }
        }
        else
        {
            if(num2>num3)
            {
                System.out.print("2nd number is largest "+num2);
            }
            else
            {
                System.out.print("3rd number is largest "+num3); 
            }
        }
    } 
}
