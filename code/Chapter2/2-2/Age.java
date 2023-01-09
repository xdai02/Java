import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age > 0 && age < 18) {
            System.out.println("Minor");
        }

        scanner.close();
    }
}
