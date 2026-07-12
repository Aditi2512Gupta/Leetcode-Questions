class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
       HashSet<Integer> set = new HashSet<>();
       int n = grid.length;
       int actualSum = 0, a = 0;

       for(int i = 0; i < n; i++) {
        for(int j = 0; j < n; j++) {
            actualSum += grid[i][j];

            if(set.contains(grid[i][j])) {
                a = grid[i][j];
            }
            set.add(grid[i][j]);
        }
       }

       int expectedSum = ((n * n) * (n * n + 1)) / 2;
       int b = expectedSum + a - actualSum;

       return new int[]{a, b};
    }
}