class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) {
                return true;
            }
            map.put(nums[i], i); 
        }
        return false;
    }
}















        /*HashSet<Integer> window = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (i > k) {
                window.remove(nums[i - k - 1]); // Maintain window of size k
            }
            if (!window.add(nums[i])) {
                return true; // Duplicate found within range k
            }
        }

        return false;
    }
}*/