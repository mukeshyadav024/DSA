public class PairsArr {

    // Method to print all pairs of elements in the array
    public static void pairs(int num[]) {
        // Outer loop to fix the first element of the pair
        for (int i = 0; i < num.length; i++) {
            int curr = num[i]; // Current element

            // Inner loop to fix the second element of the pair
            for (int j = i + 1; j < num.length; j++) {
                // Print the current pair
                System.out.print("(" + curr + ", " + num[j] + ") ");
            }

            // Print a new line for better readability between rows
            System.out.println();
        }
    }

    public static void main(String args[]) {
        // Initialize the array
        int numbers[] = {10, 22, 32, 11, 2, 1, 0};

        // Call the method to print all pairs
        pairs(numbers);
    }
}
