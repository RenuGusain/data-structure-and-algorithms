package renu.gusain.two.pointer;

import java.util.HashMap;
import java.util.Map;

public class LeetCode167 {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> info=new HashMap<>();
        int result[]=new int[2];
        for(int i=0;i<numbers.length;i++)
        {
            int current=numbers[i];
            if(info.containsKey(target-current))
            {
                result[0]=info.get(target-current);
                result[1]=i;
                return result;
            }

        }
        return result;


    }
}
