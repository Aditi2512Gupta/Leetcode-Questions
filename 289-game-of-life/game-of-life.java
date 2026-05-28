class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length, n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                int live = 0;

                for (int r = Math.max(0, i - 1); r <= Math.min(m - 1, i + 1); r++) {
                    for (int c = Math.max(0, j - 1); c <= Math.min(n - 1, j + 1); c++) {

                        if (r == i && c == j)
                            continue;

                        if ((board[r][c] & 1) == 1)
                            live++;
                    }
                }

                if (board[i][j] == 1) {
                    if (live == 2 || live == 3)
                        board[i][j] |= 2;
                } 
                else {
                    if (live == 3)
                        board[i][j] |= 2;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] >>= 1;
            }
        }

    }
}