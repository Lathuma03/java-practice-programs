public class shadowing {
    static int x=90;
    public static void main(String[] args) {
        System.out.println(x);
        fun();
        int x=40;
        System.out.println(x);

    }
    static void fun()
    {
        int x=50;
        System.out.println(x);
    }
}
