public class Sum {
    public static void main(String[] args) {
        System.out.println("1-100的累加和 = " + sum(1, 100));
        System.out.println("1024-2048的累加和 = "+ sum(1024, 2048));
    }

    public static int sum(int start, int end) {
        int total = 0;
        for(int i = start; i <= end; i++) {
            total += i;
        }
        return total;
    }
}