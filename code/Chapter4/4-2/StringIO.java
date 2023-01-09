import java.util.Scanner;

public class StringIO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string 1: ");
        String str1 = scanner.nextLine();
        System.out.println(str1);

        System.out.print("Enter string 2: ");
        String str2 = scanner.next();
        System.out.printf("%s", str2);

        scanner.close();
    }
}
