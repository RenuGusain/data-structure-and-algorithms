package renu.gusain.test;

import java.util.LinkedHashMap;
import java.util.Map;

public class NoRepeatingCharProblem {
    public static void main(String[] args) {
        String input = "abcabcde";
        Map<Character, Integer> frequencyMap = new LinkedHashMap<>();

        for (char c : input.toCharArray()) {
            if (frequencyMap.containsKey(c)) {
                frequencyMap.put(c, frequencyMap.get(c) + 1);
            } else {
                frequencyMap.put(c, 1);
            }
        }
        int cout=0;
        System.out.println(frequencyMap.size());
        for (Map.Entry<Character, Integer> currentEntry : frequencyMap.entrySet()) {
            if (currentEntry.getValue() == 1) {
                cout++;
                if(cout==2)
                {
                    System.out.println("No Repeating character ="+currentEntry.getKey());
                    break;
                }

            }


        }

    }
}
