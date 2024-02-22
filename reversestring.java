public class reversestring {
    public static void main(String[] args) {
        String str="Latha";
        String rv="";
        for(int i=str.length()-1;i>=0;i--)
        {
            rv+=str.charAt(i);
        }
        System.out.println(rv);
    }
}
