import java.util.Arrays;
import java.util.Scanner;

public class mdarr {
    public static void main(String[] args) {
        int[][] arr=new int[3][3];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2d array");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                arr[i][j]=sc.nextInt();

            }
            
        }
        System.out.println("The 2d array is: ");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        for(int r=0;r<arr.length;r++)
        {
            System.out.println(Arrays.toString(arr[r]));
        }
        
    }
}
