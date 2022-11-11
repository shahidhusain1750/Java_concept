public class Car {

    final int s = 100;

    private String name;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void start(String name) {
        System.out.println("Start a car" + name);
    }

    public void stop() {
        System.out.println("Stop a car" + name);
    }

    public void setName(String name) {
        this.name = name;
    }
}