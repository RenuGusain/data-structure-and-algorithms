package renu.gusain.dsa.window;

import java.util.HashMap;
import java.util.Map;

public class LeetCode76 {
    public static void main(String[] args) {
        System.out.println(minWindow("aabaac", "abc")); // Output: "BANC"
    }

    public static String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        Map<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int required = map.size();
        System.out.println("required "+required);
        int formed = 0;
        Map<Character, Integer> windowCounts = new HashMap<>();

        int left = 0, right = 0;
        int minLen = Integer.MAX_VALUE;
        int minLeft = 0;

        while (right < s.length()) {
            char c = s.charAt(right);
            windowCounts.put(c, windowCounts.getOrDefault(c, 0) + 1);
            System.out.println("left "+left+" right "+right+" String so far "+s.substring(left,right+1));


            if (map.containsKey(c) && windowCounts.get(c).intValue() == map.get(c).intValue()) {
                formed++;
            }

            System.out.println("formed "+formed);

            while (formed == required) {
                // Try to update result
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    minLeft = left;
                    System.out.println("String formed "+s.substring(minLeft,right+1));
                }

                char leftChar = s.charAt(left);
                System.out.println("leftChar "+leftChar);
                windowCounts.put(leftChar, windowCounts.get(leftChar) - 1);
                if (map.containsKey(leftChar) && windowCounts.get(leftChar).intValue() < map.get(leftChar).intValue()) {
                    formed--;
                }
                left++;
            }

            right++;
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minLeft, minLeft + minLen);
    }
}
