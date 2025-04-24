package renu.gusain.backtrack;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LeetCode47Permutation {
    public static void main(String[] args) {
        int num[]={1,2,1};
        List<List<Integer>>op=permuteUnique(num);
        op.stream().forEach((list)->
        {
            list.stream().forEach(e-> System.out.print(" "+e+" "));
            System.out.println();
        });
    }
    public  static  List<List<Integer>>  permuteUnique(int[] nums) {
        List<List<Integer>>result=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        boolean used[]=new boolean[n];
        backtrack(result,new ArrayList<>(),nums,n,used);

        
        return result;
    }

   public static void   backtrack( List<List<Integer>>result,List<Integer>op,int[]nums,int n,boolean used[])
    {
       if(op.size()==n)
       {
           result.add(new ArrayList<>(op));
           return;
       }
       for(int i=0;i<n;i++)
       {
           if(used[i])continue;
           if(i>0&&nums[i]==nums[i-1]&&!used[i-1])continue;
           used[i]=true;
           op.add(nums[i]);
           backtrack(result,op,nums,n,used);
           used[i]=false;
           op.remove(op.size()-1);

       }
    }
}
