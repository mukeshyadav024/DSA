public class IsPalindrome {

    // Method to check if a string is a palindrome
    public static boolean check(String str) {
        int n = str.length();
        // Loop through the first half of the string
        for(int i = 0; i < n / 2; i++) {
            // Compare characters from start and end
            if(str.charAt(i) != str.charAt(n - 1 - i)) {
                return false; // Return false if characters don't match
            }
        }
        return true; // Return true if all characters match
    }

    public static void main(String args[]) {
        // Test string
        String str = "noon";
        // Print the result of the palindrome check
        System.out.print(check(str)); // Output: true
    }
}
