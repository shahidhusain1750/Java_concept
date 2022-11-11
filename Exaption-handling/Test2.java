class printOdds extends Thread {
    public void run() {
        for (int i = 1; i < 100; i = i + 2) {
            System.out.println(i);
        }
    }
}

class printEven extends Thread {
    public void run() {
        for (int i = 2; i < 100; i = i + 2) {
            System.out.println(i);
        }
    }
}

public class Test2 {
    public static void main(String[] args) {
        Thread th = Thread.currentThread();
        System.out.println("Current thread :" + th.getName());
        th.setName("Test2 Thread :" + th.getName());
        System.out.println("Change name :" + th.getName());

        // objects
        printOdds po = new printOdds();
        po.start();
        printEven pe = new printEven();
        pe.start();

        for (int n = 5; n > 0; n--) {
            try {
                Thread.sleep(1500);
                System.out.println(n);
            } catch (InterruptedException e) {
                e.getStackTrace();
            }
        }
    }
}
