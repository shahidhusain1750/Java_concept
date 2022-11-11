import java.util.Scanner;

public class Employee extends Person implements ICallback {
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

    @Override
    public String toString() {
        return super.toString() + "Employee [empid=" + empid + ", salary=" + salary + "]";
    }

    @Override
    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name,age,id,salary of employee");
        name = sc.next();
        age = sc.nextInt();
        empid = sc.nextInt();
        salary = sc.nextDouble();
    }

    @Override
    public void callback(int params) {
        System.out.println("callback called  with " + params);

    }

}
