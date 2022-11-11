public class SUVCar extends Car {
    int seatingCapacity;

    public SUVCar(String name, Engine e) {
        super(name, e);
    }

    @Override
    public void Start() {
        System.out.println("Started " + name + engine);

    }

    @Override
    public void Stop() {
        System.out.println("Stop");

    }

}