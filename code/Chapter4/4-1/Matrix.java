public class Matrix {
    public static void main(String[] args) {
        int[][] A = {
                {1, 3},
                {1, 0},
                {1, 2}
        };
        int[][] B = {
                {0, 0},
                {7, 5},
                {2, 1}
        };
        int[][] C = new int[3][2];

        System.out.println("Matrix Addition");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                C[i][j] = A[i][j] + B[i][j];
                System.out.printf("%3d", C[i][j]);
            }
            System.out.println();
        }

        System.out.println("Matrix Subtraction");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                C[i][j] = A[i][j] - B[i][j];
                System.out.printf("%3d", C[i][j]);
            }
            System.out.println();
        }
    }
}
