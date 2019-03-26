package javaallprogram;
import java.util.Scanner;
public class tri_area {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the triangle base: ");
        float b=input.nextFloat();
        System.out.print("Enter the triangle height: ");
        float h=input.nextFloat();
        float area=(b*h)/2;
        System.out.println("The area of your triangle is: "+area);
        
    }
    
}
