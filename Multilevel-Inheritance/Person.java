import java.util.Scanner;

public class Person {
    protected String name;
    protected int age;

    public Person() {
        super();
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name or age an empid, salary");
        name = sc.next();
        age = sc.nextInt();
        // empid = sc.nextInt();
        // salary = sc.nextDouble();
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }

}