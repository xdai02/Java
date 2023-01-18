public class Board {
    public static void main(String[] args) {
        printBoard();
    }

    public static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("   |");
            }
            System.out.println();

            if (i < 2) {
                System.out.println("---+---+---");
            }
        }
    }
}
