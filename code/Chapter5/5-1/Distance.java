import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter (x1, y1): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.print("Enter (x2, y2): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        scanner.close();

        System.out.printf(
                "Distance: %.2f\n", distance(x1, y1, x2, y2)
        );
    }

    public static double square(double x) {
        return x * x;
    }

    public static double distance(double x1, double y1,
                                  double x2, double y2) {
        return Math.sqrt(square(x1 - x2) + square(y1 - y2));
    }
}
