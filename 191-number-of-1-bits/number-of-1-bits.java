class Solution {
    public int hammingWeight(int n) {
        // O(1) time and O(1) space for a 32-bit integer

        int count = 0;

        while(n != 0) {
            n &= (n - 1);
            count++;
        }

        return count;
    }
}