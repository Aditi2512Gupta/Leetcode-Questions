class Solution {
    public int rob(int[] nums) {
        // Recursion + DP (Memoization)
        // TC: O(n), SC: O(n)

        int n = nums.length;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        return solve(nums, n, dp);
    }

    private int solve(int[] arr, int n, int[] dp) {

        // Base Case
        if (n <= 0)
            return 0;

        if (n == 1)
            return arr[0];

        // If already calculated
        if (dp[n] != -1)
            return dp[n];

        // Pick current house OR don't pick current house
        dp[n] = Math.max(arr[n - 1] + solve(arr, n - 2, dp), solve(arr, n - 1, dp));

        return dp[n];
    }

    //     // TC: O(n), SC: O(1)
    //     int n = nums.length;
        
    //     if(n == 1) {
    //         return nums[0];
    //     }

    //     int prev2 = nums[0];
    //     int prev1 = Math.max(nums[0], nums[1]);

    //     for(int i = 2; i < n; i++) {
    //         int curr = Math.max(prev1, nums[i] + prev2);
    //         prev2 = prev1;
    //         prev1 = curr;
    //     }

    //     return prev1;
    // }
}