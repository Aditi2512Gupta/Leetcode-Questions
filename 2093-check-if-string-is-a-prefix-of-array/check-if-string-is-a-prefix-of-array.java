class Solution {
    public boolean isPrefixString(String s, String[] words) {
        int idx = 0;

        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                if (idx == s.length() || s.charAt(idx) != word.charAt(i))
                    return false;
                idx++;
            }

            if (idx == s.length())
                return true;
        }

        return false;

    }
}