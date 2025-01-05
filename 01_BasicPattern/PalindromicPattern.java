public class PalindromicPattern {
    public static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print decreasing numbers
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }

            // Print increasing numbers
            for (int l = 2; l <= i; l++) {
                System.out.print(l);
            }

            // Move to the next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(5);
    }
}
