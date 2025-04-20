class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> window = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (i > k) {
                window.remove(nums[i - k - 1]); // Maintain window of size k
            }
            if (!window.add(nums[i])) {
                return true; // Duplicate found within range k
            }
        }

        return false;
    }
}