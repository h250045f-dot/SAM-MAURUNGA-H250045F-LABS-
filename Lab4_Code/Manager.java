public class Manager extends Employee {  // extends: Manager IS-A Employee
    private double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);  // must be the FIRST statement
        this.bonus = bonus;
        System.out.println("Manager constructor: " + name);
    }

    @Override  
    public double calculatePay() {
        return super.calculatePay() + bonus;  
    }
}
