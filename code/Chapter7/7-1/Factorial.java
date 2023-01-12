import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        try {
            System.out.println(n + "! = " + factorial(n));
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }

    public static int factorial(int n)
            throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException(
                    "Factorial of negative numbers is not defined."
            );
        }

        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
