import java.util.Scanner;

public class Person2 {
    protected String name;
    protected int age;

    public Person2() {
        super();
    }

    Scanner sc = new Scanner(System.in);

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void accept() {
        System.out.println("Enter the name and age :");
        name = sc.next();
        age = sc.nextInt();
    }

    public void display() {
        System.out.println("Name an age is " + name + age);
    }
}
