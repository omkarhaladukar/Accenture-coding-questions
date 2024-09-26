/*

Problem Statement               (Asked in Accenture Offcampus 2 Aug 2021, Slot 2)

You are given a function,

Int MaxExponents (int a , int b);

You have to find and return the number between ‘a’ and ‘b’ ( range inclusive on both ends) which has the maximum exponent of 2.

The algorithm to find the number with maximum exponent of 2 between the given range is

Loop between ‘a’ and ‘b’. Let the looping variable be ‘i’.
Find the exponent (power) of 2 for each ‘i’ and store the number with maximum exponent of 2 so faqrd in a variable , let say ‘max’. Set ‘max’ to ‘i’ only if ‘i’ has more exponent of 2 than ‘max’.
Return ‘max’.
Assumption: a <b

Note: If two or more numbers in the range have the same exponents of  2 , return the small number.

Example

Input:
7
12
Output:
8
Explanation:

Exponents of 2 in:

7-0

8-3

9-0

10-1

11-0

12-2

Hence maximum exponent if two is of 8.

*/
public class accenture27 {

    public static void main(String[] args) {
        int a = 7; // Example input
        int b = 12; // Example input
        int result = MaxExponents(a, b);
        System.out.println("The number with the maximum exponent of 2 between " + a + " and " + b + " is: " + result);
    }

    public static int MaxExponents(int a, int b) {
        int maxExponentNumber = a; // Initialize with a
        int maxExponent = getExponentOfTwo(a); // Get exponent for the first number

        // Loop through each number from a to b
        for (int i = a; i <= b; i++) {
            int exponent = getExponentOfTwo(i); // Get exponent of the current number

            // Update max if current exponent is greater or if it's equal and the number is
            // smaller
            if (exponent > maxExponent || (exponent == maxExponent && i < maxExponentNumber)) {
                maxExponentNumber = i; // Update the number with max exponent
                maxExponent = exponent; // Update the max exponent
            }
        }

        return maxExponentNumber; // Return the number with the maximum exponent
    }

    // Helper method to calculate the exponent of 2 for a given number
    private static int getExponentOfTwo(int n) {
        int exponent = 0;

        // Count how many times n can be divided by 2
        while (n > 0 && n % 2 == 0) {
            n /= 2;
            exponent++;
        }

        return exponent; // Return the exponent
    }
}
