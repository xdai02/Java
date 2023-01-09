import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an expression: ");
        int num1 = scanner.nextInt();
        char operator = scanner.next().charAt(0);
        int num2 = scanner.nextInt();
        scanner.close();

        switch (operator) {
        case '+':
            System.out.printf(
                    "%d + %d = %d\n", num1, num2, num1 + num2
            );
            break;
        case '-':
            System.out.printf(
                    "%d - %d = %d\n", num1, num2, num1 - num2
            );
            break;
        case '*':
            System.out.printf(
                    "%d * %d = %d\n", num1, num2, num1 * num2
            );
            break;
        case '/':
            System.out.printf(
                    "%d / %d = %d\n", num1, num2, num1 / num2
            );
            break;
        default:
            System.out.println("Error! Operator is not supported");
            break;
        }
    }
}
