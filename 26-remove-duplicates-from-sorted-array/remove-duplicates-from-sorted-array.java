class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;  // Edge case: Empty array

        int i = 0; // Pointer for unique elements

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;  // Move to the next position
                nums[i] = nums[j]; // Copy unique element
            }
        }
        return i + 1;
        
    }
}