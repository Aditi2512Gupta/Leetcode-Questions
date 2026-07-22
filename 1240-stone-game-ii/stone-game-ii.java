class Solution {
    public int stoneGameII(int[] piles) {
        int n = piles.length;

        // suffix[i] = total stones from i to end
        int[] suffix = new int[n + 1];
        for (int i = n - 1; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + piles[i];
        }

        Integer[][] dp = new Integer[n][n + 1];

        return dfs(0, 1, piles, suffix, dp);
    }

    private int dfs(int i, int M, int[] piles, int[] suffix, Integer[][] dp) {
        int n = piles.length;

        if (i >= n)
            return 0;

        if (2 * M >= n - i)
            return suffix[i];

        if (dp[i][M] != null)
            return dp[i][M];

        int best = 0;

        for (int x = 1; x <= 2 * M; x++) {
            best = Math.max(best,
                    suffix[i] - dfs(i + x, Math.max(M, x), piles, suffix, dp));
        }

        return dp[i][M] = best;
    }
}