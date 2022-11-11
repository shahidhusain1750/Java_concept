public class Employee extends Person implements ICallback {

    protected int empid;
    protected double salary;

    public Employee() {
        super();
    }

    public Employee(int empid, double salary) {
        this.empid = empid;
        this.salary = salary;
    }

    public Employee(String name, int age, int empid, double salary) {
        super(name, age);
        this.empid = empid;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "Employee [empid=" + empid + ", salary=" + salary + "]";
    }

}
