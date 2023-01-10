public class Fibonacci {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        return fibonacci(n - 2) + fibonacci(n - 1);
    }
}
