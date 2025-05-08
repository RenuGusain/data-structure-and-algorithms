package renu.gusain.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode15 {
    public List<List<Integer>> threeSum(int[] nums) {


        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(nums[i]>0)break;
            for (int j = i + 1; j < n; j++) {
                if(nums[i]+nums[j]>0)break;
                for (int k = j + 1; k < n; k++) {
                    if(nums[i]+nums[j]+nums[k]>0)break;
                    if (i > 0 && nums[i - 1] == nums[i]) continue;
                    if (j > i + 1 && nums[j - 1] == nums[j]) continue;
                    if (k > j + 1 && nums[k - 1] == nums[k]) continue;
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        result.add(List.of(nums[i], nums[j], nums[k]));
                    }
                }
            }
        }
        return result;

    }
}
