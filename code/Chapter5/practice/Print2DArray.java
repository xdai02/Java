import java.util.Scanner;

public class Print2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter row: ");
        int row = scanner.nextInt();
        System.out.print("Enter column: ");
        int col = scanner.nextInt();

        print2DArray(arr, n, row, col);
        scanner.close();
    }

    public static void print2DArray(int[] arr, int n, int row, int col) {
        if (n != row * col) {
            return;
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i * col + j] + " ");
            }
            System.out.println();
        }
    }
}