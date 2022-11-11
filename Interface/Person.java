import java.util.Scanner;

public abstract class Person {
    // fields - variables
    protected String name;
    protected int age;
    Scanner sc = new Scanner(System.in);

    public Person() {
        super();
    }

    // Parameterized

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // methods
    public abstract void accept();

    @Override
    public String toString() {
        return "Person [name=" + name + " age=" + age + "]";
    }

}
