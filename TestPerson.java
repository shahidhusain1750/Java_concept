// Test Code - Driver
public class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person(); // default constructor
        // Person p2 = new Person();
        Person p2 = new Person("Shahid", 21); // Parameterized

        p1.accept();
        // p2.accept();
        p1.display();
        p2.display();

    }
}
