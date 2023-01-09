import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        scanner.close();

        if (n == 1) {
            System.out.println("1");
        } else if (n == 2) {
            System.out.println("1, 1");
        } else {
            int num1, num2, val;
            num1 = 1;
            num2 = 1;
            System.out.print("1, 1");

            for (int i = 3; i <= n; i++) {
                val = num1 + num2;
                System.out.print(", " + val);
                num1 = num2;
                num2 = val;
            }
            System.out.println();
        }
    }
}
