import java.util.Scanner;

public class Reciprocal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        scanner.close();

        double sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                sum += 1.0 / i;
            } else {
                sum -= 1.0 / i;
            }
        }
        System.out.printf("Sum = %.2f\n", sum);
    }
}
