public class Employee {
    private double salary;
    public Employee(double salary) {
        this.salary = salary;
    }
    public void increase(double amount) {
        if (amount > 0) {
            salary += amount;
        }
    }
    public double getPay() {
        return salary;
    }
    public static void main(String[] args) {
        Employee e = new Employee(40000.0);
        e.increase(2000.0);
        double p = e.getPay();
        System.out.println("Salary is " + p);

        e.increase(-500.0);
        p = e.getPay();
        System.out.println("Salary is " + p);

        e.increase(3000.0);
        p = e.getPay();
        System.out.println("Salary is " + p);
    }
}
