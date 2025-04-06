package renu.gusain.sliding.window;

import java.util.*;

public class Leetcode30 {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer>result=new ArrayList<>();
        if (s == null || s.length() == 0 || words == null || words.length == 0) {
            return result;
        }
        int totalWords=words.length;
        int wordLen=words[0].length();
        Map<String,Integer>frequncyMap=new HashMap<>();
        for (String word : words) {
            frequncyMap.put(word, frequncyMap.getOrDefault(word, 0) + 1);
        }

        for(int i=0;i<wordLen;i++)
        {
            int left=i;int right=i;int count=0;
            Map<String,Integer>seen=new HashMap<>();
            while (right+wordLen<=s.length())
            {

                String word=s.substring(right,right+wordLen);
                right=right+wordLen;
                if(frequncyMap.containsKey(word))
                {
                    seen.put(word,seen.getOrDefault(word,0)+1);

                    count++;
                    while(seen.get(word)>frequncyMap.get(word))
                    {
                      String leftString=s.substring(left,left+wordLen);
                        seen.put(leftString, seen.get(leftString) - 1);
                        left=left+wordLen;
                      count--;
                    }
                    if (count==totalWords)
                    {
                        result.add(left);
                    }

                }
                else {
                    seen.clear();
                    count=0;
                    left=right;
                }
            }
        }
        return result;

    }
}

