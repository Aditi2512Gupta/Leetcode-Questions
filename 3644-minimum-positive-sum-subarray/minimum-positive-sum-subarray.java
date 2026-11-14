
class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int[] pre = new int[n + 1];

        for (int i = 0; i < n; i++)
            pre[i + 1] = pre[i] + nums.get(i);

        TreeMap<Integer, Integer> map = new TreeMap<>();
        int ans = Integer.MAX_VALUE;

        for (int j = 1; j <= n; j++) {
            int add = j - l;
            if (add >= 0)
                map.merge(pre[add], 1, Integer::sum);

            int remove = j - r - 1;
            if (remove >= 0)
                map.compute(pre[remove], (k, v) -> v == 1 ? null : v - 1);

            Integer x = map.lowerKey(pre[j]);

            if (x != null)
                ans = Math.min(ans, pre[j] - x);
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
