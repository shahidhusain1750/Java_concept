class Mechanic extends Car {
    public void changtier() {

        System.out.println("Driver do not change tier" + " " + "because its not their responsibility");
        System.out.println("Mechanic can Change the tier");
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.drive();
        c.filltank();

        // Mechanic mc = new Mechanic();
        // mc.changtier();

        Mechanic mc = new Mechanic();
        mc.changtier();

    }
}
