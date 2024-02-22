import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number n:");
        int n=sc.nextInt();
        boolean x=isprime(n);
        System.out.println(x);

    }
    static boolean isprime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        for(int i=2;i<=n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
            else
            {
                return true;
            }
        }
        return false;
    }
}
