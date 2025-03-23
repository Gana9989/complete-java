
public class PrimeChecker {

    public static boolean isPrime(int n) {
        // Handle edge cases
        if (n <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        if (n <= 3) {
            return true; // 2 and 3 are prime numbers
        }

        // Eliminate multiples of 2 and 3
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        // Check for factors up to the square root of n
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isPrime(11));  // Output: true
        System.out.println(isPrime(15));  // Output: false
        System.out.println(isPrime(1));   // Output: false
        System.out.println(isPrime(2));   // Output: true
        System.out.println(isPrime(97));  // Output: true
    }
}
