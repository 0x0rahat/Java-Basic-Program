package javaallprogram;
import java.util.Scanner;
public class positive_negative_num {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number: ");
        float num=input.nextFloat();
        if(num >= 0)
        {
            System.out.println("The number is positive");
        }
        else
        {
            System.out.println("The number is  negative");
        }
    }
}
