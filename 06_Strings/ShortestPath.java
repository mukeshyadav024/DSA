import java.util.*;

public class ShortestPath {

    // Method to calculate the shortest path
    public static float calPath(String orgstr) {
        int x = 0;
        int y = 0;
        // Convert the input string to uppercase to handle case insensitivity
        String str = orgstr.toUpperCase();

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            // Update coordinates based on the direction
            if (str.charAt(i) == 'N') {
                y++;
            } else if (str.charAt(i) == 'S') {
                y--;
            } else if (str.charAt(i) == 'E') {
                x++;
            } else {
                x--;
            }
        }

        // Calculate the square of the coordinates
        int x2 = x * x;
        int y2 = y * y;
        
        // Calculate the shortest path using the Pythagorean theorem
        float res = (float) Math.sqrt(x2 + y2);
        
        return res;
    }

    public static void main(String args[]) {
        // Input string with directions
        String str = "WNEENESEnnn";
        
        // Print the result of the shortest path calculation
        System.out.print(calPath(str));
    }
}
