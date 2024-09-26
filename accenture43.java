
/*
You are given a function,

Void *ReplaceCharacter(Char str[], int n, char ch1, char ch2);

The function accepts a string  ‘ str’ of length n and two characters ‘ch1’ and ‘ch2’ as its arguments . Implement the function to modify and return the string ‘ str’ in such a way that all occurrences of ‘ch1’ in original string are replaced by ‘ch2’ and all occurrences of ‘ch2’  in original string are replaced by ‘ch1’.

Assumption: String Contains only lower-case alphabetical letters.

Note:

Return null if string is null.
If both characters are not present in string or both of them are same , then return the string unchanged.
Example:

Input:
Str: apples
ch1:a
ch2:p
Output:
paales
Explanation:

‘A’ in original string is replaced with ‘p’ and ‘p’ in original string is replaced with ‘a’, thus output is paales.

*/
import java.util.Scanner;

public class accenture43 {

    public static String replaceCharacter(String str, char ch1, char ch2) {
        // Check if the string is null
        if (str == null) {
            return null; // Return null if the string is null
        }

        // Check if both characters are the same
        if (ch1 == ch2) {
            return str; // Return unchanged if both characters are the same
        }

        // Convert the string to a character array for modification
        char[] result = str.toCharArray();
        int ch1Count = 0, ch2Count = 0;

        // Iterate through the character array and swap the first two occurrences
        for (int i = 0; i < result.length; i++) {
            if (result[i] == ch1) {
                if (ch1Count < 2) {
                    result[i] = ch2; // Replace ch1 with ch2
                    ch1Count++;
                }
            } else if (result[i] == ch2) {
                if (ch2Count < 2) {
                    result[i] = ch1; // Replace ch2 with ch1
                    ch2Count++;
                }
            }

            // Stop if we've swapped both characters twice
            if (ch1Count == 2 && ch2Count == 2) {
                break;
            }
        }

        // Return the modified string
        return new String(result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter the string: ");
        String str = scanner.nextLine();

        System.out.print("Enter the first character (ch1): ");
        char ch1 = scanner.nextLine().charAt(0);

        System.out.print("Enter the second character (ch2): ");
        char ch2 = scanner.nextLine().charAt(0);

        String modifiedStr = replaceCharacter(str, ch1, ch2);
        System.out.println("Original: " + str);
        System.out.println("Modified: " + modifiedStr);

        scanner.close();
    }
}
