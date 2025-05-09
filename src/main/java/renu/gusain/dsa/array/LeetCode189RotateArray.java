package renu.gusain.dsa.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LeetCode189RotateArray {
    public void rotate(int[] nums, int k) {
        final int len=nums.length;
        if(k>len)
        {
            k=k%len;

        }

        reverse(nums,0,len-1);
        reverse(nums,0,k-1);
        reverse(nums,k, len-1);
    }
    public void reverse(int []nums,int left,int right) {

        while (left<right)
        {
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
}