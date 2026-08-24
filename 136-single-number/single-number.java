class Solution {
    public int singleNumber(int[] nums) {
        // O(n) time, O(1) space
        
        int result = 0;

        for(int n: nums) {
            result ^= n;
        }

        return result;
    }
}