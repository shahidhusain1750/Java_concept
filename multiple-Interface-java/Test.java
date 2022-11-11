public class Test {
    public static void main(String[] args) {
        // Person p1 = new Person();
        // p1.accept();
        Employee e1 = new Employee();
        Employee e2 = new Employee("shivam", 20, 001, 150);
        // dynamic method dispatch
        // Person e3 = new Employee("koe", 1000, 021, 150);
        // System.out.println(e3.toString());
        // e1.accept();

        System.out.println(e1.toString());
        System.out.println(e2.toString());

        // yaha pe jab employee ne implement kiya interface ko toh ham dynamic method me
        // person ka reference nhi de sakte
        ICallback e = new Employee("jennei", 20, 001, 5200);
        e.callback(10);
        System.out.println(e.toString());
    }
}
