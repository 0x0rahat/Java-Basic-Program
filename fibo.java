package javaallprogram;
public class fibo {
    public static void main(String[] args) {
        int n,f0=0,f1=1,fibo;
        n=10;
        for(int i=0;i<=n;i++)
        {
            fibo=f0+f1;
            System.out.println(fibo);
            f0=f1;
            f1=fibo;
        }
    }
}
