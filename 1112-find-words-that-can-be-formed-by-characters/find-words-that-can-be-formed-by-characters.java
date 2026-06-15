class Solution {
    public int countCharacters(String[] words, String chars) {

        int[] freq = new int[26];
        
        for (char c : chars.toCharArray()) {
            freq[c - 'a']++;
        }

        int ans = 0;

        for (String word : words) {
            int[] cnt = new int[26];
            boolean ok = true;

            for (char c : word.toCharArray()) {
                if (++cnt[c - 'a'] > freq[c - 'a']) {
                    ok = false;
                    break;
                }
            }

            if (ok) 
                ans += word.length();
        }

        return ans;
    }
}