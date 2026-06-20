class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();

        outer:
        for (int n = left; n <= right; n++) {
            for (int x = n; x > 0; x /= 10) {
                int d = x % 10;
                if (d == 0 || n % d != 0) {
                    continue outer;
                }
            }
            res.add(n);
        }

        return res;
    }
}