class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x; 
        
        int left = 1, right = x, ans = 0;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (mid <= x / mid) { // Avoid overflow instead of using mid * mid // mid^2 < = x
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return ans;
    }
}