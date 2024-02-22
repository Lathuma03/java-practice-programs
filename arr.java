import java.util.*;

public class arr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        /* 
        double[] n=new double[3];
        n[0]=2;
        n[1]=33;
        n[2]=6;
        System.out.println(Arrays.toString(n));       
        int[] x={0,1,2,3,4,5,6};
        System.out.println(Arrays.toString(x));
        System.out.println(x.length);
        x[1]=55;
        System.out.println(Arrays.toString(x));
        String[] names={"latha","siva","sumi","Elango"};
        System.out.println(Arrays.toString(names)); 
        */
        System.out.println("Enter arr number:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The array is: ");
        /*for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }*/
        for(int j:arr)
        {
            System.out.print(j+" ");
        }
    }
}
