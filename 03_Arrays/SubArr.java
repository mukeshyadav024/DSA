public class SubArr {

    // Method to print all subarrays, their sums, and find the total count, min sum, and max sum
    public static void printsubarr(int num[]) {
        int total = 0; // Variable to count total subarrays
        int min = Integer.MAX_VALUE; // Initialize min sum to maximum possible value
        int max = Integer.MIN_VALUE; // Initialize max sum to minimum possible value

        // Outer loop for the starting index of subarray
        for (int i = 0; i < num.length; i++) {
            int start = i; // Starting index of the subarray

            // Inner loop for the ending index of subarray
            for (int j = i; j < num.length; j++) {
                int last = j; // Ending index of the subarray
                int sum = 0;  // Variable to store the sum of the current subarray

                // Loop to traverse the elements of the current subarray
                for (int k = start; k <= last; k++) {
                    System.out.print(num[k] + " "); // Print the current element
                    sum += num[k]; // Add the current element to the sum
                }

                // Print the sum of the current subarray
                System.out.println("     Sum is: " + sum);

                // Increment total subarray count
                total++;

                // Update min sum if the current sum is smaller
                if (min > sum) {
                    min = sum;
                }

                // Update max sum if the current sum is larger
                if (max < sum) {
                    max = sum;
                }
            }

            // Print a blank line for better readability between starting indices
            System.out.println();
        }

        // Print the final results
        System.out.println("Total subarrays: " + total);
        System.out.println("Minimum sum of subarray: " + min);
        System.out.println("Maximum sum of subarray: " + max);
    }

    public static void main(String args[]) {
        // Initialize the array
        int numbers[] = {2, 4, 6, 7, -1, -5};

        // Call the method to print subarrays and calculate results
        printsubarr(numbers);
    }
}
