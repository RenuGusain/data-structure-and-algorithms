package renu.gusain.dsa.graph;

import java.util.Arrays;

public class LeetCode329 {

    public int longestIncreasingPath(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;
        int dp[][]=new int[m][n];
        for(int []row:dp)
        {
            Arrays.fill(row,-1);
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int currentMax = maxPath(matrix, i, j, -1,dp);
                if (currentMax > max) {
                    max = currentMax;
                }

            }

        }

        return max;
    }

    public int maxPath(int[][] matrix, int i, int j, int previous,int dp[][]) {
        int row = matrix.length;
        int col = matrix[0].length;
        if (i < 0 || i >= row || j < 0 || j >= col) return 0;
        int current = matrix[i][j];
        if (current <= previous) return 0;
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }

        int max1 = 1 + maxPath(matrix, i + 1, j, current,dp);
        int max2 = 1 + maxPath(matrix, i - 1, j, current,dp);
        int max = Math.max(max2, max1);
        int max3 = 1 + maxPath(matrix, i, j + 1, current,dp);
        int max4 = 1 + maxPath(matrix, i, j - 1, current,dp);
        max = Math.max(max, max3);
        max = Math.max(max, max4);
        dp[i][j]=max;
        return max;

    }
}
