
/*
Problem Statement :

Given two arrays of integers, return merged sorted array.

Input: arr1 = [1, 2, 3, 4, 5],
       arr2 = [2, 4, 6, 8, 10]

Output: [1, 2, 2, 3, 4, 4, 5, 6, 8, 10]

*/
import java.util.*;

public class accenture31 {
    public static List<Integer> merged(int arr1[], int arr2[]) {
        List<Integer> arr = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                arr.add(arr1[i]);
                i++;
            } else {
                arr.add(arr2[j]);
                j++;
            }
        }
        while (i < arr1.length) {
            arr.add(arr1[i]);
            i++;
        }
        while (i < arr2.length) {
            arr.add(arr2[j]);
            j++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5 };
        int arr2[] = { 2, 4, 6, 8, 10 };

        List<Integer> merge = merged(arr1, arr2);

        for (int num : merge) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
