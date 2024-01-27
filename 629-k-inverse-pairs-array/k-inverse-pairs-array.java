class Solution {

    int[][] dp;
    int mod = 1000000007;

    public int kInversePairs(int n, int k) {
        dp = new int[k+1][n+1];
        // If we should have 0 inverse pairs - it's just  1 2 3 4 5 order, only 1 option
        for (int i = 0; i <= n; i++) {
            dp[0][i] = 1;
        }
        // Start from 2, as for 1 it's only dp[0][1] to be calculated, and it's already done
        for (int i = 2; i <= n; i++) {
            // for j == 0 it's always 1
            for (int j = 1; j <= k; j++) {
                for (int l = 0; l <= Math.min(j, i-1); l++) {
                    dp[j][i] = (dp[j][i] + dp[j-l][i-1]) % mod;
                }
            }
        }
        return dp[k][n];
    }
}