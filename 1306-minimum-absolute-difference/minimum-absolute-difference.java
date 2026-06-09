class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int diff = arr[i] - arr[i - 1];
            if (diff < minDiff) {
                minDiff = diff;
            }
        }

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 1; i < n; i++) {
            if (arr[i] - arr[i - 1] == minDiff) {
                List<Integer> pair = new ArrayList<>(2);
                pair.add(arr[i - 1]);
                pair.add(arr[i]);
                ans.add(pair);
            }
        }

        return ans;
    }
}