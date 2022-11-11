import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        int n1, n2, result;

        Scanner sc = new Scanner(System.in);
        try {

            System.out.println("Enter a Number");
            n1 = sc.nextInt();
            n2 = sc.nextInt();
            result = n1 / n2;
            System.out.println(result);
        } catch (ArithmeticException ae) {
            System.out.println(ae);
        } catch (InputMismatchException ie) {
            System.out.println(ie);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println(" I am finally block");
        }

    }
}