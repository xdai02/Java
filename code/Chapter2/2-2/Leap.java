import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        /*
         * A year is a leap year if it is
         * 1. exactly divisible by 4, and not divisible by 100;
         * 2. or is exactly divisible by 400
         */
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("Leap year");
        } else {
            System.out.println("Common year");
        }

        scanner.close();
    }
}
