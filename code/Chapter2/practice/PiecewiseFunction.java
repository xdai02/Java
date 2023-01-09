import java.util.Scanner;

public class PiecewiseFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x: ");
        double x = scanner.nextDouble();
        scanner.close();

        double y;
        if (x < -2) {
            y = 0.5 * x + 3;
        } else if (x >= -2 && x <= 2) {
            y = 0;
        } else {
            y = Math.pow(4, x);
        }

        System.out.printf("y = %.2f\n", y);
    }
}
