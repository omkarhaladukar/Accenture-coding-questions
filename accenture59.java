public class accenture59 {
    public static void main(String[] args) {
        int n = 10; // Example input
        int result = sumOfPrimesLessThanN(n);
        System.out.println("Input: " + n);
        System.out.println("Output: " + result); // Output: 17
    }

    public static int sumOfPrimesLessThanN(int n) {
        int sum = 0;

        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                sum += i; // Add the prime number to the sum
            }
        }

        return sum; // Return the total sum of primes
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // num is divisible by i, not prime
            }
        }
        return true; // num is prime
    }
}
