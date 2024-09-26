
/*
Problem Statement 

You are required to input the size of the matrix then the elements of matrix, then you have to divide the main matrix in two sub matrices (even and odd) in such a way that element at 0 index will be considered as even and element at 1st index will be considered as odd and so on. then you have sort the even and odd matrices in ascending order then print the sum of second largest number from both the matrices

Example

enter the size of array : 5
enter element at 0 index : 3
enter element at 1 index : 4
enter element at 2 index : 1
enter element at 3 index : 7
enter element at 4 index : 9
Sorted even array : 1 3 9
Sorted odd array : 4 7

7

*/
import java.util.*;

public class accenture26 {
    public static int large(ArrayList<Integer> list) {
        if (list.size() < 2) {
            return 0;
        } else {
            return list.get(list.size() - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int matrix[] = new int[n];
        for (int i = 0; i < n; i++) {
            matrix[i] = sc.nextInt();
        }
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 == 0) {
                even.add(matrix[i]);
            } else {
                odd.add(matrix[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd);

        for (int i : even) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i : odd) {
            System.out.print(i + " ");
        }
        System.out.println();

        int secondLargeEven = large(even);
        int secondLargeOdd = large(odd);

        int sum = secondLargeEven + secondLargeOdd;

        System.out.println(sum);
        sc.close();
    }
}
