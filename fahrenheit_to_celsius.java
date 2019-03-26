package javaallprogram;
import java.util.Scanner;
public class fahrenheit_to_celsius {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Fahrenheit Temperature: ");
        float fahren=input.nextFloat();
        float celsius=(fahren-32)*5/9;
        System.out.println("Celsius temperature is " +celsius);   
    }
}
