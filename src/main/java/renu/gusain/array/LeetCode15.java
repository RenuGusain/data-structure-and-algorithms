package renu.gusain.array;

import java.util.*;

public class LeetCode15 {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        boolean exit = false;
        for (int i = 0; i < n; i++) {
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];


                if (nums[i] + nums[j] + nums[k] == 0) {
                    result.add(List.of(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                }
                if (sum < 0) {
                    j++;
                }
                if (sum > 0) {
                    k--;
                }

            }
        }
        return new ArrayList<>(result);
    }

}
