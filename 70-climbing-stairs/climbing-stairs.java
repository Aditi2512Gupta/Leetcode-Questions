class Solution {
    public int climbStairs(int n) {
        // Recursion + DP (Memoization)
        
        int[] dp = new int[n + 1];

        return solve(n, dp);
    }

    private int solve(int n, int[] dp) {
        if (n <= 1) {
            return 1;
        }

        if (dp[n] != 0) {
            return dp[n];
        }

        dp[n] = solve(n - 1, dp) + solve(n - 2, dp);

        return dp[n];
    }
}

        //  if (n <= 1) {
        //     return 1;
        // }

        // return climbStairs(n - 1) + climbStairs(n - 2);

        // if(n <= 2)
        //     return n;

        // int a = 1, b = 2;
        // for(int i = 3; i <= n; i++) {
        //     int c = a + b;
        //     a = b;
        //     b = c;
        // }

        // return b;