import java.util.Scanner;

public class Height {
    public static void main(String[] args) {
        final int NUM_PEOPLE = 5;

        Scanner scanner = new Scanner(System.in);

        int total = 0;

        int i = 1;
        while (i < NUM_PEOPLE) {
            System.out.print("Enter person " + i + "'s height: ");
            double height = scanner.nextDouble();
            total += height;
            i++;
        }
        scanner.close();

        double average = total / NUM_PEOPLE;
        System.out.printf("Average height: %.2f\n", average);
    }
}
