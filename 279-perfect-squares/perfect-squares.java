class Solution {
    public int numSquares(int n) {
        // Initialize a dp array where dp[i] represents the least number of perfect squares summing up to i
        int[] dp = new int[n + 1];
        
        // Base case: 0 perfect squares needed to sum up to 0
        dp[0] = 0;
        
        // Initialize the dp array with a large value (since we want to find the minimum)
        for (int i = 1; i <= n; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        
        // Iterate through each number from 1 to n to fill the dp array
        for (int i = 1; i <= n; i++) {
            // Check for all perfect squares less than or equal to i
            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }
        
        // The result for n will be stored in dp[n]
        return dp[n];
    }
}