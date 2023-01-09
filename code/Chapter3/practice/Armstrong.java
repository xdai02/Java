public class Armstrong {
    public static void main(String[] args) {
        for (int num = 100; num <= 999; num++) {
            int a = num / 100;
            int b = num / 10 % 10;
            int c = num % 10;
            if (num == a * a * a + b * b * b + c * c * c) {
                System.out.print(num + " ");
            }
        }
    }
}
