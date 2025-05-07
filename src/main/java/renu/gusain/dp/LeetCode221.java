package renu.gusain.dp;

public class LeetCode221 {
    public static void main(String[] args) {

    }
    public static int maximalSquare(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int max = 0;
        int dp[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == '1') {
                max = 1;
                dp[i][0] = 1;
            }
        }
        for (int i = 0; i < n; i++) {
            if (matrix[0][i] == '1') {
                max = 1;
                dp[0][i] = 1;
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == '1') {
                    int diagonal = dp[i-1][j-1];
                    int up = dp[i-1][j];
                    int down = dp[i][j-1];

                    int min = Integer.min(diagonal, up);

                    min = Integer.min(min, down) ;
                    min=min+1;
                    int currentArea = min * min;
                    dp[i][j] = min;
                    if (currentArea > max) {
                        max = currentArea;
                    }
                }


            }
        }
        return max;

    }


}
