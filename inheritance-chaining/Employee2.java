import java.util.Scanner;

public class Employee2 extends Person2 {
    private int id;
    private double salary;

    public Employee2() {
        System.out.println("default constructor created...");
        // super();
    }

    public Employee2(String name, int age, int id, double salary) {
        super(name, age);
        this.id = id;
        this.salary = salary;
    }

    Scanner sc = new Scanner(System.in);

    public void accept() {
        System.out.println("Enter Id and salary :");
        super.accept();
        id = sc.nextInt();
        salary = sc.nextDouble();
    }

    public void display() {
        System.out.println("Person Information "
                + name + " " + age + " " + id + " " + salary);
    }
}
