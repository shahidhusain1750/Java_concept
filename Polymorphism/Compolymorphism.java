public class Compolymorphism {

    public void car() {
        System.out.println("car is runing 100kmph :");
    }

    // This is compile time polymorphism
    // use of overloading method
    public void car(int speed) {
        System.out.println("car spees is " + speed + "kmph :");
    }
}