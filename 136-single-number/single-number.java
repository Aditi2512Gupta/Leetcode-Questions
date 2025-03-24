class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        
        /*for (int i = 0; i < nums.length; i++) {
        int num = nums[i];
        }*/

        for (int num : nums) {
            result ^= num; // XOR cancels out duplicate numbers
        }
        return result;

    }
}