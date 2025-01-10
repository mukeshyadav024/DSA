public class InsertionSort {

    // Function to sort the array using Insertion Sort
    public static void sort(int arr[]) {
        // Start iterating from the second element (index 1)
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i]; // The current element to be inserted into the sorted portion
            int prev = i - 1;  // Pointer to the previous index

            // Shift elements of the sorted portion to the right if they are greater than 'curr'
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev]; // Move the element one position to the right
                prev--; // Move the pointer to the left
            }

            // Insert 'curr' into its correct position in the sorted portion
            arr[prev + 1] = curr;
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
