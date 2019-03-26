package javaallprogram;
import java.util.Scanner;
public class grade_if_else {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the mark: ");
        float mark=input.nextFloat();
        if(mark>79)
        {
            System.out.println("A+");
        }
        else if(mark>69)
        {
            System.out.println("A");
        }
        else if(mark>59)
        {
            System.out.println("A-");
        }
        else if(mark>49)
        {
            System.out.println("B");
        }
        else if(mark>32)
        {
            System.out.println("C");
        }
        else
        {
            System.out.println("F");
        }                
    }
}
