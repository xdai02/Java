public class MaxMin {
    public static void main(String[] args) {
        int[] num = {7, 6, 2, 9, 3, 1, 4, 0, 5, 8};
        int n = num.length;
        int max = num[0];
        int min = num[0];

        for (int i = 1; i < n; i++) {
            if (num[i] > max) {
                max = num[i];
            }
            if (num[i] < min) {
                min = num[i];
            }
        }

        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}
