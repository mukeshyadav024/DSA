public class LinearSearch {

    // Method to perform linear search for a key in the array
    public static int search(int num[], int key) {
       
        for (int i = 0; i < num.length; i++) {
           
            if (num[i] == key) {
                return i; // Return the index of the key if found
            }
        }
        return -1; // Return -1 if the key is not found
    }


    // Method to find the largest number in the array
    public static int largestnum(int num[]) {
        // Initialize largest to the smallest possible value
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {
            if (largest < num[i]) {
                largest = num[i]; // Update largest if current element is greater
            }
        }
        return largest; // Return the largest number
    }


    // Method to find the smallest number in the array
    public static int smallestnum(int num[]) {
        // Initialize smallest to the largest possible value
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < num.length; i++) {
            if (smallest > num[i]) {
                smallest = num[i]; // Update smallest if current element is smaller
            }
        }
        return smallest; // Return the smallest number
    }

    public static void main(String args[]) {
        // Initialize the array
        int numbers[] = {10, 22, 32, 11, 2, 11, 1, 32};
        int key = 11;

        // Perform linear search for the key
        int index = search(numbers, key);

        // Check if the key was found and display the result
        if (index == -1) {
            System.out.println("Key not found in array!");
        } else {
            System.out.println("Index of key " + key + " is " + index);
        }

        // Find and display the largest number in the array
        int largest = largestnum(numbers);
        System.out.println("Largest number in array is: " + largest);

        // Find and display the smallest number in the array
        int smallest = smallestnum(numbers);
        System.out.println("Smallest number in array is: " + smallest);
    }
}
