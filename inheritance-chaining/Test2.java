public class Test2 {
    public static void main(String[] args) {
        Employee2 e2 = new Employee2();
        Employee2 e3 = new Employee2("Shahid", 20, 1750, 30000);

        e2.accept();
        e2.display();
        e3.display();
        // System.out.println(e3);
    }
}
