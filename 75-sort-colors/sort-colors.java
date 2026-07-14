class Solution {
    public void sortColors(int[] nums) {
        // Dutch National Flag Algorithm (DNF) - O(n)

    //     int low = 0, mid = 0, high = nums.length - 1;
        
    //     while (mid <= high) {
    //         if (nums[mid] == 0) {
    //             swap(nums, low, mid);
    //             low++;
    //             mid++;
    //         } else if (nums[mid] == 1) {
    //             mid++;
    //         } else { // nums[mid] == 2
    //             swap(nums, mid, high);
    //             high--;
    //         }
    //     }
    // }

    // private void swap(int[] nums, int i, int j) {
    //     int temp = nums[i];
    //     nums[i] = nums[j];
    //     nums[j] = temp;
    // }

    // Optimized solution - O(2n) = O(n)
        // O(n)
        int c0 = 0, c1 = 0, c2 = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0)
                c0++;
            else if(nums[i] == 1)
                c1++;
            else
                c2++;
        }

        // O(n)
        int idx = 0;
        for(int i = 0; i < c0; i++) {
            nums[idx++] = 0;
        }
        for(int i = 0; i < c1; i++) {
            nums[idx++] = 1;
        }
        for(int i = 0; i < c2; i++) {
            nums[idx++] = 2;
        }
    }
}
