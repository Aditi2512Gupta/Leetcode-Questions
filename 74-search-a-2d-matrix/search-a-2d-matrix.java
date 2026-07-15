class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        // Binary Search - O(log (m * n))

        int m = matrix.length;     // Rows
        int n = matrix[0].length;  // Colums

        int startRow = 0, endRow = m - 1;
        while(startRow <= endRow) {
            int midRow = startRow + (endRow - startRow) / 2;

            if(target >= matrix[midRow][0] && target <= matrix[midRow][n - 1]) {
                // Found the row => BS in this row
                return bSInRow(target, matrix, midRow);
            }
            else if(target >= matrix[midRow][n - 1]) {
                // down => right
                startRow = midRow + 1;
            }
            else {
                // up => left
                endRow = midRow - 1;
            }
        }
        return false;
    }

    public boolean bSInRow(int target, int mat[][], int row) {
        int n = mat[0].length;
        int start = 0, end = n - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target == mat[row][mid])
                return true;
            else if(target > mat[row][mid])
                start = mid + 1;
            else
                end = mid - 1;
        }
        return false;
    }
}



    //     for(int i=0; i<matrix.length; i++) {
    //         for(int j=0; j<matrix[i].length; j++) {
    //             if(matrix[i][j]==target) {
    //                 return true;
    //             }
    //         }
    //     }
    //   return false; 