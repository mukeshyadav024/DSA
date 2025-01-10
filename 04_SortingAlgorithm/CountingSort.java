public class CountingSort {

    // Function to sort the array using Counting Sort
    public static void sort(int arr[]) {
        // Step 1: Find the largest element in the array
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        // Step 2: Create a count array to store the frequency of each element
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++; // Increment the count for the element
        }

        // Step 3: Use the count array to sort the original array
        int j = 0; // Index for the original array
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) { // Place the element as many times as its count
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    // Function to print the elements of the array
    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // Print each element followed by a space
        }
        System.out.println(); // Move to a new line after printing the array
    }

    public static void main(String[] args) {
        int num[] = {3, 4, 5, 2, 1, 4, 0}; // Unsorted array

        // Call the sort function to sort the array
        sort(num);

        // Call the print function to display the sorted array
        printarr(num);
    }
}
