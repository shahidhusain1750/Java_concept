public class Test1 {
    public static void main(String[] args) {

        // (currentThread) Returns a reference to the currently executing thread object
        Thread th = Thread.currentThread();
        // (getName) returns thread name
        System.out.println("current Thread :" + th.getName());
        th.setName("Task1 Thread..");
        System.out.println("current Thread :" + th.getName());

        for (int n = 5; n > 0; n--) {
            try {
                Thread.sleep(1500);
                System.out.println(n);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
