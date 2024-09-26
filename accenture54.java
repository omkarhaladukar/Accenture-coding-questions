public class accenture54 {
    public static void main(String[] args) {
        int m = 12;
        int n = 50;

        int result = Calculate(m, n);
        System.out.println("Output: " + result); // Output: 90

        // Test with another example
        m = 100;
        n = 160;
        result = Calculate(m, n);
        System.out.println("Output: " + result); // Output: 510
    }

    public static int Calculate(int m, int n) {
        int sum = 0;

        // Loop through the range [m, n]
        for (int i = m; i <= n; i++) {
            // Check if the number is divisible by both 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i; // Add to sum if condition is met
            }
        }

        return sum; // Return the total sum
    }
}
