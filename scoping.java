import java.util.*;
public class scoping {
    public static void main(String[] args) {
        int a=10;
        int b=40;
        System.out.println(a);
        {
            a=78;
            System.out.println(a);
            int  c=55;
            System.out.println(c);
        }
        System.out.println(a);
        int  c=45;
        System.out.println(c);

    }    
}
