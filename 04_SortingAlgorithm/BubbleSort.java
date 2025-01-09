public class BubbleSort {

    // Function to sort the array using Bubble Sort
    public static void sort(int arr[]) {
        // Outer loop to iterate over each term (number of passes)
        for (int term = 0; term < arr.length - 1; term++) {
            int swap = 0; // Variable to track if any swapping occurs

            // Inner loop to compare adjacent elements
            for (int i = 0; i < arr.length - 1 - term; i++) {
                if (arr[i] > arr[i + 1]) { // If current element is greater than next
                    // Swap the elements
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swap++; // Increment swap counter
                }
            }

            // If no swapping occurs in the pass, the array is already sorted
            if (swap == 0) return;
        }
    }

    // Function to print the elements of the array
    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        
        int num[] = {3, 4, 5, 2, 1, 4, 0};        // unsorted
        // int num[] = {3, 4, 5, 6, 7, 8, 9};     //sorted

        // Call sort function to sort the array
        sort(num);

        // Call print function to display the sorted array
        printarr(num);
    }
}
