//1st method implementation of interface
class Visuallabs implements Runnable {
    Thread vl;

    public Visuallabs() {
        // creating a new 2nd thread

        vl = new Thread(this, "Visuallabs Thread");
        System.out.println("Child Thread :" + vl);
        vl.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                Thread.sleep(1500);
                System.out.println("Child thread :" + i);
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}

public class Task1 {
    public static void main(String[] args) {
        // making object
        Visuallabs obj = new Visuallabs();
        Thread th = Thread.currentThread();
        System.out.println("Current thread " + th.getName());
        th.setName("Task3 Thread");
        System.out.println("current name " + th.getName());

        // making objects

        for (int n = 5; n > 0; n--)
            try {
                Thread.sleep(1500);
                System.out.println(n);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

    }

}
