import java.util.*;

public class accenture44 {

    public static String replace(String str, char c) {
        Map<Character, Integer> set = new HashMap<>();

        for (char entry : str.toCharArray()) {
            set.put(entry, set.getOrDefault(entry, 0) + 1);
        }
        int maxCount = 0;
        char maxChar = '\0';
        for (Map.Entry<Character, Integer> entry : set.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }
        return str.replace(maxChar, c);
    }

    public static void main(String[] args) {
        String str = "hhsjjjjsssssssssss";
        char c = 't';

        System.out.println(replace(str, c));
    }
}