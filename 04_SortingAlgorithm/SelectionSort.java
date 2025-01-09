public class SelectionSort {

    // Function to sort the array using Selection Sort
    public static void sort(int arr[]) {
        // Outer loop to iterate through each position in the array
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i; // Assume the current index holds the smallest element

            // Inner loop to find the smallest element in the remaining array
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j; // Update min if a smaller element is found
                }
            }

            // Swap the smallest element with the current position
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    // Function to print the elements of the array
    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int num[] = {3, 4, 5, 2, 1, 4, 0}; // Unsorted array

        // Call sort function to sort the array
        sort(num);

        // Call print function to display the sorted array
        printarr(num);
    }
}
