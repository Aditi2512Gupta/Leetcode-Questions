class Solution {
    public int uniquePaths(int m, int n) {
        // TC: O(m * n), SC: O(n)

        int dp[] = new int[n];
        Arrays.fill(dp, 1);

        for(int i = 1; i < m; i++) {
            for(int j = 1; j < n; j++) {
                dp[j] = dp[j] + dp[j - 1];
                // ways to current cell = ways from above + ways from left
            }
        }

        return dp[n - 1];
    }
}