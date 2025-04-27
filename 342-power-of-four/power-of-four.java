class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }
        // Keep dividing n by 4 if it's divisible
        while (n % 4 == 0) {
            n /= 4;
        }
        // If n becomes 1, it is a power of four
        return n == 1;
    }
}