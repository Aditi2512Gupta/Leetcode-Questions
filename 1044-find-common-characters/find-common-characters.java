class Solution {
    public List<String> commonChars(String[] words) {
        int[] min = new int[26];
        for (int i = 0; i < 26; i++) 
            min[i] = 100;

        for (String s : words) {
            int[] count = new int[26];
            for (int i = 0; i < s.length(); i++) {
                count[s.charAt(i) - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                if (count[i] < min[i]) {
                    min[i] = count[i];
                }
            }
        }

        List<String> ans = new ArrayList<>();

        for (int i = 0; i < 26; i++) {
            while (min[i]-- > 0) {
                ans.add(Character.toString((char) ('a' + i)));
            }
        }
        return ans;
    }
}