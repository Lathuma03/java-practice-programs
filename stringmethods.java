public class stringmethods {
    public static void main(String[] args) {
        String str="Lathangi Elango";
        String str2="Lathangi Elango";
        String str3=new String("Lathangi Elango");
        System.out.println(str.charAt(5));
        System.out.println(str.charAt(9));
        System.out.println(str.length());
        System.out.println(str.indexOf("L"));
        System.out.println(str.indexOf("l"));
        System.out.println(str==str2);
        System.out.println(str==str3);
        System.out.println(str.equals(str2));
        System.out.println(str.equals(str3));
        System.out.println(str.contains("lan"));
        System.out.println(str3.toLowerCase());
        System.out.println(str2.toUpperCase());
        System.out.println(str.replace("Elango","Sumithra"));
        System.out.println(str.substring(9));
        System.out.println(str+" "+str2);

        
    }
}
