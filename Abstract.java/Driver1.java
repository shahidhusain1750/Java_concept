import java.util.ArrayList;

public class Driver1 {
    public static void main(String[] args) {
        ArrayList<Person1> ll = new ArrayList<Person1>();
        System.out.println(ll);

        Person1 p1 = new Employee2("Shahid", 20, 1750, 250000);
        ll.add(p1);
        System.out.println(ll);

        ll.add(new Employee2("Ali", 22, 103, 26762));
        System.out.println(ll);

        Iterator<Person1> itr = ll.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
