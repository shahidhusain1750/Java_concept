public class Driver {
    public static void main(String[] args) {
        ICallback i = new Client();
        i.callback(10);

        ICallback p = new Superman("Shahid", 20, 101, 50000);
        // p.display();
        p.callback(10);

        // Employee e1 = new Employee("Shahid", 20, 1750, 30000);
        // i.callback(10);
        // System.out.println(e1.toString());

    }
}
