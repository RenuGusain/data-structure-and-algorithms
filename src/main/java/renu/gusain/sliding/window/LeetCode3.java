package renu.gusain.sliding.window;

import java.util.HashMap;

public class LeetCode3 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("bbbbb"));
    }

    public static int lengthOfLongestSubstring(String s) {

        int i = 0;
        int j = 0;
        int l = s.length();
        int max = 0;
        int currentWindowLen = 0;
        HashMap<Character, Integer> poistionInfo = new HashMap<>();

        while (j < l) {
            char currentChar = s.charAt(j);
            currentWindowLen++;

            if (poistionInfo.get(currentChar) != null) {
                int position = poistionInfo.get(currentChar);
                i = i > position ? i : position + 1;
                currentWindowLen = j - i + 1;

            }

            poistionInfo.put(currentChar, j);
            if (currentWindowLen > max) {
                max = currentWindowLen;
            }
            j++;


        }
        return max;
    }
}
