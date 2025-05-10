package renu.gusain.dsa.greedy;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class LeetCode179 {
    public static void main(String[] args) {
        int arr[]={3,30,34,5,9};
        System.out.println(largestNumber(arr));
    }
    public static String largestNumber(int[] nums) {
        int n=nums.length;
        String elements [] = new String[n];
        for(int i=0;i<n;i++){
            elements[i]=Integer.toString(nums[i]);
        }
        Arrays.sort(elements, (a,b)-> (b+a).compareTo(a+b));

        if(elements[0].equals("0")){
            return "0";
        }

        StringBuilder result= new StringBuilder();
        for(String str:elements){
            result.append(str);
        }

        return result.toString();
    }
}