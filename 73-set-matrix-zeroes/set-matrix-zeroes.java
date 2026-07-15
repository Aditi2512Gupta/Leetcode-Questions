class Solution {
    public void setZeroes(int[][] matrix) {

        // TC: O(m * n), SC: O(1)
        int m = matrix.length, n = matrix[0].length;
        boolean firstCol = false;

        // Mark rows and columns
        for(int i = 0; i < m; i++) {
            if(matrix[i][0] == 0)
                firstCol = true;

            for(int j = 1; j < n; j++) {
                if(matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Fill matrix using markers
        for(int i = m - 1; i >= 0; i--) {
            for(int j = n - 1; j >= 1; j--) {
                if(matrix[i][0] == 0 || matrix [0][j] == 0)
                    matrix[i][j] = 0;
            }

            if(firstCol)
                matrix[i][0] = 0;
        }
    }
}