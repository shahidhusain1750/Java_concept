import javax.management.RuntimeErrorException;

public class Cat extends Animal {

    @Override
    public void makeNoise() {
        System.out.println("meow meow");
    }

    public void Swimming() {
        throw new RuntimeException("Cat can't swimming");
    }
}
