class PrintOdds extends Thread {
    public void run() {
        for (int i = 1; i < 100; i = i + 2) {
            System.out.println(i);
        }
    }
}

class PrintEven extends Thread {
    public void run() {
        for (int i = 2; i <= 100; i = i + 2) {
            System.out.println(i);
        }
    }
}

public class Taskk1 {
    public static void main(String[] args) {
        Thread th = Thread.currentThread();
        System.out.println("current Thread :" + th.getName());
        th.setName("Taskk1 Thread :");
        System.out.println("current Thread" + th.getName());

        // making objects

        PrintOdds po = new PrintOdds();
        po.start();
        PrintEven pe = new PrintEven();
        pe.start();

        for (int n = 5; n > 0; n--)
            try {
                Thread.sleep(1500);
                System.out.println(n);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

    }
}
