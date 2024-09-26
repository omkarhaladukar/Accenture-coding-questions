/*
You are given two strings, s and t . Your task is to determine if it's 
possible to rearrange the characters of s to form the string t . 
Write a function that returns True it's possible to create t by 
rearranging the characters of s and False otherwise. 

Input 
Two strings, s and t where the length of s and t are between 1 and 
1000 characters. 

Output 
Return True if it's possible to create t by rearranging the characters of 
s and False otherwise 

Example: 
s="listen" 
t="silent" 

Output: 
True

*/

import java.util.*;

public class accenture2 {

    public static boolean CheckAnagram(String s, String t) {
        s.toLowerCase();
        t.toLowerCase();

        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string: ");
        String s = sc.nextLine(); // Silent

        System.out.println("Enter second string: ");
        String t = sc.nextLine(); // listen

        System.out.println("Output: " + CheckAnagram(s, t));
        sc.close();
    }
}