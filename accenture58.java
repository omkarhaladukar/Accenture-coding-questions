public class accenture58 {
    public static void main(String[] args) {
        int n = 12; // Example input
        int result = sumOfDivisors(n);
        System.out.println("Input: " + n);
        System.out.println("Output: " + result); // Output: 28
    }

    public static int sumOfDivisors(int n) {
        int sum = 0;

        // Loop through all numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            // Check if i is a divisor of n
            if (n % i == 0) {
                sum += i; // Add the divisor to the sum
            }
        }

        return sum; // Return the total sum of divisors
    }
}
