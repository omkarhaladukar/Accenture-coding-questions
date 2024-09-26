
/*

GIven an array, find the number of occurences of each element in the array.

Sample Test Case 2:
Input:
arr[] = {10,5,10,15,10,5}

Output:
10 - 3
5 - 2
15 - 1

*/
import java.util.HashMap;

public class accenture11 {
    public static HashMap<Integer, Integer> occurance(int arr[]) {
        HashMap<Integer, Integer> occur = new HashMap<>();

        for (int i : arr) {
            if (occur.containsKey(i)) {
                occur.put(i, occur.get(i) + 1);
            } else {
                occur.put(i, 1);
            }
        }
        return occur;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 5, 10, 15, 10, 5 };
        HashMap<Integer, Integer> result = occurance(arr);

        for (int i : result.keySet()) {
            System.out.println(i + "-" + result.get(i));
        }
    }
}
