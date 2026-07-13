class Solution {
    public void nextPermutation(int[] nums) {
        // 1. Find the pivot
        int pivot = -1;
        int n = nums.length;

        for(int i = n - 2; i >= 0; i--) {
            if(nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }

        // If no pivot exists, reverse the entire array
        if(pivot == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        // 2. Find the next largest element of pivot
        for(int i = n - 1; i > pivot; i--) {
            if(nums[i] > nums[pivot]) {
                swap(nums, i, pivot);
                break;
            }
        }

        // 3. Reverse from pivot + 1 to n - 1
        reverse(nums, pivot + 1, n - 1);
    }

    public static void swap(int nums[], int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void reverse(int nums[], int left, int right) {
        while( left < right) {
            swap(nums, left++, right--);
        }
    }
}