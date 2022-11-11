public class Employee extends Person {
    protected int empid;
    protected double salary;

    public Employee() {
        super();
    }

    public Employee(String name, int age, int empid, double salary) {
        super(name, age);
        this.empid = empid;
        this.salary = salary;
    }

    public void calculateSalary() {
        if (salary < 1500) {
            System.out.println("NO TDS applicable on salary less than 15k.");
        } else {
            salary = salary - (salary / 10);
            System.out.println("TDS applicable.. In hand salary is " + salary);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Employee [empid =" + empid + ", salary =" + salary + "]";
    }

}
