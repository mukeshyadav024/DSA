import java.util.*;

public class LargestString {

    // Method to find the lexicographically largest string
    public static String findLargestStr(String[] str) {
        // Initialize the largest string with the first element
        String largest = str[0];
        
        // Loop through the rest of the strings in the array
        for (int i = 0; i < str.length; i++) {
            // Compare the current largest with the current string
            if (largest.compareTo(str[i]) < 0) {
                largest = str[i]; // Update the largest string if current is greater
            }
        }
        return largest; // Return the largest string
    }

    public static void main(String args[]) {
        // Array of strings
        String[] str = {"mango", "apple", "banana"};
        
        // Print the result of the findLargestStr method
        System.out.print(findLargestStr(str)); // Output: mango
    }
}
