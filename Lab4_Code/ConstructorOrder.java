public class ConstructorOrder {
    public static void main(String[] args) {
        System.out.println("Creating C...");
        new C();
    }
}

class A {
    A() { System.out.println("A constructor"); }  
}

class B extends A {
    B() {  
        System.out.println("B constructor");
    }
}

class C extends B {
    C() {  
        System.out.println("C constructor");
    }
}
