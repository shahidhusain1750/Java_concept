import java.util.Scanner;

public class Stacktrace {
    public static void main(String[] args) {
        System.out.println("I am a main - will call do something");
        doSomething();
    }

    public static void doSomething() {
        dodoSomething();
    }

    public static void dodoSomething() {

        int n1, n2, result;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        result = n1 / n2;
        System.out.println(result);
    }

}
