/* Given an array of integers, write a function that finds the maximum element and its index.
Input: [1,8,4,9,6]
 Output: (9,3)
 */

public class accenture30 {
    public static void maxelement(int arr[]) {
        int max = arr[0];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                idx = i;
            }
        }
        System.out.println(max);
        System.out.println(idx);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 8, 4, 9, 6 };

        maxelement(arr);
    }
}
