// import java.util.Scanner;

class Tools {

    void addition(int[][] matrix1, int[][] matrix2) {
        int m = matrix1.length;
        int n = matrix1[0].length;

        if (m != matrix2.length || n != matrix2[0].length) {
            return;
        }

        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        displayMatrix(result);
    }

    void subtraction(int[][] matrix1, int[][] matrix2) {
        int m = matrix1.length;
        int n = matrix1[0].length;

        if (m != matrix2.length || n != matrix2[0].length) {
            return;
        }

        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        displayMatrix(result);
    }

    void multiplication(int[][] matrix1, int[][] matrix2) {
        int m1 = matrix1.length;
        int n1 = matrix1[0].length;
        int m2 = matrix2.length;
        int n2 = matrix2[0].length;

        if (n1 != m2) {
            return;
        }

        int[][] result = new int[m1][n2];
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n2; j++) {
                for (int k = 0; k < n1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        displayMatrix(result);
    }

    void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}

public class matrix {

    public static void main(String[] args) {
        Tools tools = new Tools();

        int[][] matrix1 = {
            {1, 1, 1},
            {1, 1, 1},
            {1, 1, 1}
        };

        int[][] matrix2 = {
            {1, 1, 1},
            {1, 1, 1},
            {1, 1, 1}
        };

        System.out.println("Addition:");
        tools.addition(matrix1, matrix2);

        System.out.println("Subtraction:");
        tools.subtraction(matrix1, matrix2);

        System.out.println("Multiplication:");
        tools.multiplication(matrix1, matrix2);
    }
}
