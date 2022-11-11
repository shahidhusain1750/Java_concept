import java.util.Scanner;

public class Person1 {
    private String name;
    private int age;
    Scanner sc = new Scanner(System.in);

    // default constructor
    
    public Person1() {
        System.out.println("Object Created -- default constructor");
    }

    public Person1(String name, int age) {
        System.out.println("Object created");
        this.name = name;
        this.age = age;
    }

    public void accept() {
        System.out.println("Enter a name or age");
        name = sc.next();
        age = sc.nextInt();
    }
    
    public void display() {
        System.out.println("Name an age is " + name + " " + age);
    }
}
