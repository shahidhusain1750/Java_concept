public class Test {
    public static void main(String[] args) {
        Car c1 = new Car("Audi");
        c1.start("Audi");

        Car c2 = new Car("lamborgini");
        c2.stop();

        Driver d = new Driver();
        d.drive(c1);

        Driver d1 = new Driver();
        d1.drive(c2);
    }
}
