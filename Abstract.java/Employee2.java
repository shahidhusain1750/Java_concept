public class Employee2 extends Person1 {
    private int ID;
    private double salary;

    public Employee2() {
        System.out.println("Default constructor...");
    }

    public Employee2(String name, int age, int ID, double salary) {
        super(name, age);
        this.ID = ID;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString()+ "Employee [ID =" + ID + " " + "salary = " + salary + "]";

    @Override
    public void display() {
        System.out.println("I am display of Person1");
    }
}
