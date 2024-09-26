/*
Problem Statement 

Alice has a collection of songs represented as a string S where each character reperesents a song. Aplaylisy is the substring of the given string with exactly K number of songs. She wants to create a playlist that contains maximum number of her favourite song which is 'a'. Your task is to find and return an integer value representing the maximum number of favourite songs that she can get in a single playlist.

Input: S = "acdbaaca"
       K = 3

Output: 2

Explanation: Substring of S of size 3: {"acd", "cdb", "dba", "baa", "aac", "aca"} 

So "a" is coming max 2 times in substring

*/
public class accenture28 {

    public static void main(String[] args) {
        String S = "acdbaaca"; // Input string
        int K = 3; // Size of the playlist
        int result = maxFavoriteSongs(S, K);
        System.out.println("Maximum number of favorite songs in a playlist of size " + K + ": " + result);
    }

    public static int maxFavoriteSongs(String S, int K) {
        int maxCount = 0; // To store the maximum count of 'a's found
        int currentCount = 0; // To store the count of 'a's in the current window

        // First, count 'a's in the first window of size K
        for (int i = 0; i < K && i < S.length(); i++) {
            if (S.charAt(i) == 'a') {
                currentCount++;
            }
        }

        maxCount = currentCount; // Initialize maxCount with the first window's count

        // Slide the window from index K to the end of the string
        for (int i = K; i < S.length(); i++) {
            // Add the next character to the window
            if (S.charAt(i) == 'a') {
                currentCount++;
            }
            // Remove the character that is sliding out of the window
            if (S.charAt(i - K) == 'a') {
                currentCount--;
            }
            // Update maxCount if currentCount is greater
            maxCount = Math.max(maxCount, currentCount);
        }

        return maxCount; // Return the maximum count of 'a's found
    }
}
