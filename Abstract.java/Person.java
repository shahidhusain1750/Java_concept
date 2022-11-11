public abstract class Person {

    protected String name;
    protected int age;

    // constructor
    public Person() {
        System.out.println("Default constructor...");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void display();

    @Override
    public String toString() {
        return "Person [name =" + name + " " + "age = " + age + "]";
    }
}