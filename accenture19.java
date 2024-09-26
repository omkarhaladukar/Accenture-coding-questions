import java.util.ArrayList;

public class accenture19 {
    public static ArrayList<Integer> interaction(int arr1[], int arr2[]) {
        ArrayList<Integer> ans = new ArrayList<>();

        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                ans.add(i);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5 };
        int arr2[] = { 1, 2, 3, 4 };

        ArrayList<Integer> result = interaction(arr1, arr2);

        for (int i : result) {
            System.out.println(i + " ");
        }
    }
}
