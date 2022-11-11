// w.a.program to print fibonacci series 
public class FabonacciSeries {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3, i, count = 10;
        for (i = 1; i < count; i++) {
            n3 = n1 + n2;
            System.out.println("Series is " + n3);
            n1 = n2;
            n2 = n3;

        }

    }
}
