package renu.gusain.dsa.array;

import java.util.HashMap;
import java.util.Map;

public class LeetCode169 {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int target=n/2+1;
        Map<Integer,Integer>frequency=new HashMap<>();
        for(int num:nums)
        {
           if (!frequency.containsKey(num))
            {
                frequency.put(num,1);
            }
           else
           {
               frequency.put(num,frequency.get(num)+1)
           }
           if(frequency.get(num)>=target)
           {
               return num;
           }

        }
        return 0;

    }
}
