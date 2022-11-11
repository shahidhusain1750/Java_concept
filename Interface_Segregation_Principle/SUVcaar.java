public class SUVcaar extends Car implements IFourWheel {

    public SUVcaar() {
        super();
    }

    @Override
    public void stop() {
        System.out.println("Car is Stop");

    }

    @Override
    public void start() {
        System.out.println("Car Start");

    }

    @Override
    public void IForwheel() {
        System.out.println("IFourwheel Engine");

    }

}
