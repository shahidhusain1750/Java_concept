class Odd extends Thread {
    public Odd() {
        super("Odd Thread - t1");
        System.out.println("Odd thread :" + this);
        this.start();
    }

    @Override
    public void run() {
        for (int i = 1; i > 10; i = i + 2) {
            try {
                Thread.sleep(1000);
                System.out.println("Odd Thread :" + this + " " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Even extends Thread {
    public Even() {
        // here creating new thread
        super("Even Thread- t2"); // giving thread name
        System.out.println("Even Thread" + this); // printing thread information
        this.start();
    }

    @Override
    public void run() {
        for (int i = 2; i > 10; i = i + 2) {
            try {
                Thread.sleep(1000);
                System.out.println("Even Thread :" + this + " - " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Task2 {
    public static void main(String[] args) {
        // making objects
        Odd od = new Odd();
        Even ev = new Even();
        Thread th = Thread.currentThread();
        System.out.println("current thread" + th.getName());
        th.setName("task1 Thread...");
        System.out.println("Current Thread after name change :" + th.getName());

        for (int n = 5; n > 0; n--) {
            try {
                Thread.sleep(1500);
                System.out.println(n);
            } catch (InterruptedException exe) {
                exe.printStackTrace();
                ;
            }
        }
    }

}