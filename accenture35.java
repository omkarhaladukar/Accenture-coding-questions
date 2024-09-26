/*
 
Given Array of size N, We have to return the pair whose sum is equal to target and having maximum product.

Note: First value of pair must be greater than the second value

Input: Target: 18
       N = 8
       arr = [11,1,2,8,10,11,15,7]

Output: [10, 8]  Sum is 18 and product is 80 which is maximum

*/

import java.util.Arrays;

public class accenture35 {

    public static int[] findMaxProductPair(int[] arr, int target) {
        int maxProduct = Integer.MIN_VALUE; // Initialize max product to minimum value
        int[] bestPair = null; // To store the best pair

        // Iterate through all pairs
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j) { // Ensure we are not considering the same element
                    int sum = arr[i] + arr[j];
                    if (sum == target && arr[i] > arr[j]) { // Check if sum equals target and first is greater than
                                                            // second
                        int product = arr[i] * arr[j];
                        // Update best pair if current product is greater than maxProduct
                        if (product > maxProduct) {
                            maxProduct = product;
                            bestPair = new int[] { arr[i], arr[j] };
                        }
                    }
                }
            }
        }

        return bestPair; // Return the best pair found
    }

    public static void main(String[] args) {
        int target = 18; // Target sum
        int[] arr = { 11, 1, 2, 8, 10, 11, 15, 7 }; // Input array
        int[] result = findMaxProductPair(arr, target);

        if (result != null) {
            System.out.println(Arrays.toString(result)); // Output the pair
        } else {
            System.out.println("No valid pair found.");
        }
    }
}
