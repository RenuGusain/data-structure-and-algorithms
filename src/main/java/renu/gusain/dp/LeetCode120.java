package renu.gusain.dp;

import java.util.Arrays;
import java.util.List;

public class LeetCode120 {
    public static void main(String[] args) {

    }

    public static int minimumTotal(List<List<Integer>> triangle) {
        int dp[][]=new int[triangle.size()+1][triangle.size()+1];
        Arrays.stream(dp).forEach(a->Arrays.fill(a,-1));
return backTrack(0,0,triangle,dp);


    }
    public  static int backTrack(int currentRowNo,int currentIndex,List<List<Integer>> triangle, int dp[][])
    {

        if(currentRowNo>=triangle.size())
        {
            return 0;
        }
        List<Integer>currentRow=triangle.get(currentRowNo);
        if(currentIndex>=currentRow.size())
        {
            return 0;
        }

        if (dp[currentRowNo][currentIndex]!=-1)return dp[currentRowNo][currentIndex];

        int min=Integer.MAX_VALUE;


        int currentValue=currentRow.get(currentIndex);
        for(int i=currentIndex;i<=currentIndex+1 ;i++)
        {
            int result=backTrack(currentRowNo+1,i,triangle,dp);
            int sum=currentValue+result;
            if(sum<min)
            {
                min=sum;
            }

        }

        dp[currentRowNo][currentIndex]=min;
        return min;
    }
}
