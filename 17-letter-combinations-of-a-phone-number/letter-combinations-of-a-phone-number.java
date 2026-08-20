class Solution {
    List<String> ans = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        String[] map = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        solve(0, digits, "", map);
        return ans;
    }

    void solve(int i, String digits, String curr, String[] map) {

        if (i == digits.length()) {
            ans.add(curr);
            return;
        }

        String letters = map[digits.charAt(i) - '0'];

        for (char c : letters.toCharArray()) {
            solve(i + 1, digits, curr + c, map);
        }
    }
}