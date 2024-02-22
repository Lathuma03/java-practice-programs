public class function_overloading {
    public static void main(String[] args) {
        fun(45);
        fun("Lathangi");

        
    }
    static void fun(int a)
    {
        System.out.println(a);
    }
    static void fun(String name)
    {
        System.out.println(name);
    }
    /* 
    this is not possible the compiler will confuse which method to run make sure the data type and no of parameters for function overloading.
    
    static void fun(int b)
    {
        System.out.println(b);
    }
    */
}
