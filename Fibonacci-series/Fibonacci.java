import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(num);
        for (int i = 0; i < num; i++) {
            System.out.println(Fibo(i) + "");
        }

    }

    public static int Fibo(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            return Fibo(n - 1) + Fibo(n - 2);
        }
    }
}