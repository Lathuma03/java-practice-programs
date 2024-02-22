import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        //int n=sc.nextInt();
        //boolean x=isarmstrong(n);
        //System.out.println(x);
        System.out.println("The armstrong numbers between 100 to 1000 are ");
        for(int i=100;i<1000;i++)
        {
            if(isarmstrong(i))
            {
                System.out.print(i+" ");
            }
        }

        
    }
    static boolean isarmstrong(int n)
    {
        int s=0;
        int og=n;
        while(n>0)
        {
            int r=n%10;
            int c=r*r*r;
            s=s+c;
            n=n/10;
        }
        //System.out.println("The calculated value is : "+ s);
        return s==og;

    }

}
