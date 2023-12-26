class Solution {
    public int numRollsToTarget(int n, int k, int target) {
        final int MOD = 1000000007;

       
        if (n * k < target) {
            return 0;
        }

      
        long[][] dp = new long[n + 1][target + 1];

       
        dp[0][0] = 1;


        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= Math.min(i * k, target); j++) {
                for (int temp = 1; temp <= Math.min(k, j); temp++) {
                 
                    dp[i][j] = (dp[i][j] + dp[i - 1][j - temp]) % MOD;
                }
            }
        }

 
        return (int) dp[n][target];
    }
}