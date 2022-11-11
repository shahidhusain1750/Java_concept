import java.util.ArrayList;
import java.util.Iterator;

public class Driver {
    public static void main(String[] args) {
        ArrayList<Person> ll = new ArrayList<Person>();
        System.out.println(ll);

        // dynamic method dispatch
        Person p6 = new Employee("sarah", 30, 109, 4888);
        // System.out.println(p6.toString());

        Employee e1 = new Employee("shahid", 20, 101, 50000);
        // System.out.println(e1.toString());

        ll.add(e1);
        ll.add(p6);
        ll.add(new Employee("Abdul", 22, 1001, 89947));
        // System.out.println(ll);

        // Iterate over an ArraayList

        Iterator<Person> itr = ll.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
