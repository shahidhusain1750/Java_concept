import java.util.Scanner;

public class Person {
    // fields - variables
    protected String name;
    protected int age;
    Scanner sc = new Scanner(System.in);

    // default constructor
    public Person() {
        System.out.println("Object created. -- Default constructor..");
    }

    // Parameterized

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // methods
    public void accept() {
        System.out.println("Enter name and age of the person :");
        name = sc.next();
        age = sc.nextInt();
    }

    public void display() {
        System.out.println("~~~ Person Information~~~" + name + " " + age);
    }
}
