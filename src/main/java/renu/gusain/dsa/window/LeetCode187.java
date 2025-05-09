package renu.gusain.dsa.window;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LeetCode187 {
    public static void main(String[] args) {
        String s = "AAAAAAAAAAA";
        List<String> result = findRepeatedDnaSequences(s);
        result.forEach(e -> System.out.println(e + ", "));
    }

    public static List<String> findRepeatedDnaSequences(String s) {

        HashSet<String> info = new HashSet<>();
        HashSet<String> result = new HashSet<>();
        final int len = s.length();
        if (len < 10) return new ArrayList<>();

        info.add(s.substring(0, 10));
        int i = 1, j = 10;

        while (j < len) {
            String currentString = s.substring(i, j + 1);
            if (info.contains(currentString)) {
                result.add(currentString);

            } else {
                info.add(currentString);
            }
            j++;
            i++;


        }
        return new ArrayList<>(result);
    }

}
