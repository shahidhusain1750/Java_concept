public abstract class Person {

    protected String name;
    protected int age;

    public Person() {
        super();
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void calculateSalary();

    @Override
    public String toString() {
        return "Person [age=" + age + ", name=" + name + "]";
    }

}