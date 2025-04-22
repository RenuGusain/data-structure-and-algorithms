package renu.gusain.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeetCode17 {

     static  String arr[]={"","", "abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public static void main(String[] args) {
        letterCombinations("23");
    }
    public  static List<String> letterCombinations(String digits) {
        List<String>result=new ArrayList<>();

        if(digits.trim().length()==0)
        {
            return result;
        }
        backtrack(result,0,new StringBuilder(),digits);
        return result;

    }

    public static void backtrack(List<String>result,int i,StringBuilder sb,String ip)
    {

        if(ip.length()==i)
        {
            result.add(sb.toString());
            return;
        }
        int currentNo=Integer.parseInt(ip.substring(i,i+1));
        String currentString=arr[currentNo];

        for(int k=0;k<currentString.length();k++)
        {
            sb.append(currentString.charAt(k));
            backtrack(result,i+1,sb,ip);
            sb.deleteCharAt(sb.length()-1);

        }


    }
}
