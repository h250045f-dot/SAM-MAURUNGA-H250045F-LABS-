public final class Contractor extends Employee {  
    public Contractor(String name, double baseSalary) {
        super(name, baseSalary);
        System.out.println("Contractor constructor: " + name);
    }
}
