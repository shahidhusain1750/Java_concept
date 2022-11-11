public class Dog extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("bow wow");
    }

    @Override
    public void Eating() {
        System.out.println("Running");
    }

    @Override
    public void Sleeping() {
        System.out.println("Sleeping");
    }

    @Override
    public void Swimming() {
        throw new RuntimeException("Dog can't swimming");
    }
}

class DumbDog extends Animal {
    @Override
    public void makeNoise() {
        throw new RuntimeException("I can't make noise");
    }

    @Override
    public void Swimming() {
        throw new RuntimeException("Dumdog can't swimming");
    }

}
