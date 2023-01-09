import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        scanner.close();

        int n = 0;

        do {
            num /= 10;
            n++;
        } while (num != 0);

        System.out.println("Digits: " + n);
    }
}
