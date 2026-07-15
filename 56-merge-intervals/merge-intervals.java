class Solution {
    public int[][] merge(int[][] interval) {

        // TC: O(nlogn), SC: O(n)

        Arrays.sort(interval, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> ans = new ArrayList<>();

        int start = interval[0][0];
        int end = interval[0][1];

        for(int i = 1; i < interval.length; i++) {
            if(interval[i][0] <= end)
                end = Math.max(end, interval[i][1]);
            else {
                ans.add(new int[]{start, end});
                start = interval[i][0];
                end = interval[i][1];
            }
        }

        ans.add(new int[]{start, end});

        return ans.toArray(new int[ans.size()][]);
    }
}