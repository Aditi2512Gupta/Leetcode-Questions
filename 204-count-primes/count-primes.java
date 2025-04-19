class Solution {
    public int countPrimes(int n) {
        if (n < 3) return 0;

        boolean[] isPrime = new boolean[n];
        int count = n / 2; // exclude even numbers, start from 2

        for (int i = 3; i * i < n; i += 2) {
            if (!isPrime[i]) {
                for (int j = i * i; j < n; j += 2 * i) {
                    if (!isPrime[j]) {
                        isPrime[j] = true;
                        count--;
                    }
                }
            }
        }
        return count;
    }
}