public abstract class Person1 {
    protected String name;
    protected int age;

    public Person1() {
        super();
    }

    public void Person1(String name, int age) {
        this.name = name;
        this.age = age
    }

    public abstract void display();

    @Override
    public String toString() {
    return "Person1 [name = " + name + " " + "age = " + age + "]" 
   }
}
