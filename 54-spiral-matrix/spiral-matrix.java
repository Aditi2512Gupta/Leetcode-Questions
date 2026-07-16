class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        // TC: (m * n)
        int m = matrix.length;
        int n = matrix[0].length;

        int srow = 0, scol = 0;
        int erow = m - 1, ecol = n - 1;

        List<Integer> ans = new ArrayList<>();

        while(srow <= erow && scol <= ecol) {
            // Top
            for(int j = scol; j <= ecol; j++) {
                ans.add(matrix[srow][j]);
            }

            // Right
            for(int i = srow + 1; i <= erow; i++) {
                ans.add(matrix[i][ecol]);
            }

            // Bottom
            for(int j = ecol - 1; j >= scol; j--) {
                if(srow == erow)
                    break;
                ans.add(matrix[erow][j]);
            }

            // Left
            for(int i = erow - 1; i >= srow + 1; i--) {
                if(scol == ecol)
                    break;
                ans.add(matrix[i][scol]);
            }

            srow++;
            scol++;
            erow--;
            ecol--;
        }

        return ans;
    }
}