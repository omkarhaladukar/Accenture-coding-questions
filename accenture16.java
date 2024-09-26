/*
Problem Statement :

Print the first K words of the string.

Input: Hello I am a passionate developer
       k = 4

Output: Hello I am a

*/
public class accenture16 {
    public static String findWords(String str, int k) {
        String words[] = str.split("\\s+");
        if (k > words.length) {
            return str;
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < k; i++) {
            result.append(words[i]); // or words[i]+" "
            if (i < k - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String str = "hello my name is omkar";
        int k = 4;
        System.out.println(findWords(str, k));
    }
}
/*
 * public class FirstKWords {
 * 
 * // Function to print the first K words of the given string
 * public static void printFirstKWords(String str, int K) {
 * // Split the string into words based on whitespace
 * String[] words = str.split("\\s+");
 * 
 * // If K is greater than the number of words, adjust K
 * K = Math.min(K, words.length);
 * 
 * // Loop through the first K words and print them
 * for (int i = 0; i < K; i++) {
 * System.out.print(words[i] + " ");
 * }
 * }
 * 
 * public static void main(String[] args) {
 * // Input string
 * String str = "Hello I am a passionate developer";
 * 
 * // Number of words to print
 * int K = 4;
 * 
 * // Call the function to print the first K words
 * printFirstKWords(str, K);
 * }
 * }
 * 
 */
