package renu.gusain.dp;

import java.util.Arrays;

public class LeetCode97 {
    public static void main(String[] args) {
        LeetCode97 obj = new LeetCode97();
        String s1 = "aabcc";
        String s2 = "dbbca";
        String s3 = "aadbbcbcac";
        boolean result=obj.recursion(s1, s2, s3,0,0,0);
        System.out.println("result= "+result);

    }

    public boolean recursion(String s1, String s2, String s3, int i, int j, int k) {
        if (k == s3.length() && i == s1.length() && s2.length() == j) {
            return true;
        }

        if (k==s3.length()) return false;

        boolean result1 = false;
        boolean result2 = false;
        if(i<s1.length()&&s1.charAt(i)==s3.charAt(k))
        {
            result2= recursion(s1,s2,s3,i+1,j,k+1);
        }
        if(j<s2.length()&&s2.charAt(j)==s3.charAt(k))
        {
            result1=  recursion(s1,s2,s3,i,j+1,k+1);
        }
        return result1||result2;


    }

}
