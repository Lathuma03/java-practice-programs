import java.util.Arrays;
import java.util.Scanner;

public class revarr {
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
        rev(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void rev(int[] arr)
    {
        int s=0;
        int e=arr.length-1;
        while(s<e)
        {
            swap(arr,s,e);
            s++;
            e--;

        }
    }
    static void swap(int[] arr,int i1,int i2)
    {
        int t=arr[i1];
        arr[i1]=arr[i2];
        arr[i2]=t;
    }
}
