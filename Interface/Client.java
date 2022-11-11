public class Client implements ICallback {

    @Override
    public void callback(int params) {
        System.out.println("callback called with :" + params);

    }

    public void nonIfacemeth() {
        System.out.println("Classes that impliments Interface may also have their own ");
    }

}
