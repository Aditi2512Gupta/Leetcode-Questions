class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
      
        int[] freq = new int[1001];
        int[] temp = new int[Math.min(nums1.length, nums2.length)];
        int k = 0;

        for (int num : nums1) {
            freq[num]++;
        }

        for (int num : nums2) {
            if (freq[num] > 0) {
                temp[k++] = num;
                freq[num]--;
            }
        }

        int[] result = new int[k];
        System.arraycopy(temp, 0, result, 0, k);
        return result;
    }
}