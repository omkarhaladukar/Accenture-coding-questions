
/*
Problem Statement :

Input : N = 7, arr = [1,2,3,4,3,2,1]
Output: 4   

Explanation: 4 is the elevation point

Input: N = 2, arr = [5,3]
Output: 5

*/
import java.util.Scanner;

public class accenture12 {

    // Function to find the elevation point
    public static int findElevationPoint(int[] arr, int n) {
        // If array has only one element or two elements, return the first element
        if (n == 1 || n == 2) {
            return arr[0];
        }

        // Traverse the array to find the elevation point
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return arr[i];
            }
        }

        // If the entire array is strictly increasing, return the last element
        return arr[n - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for size of array
        System.out.println("Enter the size of the array (N): ");
        int N = sc.nextInt();

        // Input for the array elements
        int[] arr = new int[N];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // Find the elevation point
        int elevationPoint = findElevationPoint(arr, N);

        // Output the elevation point
        System.out.println("Elevation point: " + elevationPoint);
        sc.close();
    }
}
