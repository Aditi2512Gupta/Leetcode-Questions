class Solution {
    public int maxSubArray(int[] nums) {

        // Kadane's Algorithm 

        int currSum = 0, maxSum = Integer.MIN_VALUE;

        for(int val: nums) {
            currSum += val;
            maxSum = Math.max(maxSum, currSum);

            if(currSum < 0)
                currSum = 0;
        }

        return maxSum;

        // int currentSum = nums[0];
        // int maxSum = nums[0];
        // for (int i = 1; i < nums.length; i++) {
        //     currentSum = Math.max(nums[i], currentSum + nums[i]);
        //     maxSum = Math.max(maxSum, currentSum);
        // }
        // return maxSum;
    }
}
