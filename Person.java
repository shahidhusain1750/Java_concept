import java.util.Scanner;

public class Person {
    // fields - variables
    private String name;
    private int age;
    Scanner sc = new Scanner(System.in);

    // default constructor
    public Person() {
        System.out.println("Object created. -- Default constructor..");
    }

    // Parameterized
    public Person(String n, int a) {
        System.out.println("Object created.-- Parameterized constructor");
        name = n;
        age = a;
    }

    // methods
    public void accept() {
        System.out.println("Enter name and age of the person :");
        name = sc.next();
        age = sc.nextInt();
    }

    public void display() {
        System.out.println("~~~Person Information~~~");
        System.out.println("Name " +name);
        System.out.println("Age " + age);
    }

}
