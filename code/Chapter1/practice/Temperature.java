import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double C = scanner.nextDouble();
        double F = 32 + C * 9 / 5;

        System.out.printf("F = 32 + %.2f * 9 / 5 = %.2f\n", C, F);
        scanner.close();
    }
}
