import java.util.Scanner;
public class sicalc {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Simple Interest Calculator");
        System.out.println("Enter Principle : ");
        int p=sc.nextInt();
        System.out.println("Enter Rate :");
        int r=sc.nextInt();
        System.out.println("Enter number of years :");
        int n=sc.nextInt();
        int si=(p*r*n)/100;
        System.out.println("Simple Interest is "+si);
        sc.close();

    }
    
}
