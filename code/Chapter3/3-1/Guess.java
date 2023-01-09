import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // generate random number between 1 and 100
        int answer = random.nextInt(100) + 1;

        int num = 0;
        int cnt = 0;

        do {
            System.out.print("Guess a number: ");
            num = scanner.nextInt();
            cnt++;

            if (num > answer) {
                System.out.println("Too high");
            } else if (num < answer) {
                System.out.println("Too low");
            }
        } while (num != answer);

        System.out.println("Correct! You guessed " + cnt + " times.");
        scanner.close();
    }
}
