import java.util.HashMap;
import java.util.HashSet;

public class Practice {
    public static void main(String[] args) {
        // Write your solution here
        String s = "abcabcbb";
        int maxLen = 0;
        int left = 0;
        HashSet<Character> set = new HashSet<>();
        for (int right = 0; right < s.length(); right++) {
            char current = s.charAt(right);
            while (set.contains(current)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(current);
            maxLen = Math.max(maxLen, right - left + 1);
        }
        System.out.println(maxLen);
    }
}
