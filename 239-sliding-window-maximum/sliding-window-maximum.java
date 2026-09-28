class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int[] ans = new int[nums.length - k + 1];
        int j = 0;

        for (int i = 0; i < nums.length; i++) {

            // Remove elements outside the window
            if (!dq.isEmpty() && dq.peekFirst() <= i - k)
                dq.pollFirst();

            // Remove smaller elements
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i])
                dq.pollLast();

            dq.addLast(i);

            // Window is ready
            if (i >= k - 1)
                ans[j++] = nums[dq.peekFirst()];
        }

        return ans;
    }
}