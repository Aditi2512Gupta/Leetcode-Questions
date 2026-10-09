class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    int atMost(int nums[], int k) {
        int freq[] = new int[nums.length + 1];
        int l = 0, ans = 0;

        for(int r = 0; r < nums.length; r++) {
            if(freq[nums[r]]++ == 0)
                k--;

            while(k < 0) {
                if(--freq[nums[l++]] == 0)
                    k++;
            }

            ans += r - l + 1;
        }

        return ans;
    }
}