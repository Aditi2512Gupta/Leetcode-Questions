class Solution {
    public int dominantIndex(int[] nums) {
        int max = -1;
        int maxIndex = -1;

        // First pass: find the max element and its index
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }

        // Second pass: check if max is at least twice every other element
        for (int i = 0; i < nums.length; i++) {
            if (i != maxIndex && max < 2 * nums[i]) {
                return -1;
            }
        }

        return maxIndex;
    }
}