import java.util.Arrays;

/**
 * varargs
 */
public class varargs {

    public static void main(String[] args) {
        fun();
        fun(1,56,25,89,36,455,89,48,36,448);
        multiple(0, 0, args);
        multiple(5,9,"Latha","siva","kanchana","sumi","Elango" );
    }
    static void fun(int ...v)
    {
        System.out.println(Arrays.toString(v));
    }
    static void multiple(int a,int b,String ...v)
    {
        System.out.println(Arrays.toString(v));
        System.out.println(a);
        System.out.println(b);
    }
}
