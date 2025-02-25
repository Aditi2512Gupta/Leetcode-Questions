class Solution {
    public int search(int[] nums, int target) {
        int lb=0, ub=nums.length-1,mid;
        while(lb<=ub) {
            mid=(lb+ub)/2;
            if(nums[mid]==target) {
                return mid;
            }
            else if(nums[mid]>target) {
                ub=mid-1;
            }
            else {
                lb=mid+1;
            }
        }
        return -1;
    }
}