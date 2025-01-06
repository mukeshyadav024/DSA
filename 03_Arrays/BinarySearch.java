public class BinarySearch {

    // Method to perform binary search on a sorted array
    public static int search(int num[], int key) {
        int start = 0; // Initialize the starting index
        int end = num.length - 1; // Initialize the ending index

        while (start <= end) {
            // Calculate the middle index
            int mid = (start + end) / 2;

            // Check if the key is present at mid
            if (num[mid] == key) {
                return mid; // Return the index if key is found
            }

            // If the key is greater, discard the left half
            if (num[mid] < key) {
                start = mid + 1;
            } else {
                // If the key is smaller, discard the right half
                end = mid - 1;
            }
        }

        // Return -1 if the key is not found in the array
        return -1;
    }

    public static void main(String args[]) {
        // Sorted array for binary search
        int numbers[] = {1, 3, 4, 7, 11, 14, 23, 34, 44};
        int key = 23;

        // Perform binary search
        int index = search(numbers, key);

        // Check and display the result
        if (index == -1) {
            System.out.println("Key not found in array!");
        } else {
            System.out.println("Index of key " + key + " is " + index);
        }
    }
}
