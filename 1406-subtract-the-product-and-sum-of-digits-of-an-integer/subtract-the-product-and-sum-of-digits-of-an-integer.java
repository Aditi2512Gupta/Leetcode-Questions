class Solution {
    public int subtractProductAndSum(int n) {
        int pro = 1, sum = 0, num = n;
        while(num > 0) {
            int d= num % 10;
            pro *= d;
            sum += d;
            num /= 10;
        }

        return pro - sum;
    }
}