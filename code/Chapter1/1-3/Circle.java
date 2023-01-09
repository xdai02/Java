import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        final double PI = 3.14159;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Radius: ");
        double r = scanner.nextDouble();

        double area = PI * Math.pow(r, 2);
        System.out.printf("Area = %.2f\n", area);
    
        scanner.close();
    }
}
