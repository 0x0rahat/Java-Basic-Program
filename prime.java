package javaallprogram;
public class prime {
    public static void main(String[] args)
    {
        for(int i=0;i<=100;i++)
        {
            if(check_prime(i)==true)
            {
                System.out.println(i);
            }
        }
    }
    static boolean check_prime(int number)
    {
        int num=number;
        int k;
        k=0;
        for(int i=1;i<=num;i++)
        {
            if(num %i == 0)
            {
                k++;
            }
        }
        if (k == 2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
