class Solution {
    public List<List<String>> solveNQueens(int n) {
        
        List<List<String>> res = new ArrayList<>();
        int[] board = new int[n];
        solve(0, n, board, res);
        return res;
    }

    private void solve(int col, int n, int[] board, List<List<String>> res) {
        if (col == n) {
            res.add(construct(board, n));
            return;
        }

        for (int row = 0; row < n; row++) {
            boolean safe = true;

            for (int i = 0; i < col; i++) {
                if (board[i] == row || Math.abs(board[i] - row) == Math.abs(i - col)) {
                    safe = false;
                    break;
                }
            }

            if (safe) {
                board[col] = row;
                solve(col + 1, n, board, res);
            }
        }
    }

    private List<String> construct(int[] board, int n) {
        List<String> temp = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            char[] row = new char[n];
            Arrays.fill(row, '.');
            row[board[i]] = 'Q';
            temp.add(new String(row));
        }

        return temp;
    }
}