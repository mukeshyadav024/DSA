public class ReverseArray {

    // Method to reverse the array
    public static void reverse(int num[]) {
     
        int start = 0; // Start pointer
        int end = num.length - 1; // End pointer

        // Loop to swap elements until the start pointer crosses the end pointer
        while (start < end) {
            
            int temp = num[end];  // Temporarily store the value at the end
            num[end] = num[start]; // Copy value at start to the end
            num[start] = temp;    // Copy temporary value to start

            // Move pointers towards each other
            start++;
            end--;
        }
    }

    public static void main(String args[]) {

        // Initialize the array to be reversed
        int numbers[] = {10, 22, 32, 11, 2, 1, 0};

        // Print the original array
        System.out.println("Original Array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println(); 

        // Call the reverse method to reverse the array
        reverse(numbers);

        // Print the reversed array
        System.out.println("Reversed Array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println(); 
    }
}
