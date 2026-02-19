package stage2a_dsa_foundations;

import java.util.HashMap;


public class longestSubstring {
    public static void main(String[] args) {
        String s = "pwwkew";
        int left = 0;
        int maxLen = 0; // 1. Need this to store the result

        // 2. Change <String, Integer> to <Character, Integer>
        HashMap<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char current = s.charAt(right);

            if (map.containsKey(current)) {
                // The Jump: move left to the right of the old occurrence
                left = Math.max(left, map.get(current) + 1);
            }

            map.put(current, right);

            // 3. Update the max length of the window at each step
            maxLen = Math.max(maxLen, right - left + 1);
        }

        System.out.println("Longest Substring Length: " + maxLen);
    }
}
