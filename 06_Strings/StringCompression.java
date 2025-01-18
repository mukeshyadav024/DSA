import java.util.*;

public class StringCompression {

    // Method to compress the string
    public static String compress(String str) {
        // StringBuilder to build the compressed string
        StringBuilder sb = new StringBuilder();

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            // Count consecutive characters
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            // Append the character
            sb.append(str.charAt(i));
            // Append the count if it's greater than 1
            if (count > 1) {
                sb.append(count);
            }
        }
        // Return the compressed string
        return sb.toString();
    }

    public static void main(String args[]) {
        // Input string
        String str = "aaabbccddd";
        // Print the result of the compression
        System.out.print(compress(str));
    }
}
