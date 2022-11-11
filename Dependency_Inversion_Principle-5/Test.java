public class Test {
    public static void main(String[] args) {
        SUVCar sv1 = new SUVCar("Audi", new V6Engine());
        SUVCar sv2 = new SUVCar("lamborgini", new FourCEngine());
        sv1.Start();
        sv1.Stop();

        sv2.Start();
        sv2.Stop();
    }
}
