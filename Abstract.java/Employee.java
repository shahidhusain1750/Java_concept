public class Employee extends Person {
    private int empid;
    private int salary;

    public Employee(String name, int age, int empid, int salary) {
        super(name, age);
        this.empid = empid;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "Employee [empid =" + empid + " salary =" + salary + "]";
    }

    @Override
    public void display() {
        System.out.println("I am display employee...");
    }

}
