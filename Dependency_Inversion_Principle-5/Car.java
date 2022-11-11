public abstract class Car {

    protected String name;
    protected Engine engine;

    public Car(String name, Engine e) {
        this.name = name;
        this.engine = e;
    }

    public String getName() {
        return name;
    }

    public abstract void Start();

    public abstract void Stop();

}