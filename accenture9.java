
/*
Question: Write a program in C such that it takes a lower limit and upper limit as inputs and print all the intermediate palindrome numbers.

Test Cases:

TestCase 1:
Input :
10 , 80
Expected Result:
11 , 22 , 33 , 44 , 55 , 66 , 77.

Test Case 2:
Input:
100,200
Expected Result:
101 , 111 , 121 , 131 , 141 , 151 , 161 , 171 , 181 , 191.

*/


public class accenture9 {
    public static boolean checkPelindrome(int num) {
        int original = num;
        int rem = 0;
        while (num != 0) {
            int digit = num % 10;
            rem = (rem * 10) + digit;
            num = num / 10;
        }
        return original == rem;
    }

    public static void isPelindrome(int ln, int un) {
        for (int i = ln; i <= un; i++) {
            if (checkPelindrome(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {

        int ln = 10;
        int un = 100;

        isPelindrome(ln, un);

    }
}
