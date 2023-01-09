import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three sides of a triangle: ");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();
        scanner.close();

        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            System.out.println("Invalid");
        } else {
            double p = (side1 + side2 + side3) / 2;
            double area = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
            System.out.printf("Area = %.2f\n", area);
        }
    }
}
