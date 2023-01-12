import java.util.Scanner;

public class Character {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char c = scanner.next().charAt(0);

        if (c >= 'a' && c <= 'z') {
            System.out.println("Lowercase");
        } else if (c >= 'A' && c <= 'Z') {
            System.out.println("Uppercase");
        } else if (c >= '0' && c <= '9') {
            System.out.println("Digit");
        } else {
            System.out.println("Special character");
        }
        scanner.close();
    }
}
