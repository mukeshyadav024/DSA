import java.util.*;

public class PrimeNum {


// print prime number

    public static boolean prime(int n) {
        if (n <= 1) {
            return false;
        } else if (n == 2) {
            return true;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }



// print prime number from 1 to n range ::

    public static void primeInRange(int r) {
        for (int i = 1; i <= r; i++) {
            if (prime(i)) {
                System.out.println(i);
            }
        }
    }


//main function

    public static void main(String[] args) {
        boolean val = prime(202);

        if (val) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }

        primeInRange(20);  // Function to print primes in the range 1 to 20
    }
}
