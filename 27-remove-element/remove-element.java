class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;  // Slow pointer

        for (int j = 0; j < nums.length; j++) {  // Fast pointer
            if (nums[j] != val) {
                nums[i] = nums[j]; // Move valid element to front
                i++;
            }
        }
        
        return i;
    }
}