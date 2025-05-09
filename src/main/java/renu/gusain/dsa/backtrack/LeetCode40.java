package renu.gusain.dsa.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates); // Required to handle duplicates efficiently
        backtrack(candidates, result,0, target, new ArrayList<>());
        return result;
    }
    public void backtrack(int[]nums,List<List<Integer>>result,int start,int remaining,List<Integer>op)
    {
        if(remaining==0)
        {
            result.add(new ArrayList<>(op));
        }
        for(int i=start;i<nums.length;i++)
        {
            if(i>start && nums[i]==nums[i-1])
            {
                continue;

            }
            if(nums[i]>remaining)
            {
                break;
            }
            op.add(nums[i]);
            backtrack(nums,result,i+1,remaining-nums[i],op);
            op.remove(op.size()-1);
        }

    }
}
