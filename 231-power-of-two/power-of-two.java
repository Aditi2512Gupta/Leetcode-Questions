class Solution {
    public boolean isPowerOfTwo(int n) {
        // TC: O(1), SC: O(1)

        if(n <= 0)
            return false;
        return (n & (n - 1)) == 0;
    }
}