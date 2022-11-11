public class Drive {
    public static void main(String[] args) {
        // Person p1 = new Person("Shahid", 20);
        // p1.display();

        // Person p = new Person("Shahid", 20);

        Person p = new Person();
        p.setAge(20);

        p.setName("Shahid");
        p.display();

        // cannot change & modify of private modifier
        // p.name = "husain";
        // System.out.println(p.name);
        // p.age = -1;
        // System.out.println(p.age);

    }
}
