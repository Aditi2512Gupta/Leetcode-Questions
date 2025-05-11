class Solution {
    public int integerBreak(int n) {
        if (n == 2) return 1; // 1 + 1
        if (n == 3) return 2; // 1 + 2

        int product = 1;
        
        // Use as many 3s as possible
        while (n > 4) {
            product *= 3;
            n -= 3;
        }
        
        // Multiply the remaining n (which will be 2, 3, or 4)
        product *= n;
        
        return product;
    }
}