class Solution {
    public int findShortestSubArray(int[] nums) {
        int[] count = new int[50000];
        int[] first = new int[50000];

        Arrays.fill(first, -1);

        int degree = 0, ans = nums.length;

        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];

            if (first[x] == -1)
                first[x] = i;

            count[x]++;

            if (count[x] > degree) {
                degree = count[x];
                ans = i - first[x] + 1;

            }
             else if (count[x] == degree) {
                ans = Math.min(ans, i - first[x] + 1);
            }
        }
        return ans;
    }
}