class Solution {
    public int minPathSum(int[][] grid) {

        int m = grid.length, n = grid[0].length;
        int[] dp = new int[n];

        dp[0] = grid[0][0];

        for (int j = 1; j < n; j++)
            dp[j] = dp[j - 1] + grid[0][j];

        for (int i = 1; i < m; i++) {
            dp[0] += grid[i][0];
            for (int j = 1; j < n; j++) {
                dp[j] = Math.min(dp[j], dp[j - 1]) + grid[i][j];
            }
        }

        return dp[n - 1];
    }
}

//         int m = grid.length;
//         int n = grid[0].length;

//         for(int i = 0; i < m; i++) {
//             for(int j = 0; j < n; j++) {
//                 if(i == 0 && j == 0)
//                     continue;

//                 else if(i == 0)
//                     grid[i][j] += grid[i][j - 1];

//                 else if(j == 0)
//                     grid[i][j] += grid[i - 1][j];

//                 else
//                     grid[i][j] += Math.min(grid[i][j - 1], grid[i - 1][j]);
//             }
//         }

//         return grid[m - 1][n - 1];
//     }
// }

