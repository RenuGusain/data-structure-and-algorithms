package renu.gusain.dsa.backtrack;

import java.util.ArrayList;
import java.util.List;

public class LeetCode39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
List<List<Integer>>result=new ArrayList<>();
backTrack(candidates,target,0,result,new ArrayList<>(),0);
return result;

    }
    public  void  backTrack(int[] candidates, int target,int i,List<List<Integer>>result,List<Integer>currentList, int sum)
    {
        if(sum==target)
        {
            result.add(new ArrayList<>(currentList));
            return;
        }
        if(candidates.length==i)
        {
            return;
        }
        if(sum>target)return;;
        int currentCandidate=candidates[i];
        //Incude it in sum
        sum=sum+currentCandidate;
        currentList.add(currentCandidate);

        //include itself again
        backTrack(candidates,target,i,result,currentList,sum);
        backTrack(candidates,target,i+1,result,currentList,sum);
        //exclude id
        sum=sum-currentCandidate;
        currentList.remove(Integer.valueOf(currentCandidate));
        backTrack(candidates,target,i+1,result,currentList,sum);
        backTrack(candidates,target,i,result,currentList,sum);

    }
}
