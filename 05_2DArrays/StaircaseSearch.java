import java.util.*;

public class StaircaseSearch {

    // Search using top-right corner approach
    public static boolean topRightApproach(int matrix[][], int key) {
        int row = 0; // Start from the first row
        int col = matrix[0].length - 1; // Start from the last column

        // Traverse the matrix
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) { // Key found
                System.out.println("Key Found At (" + row + ", " + col + ")");
                return true;
            } else if (key < matrix[row][col]) {
                col--; // Move left if key is smaller
            } else {
                row++; // Move down if key is larger
            }
        }
        System.out.println("Key Not Found : "); // Key not found
        return false;
    }

    // Search using bottom-left corner approach
    public static boolean bottomLeftApproach(int matrix[][], int key) {
        int row = matrix.length - 1; // Start from the last row
        int col = 0; // Start from the first column

        // Traverse the matrix
        while (col < matrix[0].length && row >= 0) {
            if (matrix[row][col] == key) { // Key found
                System.out.println("Key Found At (" + row + ", " + col + ")");
                return true;
            } else if (key < matrix[row][col]) {
                row--; // Move up if key is smaller
            } else {
                col++; // Move right if key is larger
            }
        }
        System.out.println("Key Not Found : "); // Key not found
        return false;
    }

    public static void main(String args[]) {
        int matrix[][] = { // Input 2D matrix
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int key1 = 8; // Key to search using top-right approach
        int key2 = 9; // Key to search using bottom-left approach

        // Search using top-right approach
        System.out.println("Using Top-right Approach:");
        topRightApproach(matrix, key1);

        // Search using bottom-left approach
        System.out.println("\nUsing Bottom-left Approach:");
        bottomLeftApproach(matrix, key2);
    }
}
