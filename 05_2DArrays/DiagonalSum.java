import java.util.*;

public class DiagonalSum {

    // Brute-force approach to calculate diagonal sum
    public static int sum(int[][] matrix) {
        int n = matrix.length; // Size of the matrix (assumes square matrix)
        int sum = 0;

        // Iterate over all elements in the matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) { // Primary diagonal
                    sum += matrix[i][j];
                } else if (i + j == (n - 1)) { // Secondary diagonal
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

    // Optimized approach to calculate diagonal sum
    public static int optimiseSum(int[][] matrix) {
        int sum = 0;

        // Traverse only the rows, accessing both diagonals in one loop
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i]; // Primary diagonal
            if (i != matrix.length - 1 - i) { // Avoid double-counting the center for odd-sized matrices
                sum += matrix[i][matrix.length - i - 1]; // Secondary diagonal
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        // Define a sample square matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Compute diagonal sum using both approaches
        int res1 = sum(matrix); // Brute-force
        int res2 = optimiseSum(matrix); // Optimized

        // Print results
        System.out.println("Brute-force Sum: " + res1);
        System.out.println("Optimized Sum: " + res2);
    }
}
