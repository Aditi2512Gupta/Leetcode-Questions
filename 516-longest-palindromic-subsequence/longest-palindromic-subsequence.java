class Solution {
    public int longestPalindromeSubseq(String s) {
        String r = new StringBuilder(s).reverse().toString();

        int n = s.length();
        int dp[] = new int[n + 1];

        for(int i = 1; i <= n; i++) {
            int prev = 0;
            for(int j = 1; j <= n; j++) {
                int temp = dp[j];
                if(s.charAt(i - 1) == r.charAt(j - 1))
                    dp[j] = 1 + prev;
                else
                    dp[j] = Math.max(dp[j], dp[j - 1]);

                prev = temp;
            }
        }

        return dp[n];
    }
}