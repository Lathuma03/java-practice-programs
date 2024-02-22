/**
 * stringpool this is used to study the difference between the "==" and "equals" whereas 
 * "equals" refers the content
 * "==" refers the object in memeory
 */
public class stringpool {

    public static void main(String[] args) {
        String s1="abc"; //one string "abc" with 2 variables reference s1 and s2.
        String s2="abc";
        String s3=new String("abc");// creates a new object abc which as s3 as reference.
        if(s1==s3)
        {
            System.out.println("s3 is in pool");
        }
        else
        {
            System.out.println("s3 not in pool");
        }
    }
}