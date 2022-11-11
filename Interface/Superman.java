public class Superman extends Employee implements ICallback {
    public Superman(String name, int age, int empid, int salary) {
        System.out.println("Object of Superman created...");
    }

    @Override
    public void callback(int params) {
        System.out.println("superman has " + params + " Super powers");

    }
}
