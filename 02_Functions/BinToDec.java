public class BinToDec {

    public static void binDec(int n) {

        int mynum = n;
        int pow = 0;
        int dec = 0;

        while (n > 0) {

            int lastDig = n % 10;  // Get the last digit
            dec = dec + (lastDig * (int) Math.pow(2, pow));  // Convert to decimal
            pow++;
            n = n / 10;  // Move to the next digit
        }

        System.out.println("Decimal of Binary " + mynum + " is " + dec);
    }

    public static void main(String[] args) {
        binDec(1001);
    }
}
