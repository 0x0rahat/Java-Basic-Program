package javaallprogram;
import java.util.Scanner;
public class gread_switch {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the mark: ");
        int mark=input.nextInt();
        int index=mark/10;
        switch(index)
        {
            case 8:
                System.out.println("A+");
                break;
            case 7:
                System.out.println("A");
                break;
            case 6:
                System.out.println("A-");
                break;
            case 5:
                System.out.println("B");
                break;
            case 4:
                System.out.println("C");
                break;
            default:
                System.out.println("F");
                break;
        }
    }   
}
