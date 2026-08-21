class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(nums, 0, ans); 
        return ans;
    }

    static void solve(int nums[], int index, List<List<Integer>> ans) {
        if(index == nums.length) {
            List<Integer> list = new ArrayList<>();
            for(int x: nums)
                list.add(x);
            ans.add(list);
            return;
        }

        for(int i = index; i < nums.length; i++) {
            swap(nums, index, i);
            
            solve(nums, index + 1, ans);

            //backtrack
            swap(nums, index, i);
        }
    }

    static void swap(int nums[], int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
} 