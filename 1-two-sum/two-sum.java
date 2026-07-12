class Solution {
    public int[] twoSum(int[] nums, int target) {

    HashMap<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
        int first = nums[i];
        int second = target - first;

        if (map.containsKey(second)) {
            return new int[]{i, map.get(second)};
        }

        map.put(first, i);
    }

    return new int[]{};
}

        /*for(int i=0; i<nums.length; i++)
        {
            for(int j=0; j<nums.length; j++)
            {
                if(nums[i] + nums[j] == target)
            }
        }
    }*/
}