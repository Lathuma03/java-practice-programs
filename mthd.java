public class mthd {
    private static int add(int n1,int n2)
    {
        int r=n1+n2;
        return r;
    }
    static String greet(String x)
    {
        String greeting="Hi "+x;
        return greeting;
    }
    public static void main(String[] args) {
        int result=add(10,10);
        System.out.println(result);
        String msg=greet("latha");
        System.out.println(msg);
    }
}
