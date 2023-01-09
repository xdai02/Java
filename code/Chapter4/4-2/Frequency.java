import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.print("Character to search: ");
        char c = scanner.next().charAt(0);

        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                cnt++;
            }
        }

        System.out.printf(
                "\'%c' appears %d times in \"%s\".\n", c, cnt, str
        );
        scanner.close();
    }
}
