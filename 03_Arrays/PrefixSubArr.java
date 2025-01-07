public class PrefixSubArr {

    // Method to calculate the maximum sum of subarrays using prefix sums
    public static void maxsubarr(int num[]) {
        int currsum = 0; // Variable to store the current sum of subarray
        int maxsum = Integer.MIN_VALUE; // Variable to store the maximum sum, initialized to the smallest value
        int prefix[] = new int[num.length]; // Prefix array to store cumulative sums

        // Build the prefix sum array
        prefix[0] = num[0]; // First element of prefix is the first element of the array
        for (int k = 1; k < prefix.length; k++) {
            prefix[k] = prefix[k - 1] + num[k]; // Each element is the sum of all previous elements
        }

        // Nested loops to iterate over all subarrays
        for (int i = 0; i < num.length; i++) {
            int start = i; // Starting index of the subarray
            for (int j = i; j < num.length; j++) {
                int last = j; // Ending index of the subarray

                // Calculate the sum of the current subarray using the prefix array
                currsum = (start == 0) ? prefix[last] : prefix[last] - prefix[start - 1];

                // Update maxsum if the current sum is greater
                if (maxsum < currsum) {
                    maxsum = currsum;
                }
            }
        }

        // Print the maximum sum of subarrays
        System.out.println("Maximum sum is: " + maxsum);
    }

    public static void main(String args[]) {
        // Initialize the array
        int numbers[] = {2, 4, 6, 7, 11, 1, 2, 8, -1, -5};

        // Call the method to calculate and print the maximum sum of subarrays
        maxsubarr(numbers);
    }
}
