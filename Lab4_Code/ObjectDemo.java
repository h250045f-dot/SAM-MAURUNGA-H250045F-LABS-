public class ObjectDemo {
    public static void main(String[] args) {
        Plain p = new Plain();

        
        System.out.println(p instanceof Object);  
        System.out.println(p.getClass().getName());  
        
        System.out.println(p.toString().startsWith("Plain@"));
        
        System.out.println(p.equals(new Plain()));

        Named n = new Named("Tendai");
        System.out.println(n);  
    }
}

class Plain { }  

class Named {
    private final String name;
    Named(String name) { this.name = name; }

    @Override
    public String toString() { return "Named[" + name + "]"; }
}
