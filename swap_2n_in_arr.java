import java.util.Arrays;

public class swap_2n_in_arr {
    public static void main(String[] args) {
        int[] arr={97,65,32,14,65,87};
        System.out.println(Arrays.toString(arr));
        swap(arr,0,5);
        System.out.println(Arrays.toString(arr));
        
        
    }
    static void swap(int[] arr,int i1,int i2)
    {
        int t=arr[i1];
        arr[i1]=arr[i2];
        arr[i2]=t;
    }
}
