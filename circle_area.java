package javaallprogram;
import java.util.Scanner;
public class circle_area {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the R: ");
        double radius=input.nextDouble();
        double pi=Math.PI;
        double area=pi*(radius*radius);
        System.out.println("Area is "+area);
    }
}
