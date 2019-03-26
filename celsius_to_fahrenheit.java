package javaallprogram;
import java.util.Scanner;
public class celsius_to_fahrenheit {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Temperature in Celsius: ");
        float celsius=input.nextFloat();
        float faren=(celsius*9)/5+32;
        System.out.println("Temperature in Fahrenheit is: "+faren);
    }
}
