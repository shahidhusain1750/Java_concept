//Single Responsibility
public class Student {

    private String name;
    private int age;

    public Student() {

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void read() {
        System.out.println("Student reading book");
    }

    public void teaching() {
    }

    // public static void main(String[] args) {
    // Student st = new Student();
    // st.read();
    // }
}
