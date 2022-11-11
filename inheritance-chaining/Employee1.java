import java.util.Scanner;

public class Employee1 extends Person1 {
    private int id;
    private double salary;

    public Employee1() {
        System.out.println("Default constructor");
    }

    public Employee1(String name, int age, int id, double salary) {
        super(name, age);
        this.id = id;
        this.salary = salary;
        System.out.println("Default constructor");
    }

    public void accept() {
        System.out.println("Enter a name, age, id and salary");
        super.accept();
        id = sc.nextInt();
        salary = sc.nextDouble();
    }

    public void display() {
        System.out.println("Employee Information"
                + name + " " + age + " " + id + " " + salary);
    }

}
