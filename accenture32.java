/*
NOTE:- Return null if str is null.

Example :-

Input:
str.Move-Hyphens-to-Front
Output:
—MoveHyphenstoFront
Explanation:-

The string “Move-Hyphens -to-front” has 3 hyphens (-), which are moved to the front of the string, this output is “— MoveHyphen”

Sample Input

Str: String-Compare
Sample Output-

-StringCompare

*/
public class accenture32 {
    public static String moveHypen(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder hypen = new StringBuilder();
        StringBuilder nonHypen = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '-') {
                hypen.append('-');
            } else {
                nonHypen.append(str.charAt(i));
            }
        }
        return hypen.toString() + nonHypen.toString();

    }

    public static void main(String[] args) {
        String str = "mc-sksksk-ksks-kk";

        String move = moveHypen(str);
        System.out.println(move);
    }
}
