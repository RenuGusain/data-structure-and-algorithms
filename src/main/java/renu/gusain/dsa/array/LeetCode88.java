package renu.gusain.dsa.array;

public class LeetCode88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i=0;int j=0;
        while (i<m&&j<n)
        {
            int a=nums1[i];
            int b=nums2[j];
            if(a>b)
            {
                nums2[j]=nums1[i];
            }

        }
    }
}
