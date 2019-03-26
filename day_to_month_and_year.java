package javaallprogram;
import java.util.Scanner;
public class day_to_month_and_year {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter day :");
        int day=input.nextInt();
        int year=day/365;
        int month=(day/30)-(year*12);
        System.out.println(year+" Year and "+month+" Month");
    }
    
}
