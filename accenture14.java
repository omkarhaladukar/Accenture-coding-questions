/*
Problem Statement :

Given the function accepts an integer arr of size n as its argument. The function needs to return the index of equiibrium point int ht array, where the sum of elements on the left of the index is equal to the sum of elements on the right of the index. If no equilibrium point exists, the function should return -1.

Input arr: {3,4,3,1,6}
Output: 2   

Explanation: 3+4 = 7 and 1+6 = 7 so 3 is the equilibrium point having index 2.

*/
public class accenture14 {

   public static int findEquilibriumIndex(int arr[]){
    int total=0;
    int left=0;

    for(int i : arr ){
   total+=i;
    }
    for(int i=0;i<arr.length;i++){
        int right=total-left-arr[i];
        if(left==right){
            return i;
        }
        left+=arr[i];
    }
    return -1;
   }

    public static void main(String[] args) {
        // Test case 1
        int[] arr1 = { 3, 4, 3, 1, 6 };
        System.out.println("Equilibrium Index: " + findEquilibriumIndex(arr1)); // Output: 2

        // Test case 2
        int[] arr2 = { 1, 2, 3, 4, 6 };
        System.out.println("Equilibrium Index: " + findEquilibriumIndex(arr2)); // Output: -1 (No equilibrium point)
    }
}
