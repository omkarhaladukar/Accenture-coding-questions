/*
Problem Statement 

A number whose sum of digits is prime. 

Input: 43
Output: YES (4+3 = 7)

Input: 123
Output: NO (1+2+3 = 6)

*/
public class accenture18 {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n / 2; i++) {
            if (i % n == 0) {
                return false;
            }
        }
        return true;
    }

    public static String prime(int n) {
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum += digit;
            n = n / 10;
        }
        if (isPrime(sum)) {
            return "yes";
        } else {
            return "NO";
        }

    }

    public static void main(String[] args) {
        int n = 43;
        System.out.println(prime(n));
    }
}
