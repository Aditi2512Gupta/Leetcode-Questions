class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        // Deque , TC: O(n), SC: O(n)

        int n = nums.length;
        Deque<Integer> dq = new ArrayDeque<>();
        int res[] = new int[n - k + 1];
        int idx = 0;

        // First Window
        for(int i = 0; i < k; i++) {
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
                dq.pollLast();
            }
            dq.offerLast(i);
        }

        // Remaining Windows
        for(int i = k; i < n; i++) {

            // Maximum of previous window
            res[idx++] = nums[dq.peekFirst()];

            // Remove indices not part of current window
            while(!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // Remove smaller elements on the left side
            while(!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
                dq.pollLast();
            }
            dq.offerLast(i);
        }

        // Remaining of last window
        res[idx] = nums[dq.peekFirst()];

        return res;
    }
}