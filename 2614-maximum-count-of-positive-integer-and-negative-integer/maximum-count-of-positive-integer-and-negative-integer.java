class Solution {
    public int maximumCount(int[] nums) {
        int negCount = findFirstZero(nums); // Count of negative numbers
        int posCount = nums.length - findFirstPositive(nums); // Count of positive numbers
        return Math.max(negCount, posCount);
    }

    private int findFirstZero(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < 0) { // Negative number
                left = mid + 1;
            } else { // Zero or positive
                right = mid - 1;
            }
        }
        return left; // First zero index = count of negative numbers
    }

    private int findFirstPositive(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= 0) { // Zero is NOT positive
                left = mid + 1;
            } else { // Found a positive number
                right = mid - 1;
            }
        }
        return left; // First positive index
    }
}