/*  Given an array of integers, write a function that finds the missing number.
    Input: [1,2,4,5,6]
    Output: 3
*/
public class accenture15 {

    // Function to find the missing number
    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1; // n is the total number of elements including the missing one

        // Calculate the expected sum of first n natural numbers
        int expectedSum = (n * (n + 1)) / 2;

        // Calculate the actual sum of the array elements
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        // The missing number is the difference between expectedSum and actualSum
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        // Test case
        int[] arr = { 1, 2, 4, 5, 6 };
        int missingNumber = findMissingNumber(arr);
        System.out.println("The missing number is: " + missingNumber); // Output: 3
    }
}
