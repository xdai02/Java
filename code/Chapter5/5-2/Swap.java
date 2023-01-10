public class Swap {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        System.out.println("Before: a = " + a + ", b = " + b);
        swap(a, b);
        System.out.println("After: a = " + a + ", b = " + b);
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("swap(): a = " + a + ", b = " + b);
    }
}
