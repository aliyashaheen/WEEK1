import java.util.Random;
import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] A = generateMatrix(rows, cols, rand);
        int[][] B = generateMatrix(rows, cols, rand);

        System.out.println("\nMatrix A:");
        displayMatrix(A);
        System.out.println("\nMatrix B:");
        displayMatrix(B);

        System.out.println("\nAddition:");
        displayMatrix(addMatrices(A, B));

        System.out.println("\nSubtraction:");
        displayMatrix(subtractMatrices(A, B));

        System.out.println("\nMultiplication:");
        if (rows == cols) {
            displayMatrix(multiplyMatrices(A, B));
        } else {
            System.out.println("Multiplication not possible (Non-square matrices).");
        }

        System.out.println("\nTranspose of A:");
        displayMatrix(transposeMatrix(A));

        if (rows == 2 && cols == 2) {
            System.out.println("\nDeterminant of A: " + determinant2x2(A));
            System.out.println("\nInverse of A:");
            displayMatrix(inverse2x2(A));
        } else if (rows == 3 && cols == 3) {
            System.out.println("\nDeterminant of A: " + determinant3x3(A));
        } else {
            System.out.println("\nDeterminant & inverse can only be calculated for 2x2 or 3x3 matrices.");
        }

        sc.close();
    }

    static int[][] generateMatrix(int rows, int cols, Random rand) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = rand.nextInt(10); 
        return matrix;
    }

    static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row)
                System.out.print(val + "\t");
            System.out.println();
        }
    }

    static int[][] addMatrices(int[][] A, int[][] B) {
        int[][] result = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A[0].length; j++)
                result[i][j] = A[i][j] + B[i][j];
        return result;
    }

    static int[][] subtractMatrices(int[][] A, int[][] B) {
        int[][] result = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A[0].length; j++)
                result[i][j] = A[i][j] - B[i][j];
        return result;
    }

    static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int[][] result = new int[A.length][B[0].length];
        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < B[0].length; j++)
                for (int k = 0; k < A[0].length; k++)
                    result[i][j] += A[i][k] * B[k][j];
        return result;
    }

    static int[][] transposeMatrix(int[][] A) {
        int[][] result = new int[A[0].length][A.length];
        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A[0].length; j++)
                result[j][i] = A[i][j];
        return result;
    }

    static int determinant2x2(int[][] A) {
        return A[0][0] * A[1][1] - A[0][1] * A[1][0];
    }

    static int determinant3x3(int[][] A) {
        return A[0][0] * (A[1][1] * A[2][2] - A[1][2] * A[2][1]) -
               A[0][1] * (A[1][0] * A[2][2] - A[1][2] * A[2][0]) +
               A[0][2] * (A[1][0] * A[2][1] - A[1][1] * A[2][0]);
    }

    static int[][] inverse2x2(int[][] A) {
        int det = determinant2x2(A);
        if (det == 0) {
            System.out.println("Inverse does not exist (Determinant is 0).");
            return new int[][]{{0, 0}, {0, 0}};
        }
        int[][] inverse = {{A[1][1], -A[0][1]}, {-A[1][0], A[0][0]}};
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                inverse[i][j] /= det;
        return inverse;
    }
}
