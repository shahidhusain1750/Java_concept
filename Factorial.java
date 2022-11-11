// w.a.p to print factorial of 5 number.
public class Factorial {
    public static void main(String[] args) {
        int fact = 1;
        int i;
        int n = 5;

        for (i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factoral of 5 number is " + fact);
    }
}
