class Solution {
    public List<Integer> minSubsequence(int[] nums) {

        Arrays.sort(nums);

        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        List<Integer> ans = new ArrayList<>();
        int currSum = 0;

        for (int i = nums.length - 1; i >= 0; i--) {
            currSum += nums[i];
            ans.add(nums[i]);

            if (currSum > totalSum - currSum) {
                break;
            }
        }

        return ans;
    }
}