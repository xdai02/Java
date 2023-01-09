public class SquareSum {
    public static void main(String[] args) {
        int[] arr = {7, 6, 2, 9, 3};
        int sum = 0;
        for (int elem : arr) {
            sum += elem * elem;
        }
        System.out.println("Square sum = " + sum);
    }
}
