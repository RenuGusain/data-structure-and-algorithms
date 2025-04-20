package renu.gusain.array;

import java.util.Arrays;

public class LeetCode135 {
    public static void main(String[] args) {
        int rating[] = {1, 2, 2};
        System.out.println(candy(rating));
    }

    public static int candy(int[] ratings) {
        final int len = ratings.length;
        int candies[] = new int[len];
        Arrays.fill(candies, 1);

        for (int i = 1; i < len; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }

        }
        for (int i = len - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }
        return Arrays.stream(candies).sum();


    }
}
