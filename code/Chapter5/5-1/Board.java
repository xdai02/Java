public class Board {
    public static void main(String[] args) {
        print_board(3, 3);
    }

    public static void print_board(int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col - 1; j++) {
                System.out.print("   |");
            }
            System.out.println();

            if (i < row - 1) {
                System.out.println("---+---+---");
            }
        }
    }
}
