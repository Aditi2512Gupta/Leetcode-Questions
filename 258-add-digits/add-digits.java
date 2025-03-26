class Solution {
    public int addDigits(int num) {
        int sum = 0, n = num, d;
        while(n >= 10)
        {
            sum = 0;
            while(n>0)
            {
                d = n%10;
                sum += d;
                n = n/10;
            }
            n = sum;
        }
        return n;
    }
}