//Single Responsibility Principal
public class Teacher extends Student {
    public void teaching() {
        System.out.println("Teacher Teaching a book");
    }

    public static void main(String[] args) {
        Student th = new Teacher();
        th.teaching();

        Student st = new Student("Shahid", 20);
        st.read();
        System.out.println(st);

    }
}
