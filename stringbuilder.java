public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("I love Arjun.");
        sb.append("Arjun loves me");
        sb.insert(13, "I am his wife");
        sb.delete(2,5);
        sb.replace(7,11,"varun");
        sb.length();
        String str=sb.toString();
        System.out.println(str);

    }
}
