import java.util.*;

public class SpiralMatrix {

    // Method to print the matrix in spiral order
    public static void printspiral(int[][] matrix) {
        int startRow = 0; // Starting row index
        int startCol = 0; // Starting column index
        int endRow = matrix.length - 1; // Ending row index
        int endCol = matrix[0].length - 1; // Ending column index

        // Traverse the matrix in spiral order
        while (startRow <= endRow && startCol <= endCol) {

            // Traverse from left to right on the current top row
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // Traverse from top to bottom on the current right column
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            // Traverse from right to left on the current bottom row
            // Check to avoid double printing when there's only one row left
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            // Traverse from bottom to top on the current left column
            // Check to avoid double printing when there's only one column left
            for (int i = endRow - 1; i > startRow; i--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }

            // Move inward to the next layer of the spiral
            startCol++;
            startRow++;
            endRow--;
            endCol--;
        }

        System.out.println(); // Print a newline after the spiral traversal
    }

    public static void main(String[] args) {
        // Define a sample 2D matrix
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        // Call the method to print the matrix in spiral order
        printspiral(matrix);
    }
}
