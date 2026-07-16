class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        // TC: O(n), SC: O(1)

        int n = nums.length;
        int ans[] = new int[n];
        Arrays.fill(ans, 1);

        // Storing prefix products in ans[]
        for(int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        int suffix = 1;
        // Multiply suffix products
        for(int i = n - 2; i >= 0; i--) {
            suffix *= nums[i + 1];
            ans[i] *= suffix;
        }

        return ans;
    }
}