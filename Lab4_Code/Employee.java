public class Employee {
    protected String name;  
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
        System.out.println("Employee constructor: " + name);
    }

    public double calculatePay() {
        return baseSalary;
    }

    public final String companyName() {  
        return "Harare Tech Ltd";
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[" + name
               + ", pay=" + calculatePay() + "]";
    }
}
