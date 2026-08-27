class Solution {
    public String lexGreaterPermutation(String s, String target) {
        int n = s.length();
        int[] count = new int[26];

        for (char c : s.toCharArray())
            count[c - 'a']++;

        char[] ans = new char[n];

        for (int i = 0; i < n; i++) {
            int x = target.charAt(i) - 'a';

            // Keep same character if possible
            if (count[x] > 0) {
                ans[i] = target.charAt(i);
                count[x]--;
            } else {
                // Find smallest character greater than target[i]
                for (int c = x + 1; c < 26; c++) {
                    if (count[c] > 0) {
                        ans[i] = (char) ('a' + c);
                        count[c]--;

                        fill(ans, i + 1, count);
                        return new String(ans);
                    }
                }

                // Backtrack
                while (i > 0) {
                    i--;
                    count[ans[i] - 'a']++;

                    x = target.charAt(i) - 'a';

                    for (int c = x + 1; c < 26; c++) {
                        if (count[c] > 0) {
                            ans[i] = (char) ('a' + c);
                            count[c]--;

                            fill(ans, i + 1, count);
                            return new String(ans);
                        }
                    }
                }

                return "";
            }
        }

        // s permutation is exactly target, so backtrack
        for (int i = n - 1; i >= 0; i--) {
            count[ans[i] - 'a']++;

            int x = target.charAt(i) - 'a';

            for (int c = x + 1; c < 26; c++) {
                if (count[c] > 0) {
                    ans[i] = (char) ('a' + c);
                    count[c]--;

                    fill(ans, i + 1, count);
                    return new String(ans);
                }
            }
        }

        return "";
    }

    private void fill(char[] ans, int start, int[] count) {
        int k = start;

        for (int c = 0; c < 26; c++) {
            while (count[c] > 0) {
                ans[k++] = (char) ('a' + c);
                count[c]--;
            }
        }
    }
}