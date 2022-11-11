class Bike implements Car {

    @Override
    public void running(int speed) {
        System.out.println("Car is running speed is " + speed);
    }

    @Override
    public void Stop(int decreas) {
        System.out.println("car stop speed is " + decreas);
    }
}
