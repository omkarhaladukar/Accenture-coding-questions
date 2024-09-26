
/*

Encode the Number: 
You work in the message encoding department of a national security 
message agency. Every message that is sent from or received in your 
office is encoded. You have an integer N and each digit of N is squared 
and the squares are concatenated  together to encode the original 
number. Your task is to find and return an integer value representing 
the encoded value of the number. 

Input Specification: 
input1: An integer value N representing the number to be encoded. 

Explanation: 
Output Specification: 
Return an integer value representing the encoded value of the number.

Example 1: 
input1: 34 
Output: 916 

Here, the given integer is 34, and the square its digit are: 
3^2= 9 
4²=16 

*/


public class accenture13 {
    public static int encoded(int n) {
        String str = "";

        while (n != 0) {
            int digit = n % 10;
            str = (digit * digit) + str;
            n = n / 10;
        }

        return Integer.parseInt(str);
    }

    public static void main(String[] args) {
        int n = 34;
        int res = encoded(n);
        System.out.println(res);

    }
}
/*
 * public class EncodeNumber {
 * 
 * // Function to encode the number
 * public static int encodeNumber(int N) {
 * // Convert the number to a string to iterate over each digit
 * 
 * String numStr = Integer.toString(N);
 * StringBuilder encodedStr = new StringBuilder();
 * 
 * // Loop through each character in the string representation of the number
 * 
 * for (int i = 0; i < numStr.length(); i++) {
 * // Convert each character back to an integer (digit)
 * 
 * int digit = Character.getNumericValue(numStr.charAt(i));
 * 
 * // Square the digit
 * 
 * int square = digit * digit;
 * 
 * // Append the squared result to the encoded string
 * 
 * encodedStr.append(square);
 * }
 * 
 * // Convert the concatenated string back to an integer and return it
 * 
 * return Integer.parseInt(encodedStr.toString());
 * }
 * 
 * public static void main(String[] args) {
 * // Test case 1
 * 
 * int input1 = 34;
 * int result = encodeNumber(input1);
 * System.out.println("Encoded value of " + input1 + " is: " + result); //
 * Output: 916
 * 
 * // Test case 2
 * 
 * int input2 = 123;
 * int result2 = encodeNumber(input2);
 * System.out.println("Encoded value of " + input2 + " is: " + result2); //
 * Output: 149
 * }
 * }
 * 
 */
