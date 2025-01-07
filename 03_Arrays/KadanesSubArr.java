public class KadanesSubArr {

    // Method to find the maximum subarray sum using Kadane's Algorithm
    public static void maxsubarr(int num[]) {
        int currsum = 0; // Variable to store the current subarray sum
        int maxsum = Integer.MIN_VALUE; // Variable to store the maximum sum, initialized to the smallest value

        // Loop through the array
        for (int i = 0; i < num.length; i++) {
            currsum += num[i]; // Add the current element to the current sum

            // Update maxsum if currsum is greater
            maxsum = Math.max(currsum, maxsum);

            // Reset currsum to 0 if it becomes negative (Kadane's reset condition)
            if (currsum < 0) {
                currsum = 0;
            }
        }

        // Print the maximum subarray sum
        System.out.println("Maximum subarray sum is: " + maxsum);
    }

    public static void main(String args[]) {
        // Test cases
        int numbers1[] = {-2, -3, -4, -1, -2, -1, -5, -3}; // All negative numbers
        int numbers2[] = {-2, -3, 4, -1, -2, 1, 5, -3};    // Mixed positive and negative numbers

        System.out.println("Test Case 1:");
        maxsubarr(numbers1);

        System.out.println("Test Case 2:");
        maxsubarr(numbers2);
    }
}
