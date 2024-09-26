/*

Print first K words
Example

Input: "Hello I am a passionate developer"     
    k: 3
Output:Hello I am
*/

public class accenture38 {
    public static void firstK(String str, int k) {
        String arr[] = str.split(" ");

        for (int i = 0; i < 3; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String str = "hello i am passionate developer";

        firstK(str, 3);
    }
}
/*
 * public class FirstKWords {
 * 
 * public static void main(String[] args) {
 * String input = "Hello I am a passionate developer"; // Input string
 * int k = 3; // Number of words to print
 * String result = printFirstKWords(input, k);
 * System.out.println(result); // Output the result
 * }
 * 
 * public static String printFirstKWords(String str, int k) {
 * // Split the string into words
 * String[] words = str.split(" ");
 * StringBuilder result = new StringBuilder();
 * 
 * // Collect the first K words
 * for (int i = 0; i < Math.min(k, words.length); i++) {
 * result.append(words[i]);
 * if (i < k - 1 && i < words.length - 1) {
 * result.append(" "); // Add a space between words
 * }
 * }
 * 
 * return result.toString(); // Return the result as a string
 * }
 * }
 */