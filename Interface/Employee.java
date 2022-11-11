import java.util.Scanner;

public class Employee extends Person {
    private int eid;
    private double salary;

    public Employee() {
        super();
        System.out.println("I am a default constructor - Employee");
    }

    public Employee(String name, int age, int eid, double salary) {
        super(name, age);
        this.eid = eid;
        this.salary = salary;
    }

    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter empid and salary");
        eid = sc.nextInt();
        salary = sc.nextDouble();
    }

    @Override
    public String toString() {
        return super.toString() + "Employee [eid=" + eid + ", salary=" + salary + "]";
    }

}
