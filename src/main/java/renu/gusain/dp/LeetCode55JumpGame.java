package renu.gusain.dp;

public class LeetCode55JumpGame {

    public boolean canJump(int[] nums) {
        int len=nums.length;
        int result[]=new int[len];
        return solve(nums, 0, len - 1,result);
    }

    public boolean solve(int[] nums, int i, final int lastIndex,int result[]) {
        if(result[i]==1)return true;
        if(result[i]==2)return false;
        if (i == lastIndex) {
            return true;
        };
        int steps = nums[i];
        if (steps >= lastIndex - i) return true;
        if (steps == 0) return false;
        for (int currentStep = 1; currentStep <= steps; currentStep++) {
            if (solve(nums, i + currentStep, lastIndex,result))
            {
                result[i+currentStep]=1;
                return true;
            }
            result[i+currentStep]=2;

        }
        result[i]=2;
        return false;
    }
}
