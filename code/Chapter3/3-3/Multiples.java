import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 10;
        System.out.print("Enter " + n + " integers: ");

        int sum_square = 0;
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num < 0) {
                continue;
            }
            sum_square += num * num;
        }

        System.out.println(
                "Sum of squares of positive integers: " + sum_square
        );
        scanner.close();
    }
}
