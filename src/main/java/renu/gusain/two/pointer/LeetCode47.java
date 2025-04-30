package renu.gusain.two.pointer;

public class LeetCode47 {
    public static void main(String[] args) {
        int hegiht[]={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(hegiht));
    }
    public static int trap(int[] height) {
        int n=height.length;
        int left[]=new int[n];
        int right[]=new int[n];
        left[0]=Integer.MIN_VALUE;
        for(int i=1;i<n;i++)
        {
            if(left[i-1]>height[i-1])
            {
                left[i]=left[i-1];
            }
            else
            {
                left[i]=height[i-1];
            }


        }

        right[n-1]=Integer.MIN_VALUE;
        for(int i=n-2;i>=0;i--)
        {
            if(right[i+1]>height[i+1])
            {
                right[i]=right[i+1];
            }
            else
            {
                right[i]=height[i+1];
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(height[i] + " "+ left[i]+" "+ right[i]);
        }
        int area=0;
        for(int i=0;i<n;i++)
        {
            int colmHt=Integer.min(left[i],right[i]);
            if(colmHt>0&&colmHt-height[i]>0)
            {
                colmHt=colmHt-height[i];
                area=area+colmHt;
            }





        }
        return area;

    }
}
