import java.util.*;

// Program to perform matrix operations
public class MatrixOperations {

    // Method to create a random matrix
    public static int[][] createRandomMatrix(int rows, int cols) {

        int matrix[][] = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Generate random numbers between 1 and 9
                matrix[i][j] = (int)(Math.random() * 9) + 1;
            }
        }
        return matrix;
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] a, int[][] b) {

        int rows = a.length;
        int cols = a[0].length;
        int sum[][] = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        return sum;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] a, int[][] b) {

        int rows = a.length;
        int cols = a[0].length;
        int diff[][] = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                diff[i][j] = a[i][j] - b[i][j];
            }
        }
        return diff;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] a, int[][] b) {

        int rows = a.length;
        int cols = b[0].length;
        int common = b.length;

        int product[][] = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < common; k++) {
                    product[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return product;
    }

    // Method to display matrix
    public static void displayMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {

        int rows = 3, cols = 3;

        // Create random matrices
        int[][] matrixA = createRandomMatrix(rows, cols);
        int[][] matrixB = createRandomMatrix(rows, cols);

        System.out.println("Matrix A:");
        displayMatrix(matrixA);

        System.out.println("\nMatrix B:");
        displayMatrix(matrixB);

        // Addition
        System.out.println("\nAddition of matrices:");
        displayMatrix(addMatrices(matrixA, matrixB));

        // Subtraction
        System.out.println("\nSubtraction of matrices:");
        displayMatrix(subtractMatrices(matrixA, matrixB));

        // Multiplication
        System.out.println("\nMultiplication of matrices:");
        displayMatrix(multiplyMatrices(matrixA, matrixB));
    }
}
