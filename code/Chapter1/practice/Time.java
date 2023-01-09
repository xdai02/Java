import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total seconds: ");
        int total = scanner.nextInt();
        scanner.close();

        int hour = total / 3600;
        int min = total % 3600 / 60;
        int sec = total % 60;

        System.out.printf(
                "%d second(s) = %d hour(s) %d minute(s) %d second(s)\n",
                total, hour, min, sec
        );
    }
}
