public class Hanoi {
    static int move = 0;

    public static void main(String[] args) {
        hanoi(3, 'A', 'B', 'C');
        System.out.println("Moves: " + move);
    }

    public static void hanoi(int n, char src, char mid, char dst) {
        if (n == 1) {
            System.out.println(src + " -> " + dst);
            move++;
        } else {
            // move top n-1 disks from src to mid
            hanoi(n - 1, src, dst, mid);
            System.out.println(src + " -> " + dst);
            move++;
            // move top n-1 disks from mid to dst
            hanoi(n - 1, mid, src, dst);
        }
    }
}