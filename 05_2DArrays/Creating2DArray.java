import java.util.*;

public class Creating2DArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for input

        // Declare a 3x3 2D array (matrix)
        int[][] matrix = new int[3][3];

        // Input elements into the 2D array
        System.out.println("Enter the elements of the 3x3 matrix:");
        for (int i = 0; i < matrix.length; i++) { // Loop through rows
            for (int j = 0; j < matrix[0].length; j++) { // Loop through columns
                matrix[i][j] = sc.nextInt(); // Input each element
            }
        }

        // Display the 2D array
        System.out.println("The entered 3x3 matrix is:");
        for (int i = 0; i < matrix.length; i++) { // Loop through rows
            for (int j = 0; j < matrix[0].length; j++) { // Loop through columns
                System.out.print(matrix[i][j] + " "); // Print each element
            }
            System.out.println(); // Move to the next line after printing each row
        }

        sc.close(); // Close the Scanner to prevent resource leaks
    }
}
