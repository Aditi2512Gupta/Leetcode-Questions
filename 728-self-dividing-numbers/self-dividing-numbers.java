class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();

        for (int num = left; num <= right; num++) {
            int x = num;
            boolean valid = true;

            while (x > 0) {
                int digit = x % 10;

                if (digit == 0 || num % digit != 0) {
                    valid = false;
                    break;
                }

                x /= 10;
            }

            if (valid) {
                ans.add(num);
            }
        }

        return ans;
    }
}