public class DecToBin {

    public static void decBin(int n) {

        int mynum = n;
        int pow = 0;
        int bin = 0;

        while (n > 0) {
            int lastDig = n % 2;  // Direct calculation
            bin = bin + (lastDig * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;
        }

        System.out.println("Binary of Decimal " + mynum + " is " + bin);
    }

    public static void main(String[] args) {
        decBin(5);
    }
}
