import java.util.Scanner;

public class Power2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = scanner.nextInt();
        scanner.close();

        System.out.println(power2(x));
    }


    public static int power2(int x) {
        if (x == 0) {
            return 1;
        }
        return 2 * power2(x - 1);
    }
}
