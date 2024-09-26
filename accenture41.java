/*
Rearrangement Of Bits

Alex Gives You a positive Number N and wants you to rearrange the
bits of the number in its binary representation such that all set bits are in consecutive order. Your task is to find and return an integer value representing the minimum possible number that can be formed after re-arranging the bits of the number N.

Example

Input1: 10      
Output: 3
Explanation: 10 -> binary: 1010 count the set bits and arrange in consecutive order such as 0011 which in decimal is 3.

Input: 2
Output: 1
*/
public class accenture41 {

    public static int dectobinary(String binary) {
        // Count the number of set bits (1s)
        int count = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                count++;
            }
        }

        // If there are no set bits, return 0
        if (count == 0) {
            return 0;
        }

        // Create a string with `count` number of '1's
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < count; i++) {
            s.append('1');
        }

        // Parse the constructed binary string to an integer
        return Integer.parseInt(s.toString(), 2);
    }

    public static int binaryTodec(int n) {
        // Convert the integer to its binary string representation
        String binary = Integer.toBinaryString(n);
        // Call dectobinary to get the final integer
        return dectobinary(binary);
    }

    public static void main(String[] args) {
        int n = 10; // Example input

        int result = binaryTodec(n);
        System.out.println(result); // Output should be 3
    }
}
