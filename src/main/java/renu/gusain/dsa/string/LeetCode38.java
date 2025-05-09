package renu.gusain.dsa.string;

public class LeetCode38 {
    public static void main(String[] args) {
        System.out.println(countAndSay(1));

    }
    public static  String countAndSay(int n) {
        if(n==1)
        {
            return "1";
        }
        else
        {
           return getRLE(countAndSay(n-1));
        }


    }


    public static String getRLE(String input) {

        int n = input.length();
        int left = 0;
        int right = 1;
        StringBuilder sb = new StringBuilder();

        while (right < n) {
            char leftChar = input.charAt(left);
            char rightChar = input.charAt(right);

            if (leftChar != rightChar) {
                int count = right - left;

                sb.append(count).append(leftChar);
                left = right;
            }
            right++;


        }
        sb.append(right - left).append(input.charAt(left));
        return sb.toString();
    }
}
