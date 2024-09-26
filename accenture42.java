/*
    
Given an integer N and string S. your task is to find and return new String which consist of the original string repeated N times.

Input: N = 3, S = "abc"
Output: "abcabcabc"

*/
public class accenture42 {
    public static String repeat(String str, int n) {
        String repo = "";
        while (n > 0) {
            repo += str;
            n--;
        }
        return repo;
    }

    public static void main(String[] args) {
        int n = 3;
        String str = "abc";
        System.out.println(repeat(str, n));
    }
}
