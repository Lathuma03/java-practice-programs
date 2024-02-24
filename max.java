import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of arrays:");
        int n=sc.nextInt();     
        int[] arr=new int[n];        
        System.out.println("Enter the arrays:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();

        }
        
        System.out.println(max(arr));

    }

        static int max(int[] arr)
        {
            int mx=arr[0];
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]>mx)
                {
                    mx=arr[i];
                }
            }
            return mx;

        }
    }

