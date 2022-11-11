public class Driver {
    public static void main(String[] args) {

        Person e1 = new Employee("Nabeel", 21, 1, 10000);
        e1.calculateSalary();
        System.out.println(e1.toString());

        PTEmployee pt1 = new PTEmployee("Sadiya", 22, 002);
        pt1.calculateSalary(400, 20);
        System.out.println(pt1.toString());
    }
}
