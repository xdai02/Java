public class ASCII {
    public static void main(String[] args) {
        for (int i = 0; i < 128; i++) {
            System.out.println(String.format("%c - %d", i, i));
        }
    }
}
