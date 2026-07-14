class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            // Skip duplicate first elements
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1, k = n - 1;

            while (j < k) {

                int sum = nums[i] + nums[j] + nums[k];

                if (sum < 0) {
                    j++;
                }
                else if (sum > 0) {
                    k--;
                }
                else {
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;

                    // Skip duplicate second elements
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }

                    // Skip duplicate third elements
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                }
            }
        }

        return ans;
    }
}
        // int n = nums.length;
        // Set<List<Integer>> uniqueTriplets = new HashSet<>();

        // for (int i = 0; i < n; i++) {
        //     int target = -nums[i];

        //     HashSet<Integer> set = new HashSet<>();

        //     for (int j = i + 1; j < n; j++) {
        //         int third = target - nums[j];

        //         if (set.contains(third)) {
        //             List<Integer> trip = new ArrayList<>();
        //             trip.add(nums[i]);
        //             trip.add(nums[j]);
        //             trip.add(third);

        //             Collections.sort(trip);
        //             uniqueTriplets.add(trip);
        //         }

        //         set.add(nums[j]);
        //     }
        // }

        // return new ArrayList<>(uniqueTriplets);


        // int n = nums.length;
        // List<List<Integer>> ans = new ArrayList<>();

        // HashSet<List<Integer>> set = new HashSet<>();

        // for (int i = 0; i < n; i++) {
        //     for (int j = i + 1; j < n; j++) {
        //         for (int k = j + 1; k < n; k++) {

        //             if (nums[i] + nums[j] + nums[k] == 0) {

        //                 List<Integer> trip = new ArrayList<>();
        //                 trip.add(nums[i]);
        //                 trip.add(nums[j]);
        //                 trip.add(nums[k]);

        //                 Collections.sort(trip);

        //                 if (!set.contains(trip)) {
        //                     set.add(trip);
        //                     ans.add(trip);
        //                 }
        //             }
        //         }
        //     }
        // }

        // return ans;