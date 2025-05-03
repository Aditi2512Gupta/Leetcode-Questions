class Solution {
    public int numSquares(int n) {
        if (isPerfectSquare(n)) return 1;

        for (int i = 1; i * i <= n; i++) {
            if (isPerfectSquare(n - i * i)) return 2;
        }

        while (n % 4 == 0) n /= 4;
        if (n % 8 == 7) return 4;

        return 3;
    }

    private boolean isPerfectSquare(int n) {
        int sqrt = (int)Math.sqrt(n);
        return sqrt * sqrt == n;
        
        /*if (num < 2) return true; // 0 and 1 are perfect squares

        long left = 2, right = num / 2;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;

            if (square == num) return true;
            else if (square < num) left = mid + 1;
            else right = mid - 1;
        }

        return false;*/
    }
}
