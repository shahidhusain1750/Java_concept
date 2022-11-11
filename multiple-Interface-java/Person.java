import java.util.Scanner;

public abstract class Person {
    protected String name;
    protected int age;
    Scanner sc = new Scanner(System.in);

    public Person() {
        super();
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void accept();

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }

}