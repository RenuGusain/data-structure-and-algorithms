package renu.gusain.dsa.two.pointer;

import java.util.Arrays;

public class LeetCode16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int minDif = Integer.MAX_VALUE;
        int result=0;
        for (int i = 0; i < n; i++) {
            int l = 0;
            int r = n - 1;
            while (l < r) {
                if (l == i) {
                    l++;
                    continue;

                }
                if (r == i) {
                    r--;
                    continue;
                }
                int left = nums[l];
                int right = nums[r];
                int currentSum = left + right + nums[i];

                if (currentSum < target) {
                    l++;
                } else if (currentSum > target) {
                    r--;

                }
                if (currentSum == target) {
                    return 0;
                }
                int diff = Math.abs(target - currentSum);
                if (diff < minDif) {
                    minDif = diff;
                    result=currentSum;
                }
                System.out.print("current no =" +left+" "+right+" "+nums[i]+" current diff "+diff);
            }
        }
        return result;
    }
}
