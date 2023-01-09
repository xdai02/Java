import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a 3-digit integer: ");
        int num = scanner.nextInt();

        int a = num / 100;
        int b = num / 10 % 10;
        int c = num % 10;

        System.out.println("Reversed: " + (c * 100 + b * 10 + a));

        scanner.close();
    }
}
