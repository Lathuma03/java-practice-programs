public class cclass {
    
    static class Cat {
        String name;
        void meow()
        {
            System.out.println(name+" : meow....");
        }   
        
    }
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.name="Latha";
        cat.meow();
    }
}
