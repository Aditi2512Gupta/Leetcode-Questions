class Solution {
    public int[] findErrorNums(int[] nums) {
       boolean[] seen = new boolean[nums.length + 1];
        int duplicate = -1;
        int missing = -1;

        // First pass: find duplicate
        for (int num : nums) {
            if (seen[num]) {
                duplicate = num;
            }
            seen[num] = true;
        }

        // Second pass: find missing
        for (int i = 1; i <= nums.length; i++) {
            if (!seen[i]) {
                missing = i;
                break;
            }
        }

        return new int[] {duplicate, missing}; 
    }
}