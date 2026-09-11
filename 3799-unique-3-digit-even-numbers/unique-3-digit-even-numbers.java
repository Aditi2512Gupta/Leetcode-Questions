class Solution {
    public int totalNumbers(int[] digits) {
        int[] c = new int[10];
        for (int d : digits)
            c[d]++;

        int ans = 0;

        for (int i = 1; i < 10; i++) {
            if (c[i] == 0)
                continue;
            c[i]--;

            for (int j = 0; j < 10; j++) {
                if (c[j] == 0)
                    continue;
                c[j]--;

                for (int k = 0; k < 10; k += 2)
                    if (c[k] > 0)   
                        ans++;

                c[j]++;
            }

            c[i]++;
        }

        return ans;
    }
}
