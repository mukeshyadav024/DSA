import java.util.*;

public class FirstLetterUppercase{

    // Method to convert the first letter of each word to uppercase
    public static String uppercase(String str){
        // StringBuilder to build the new string
        StringBuilder sb = new StringBuilder();
        // Append the uppercase version of the first character
        sb.append(Character.toUpperCase(str.charAt(0)));

        // Loop through the rest of the characters in the string
        for(int i = 1; i < str.length(); i++){
            // Check if the current character is a space and is not the last character
            if(str.charAt(i) == ' ' && i < str.length() - 1){
                // Append the space character
                sb.append(str.charAt(i));
                // Move to the next character and append its uppercase version
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                // Append the current character as it is
                sb.append(str.charAt(i));
            }
        }
        // Return the modified string
        return sb.toString();
    }

    public static void main(String args[]){
        // Input string
        String str = "Hi, i am shiva";
        // Print the result of the uppercase method
        System.out.print(uppercase(str));
    }
}
