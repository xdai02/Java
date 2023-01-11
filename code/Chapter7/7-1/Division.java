import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter an integer for dividend: ");
                int dividend = scanner.nextInt();
                System.out.print("Enter an integer for divisor: ");
                int divisor = scanner.nextInt();
                int quotient = dividend / divisor;
                System.out.println(
                        dividend + " / " + divisor + " = " + quotient
                );
            } catch (InputMismatchException e) {
                System.out.println("Only integers supported.");
            } catch (ArithmeticException e) {
                System.out.println("Divisor cannot be 0.");
            } finally {
                scanner.nextLine();
            }
        }
    }
}
